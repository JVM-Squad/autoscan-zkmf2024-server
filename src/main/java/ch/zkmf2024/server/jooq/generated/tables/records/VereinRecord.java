/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.records;

import ch.zkmf2024.server.jooq.generated.tables.Verein;
import ch.zkmf2024.server.jooq.generated.tables.interfaces.IVerein;
import ch.zkmf2024.server.jooq.generated.tables.pojos.VereinPojo;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class VereinRecord extends UpdatableRecordImpl<VereinRecord> implements IVerein {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>verein.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>verein.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>verein.email</code>.
     */
    @Override
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>verein.email</code>.
     */
    @Override
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>verein.praesident_kontakt_id</code>.
     */
    @Override
    public void setPraesidentKontaktId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>verein.praesident_kontakt_id</code>.
     */
    @Override
    public Long getPraesidentKontaktId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>verein.direktion_kontakt_id</code>.
     */
    @Override
    public void setDirektionKontaktId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>verein.direktion_kontakt_id</code>.
     */
    @Override
    public Long getDirektionKontaktId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>verein.vereinsname</code>.
     */
    @Override
    public void setVereinsname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>verein.vereinsname</code>.
     */
    @Override
    public String getVereinsname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>verein.adresse</code>.
     */
    @Override
    public void setAdresse(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>verein.adresse</code>.
     */
    @Override
    public String getAdresse() {
        return (String) get(5);
    }

    /**
     * Setter for <code>verein.plz</code>.
     */
    @Override
    public void setPlz(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>verein.plz</code>.
     */
    @Override
    public Integer getPlz() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>verein.ort</code>.
     */
    @Override
    public void setOrt(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>verein.ort</code>.
     */
    @Override
    public String getOrt() {
        return (String) get(7);
    }

    /**
     * Setter for <code>verein.homepage</code>.
     */
    @Override
    public void setHomepage(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>verein.homepage</code>.
     */
    @Override
    public String getHomepage() {
        return (String) get(8);
    }

    /**
     * Setter for <code>verein.iban</code>.
     */
    @Override
    public void setIban(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>verein.iban</code>.
     */
    @Override
    public String getIban() {
        return (String) get(9);
    }

    /**
     * Setter for <code>verein.modula</code>.
     */
    @Override
    public void setModula(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>verein.modula</code>.
     */
    @Override
    public Boolean getModula() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>verein.modulb</code>.
     */
    @Override
    public void setModulb(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>verein.modulb</code>.
     */
    @Override
    public Boolean getModulb() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>verein.modulc</code>.
     */
    @Override
    public void setModulc(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>verein.modulc</code>.
     */
    @Override
    public Boolean getModulc() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>verein.moduld</code>.
     */
    @Override
    public void setModuld(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>verein.moduld</code>.
     */
    @Override
    public Boolean getModuld() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>verein.module</code>.
     */
    @Override
    public void setModule(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>verein.module</code>.
     */
    @Override
    public Boolean getModule() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>verein.modulf</code>.
     */
    @Override
    public void setModulf(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>verein.modulf</code>.
     */
    @Override
    public Boolean getModulf() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>verein.modulg</code>.
     */
    @Override
    public void setModulg(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>verein.modulg</code>.
     */
    @Override
    public Boolean getModulg() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>verein.modulh</code>.
     */
    @Override
    public void setModulh(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>verein.modulh</code>.
     */
    @Override
    public Boolean getModulh() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>verein.klasse_modula</code>.
     */
    @Override
    public void setKlasseModula(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>verein.klasse_modula</code>.
     */
    @Override
    public String getKlasseModula() {
        return (String) get(18);
    }

    /**
     * Setter for <code>verein.klasse_modulb</code>.
     */
    @Override
    public void setKlasseModulb(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>verein.klasse_modulb</code>.
     */
    @Override
    public String getKlasseModulb() {
        return (String) get(19);
    }

    /**
     * Setter for <code>verein.klasse_modulh</code>.
     */
    @Override
    public void setKlasseModulh(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>verein.klasse_modulh</code>.
     */
    @Override
    public String getKlasseModulh() {
        return (String) get(20);
    }

    /**
     * Setter for <code>verein.harmonie</code>.
     */
    @Override
    public void setHarmonie(Boolean value) {
        set(21, value);
    }

    /**
     * Getter for <code>verein.harmonie</code>.
     */
    @Override
    public Boolean getHarmonie() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>verein.brass_band</code>.
     */
    @Override
    public void setBrassBand(Boolean value) {
        set(22, value);
    }

    /**
     * Getter for <code>verein.brass_band</code>.
     */
    @Override
    public Boolean getBrassBand() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>verein.fanfare</code>.
     */
    @Override
    public void setFanfare(Boolean value) {
        set(23, value);
    }

    /**
     * Getter for <code>verein.fanfare</code>.
     */
    @Override
    public Boolean getFanfare() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>verein.tambouren</code>.
     */
    @Override
    public void setTambouren(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for <code>verein.tambouren</code>.
     */
    @Override
    public Boolean getTambouren() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>verein.perkussionsensemble</code>.
     */
    @Override
    public void setPerkussionsensemble(Boolean value) {
        set(25, value);
    }

    /**
     * Getter for <code>verein.perkussionsensemble</code>.
     */
    @Override
    public Boolean getPerkussionsensemble() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>verein.website_text</code>.
     */
    @Override
    public void setWebsiteText(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>verein.website_text</code>.
     */
    @Override
    public String getWebsiteText() {
        return (String) get(26);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IVerein from) {
        setId(from.getId());
        setEmail(from.getEmail());
        setPraesidentKontaktId(from.getPraesidentKontaktId());
        setDirektionKontaktId(from.getDirektionKontaktId());
        setVereinsname(from.getVereinsname());
        setAdresse(from.getAdresse());
        setPlz(from.getPlz());
        setOrt(from.getOrt());
        setHomepage(from.getHomepage());
        setIban(from.getIban());
        setModula(from.getModula());
        setModulb(from.getModulb());
        setModulc(from.getModulc());
        setModuld(from.getModuld());
        setModule(from.getModule());
        setModulf(from.getModulf());
        setModulg(from.getModulg());
        setModulh(from.getModulh());
        setKlasseModula(from.getKlasseModula());
        setKlasseModulb(from.getKlasseModulb());
        setKlasseModulh(from.getKlasseModulh());
        setHarmonie(from.getHarmonie());
        setBrassBand(from.getBrassBand());
        setFanfare(from.getFanfare());
        setTambouren(from.getTambouren());
        setPerkussionsensemble(from.getPerkussionsensemble());
        setWebsiteText(from.getWebsiteText());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IVerein> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VereinRecord
     */
    public VereinRecord() {
        super(Verein.VEREIN);
    }

    /**
     * Create a detached, initialised VereinRecord
     */
    public VereinRecord(Long id, String email, Long praesidentKontaktId, Long direktionKontaktId, String vereinsname, String adresse, Integer plz, String ort, String homepage, String iban, Boolean modula, Boolean modulb, Boolean modulc, Boolean moduld, Boolean module, Boolean modulf, Boolean modulg, Boolean modulh, String klasseModula, String klasseModulb, String klasseModulh, Boolean harmonie, Boolean brassBand, Boolean fanfare, Boolean tambouren, Boolean perkussionsensemble, String websiteText) {
        super(Verein.VEREIN);

        setId(id);
        setEmail(email);
        setPraesidentKontaktId(praesidentKontaktId);
        setDirektionKontaktId(direktionKontaktId);
        setVereinsname(vereinsname);
        setAdresse(adresse);
        setPlz(plz);
        setOrt(ort);
        setHomepage(homepage);
        setIban(iban);
        setModula(modula);
        setModulb(modulb);
        setModulc(modulc);
        setModuld(moduld);
        setModule(module);
        setModulf(modulf);
        setModulg(modulg);
        setModulh(modulh);
        setKlasseModula(klasseModula);
        setKlasseModulb(klasseModulb);
        setKlasseModulh(klasseModulh);
        setHarmonie(harmonie);
        setBrassBand(brassBand);
        setFanfare(fanfare);
        setTambouren(tambouren);
        setPerkussionsensemble(perkussionsensemble);
        setWebsiteText(websiteText);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised VereinRecord
     */
    public VereinRecord(VereinPojo value) {
        super(Verein.VEREIN);

        if (value != null) {
            setId(value.getId());
            setEmail(value.getEmail());
            setPraesidentKontaktId(value.getPraesidentKontaktId());
            setDirektionKontaktId(value.getDirektionKontaktId());
            setVereinsname(value.getVereinsname());
            setAdresse(value.getAdresse());
            setPlz(value.getPlz());
            setOrt(value.getOrt());
            setHomepage(value.getHomepage());
            setIban(value.getIban());
            setModula(value.getModula());
            setModulb(value.getModulb());
            setModulc(value.getModulc());
            setModuld(value.getModuld());
            setModule(value.getModule());
            setModulf(value.getModulf());
            setModulg(value.getModulg());
            setModulh(value.getModulh());
            setKlasseModula(value.getKlasseModula());
            setKlasseModulb(value.getKlasseModulb());
            setKlasseModulh(value.getKlasseModulh());
            setHarmonie(value.getHarmonie());
            setBrassBand(value.getBrassBand());
            setFanfare(value.getFanfare());
            setTambouren(value.getTambouren());
            setPerkussionsensemble(value.getPerkussionsensemble());
            setWebsiteText(value.getWebsiteText());
            resetChangedOnNotNull();
        }
    }
}
