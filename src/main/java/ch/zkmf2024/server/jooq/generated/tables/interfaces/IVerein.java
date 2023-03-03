/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.interfaces;

import java.io.Serializable;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IVerein extends Serializable {

    /**
     * Setter for <code>verein.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>verein.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>verein.email</code>.
     */
    public void setEmail(String value);

    /**
     * Getter for <code>verein.email</code>.
     */
    public String getEmail();

    /**
     * Setter for <code>verein.praesident_kontakt_id</code>.
     */
    public void setPraesidentKontaktId(Long value);

    /**
     * Getter for <code>verein.praesident_kontakt_id</code>.
     */
    public Long getPraesidentKontaktId();

    /**
     * Setter for <code>verein.direktion_kontakt_id</code>.
     */
    public void setDirektionKontaktId(Long value);

    /**
     * Getter for <code>verein.direktion_kontakt_id</code>.
     */
    public Long getDirektionKontaktId();

    /**
     * Setter for <code>verein.vereinsname</code>.
     */
    public void setVereinsname(String value);

    /**
     * Getter for <code>verein.vereinsname</code>.
     */
    public String getVereinsname();

    /**
     * Setter for <code>verein.adresse</code>.
     */
    public void setAdresse(String value);

    /**
     * Getter for <code>verein.adresse</code>.
     */
    public String getAdresse();

    /**
     * Setter for <code>verein.plz</code>.
     */
    public void setPlz(Integer value);

    /**
     * Getter for <code>verein.plz</code>.
     */
    public Integer getPlz();

    /**
     * Setter for <code>verein.ort</code>.
     */
    public void setOrt(String value);

    /**
     * Getter for <code>verein.ort</code>.
     */
    public String getOrt();

    /**
     * Setter for <code>verein.homepage</code>.
     */
    public void setHomepage(String value);

    /**
     * Getter for <code>verein.homepage</code>.
     */
    public String getHomepage();

    /**
     * Setter for <code>verein.iban</code>.
     */
    public void setIban(String value);

    /**
     * Getter for <code>verein.iban</code>.
     */
    public String getIban();

    /**
     * Setter for <code>verein.modula</code>.
     */
    public void setModula(Boolean value);

    /**
     * Getter for <code>verein.modula</code>.
     */
    public Boolean getModula();

    /**
     * Setter for <code>verein.modulb</code>.
     */
    public void setModulb(Boolean value);

    /**
     * Getter for <code>verein.modulb</code>.
     */
    public Boolean getModulb();

    /**
     * Setter for <code>verein.modulc</code>.
     */
    public void setModulc(Boolean value);

    /**
     * Getter for <code>verein.modulc</code>.
     */
    public Boolean getModulc();

    /**
     * Setter for <code>verein.moduld</code>.
     */
    public void setModuld(Boolean value);

    /**
     * Getter for <code>verein.moduld</code>.
     */
    public Boolean getModuld();

    /**
     * Setter for <code>verein.module</code>.
     */
    public void setModule(Boolean value);

    /**
     * Getter for <code>verein.module</code>.
     */
    public Boolean getModule();

    /**
     * Setter for <code>verein.modulf</code>.
     */
    public void setModulf(Boolean value);

    /**
     * Getter for <code>verein.modulf</code>.
     */
    public Boolean getModulf();

    /**
     * Setter for <code>verein.modulg</code>.
     */
    public void setModulg(Boolean value);

    /**
     * Getter for <code>verein.modulg</code>.
     */
    public Boolean getModulg();

    /**
     * Setter for <code>verein.modulh</code>.
     */
    public void setModulh(Boolean value);

    /**
     * Getter for <code>verein.modulh</code>.
     */
    public Boolean getModulh();

    /**
     * Setter for <code>verein.klasse_modula</code>.
     */
    public void setKlasseModula(String value);

    /**
     * Getter for <code>verein.klasse_modula</code>.
     */
    public String getKlasseModula();

    /**
     * Setter for <code>verein.klasse_modulb</code>.
     */
    public void setKlasseModulb(String value);

    /**
     * Getter for <code>verein.klasse_modulb</code>.
     */
    public String getKlasseModulb();

    /**
     * Setter for <code>verein.klasse_modulh</code>.
     */
    public void setKlasseModulh(String value);

    /**
     * Getter for <code>verein.klasse_modulh</code>.
     */
    public String getKlasseModulh();

    /**
     * Setter for <code>verein.harmonie</code>.
     */
    public void setHarmonie(Boolean value);

    /**
     * Getter for <code>verein.harmonie</code>.
     */
    public Boolean getHarmonie();

    /**
     * Setter for <code>verein.brass_band</code>.
     */
    public void setBrassBand(Boolean value);

    /**
     * Getter for <code>verein.brass_band</code>.
     */
    public Boolean getBrassBand();

    /**
     * Setter for <code>verein.fanfare</code>.
     */
    public void setFanfare(Boolean value);

    /**
     * Getter for <code>verein.fanfare</code>.
     */
    public Boolean getFanfare();

    /**
     * Setter for <code>verein.tambouren</code>.
     */
    public void setTambouren(Boolean value);

    /**
     * Getter for <code>verein.tambouren</code>.
     */
    public Boolean getTambouren();

    /**
     * Setter for <code>verein.perkussionsensemble</code>.
     */
    public void setPerkussionsensemble(Boolean value);

    /**
     * Getter for <code>verein.perkussionsensemble</code>.
     */
    public Boolean getPerkussionsensemble();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IVerein
     */
    public void from(IVerein from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IVerein
     */
    public <E extends IVerein> E into(E into);
}
