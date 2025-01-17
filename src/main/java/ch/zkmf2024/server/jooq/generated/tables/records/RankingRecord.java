/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.records;

import ch.zkmf2024.server.jooq.generated.tables.Ranking;
import ch.zkmf2024.server.jooq.generated.tables.interfaces.IRanking;
import ch.zkmf2024.server.jooq.generated.tables.pojos.RankingPojo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import java.math.BigDecimal;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes", "this-escape"})
public class RankingRecord extends UpdatableRecordImpl<RankingRecord> implements Record8<Long, Long, String, String, String, String, BigDecimal, Integer>, IRanking {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ranking.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>ranking.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ranking.fk_verein</code>.
     */
    @Override
    public void setFkVerein(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>ranking.fk_verein</code>.
     */
    @Override
    public Long getFkVerein() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ranking.modul</code>.
     */
    @Override
    public void setModul(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ranking.modul</code>.
     */
    @Override
    public String getModul() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ranking.klasse</code>.
     */
    @Override
    public void setKlasse(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ranking.klasse</code>.
     */
    @Override
    public String getKlasse() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ranking.besetzung</code>.
     */
    @Override
    public void setBesetzung(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>ranking.besetzung</code>.
     */
    @Override
    public String getBesetzung() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ranking.category</code>.
     */
    @Override
    public void setCategory(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>ranking.category</code>.
     */
    @Override
    public String getCategory() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ranking.score</code>.
     */
    @Override
    public void setScore(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>ranking.score</code>.
     */
    @Override
    public BigDecimal getScore() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ranking.rank</code>.
     */
    @Override
    public void setRank(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>ranking.rank</code>.
     */
    @Override
    public Integer getRank() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, String, String, String, String, BigDecimal, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, Long, String, String, String, String, BigDecimal, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Ranking.RANKING.ID;
    }

    @Override
    public Field<Long> field2() {
        return Ranking.RANKING.FK_VEREIN;
    }

    @Override
    public Field<String> field3() {
        return Ranking.RANKING.MODUL;
    }

    @Override
    public Field<String> field4() {
        return Ranking.RANKING.KLASSE;
    }

    @Override
    public Field<String> field5() {
        return Ranking.RANKING.BESETZUNG;
    }

    @Override
    public Field<String> field6() {
        return Ranking.RANKING.CATEGORY;
    }

    @Override
    public Field<BigDecimal> field7() {
        return Ranking.RANKING.SCORE;
    }

    @Override
    public Field<Integer> field8() {
        return Ranking.RANKING.RANK;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getFkVerein();
    }

    @Override
    public String component3() {
        return getModul();
    }

    @Override
    public String component4() {
        return getKlasse();
    }

    @Override
    public String component5() {
        return getBesetzung();
    }

    @Override
    public String component6() {
        return getCategory();
    }

    @Override
    public BigDecimal component7() {
        return getScore();
    }

    @Override
    public Integer component8() {
        return getRank();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getFkVerein();
    }

    @Override
    public String value3() {
        return getModul();
    }

    @Override
    public String value4() {
        return getKlasse();
    }

    @Override
    public String value5() {
        return getBesetzung();
    }

    @Override
    public String value6() {
        return getCategory();
    }

    @Override
    public BigDecimal value7() {
        return getScore();
    }

    @Override
    public Integer value8() {
        return getRank();
    }

    @Override
    public RankingRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public RankingRecord value2(Long value) {
        setFkVerein(value);
        return this;
    }

    @Override
    public RankingRecord value3(String value) {
        setModul(value);
        return this;
    }

    @Override
    public RankingRecord value4(String value) {
        setKlasse(value);
        return this;
    }

    @Override
    public RankingRecord value5(String value) {
        setBesetzung(value);
        return this;
    }

    @Override
    public RankingRecord value6(String value) {
        setCategory(value);
        return this;
    }

    @Override
    public RankingRecord value7(BigDecimal value) {
        setScore(value);
        return this;
    }

    @Override
    public RankingRecord value8(Integer value) {
        setRank(value);
        return this;
    }

    @Override
    public RankingRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, BigDecimal value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRanking from) {
        setId(from.getId());
        setFkVerein(from.getFkVerein());
        setModul(from.getModul());
        setKlasse(from.getKlasse());
        setBesetzung(from.getBesetzung());
        setCategory(from.getCategory());
        setScore(from.getScore());
        setRank(from.getRank());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IRanking> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RankingRecord
     */
    public RankingRecord() {
        super(Ranking.RANKING);
    }

    /**
     * Create a detached, initialised RankingRecord
     */
    public RankingRecord(Long id, Long fkVerein, String modul, String klasse, String besetzung, String category, BigDecimal score, Integer rank) {
        super(Ranking.RANKING);

        setId(id);
        setFkVerein(fkVerein);
        setModul(modul);
        setKlasse(klasse);
        setBesetzung(besetzung);
        setCategory(category);
        setScore(score);
        setRank(rank);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised RankingRecord
     */
    public RankingRecord(RankingPojo value) {
        super(Ranking.RANKING);

        if (value != null) {
            setId(value.getId());
            setFkVerein(value.getFkVerein());
            setModul(value.getModul());
            setKlasse(value.getKlasse());
            setBesetzung(value.getBesetzung());
            setCategory(value.getCategory());
            setScore(value.getScore());
            setRank(value.getRank());
            resetChangedOnNotNull();
        }
    }
}
