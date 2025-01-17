package ch.zkmf2024.server.service;

import ch.zkmf2024.server.dto.AdhocOrchesterTeilnehmerDTO;
import ch.zkmf2024.server.dto.DoppelEinsatzDTO;
import ch.zkmf2024.server.dto.ImageType;
import ch.zkmf2024.server.dto.Modul;
import ch.zkmf2024.server.dto.NichtmitgliederDTO;
import ch.zkmf2024.server.dto.PhaseStatus;
import ch.zkmf2024.server.dto.RegisterVereinRequestDTO;
import ch.zkmf2024.server.dto.TimetableOverviewEntryDTO;
import ch.zkmf2024.server.dto.TitelDTO;
import ch.zkmf2024.server.dto.VereinDTO;
import ch.zkmf2024.server.dto.VereinMessageDTO;
import ch.zkmf2024.server.dto.VereinPresentationDTO;
import ch.zkmf2024.server.dto.VereinProgrammDTO;
import ch.zkmf2024.server.dto.VereinProgrammTitelDTO;
import ch.zkmf2024.server.dto.VereinSelectionDTO;
import ch.zkmf2024.server.dto.VereinStageSetupDTO;
import ch.zkmf2024.server.dto.VereinTeilnahmeDTO;
import ch.zkmf2024.server.dto.VereinsanmeldungDetailDTO;
import ch.zkmf2024.server.dto.VereinsinfoDTO;
import ch.zkmf2024.server.dto.VerifyEmailRequestDTO;
import ch.zkmf2024.server.dto.admin.VereinCommentDTO;
import ch.zkmf2024.server.dto.admin.VereinErrataDTO;
import ch.zkmf2024.server.dto.admin.VereinOverviewDTO;
import ch.zkmf2024.server.jooq.generated.tables.pojos.ImagePojo;
import ch.zkmf2024.server.jooq.generated.tables.pojos.KontaktPojo;
import ch.zkmf2024.server.jooq.generated.tables.pojos.VereinAnmeldungAdhocOrchesterPojo;
import ch.zkmf2024.server.jooq.generated.tables.pojos.VereinAnmeldungDetailPojo;
import ch.zkmf2024.server.jooq.generated.tables.pojos.VereinAnmeldungNichtmitgliederPojo;
import ch.zkmf2024.server.jooq.generated.tables.pojos.VereinCommentPojo;
import ch.zkmf2024.server.jooq.generated.tables.pojos.VereinDoppeleinsatzPojo;
import ch.zkmf2024.server.jooq.generated.tables.pojos.VereinMessagePojo;
import ch.zkmf2024.server.jooq.generated.tables.pojos.VereinPojo;
import ch.zkmf2024.server.jooq.generated.tables.pojos.VereinProgrammPojo;
import ch.zkmf2024.server.jooq.generated.tables.pojos.VereinProgrammTitelPojo;
import ch.zkmf2024.server.jooq.generated.tables.pojos.VereinStatusPojo;
import ch.zkmf2024.server.jooq.generated.tables.pojos.Zkmf2024UserPojo;
import ch.zkmf2024.server.mapper.VereinMapper;
import ch.zkmf2024.server.repository.ErrataRepository;
import ch.zkmf2024.server.repository.ImageRepository;
import ch.zkmf2024.server.repository.TimetableRepository;
import ch.zkmf2024.server.repository.UserRepository;
import ch.zkmf2024.server.repository.VereinRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jooq.DSLContext;
import org.jooq.JSONB;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.LongFunction;

import static ch.zkmf2024.server.dto.ImageType.VEREIN_BILD;
import static ch.zkmf2024.server.dto.ImageType.VEREIN_LOGO;
import static ch.zkmf2024.server.dto.UserRole.ADMIN;
import static ch.zkmf2024.server.dto.UserRole.VEREIN;
import static ch.zkmf2024.server.util.DateUtil.now;
import static java.util.Comparator.comparing;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

@Slf4j
@Service
public class VereinService {

    public static final VereinMapper MAPPER = VereinMapper.INSTANCE;

    private final UserRepository userRepository;
    private final VereinRepository vereinRepository;
    private final ImageRepository imageRepository;
    private final TimetableRepository timetableRepository;
    private final ErrataRepository errataRepository;
    private final PasswordEncoder passwordEncoder;
    private final MailService mailService;
    private final CloudflareService cloudflareService;
    private final StageService stageService;
    private final DSLContext jooqDsl;

    public VereinService(UserRepository userRepository,
                         VereinRepository vereinRepository,
                         ImageRepository imageRepository,
                         TimetableRepository timetableRepository,
                         ErrataRepository errataRepository,
                         PasswordEncoder passwordEncoder,
                         MailService mailService,
                         CloudflareService cloudflareService,
                         StageService stageService,
                         DSLContext jooqDsl) {
        this.userRepository = userRepository;
        this.vereinRepository = vereinRepository;
        this.imageRepository = imageRepository;
        this.timetableRepository = timetableRepository;
        this.errataRepository = errataRepository;
        this.passwordEncoder = passwordEncoder;
        this.mailService = mailService;
        this.cloudflareService = cloudflareService;
        this.stageService = stageService;
        this.jooqDsl = jooqDsl;
    }

    public Optional<VereinDTO> find(String email) {
        return vereinRepository.findByEmail(email)
                               .map(this::toDTO);
    }

    public Optional<VereinStageSetupDTO> findStageSetup(String email) {
        return vereinRepository.findAnmeldungDetailByEmail(email)
                               .map(pojo -> toVereinStageSetupDTO(pojo, vereinRepository::findRelevantLocationIdentifierForStageSetup));

    }

    public Optional<VereinStageSetupDTO> findStageSetupByVereinId(Long vereinId) {
        return vereinRepository.findAnmeldungDetailById(vereinId)
                               .map(pojo -> toVereinStageSetupDTO(pojo, vereinRepository::findRelevantLocationIdentifierForStageSetup));
    }

    private VereinStageSetupDTO toVereinStageSetupDTO(VereinAnmeldungDetailPojo pojo, LongFunction<String> locationIdentifierGetter) {
        return new VereinStageSetupDTO(
                pojo.getFkVerein(),
                locationIdentifierGetter.apply(pojo.getFkVerein()),
                Optional.ofNullable(pojo.getStageSetup()).map(JSONB::data).orElse("{}"),
                pojo.getStageDirigentenpodest(),
                pojo.getStageAblagenAmount(),
                pojo.getStageComment(),
                pojo.getStageSetupAdditional() != null
        );
    }

    public Optional<VereinDTO> findById(Long id) {
        return vereinRepository.findById(id)
                               .map(this::toDTO);
    }

    public List<VereinCommentDTO> findCommentsByVereinId(Long vereinId) {
        return vereinRepository.findCommentsByVereinId(vereinId).stream()
                               .map(pojo -> new VereinCommentDTO(pojo.getComment(), pojo.getCreatedAt(), pojo.getCreatedBy()))
                               // newest first
                               .sorted(comparing(VereinCommentDTO::createdAt).reversed())
                               .toList();
    }

    public List<VereinMessageDTO> findMessagesByVereinId(Long vereinId, String username) {
        return vereinRepository.findMessagesByVereinId(vereinId).stream()
                               .map(pojo -> new VereinMessageDTO(pojo.getMessage(), pojo.getCreatedAt(), pojo.getCreatedBy(), pojo.getCreatedBy().equals(username)))
                               .sorted(comparing(VereinMessageDTO::createdAt))
                               .toList();
    }

    public List<VereinOverviewDTO> findAll() {
        return vereinRepository.findAllOverview();
    }

    public List<VereinSelectionDTO> findAllForSelection() {
        return vereinRepository.findAllNotYetPlanned();
    }

    public List<VereinDTO> findAllForExport() {
        return vereinRepository.findAllForExport();
    }

    public List<Long> findAllVereinIds() {
        return vereinRepository.findAllVereinIds();
    }

    public VereinStatusPojo findStatus(Long vereinId) {
        return vereinRepository.findStatusById(vereinId);
    }

    private VereinDTO toDTO(VereinPojo verein) {
        var praesident = vereinRepository.findKontaktById(verein.getPraesidentKontaktId());
        var direktion = vereinRepository.findKontaktById(verein.getDirektionKontaktId());

        var logoImg = imageRepository.findImageByForeignKeyAndType(verein.getId(), VEREIN_LOGO);
        var bildImg = imageRepository.findImageByForeignKeyAndType(verein.getId(), VEREIN_BILD);

        var vereinsanmeldung = MAPPER.toVereinsanmeldungDTO(verein);

        return new VereinDTO(
                verein.getEmail(),
                MAPPER.toDTO(verein),
                getDoppeleinsatz(verein.getId()),
                MAPPER.toDTO(praesident),
                MAPPER.toDTO(direktion),
                vereinsanmeldung,
                new VereinsinfoDTO(logoImg.map(ImagePojo::getId).orElse(null),
                                   bildImg.map(ImagePojo::getId).orElse(null),
                                   logoImg.map(ImagePojo::getCloudflareId).orElse(null),
                                   bildImg.map(ImagePojo::getCloudflareId).orElse(null),
                                   verein.getWebsiteText()),
                verein.getConfirmedAt() != null,
                getProgramme(verein.getId()),
                getAnmeldungDetail(verein.getId(), vereinsanmeldung.hasPartituren()),
                // only used for export, not important here
                false,
                false,
                false,
                verein.getPhase2ConfirmedBy(),
                verein.getPhase2ConfirmedAt(),
                verein.getPhase4ConfirmedAt(),
                findTimetableEntriesByVereinId(verein.getId()),
                findMessagesByVereinId(verein.getId(), verein.getEmail()),
                findErrata(verein.getId()),
                verein.getLunchTime(),
                false
        );
    }

    private VereinsanmeldungDetailDTO getAnmeldungDetail(Long vereinId, boolean hasPartituren) {
        var anmeldungDetail = vereinRepository.getAnmeldungDetail(vereinId, hasPartituren);
        if (anmeldungDetail.adhocOrchesterTeilnehmer().isEmpty()) {
            anmeldungDetail.adhocOrchesterTeilnehmer().add(new AdhocOrchesterTeilnehmerDTO(null, null, null));
        }
        if (anmeldungDetail.nichtmitglieder().isEmpty()) {
            anmeldungDetail.nichtmitglieder().add(new NichtmitgliederDTO(null, null));
        }
        return anmeldungDetail;
    }

    private List<VereinErrataDTO> findErrata(Long vereinId) {
        return errataRepository.getRelevantErrata(vereinId);
    }

    private List<TimetableOverviewEntryDTO> findTimetableEntriesByVereinId(Long vereinId) {
        return timetableRepository.findAllByVereinId(vereinId);
    }

    private List<DoppelEinsatzDTO> getDoppeleinsatz(Long vereinId) {
        return vereinRepository.findDoppeleinsatz(vereinId);
    }

    private List<VereinProgrammDTO> getProgramme(Long vereinId) {
        return vereinRepository.findProgramme(vereinId);
    }

    public void create(RegisterVereinRequestDTO request) {
        if (userRepository.existsById(request.email())) {
            log.warn("tried to register new verein with already registerd email {}", request.email());
            throw new IllegalArgumentException("there is already a user with email: " + request.email());
        }

        if (vereinRepository.findByEmail(request.email()).isPresent()) {
            log.error("there is already a verein associated with email '{}' but no corresponding user found", request.email());
            throw new IllegalStateException();
        }

        jooqDsl.transaction(configuration -> {
            var user = new Zkmf2024UserPojo();
            user.setEmail(request.email());
            user.setPassword(passwordEncoder.encode(request.password()));
            user.setRole(VEREIN.name());
            user.setCreatedAt(now());
            user.setEmailVerification(UUID.randomUUID().toString());
            userRepository.insert(user);

            var kontaktPraesident = new KontaktPojo();
            vereinRepository.insert(kontaktPraesident);
            var kontaktDirektion = new KontaktPojo();
            vereinRepository.insert(kontaktDirektion);

            var verein = new VereinPojo();
            verein.setEmail(request.email());
            verein.setVereinsname(request.vereinsname());
            verein.setPraesidentKontaktId(kontaktPraesident.getId());
            verein.setDirektionKontaktId(kontaktDirektion.getId());

            vereinRepository.insert(verein);

            var detail = new VereinAnmeldungDetailPojo();
            detail.setFkVerein(verein.getId());
            vereinRepository.insert(detail);

            var status = new VereinStatusPojo();
            status.setFkVerein(verein.getId());
            vereinRepository.insert(status);

            mailService.sendRegistrationEmail(user);
        });

    }

    public VereinDTO update(String email, VereinDTO dto) {
        // TODO verify user is allowed to update
        var verein = vereinRepository.findByEmail(email).orElseThrow(() -> new NoSuchElementException("no Verein found for email: %s".formatted(email)));

        MAPPER.updateVereinsangaben(verein, dto.angaben());
        if (verein.getConfirmedAt() == null) {
            MAPPER.updateVereinsanmeldung(verein, dto.anmeldung());
        }
        verein.setWebsiteText(dto.info().websiteText());
        if (verein.getPhase2ConfirmedAt() == null && dto.programmUpdated()) {
            verein.setProgrammLastUpdated(now());
        }
        vereinRepository.update(verein);

        var praesident = vereinRepository.findKontaktById(verein.getPraesidentKontaktId());
        MAPPER.updateKontakt(praesident, dto.praesident());
        vereinRepository.update(praesident);

        var direktion = vereinRepository.findKontaktById(verein.getDirektionKontaktId());
        MAPPER.updateKontakt(direktion, dto.direktion());
        vereinRepository.update(direktion);

        updateProgramme(verein.getId(), dto.programme(), verein.getPhase2ConfirmedAt() != null);

        updateDoppeleinsatz(verein.getId(), dto.doppelEinsatz(), dto.angaben().mitspielerDoppeleinsatz());

        if (verein.getPhase4ConfirmedAt() == null) {
            var anmeldungDetail = vereinRepository.findAnmeldungDetail(verein.getId()).orElseThrow();
            MAPPER.updateAnmeldungDetail(anmeldungDetail, dto.anmeldungDetail());
            vereinRepository.update(anmeldungDetail);
        }

        vereinRepository.deleteAdhocOrchester(verein.getId());
        vereinRepository.insertAdhocOrchester(dto.anmeldungDetail().adhocOrchesterTeilnehmer().stream()
                                                 .filter(AdhocOrchesterTeilnehmerDTO::isNotEmpty)
                                                 .map(adhoc -> new VereinAnmeldungAdhocOrchesterPojo(
                                                         null, verein.getId(), adhoc.name(), adhoc.email(), adhoc.instrument()
                                                 ))
                                                 .toList());

        vereinRepository.deleteNichtmitglieder(verein.getId());
        vereinRepository.insertNichtmitglieder(dto.anmeldungDetail().nichtmitglieder().stream()
                                                  .filter(NichtmitgliederDTO::isNotEmpty)
                                                  .map(nichtmitglieder -> new VereinAnmeldungNichtmitgliederPojo(
                                                          null, verein.getId(), nichtmitglieder.amount(), nichtmitglieder.instrument()
                                                  ))
                                                  .toList());

        dto = toDTO(verein);

        updateStatus(verein.getId(), dto);

        return dto;
    }

    public void updateStage(String email, VereinStageSetupDTO dto) {
        // TODO check if not fixed
        var detail = vereinRepository.findAnmeldungDetailByEmail(email).orElseThrow(() -> new NoSuchElementException("no Verein found for email: %s".formatted(email)));
        detail.setStageSetup(JSONB.jsonbOrNull(dto.stageSetup()));
        detail.setStageDirigentenpodest(dto.dirigentenpodest());
        detail.setStageAblagenAmount(dto.ablagenAmount());
        detail.setStageComment(dto.comment());
        vereinRepository.update(detail);

        // asynchronously generate the stage setup image and store it in DB as well
        stageService.createStageSetupImage(dto);
    }

    public void updateStageSetupAdditional(String email, MultipartFile file) throws IOException {
        if (file != null) {
            var detail = vereinRepository.findByEmail(email).map(VereinPojo::getId).flatMap(vereinRepository::findAnmeldungDetail).orElseThrow();
            detail.setStageSetupAdditional(file.getBytes());
            vereinRepository.update(detail);
        }
    }

    public void deleteStageSetupAdditional(String email) {
        vereinRepository.findByEmail(email).map(VereinPojo::getId).flatMap(vereinRepository::findAnmeldungDetail).ifPresent(detail -> {
            detail.setStageSetupAdditional(null);
            vereinRepository.update(detail);
        });
    }

    public Optional<byte[]> getStageSetupAdditional(String email) {
        return vereinRepository.findByEmail(email)
                               .map(VereinPojo::getId)
                               .flatMap(vereinRepository::findAnmeldungDetail)
                               .map(VereinAnmeldungDetailPojo::getStageSetupAdditional);
    }

    private void updateDoppeleinsatz(Long vereinId, List<DoppelEinsatzDTO> doppeleinsatz, boolean mitspielerDoppeleinsatz) {
        vereinRepository.deleteDoppeleinsatzByVereinId(vereinId);
        if (mitspielerDoppeleinsatz && doppeleinsatz != null) {
            for (var doppelEinsatzDTO : doppeleinsatz) {
                vereinRepository.insert(new VereinDoppeleinsatzPojo(null,
                                                                    vereinId,
                                                                    doppelEinsatzDTO.otherVerein().id(),
                                                                    doppelEinsatzDTO.mitspielerName()));
            }
        }
    }

    public void updateStatus(Long vereinId, VereinDTO dto) {
        var status = vereinRepository.findStatusById(vereinId);
        status.setPhase1(dto.getPhase1Status().name());
        status.setPhase2(dto.getPhase2Status().name());
        status.setPhase4(dto.getPhase4Status().name());
        vereinRepository.update(status);
    }

    public VereinDTO confirmRegistration(String email) {
        var verein = vereinRepository.findByEmail(email).orElseThrow();
        if (verein.getConfirmedAt() == null) {
            verein.setConfirmedAt(now());

            getSelectedModule(verein).forEach(modul -> {
                var vereinProgramm = new VereinProgrammPojo();
                vereinProgramm.setFkVerein(verein.getId());
                vereinProgramm.setModul(modul.name());
                vereinProgramm.setKlasse(modul.getRelevantKlasse(verein.getKlasseModula(),
                                                                 verein.getKlasseModulb(),
                                                                 verein.getKlasseModulh())
                                              .map(Enum::name)
                                              .orElse(null));
                vereinProgramm.setBesetzung(modul.getRelevantBesetzung(verein.getHarmonie(),
                                                                       verein.getBrassBand(),
                                                                       verein.getFanfare())
                                                 .map(Enum::name)
                                                 .orElse(null));
                vereinRepository.insert(vereinProgramm);
            });

            vereinRepository.update(verein);
        } else {
            log.error("user {} tried to confirm registration, but was already confirmed at {}", email, verein.getConfirmedAt());
        }

        var dto = toDTO(verein);
        mailService.sendRegistrationConfirmationEmail(dto);

        return dto;
    }

    private List<Modul> getSelectedModule(VereinPojo vereinPojo) {
        var module = new ArrayList<Modul>();
        if (vereinPojo.getModula()) module.add(Modul.A);
        if (vereinPojo.getModulb()) module.add(Modul.B);
        if (vereinPojo.getModulc()) module.add(Modul.C);
        if (vereinPojo.getModuld()) module.add(Modul.D);
        if (vereinPojo.getModule()) module.add(Modul.E);
        if (vereinPojo.getModulf()) module.add(Modul.F);
        if (vereinPojo.getModulg()) module.add(Modul.G);
        if (vereinPojo.getModulh()) module.add(Modul.H);
        return module;
    }

    private void updateProgramme(Long vereinId, List<VereinProgrammDTO> programme, boolean phase2Confirmed) {
        for (var programm : programme) {
            var programmPojo = vereinRepository.findVereinProgramm(programm.id()).orElseThrow();
            if (Objects.equals(vereinId, programmPojo.getFkVerein())) {
                if (phase2Confirmed && programm.modul() != Modul.C) {
                    // only Modul C (Platzkonzert) is allowed to update Programm after phase 2 confirmation
                    continue;
                }

                programmPojo.setTitel(programm.titel());
                programmPojo.setInfoModeration(programm.infoModeration());
                programmPojo.setTotalDurationInSeconds(calculateTotalDurationInSeconds(programm.ablauf()));
                if (programm.modul() == Modul.B) {
                    programmPojo.setModulBPa(programm.unterhaltungPA());
                    programmPojo.setModulBEgitarre(programm.unterhaltungEGitarre());
                    programmPojo.setModulBEbass(programm.unterhaltungEBass());
                    programmPojo.setModulBKeyboard(programm.unterhaltungKeyboard());
                    programmPojo.setModulBGesang(programm.unterhaltungGesang());
                }

                if (programm.modul() == Modul.D) {
                    programmPojo.setModulDTitel_1Id(createOrUpdateTitel(vereinId, programm.parademusikTitel1(), programm.modul()));
                    programmPojo.setModulDTitel_2Id(createOrUpdateTitel(vereinId, programm.parademusikTitel2(), programm.modul()));
                }

                if (programm.modul() == Modul.G) {
                    programmPojo.setModulGKatA_1(programm.tambourenKatAGrundlage1() != null ? programm.tambourenKatAGrundlage1().name() : null);
                    programmPojo.setModulGKatA_2(programm.tambourenKatAGrundlage2() != null ? programm.tambourenKatAGrundlage2().name() : null);

                    programmPojo.setModulGKatATitel_1Id(createOrUpdateTitel(vereinId, programm.tambourenKatATitel1(), programm.modul()));
                    programmPojo.setModulGKatATitel_2Id(createOrUpdateTitel(vereinId, programm.tambourenKatATitel2(), programm.modul()));

                    programmPojo.setModulGKatBTitelId(createOrUpdateTitel(vereinId, programm.tambourenKatBTitel(), programm.modul()));
                    programmPojo.setModulGKatCTitelId(createOrUpdateTitel(vereinId, programm.tambourenKatCTitel(), programm.modul()));
                }

                vereinRepository.update(programmPojo);

                var existingProgrammTitel = vereinRepository.findTitelByProgrammId(programmPojo.getId());
                var programmTitelPerId = existingProgrammTitel.stream()
                                                              .collect(toMap(VereinProgrammTitelPojo::getFkTitel, identity()));
                for (int i = 0; i < programm.ablauf().size(); i++) {
                    var programmTitel = programm.ablauf().get(i);
                    var titel = programmTitel.titel();
                    var titelId = titel.id();
                    if (programmTitelPerId.containsKey(titelId)) {
                        // update
                        var titelPojo = vereinRepository.findTitelById(titelId);
                        if (titelPojo.getFkVerein() != null) {
                            MAPPER.updatePojo(titelPojo, titel);
                            vereinRepository.update(titelPojo);
                        }

                        var vereinProgrammTitelPojo = programmTitelPerId.get(titelId);
                        vereinProgrammTitelPojo.setPosition(i);
                        // there is no applause for last titel
                        vereinProgrammTitelPojo.setApplausInSeconds((i < programm.ablauf().size() - 1) ?
                                                                            programmTitel.applausInSeconds() :
                                                                            null);
                        vereinRepository.update(vereinProgrammTitelPojo);
                    } else {
                        // create new
                        if (titelId == null) {
                            var titelPojo = MAPPER.toPojo(titel, vereinId);
                            titelPojo.setModul(programm.modul().name());
                            vereinRepository.insert(titelPojo);
                            titelId = titelPojo.getId();
                        }

                        var vereinProgrammTitelPojo = new VereinProgrammTitelPojo(programmPojo.getId(),
                                                                                  titelId,
                                                                                  i,
                                                                                  titel.durationInSeconds(),
                                                                                  (i < programm.ablauf().size() - 1) ?
                                                                                          programmTitel.applausInSeconds() :
                                                                                          null);
                        vereinRepository.insert(vereinProgrammTitelPojo);
                    }
                }

                var idsToKeep = programm.ablauf().stream()
                                        .map(s -> s.titel().id())
                                        .filter(Objects::nonNull)
                                        .collect(toSet());

                for (var t : existingProgrammTitel) {
                    if (!idsToKeep.contains(t.getFkTitel())) {
                        vereinRepository.delete(t);
                    }
                }

                // TODO delete orphan selbstwahlstück
            } else {
                log.error("tried to update Vereinsprogramm {} that does not belong to Vereins-ID {}",
                          programmPojo, vereinId);
            }
        }
    }

    private Long createOrUpdateTitel(Long vereinId, TitelDTO titel, Modul modul) {
        if (!titel.isValid()) {
            return null;
        }

        var titelId = titel.id();
        if (titelId == null) {
            var titelPojo = MAPPER.toPojo(titel, vereinId);
            titelPojo.setModul(modul.name());
            vereinRepository.insert(titelPojo);
            titelId = titelPojo.getId();
        } else {
            var titelPojo = vereinRepository.findTitelById(titelId);
            if (titelPojo.getFkVerein() != null) {
                MAPPER.updatePojo(titelPojo, titel);
                vereinRepository.update(titelPojo);
            }
        }
        return titelId;
    }

    public static int calculateTotalDurationInSeconds(List<VereinProgrammTitelDTO> ablauf) {
        var totalInSeconds = 0;
        for (int i = 0; i < ablauf.size(); i++) {
            var programmTitel = ablauf.get(i);
            totalInSeconds += programmTitel.titel().durationInSeconds();
            if (i < ablauf.size() - 1 && programmTitel.applausInSeconds() != null) {
                // last applause does not count to total duration of program
                totalInSeconds += programmTitel.applausInSeconds();
            }
        }
        return totalInSeconds;
    }

    public boolean verifyEmail(VerifyEmailRequestDTO request) {
        var user = userRepository.findById(request.email()).orElseThrow();
        if (StringUtils.equals(user.getEmailVerification(), request.verification())) {
            user.setEmailVerification(null);
            user.setEmailVerifiedAt(now());
            userRepository.update(user);
            return true;
        } else {
            log.error("could not verify email: {}", request);
            return false;
        }
    }

    public void updateBilder(String email, MultipartFile logo, MultipartFile bild) throws IOException {
        var verein = vereinRepository.findByEmail(email).orElseThrow();
        saveImage(logo, verein.getId(), VEREIN_LOGO);
        saveImage(bild, verein.getId(), VEREIN_BILD);
    }

    private void saveImage(MultipartFile file, Long vereinId, ImageType imageType) throws IOException {
        if (file != null) {
            var image = imageRepository.findImageByForeignKeyAndType(vereinId, imageType);
            if (image.isPresent()) {
                var pojo = image.get();
                pojo.setName(file.getOriginalFilename());
                pojo.setContent(file.getBytes());
                pojo.setUploadedAt(now());
                imageRepository.update(pojo);
                uploadToCloudflare(pojo);
            } else {
                var pojo = new ImagePojo();
                pojo.setForeignKey(vereinId);
                pojo.setType(imageType.name());
                pojo.setName(file.getOriginalFilename());
                pojo.setContent(file.getBytes());
                pojo.setUploadedAt(now());
                imageRepository.insert(pojo);
                uploadToCloudflare(pojo);
            }
        }
    }

    private void uploadToCloudflare(ImagePojo pojo) {
        cloudflareService.upload(pojo).ifPresent(cloudflareId -> {
            pojo.setCloudflareId(cloudflareId);
            imageRepository.update(pojo);
        });
    }

    public void forgotPassword(String email) {
        userRepository.findByIdAndRole(email, VEREIN).ifPresentOrElse(
                user -> {
                    user.setPasswordResetToken(UUID.randomUUID().toString());
                    userRepository.update(user);

                    mailService.sendResetPasswordEmail(user);
                },
                () -> log.warn("forgot password called for unknown user: {}", email)
        );
    }

    public boolean resetPassword(String email, String token, String newPassword) {
        var user = userRepository.findByIdAndRole(email, VEREIN);
        if (user.isPresent()) {
            var userPojo = user.get();
            if (StringUtils.equals(userPojo.getPasswordResetToken(), token)) {
                userPojo.setPassword(passwordEncoder.encode(newPassword));
                userPojo.setPasswordResetToken(null);
                userRepository.update(userPojo);

                log.info("updated password for user {}", email);
                return true;
            } else {
                log.warn("presented password reset-token did not match expected one: {}/{}",
                         token,
                         userPojo.getPasswordResetToken());
            }
        } else {
            log.warn("tried to reset password for unknown user: {}, {}", email, token);
        }
        return false;
    }

    public void deleteImage(String email, Long id) {
        var image = imageRepository.findById(id).orElseThrow();
        var verein = vereinRepository.findByEmail(email).orElseThrow();

        if (Objects.equals(verein.getId(), image.getForeignKey())) {
            cloudflareService.delete(image);
            imageRepository.delete(image);
        } else {
            log.error("user with email '{}' tried to delete image with id {}, but does not belong to them!", email, id);
        }
    }

    public List<VereinTeilnahmeDTO> getOverview() {
        return vereinRepository.findAllConfirmed();
    }

    public Optional<VereinPresentationDTO> findPresentationByIdentifier(String vereinIdentifier) {
        return vereinRepository.findPresentationByIdentifier(vereinIdentifier);
    }

    public VereinCommentDTO saveComment(String username, Long vereinId, String comment) {
        var pojo = new VereinCommentPojo(null, vereinId, comment, now(), username);
        vereinRepository.insert(pojo);
        return new VereinCommentDTO(pojo.getComment(), pojo.getCreatedAt(), pojo.getCreatedBy());
    }

    public VereinMessageDTO saveMessage(String email, String message) {
        var verein = vereinRepository.findByEmail(email).orElseThrow();
        return saveMessage(email, verein.getId(), message);
    }

    public VereinMessageDTO saveMessage(String username, Long vereinId, String message) {
        var vereinPojo = vereinRepository.findById(vereinId).orElseThrow();
        var pojo = new VereinMessagePojo(null, vereinPojo.getId(), message, now(), username);
        vereinRepository.insert(pojo);

        userRepository.findByIdAndRole(username, ADMIN).ifPresent(user -> mailService.sendNewMessageEmail(vereinPojo.getEmail()));
        userRepository.findByIdAndRole(username, VEREIN).ifPresent(user -> mailService.sendNewMessageInternalEmail(vereinPojo));

        return new VereinMessageDTO(pojo.getMessage(), pojo.getCreatedAt(), pojo.getCreatedBy(), true);
    }

    @Async
    public void broadcast(String username, List<Long> ids, String message) {
        ids.stream()
           .distinct()
           .forEach(vereinId -> saveMessage(username, vereinId, message));
    }

    public void confirmProgramm(String username, Long vereinId) {
        var verein = vereinRepository.findById(vereinId).orElseThrow();
        if (verein.getPhase2ConfirmedAt() != null) {
            log.error("user {} tried to confirm programm for verein {}, but was already confirmed at {} by {}",
                      username, verein.getId(), verein.getPhase2ConfirmedAt(), verein.getPhase2ConfirmedBy());
            return;
        }

        var status = PhaseStatus.valueOf(findStatus(vereinId).getPhase2());
        if (status != PhaseStatus.DONE) {
            log.error("user {} tried to confirm programm for verein {}, but not yet in required status DONE, actual status {}",
                      username, verein.getId(), status);
            return;
        }

        verein.setPhase2ConfirmedAt(now());
        verein.setPhase2ConfirmedBy(username);
        vereinRepository.update(verein);
    }
}
