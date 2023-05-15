/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface ITitel extends Serializable {

    /**
     * Setter for <code>titel.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>titel.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>titel.fk_verein</code>.
     */
    public void setFkVerein(Long value);

    /**
     * Getter for <code>titel.fk_verein</code>.
     */
    public Long getFkVerein();

    /**
     * Setter for <code>titel.titel_name</code>.
     */
    public void setTitelName(String value);

    /**
     * Getter for <code>titel.titel_name</code>.
     */
    public String getTitelName();

    /**
     * Setter for <code>titel.composer</code>.
     */
    public void setComposer(String value);

    /**
     * Getter for <code>titel.composer</code>.
     */
    public String getComposer();

    /**
     * Setter for <code>titel.arrangeur</code>.
     */
    public void setArrangeur(String value);

    /**
     * Getter for <code>titel.arrangeur</code>.
     */
    public String getArrangeur();

    /**
     * Setter for <code>titel.grad</code>.
     */
    public void setGrad(BigDecimal value);

    /**
     * Getter for <code>titel.grad</code>.
     */
    public BigDecimal getGrad();

    /**
     * Setter for <code>titel.duration_in_seconds</code>.
     */
    public void setDurationInSeconds(Integer value);

    /**
     * Getter for <code>titel.duration_in_seconds</code>.
     */
    public Integer getDurationInSeconds();

    /**
     * Setter for <code>titel.modul</code>.
     */
    public void setModul(String value);

    /**
     * Getter for <code>titel.modul</code>.
     */
    public String getModul();

    /**
     * Setter for <code>titel.klasse</code>.
     */
    public void setKlasse(String value);

    /**
     * Getter for <code>titel.klasse</code>.
     */
    public String getKlasse();

    /**
     * Setter for <code>titel.besetzung</code>.
     */
    public void setBesetzung(String value);

    /**
     * Getter for <code>titel.besetzung</code>.
     */
    public String getBesetzung();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ITitel
     */
    public void from(ITitel from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ITitel
     */
    public <E extends ITitel> E into(E into);
}