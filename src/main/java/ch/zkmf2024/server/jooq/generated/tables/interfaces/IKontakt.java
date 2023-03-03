/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.interfaces;

import java.io.Serializable;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IKontakt extends Serializable {

    /**
     * Setter for <code>kontakt.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>kontakt.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>kontakt.vorname</code>.
     */
    public void setVorname(String value);

    /**
     * Getter for <code>kontakt.vorname</code>.
     */
    public String getVorname();

    /**
     * Setter for <code>kontakt.nachname</code>.
     */
    public void setNachname(String value);

    /**
     * Getter for <code>kontakt.nachname</code>.
     */
    public String getNachname();

    /**
     * Setter for <code>kontakt.adresse</code>.
     */
    public void setAdresse(String value);

    /**
     * Getter for <code>kontakt.adresse</code>.
     */
    public String getAdresse();

    /**
     * Setter for <code>kontakt.plz</code>.
     */
    public void setPlz(Integer value);

    /**
     * Getter for <code>kontakt.plz</code>.
     */
    public Integer getPlz();

    /**
     * Setter for <code>kontakt.ort</code>.
     */
    public void setOrt(String value);

    /**
     * Getter for <code>kontakt.ort</code>.
     */
    public String getOrt();

    /**
     * Setter for <code>kontakt.email</code>.
     */
    public void setEmail(String value);

    /**
     * Getter for <code>kontakt.email</code>.
     */
    public String getEmail();

    /**
     * Setter for <code>kontakt.telefon_privat</code>.
     */
    public void setTelefonPrivat(String value);

    /**
     * Getter for <code>kontakt.telefon_privat</code>.
     */
    public String getTelefonPrivat();

    /**
     * Setter for <code>kontakt.telefon_mobile</code>.
     */
    public void setTelefonMobile(String value);

    /**
     * Getter for <code>kontakt.telefon_mobile</code>.
     */
    public String getTelefonMobile();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IKontakt
     */
    public void from(IKontakt from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IKontakt
     */
    public <E extends IKontakt> E into(E into);
}
