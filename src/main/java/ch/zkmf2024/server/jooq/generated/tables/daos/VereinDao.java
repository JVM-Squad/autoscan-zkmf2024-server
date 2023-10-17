/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.daos;

import ch.zkmf2024.server.jooq.generated.tables.Verein;
import ch.zkmf2024.server.jooq.generated.tables.pojos.VereinPojo;
import ch.zkmf2024.server.jooq.generated.tables.records.VereinRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class VereinDao extends DAOImpl<VereinRecord, VereinPojo, Long> {

    /**
     * Create a new VereinDao without any configuration
     */
    public VereinDao() {
        super(Verein.VEREIN, VereinPojo.class);
    }

    /**
     * Create a new VereinDao with an attached configuration
     */
    public VereinDao(Configuration configuration) {
        super(Verein.VEREIN, VereinPojo.class, configuration);
    }

    @Override
    public Long getId(VereinPojo object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Verein.VEREIN.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<VereinPojo> fetchById(Long... values) {
        return fetch(Verein.VEREIN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public VereinPojo fetchOneById(Long value) {
        return fetchOne(Verein.VEREIN.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<VereinPojo> fetchOptionalById(Long value) {
        return fetchOptional(Verein.VEREIN.ID, value);
    }

    /**
     * Fetch records that have <code>email BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfEmail(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.EMAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<VereinPojo> fetchByEmail(String... values) {
        return fetch(Verein.VEREIN.EMAIL, values);
    }

    /**
     * Fetch records that have <code>praesident_kontakt_id BETWEEN
     * lowerInclusive AND upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfPraesidentKontaktId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Verein.VEREIN.PRAESIDENT_KONTAKT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>praesident_kontakt_id IN (values)</code>
     */
    public List<VereinPojo> fetchByPraesidentKontaktId(Long... values) {
        return fetch(Verein.VEREIN.PRAESIDENT_KONTAKT_ID, values);
    }

    /**
     * Fetch records that have <code>direktion_kontakt_id BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfDirektionKontaktId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Verein.VEREIN.DIREKTION_KONTAKT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>direktion_kontakt_id IN (values)</code>
     */
    public List<VereinPojo> fetchByDirektionKontaktId(Long... values) {
        return fetch(Verein.VEREIN.DIREKTION_KONTAKT_ID, values);
    }

    /**
     * Fetch records that have <code>vereinsname BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfVereinsname(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.VEREINSNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>vereinsname IN (values)</code>
     */
    public List<VereinPojo> fetchByVereinsname(String... values) {
        return fetch(Verein.VEREIN.VEREINSNAME, values);
    }

    /**
     * Fetch records that have <code>adresse BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfAdresse(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.ADRESSE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>adresse IN (values)</code>
     */
    public List<VereinPojo> fetchByAdresse(String... values) {
        return fetch(Verein.VEREIN.ADRESSE, values);
    }

    /**
     * Fetch records that have <code>plz BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfPlz(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Verein.VEREIN.PLZ, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>plz IN (values)</code>
     */
    public List<VereinPojo> fetchByPlz(Integer... values) {
        return fetch(Verein.VEREIN.PLZ, values);
    }

    /**
     * Fetch records that have <code>ort BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfOrt(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.ORT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ort IN (values)</code>
     */
    public List<VereinPojo> fetchByOrt(String... values) {
        return fetch(Verein.VEREIN.ORT, values);
    }

    /**
     * Fetch records that have <code>homepage BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfHomepage(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.HOMEPAGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>homepage IN (values)</code>
     */
    public List<VereinPojo> fetchByHomepage(String... values) {
        return fetch(Verein.VEREIN.HOMEPAGE, values);
    }

    /**
     * Fetch records that have <code>facebook BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfFacebook(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.FACEBOOK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>facebook IN (values)</code>
     */
    public List<VereinPojo> fetchByFacebook(String... values) {
        return fetch(Verein.VEREIN.FACEBOOK, values);
    }

    /**
     * Fetch records that have <code>instagram BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfInstagram(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.INSTAGRAM, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>instagram IN (values)</code>
     */
    public List<VereinPojo> fetchByInstagram(String... values) {
        return fetch(Verein.VEREIN.INSTAGRAM, values);
    }

    /**
     * Fetch records that have <code>iban BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfIban(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.IBAN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>iban IN (values)</code>
     */
    public List<VereinPojo> fetchByIban(String... values) {
        return fetch(Verein.VEREIN.IBAN, values);
    }

    /**
     * Fetch records that have <code>modula BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfModula(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.MODULA, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>modula IN (values)</code>
     */
    public List<VereinPojo> fetchByModula(Boolean... values) {
        return fetch(Verein.VEREIN.MODULA, values);
    }

    /**
     * Fetch records that have <code>modulb BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfModulb(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.MODULB, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>modulb IN (values)</code>
     */
    public List<VereinPojo> fetchByModulb(Boolean... values) {
        return fetch(Verein.VEREIN.MODULB, values);
    }

    /**
     * Fetch records that have <code>modulc BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfModulc(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.MODULC, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>modulc IN (values)</code>
     */
    public List<VereinPojo> fetchByModulc(Boolean... values) {
        return fetch(Verein.VEREIN.MODULC, values);
    }

    /**
     * Fetch records that have <code>moduld BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfModuld(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.MODULD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>moduld IN (values)</code>
     */
    public List<VereinPojo> fetchByModuld(Boolean... values) {
        return fetch(Verein.VEREIN.MODULD, values);
    }

    /**
     * Fetch records that have <code>module BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfModule(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.MODULE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>module IN (values)</code>
     */
    public List<VereinPojo> fetchByModule(Boolean... values) {
        return fetch(Verein.VEREIN.MODULE, values);
    }

    /**
     * Fetch records that have <code>modulf BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfModulf(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.MODULF, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>modulf IN (values)</code>
     */
    public List<VereinPojo> fetchByModulf(Boolean... values) {
        return fetch(Verein.VEREIN.MODULF, values);
    }

    /**
     * Fetch records that have <code>modulg BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfModulg(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.MODULG, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>modulg IN (values)</code>
     */
    public List<VereinPojo> fetchByModulg(Boolean... values) {
        return fetch(Verein.VEREIN.MODULG, values);
    }

    /**
     * Fetch records that have <code>modulh BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfModulh(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.MODULH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>modulh IN (values)</code>
     */
    public List<VereinPojo> fetchByModulh(Boolean... values) {
        return fetch(Verein.VEREIN.MODULH, values);
    }

    /**
     * Fetch records that have <code>klasse_modula BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfKlasseModula(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.KLASSE_MODULA, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>klasse_modula IN (values)</code>
     */
    public List<VereinPojo> fetchByKlasseModula(String... values) {
        return fetch(Verein.VEREIN.KLASSE_MODULA, values);
    }

    /**
     * Fetch records that have <code>klasse_modulb BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfKlasseModulb(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.KLASSE_MODULB, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>klasse_modulb IN (values)</code>
     */
    public List<VereinPojo> fetchByKlasseModulb(String... values) {
        return fetch(Verein.VEREIN.KLASSE_MODULB, values);
    }

    /**
     * Fetch records that have <code>klasse_modulh BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfKlasseModulh(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.KLASSE_MODULH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>klasse_modulh IN (values)</code>
     */
    public List<VereinPojo> fetchByKlasseModulh(String... values) {
        return fetch(Verein.VEREIN.KLASSE_MODULH, values);
    }

    /**
     * Fetch records that have <code>harmonie BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfHarmonie(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.HARMONIE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>harmonie IN (values)</code>
     */
    public List<VereinPojo> fetchByHarmonie(Boolean... values) {
        return fetch(Verein.VEREIN.HARMONIE, values);
    }

    /**
     * Fetch records that have <code>brass_band BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfBrassBand(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.BRASS_BAND, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>brass_band IN (values)</code>
     */
    public List<VereinPojo> fetchByBrassBand(Boolean... values) {
        return fetch(Verein.VEREIN.BRASS_BAND, values);
    }

    /**
     * Fetch records that have <code>fanfare BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfFanfare(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.FANFARE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>fanfare IN (values)</code>
     */
    public List<VereinPojo> fetchByFanfare(Boolean... values) {
        return fetch(Verein.VEREIN.FANFARE, values);
    }

    /**
     * Fetch records that have <code>tambouren BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfTambouren(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.TAMBOUREN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tambouren IN (values)</code>
     */
    public List<VereinPojo> fetchByTambouren(Boolean... values) {
        return fetch(Verein.VEREIN.TAMBOUREN, values);
    }

    /**
     * Fetch records that have <code>perkussionsensemble BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfPerkussionsensemble(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.PERKUSSIONSENSEMBLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>perkussionsensemble IN (values)</code>
     */
    public List<VereinPojo> fetchByPerkussionsensemble(Boolean... values) {
        return fetch(Verein.VEREIN.PERKUSSIONSENSEMBLE, values);
    }

    /**
     * Fetch records that have <code>website_text BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfWebsiteText(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.WEBSITE_TEXT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>website_text IN (values)</code>
     */
    public List<VereinPojo> fetchByWebsiteText(String... values) {
        return fetch(Verein.VEREIN.WEBSITE_TEXT, values);
    }

    /**
     * Fetch records that have <code>direktion_doppeleinsatz BETWEEN
     * lowerInclusive AND upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfDirektionDoppeleinsatz(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.DIREKTION_DOPPELEINSATZ, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>direktion_doppeleinsatz IN (values)</code>
     */
    public List<VereinPojo> fetchByDirektionDoppeleinsatz(Boolean... values) {
        return fetch(Verein.VEREIN.DIREKTION_DOPPELEINSATZ, values);
    }

    /**
     * Fetch records that have <code>direktion_doppeleinsatz_verein BETWEEN
     * lowerInclusive AND upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfDirektionDoppeleinsatzVerein(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.DIREKTION_DOPPELEINSATZ_VEREIN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>direktion_doppeleinsatz_verein IN
     * (values)</code>
     */
    public List<VereinPojo> fetchByDirektionDoppeleinsatzVerein(String... values) {
        return fetch(Verein.VEREIN.DIREKTION_DOPPELEINSATZ_VEREIN, values);
    }

    /**
     * Fetch records that have <code>mitspieler_doppeleinsatz BETWEEN
     * lowerInclusive AND upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfMitspielerDoppeleinsatz(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.MITSPIELER_DOPPELEINSATZ, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>mitspieler_doppeleinsatz IN (values)</code>
     */
    public List<VereinPojo> fetchByMitspielerDoppeleinsatz(Boolean... values) {
        return fetch(Verein.VEREIN.MITSPIELER_DOPPELEINSATZ, values);
    }

    /**
     * Fetch records that have <code>confirmed_at BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfConfirmedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Verein.VEREIN.CONFIRMED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>confirmed_at IN (values)</code>
     */
    public List<VereinPojo> fetchByConfirmedAt(LocalDateTime... values) {
        return fetch(Verein.VEREIN.CONFIRMED_AT, values);
    }

    /**
     * Fetch records that have <code>tambouren_kat_a BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfTambourenKatA(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.TAMBOUREN_KAT_A, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tambouren_kat_a IN (values)</code>
     */
    public List<VereinPojo> fetchByTambourenKatA(Boolean... values) {
        return fetch(Verein.VEREIN.TAMBOUREN_KAT_A, values);
    }

    /**
     * Fetch records that have <code>tambouren_kat_b BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfTambourenKatB(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.TAMBOUREN_KAT_B, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tambouren_kat_b IN (values)</code>
     */
    public List<VereinPojo> fetchByTambourenKatB(Boolean... values) {
        return fetch(Verein.VEREIN.TAMBOUREN_KAT_B, values);
    }

    /**
     * Fetch records that have <code>tambouren_kat_c BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfTambourenKatC(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Verein.VEREIN.TAMBOUREN_KAT_C, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tambouren_kat_c IN (values)</code>
     */
    public List<VereinPojo> fetchByTambourenKatC(Boolean... values) {
        return fetch(Verein.VEREIN.TAMBOUREN_KAT_C, values);
    }

    /**
     * Fetch records that have <code>phase2_confirmed_by BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfPhase2ConfirmedBy(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.PHASE2_CONFIRMED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>phase2_confirmed_by IN (values)</code>
     */
    public List<VereinPojo> fetchByPhase2ConfirmedBy(String... values) {
        return fetch(Verein.VEREIN.PHASE2_CONFIRMED_BY, values);
    }

    /**
     * Fetch records that have <code>phase2_confirmed_at BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfPhase2ConfirmedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Verein.VEREIN.PHASE2_CONFIRMED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>phase2_confirmed_at IN (values)</code>
     */
    public List<VereinPojo> fetchByPhase2ConfirmedAt(LocalDateTime... values) {
        return fetch(Verein.VEREIN.PHASE2_CONFIRMED_AT, values);
    }

    /**
     * Fetch records that have <code>prov_wettspiel BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfProvWettspiel(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.PROV_WETTSPIEL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>prov_wettspiel IN (values)</code>
     */
    public List<VereinPojo> fetchByProvWettspiel(String... values) {
        return fetch(Verein.VEREIN.PROV_WETTSPIEL, values);
    }

    /**
     * Fetch records that have <code>prov_parademusik BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfProvParademusik(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.PROV_PARADEMUSIK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>prov_parademusik IN (values)</code>
     */
    public List<VereinPojo> fetchByProvParademusik(String... values) {
        return fetch(Verein.VEREIN.PROV_PARADEMUSIK, values);
    }

    /**
     * Fetch records that have <code>prov_platzkonzert BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfProvPlatzkonzert(String lowerInclusive, String upperInclusive) {
        return fetchRange(Verein.VEREIN.PROV_PLATZKONZERT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>prov_platzkonzert IN (values)</code>
     */
    public List<VereinPojo> fetchByProvPlatzkonzert(String... values) {
        return fetch(Verein.VEREIN.PROV_PLATZKONZERT, values);
    }

    /**
     * Fetch records that have <code>programm_last_updated BETWEEN
     * lowerInclusive AND upperInclusive</code>
     */
    public List<VereinPojo> fetchRangeOfProgrammLastUpdated(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Verein.VEREIN.PROGRAMM_LAST_UPDATED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>programm_last_updated IN (values)</code>
     */
    public List<VereinPojo> fetchByProgrammLastUpdated(LocalDateTime... values) {
        return fetch(Verein.VEREIN.PROGRAMM_LAST_UPDATED, values);
    }
}
