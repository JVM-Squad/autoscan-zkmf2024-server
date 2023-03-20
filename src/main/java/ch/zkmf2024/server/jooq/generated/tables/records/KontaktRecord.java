/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.records;

import ch.zkmf2024.server.jooq.generated.tables.Kontakt;
import ch.zkmf2024.server.jooq.generated.tables.interfaces.IKontakt;
import ch.zkmf2024.server.jooq.generated.tables.pojos.KontaktPojo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class KontaktRecord extends UpdatableRecordImpl<KontaktRecord> implements Record9<Long, String, String, String, Integer, String, String, String, String>, IKontakt {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>kontakt.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>kontakt.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>kontakt.vorname</code>.
     */
    @Override
    public void setVorname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>kontakt.vorname</code>.
     */
    @Override
    public String getVorname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>kontakt.nachname</code>.
     */
    @Override
    public void setNachname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>kontakt.nachname</code>.
     */
    @Override
    public String getNachname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>kontakt.adresse</code>.
     */
    @Override
    public void setAdresse(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>kontakt.adresse</code>.
     */
    @Override
    public String getAdresse() {
        return (String) get(3);
    }

    /**
     * Setter for <code>kontakt.plz</code>.
     */
    @Override
    public void setPlz(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>kontakt.plz</code>.
     */
    @Override
    public Integer getPlz() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>kontakt.ort</code>.
     */
    @Override
    public void setOrt(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>kontakt.ort</code>.
     */
    @Override
    public String getOrt() {
        return (String) get(5);
    }

    /**
     * Setter for <code>kontakt.email</code>.
     */
    @Override
    public void setEmail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>kontakt.email</code>.
     */
    @Override
    public String getEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>kontakt.telefon_privat</code>.
     */
    @Override
    public void setTelefonPrivat(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>kontakt.telefon_privat</code>.
     */
    @Override
    public String getTelefonPrivat() {
        return (String) get(7);
    }

    /**
     * Setter for <code>kontakt.telefon_mobile</code>.
     */
    @Override
    public void setTelefonMobile(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>kontakt.telefon_mobile</code>.
     */
    @Override
    public String getTelefonMobile() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, Integer, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, String, String, Integer, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Kontakt.KONTAKT.ID;
    }

    @Override
    public Field<String> field2() {
        return Kontakt.KONTAKT.VORNAME;
    }

    @Override
    public Field<String> field3() {
        return Kontakt.KONTAKT.NACHNAME;
    }

    @Override
    public Field<String> field4() {
        return Kontakt.KONTAKT.ADRESSE;
    }

    @Override
    public Field<Integer> field5() {
        return Kontakt.KONTAKT.PLZ;
    }

    @Override
    public Field<String> field6() {
        return Kontakt.KONTAKT.ORT;
    }

    @Override
    public Field<String> field7() {
        return Kontakt.KONTAKT.EMAIL;
    }

    @Override
    public Field<String> field8() {
        return Kontakt.KONTAKT.TELEFON_PRIVAT;
    }

    @Override
    public Field<String> field9() {
        return Kontakt.KONTAKT.TELEFON_MOBILE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getVorname();
    }

    @Override
    public String component3() {
        return getNachname();
    }

    @Override
    public String component4() {
        return getAdresse();
    }

    @Override
    public Integer component5() {
        return getPlz();
    }

    @Override
    public String component6() {
        return getOrt();
    }

    @Override
    public String component7() {
        return getEmail();
    }

    @Override
    public String component8() {
        return getTelefonPrivat();
    }

    @Override
    public String component9() {
        return getTelefonMobile();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getVorname();
    }

    @Override
    public String value3() {
        return getNachname();
    }

    @Override
    public String value4() {
        return getAdresse();
    }

    @Override
    public Integer value5() {
        return getPlz();
    }

    @Override
    public String value6() {
        return getOrt();
    }

    @Override
    public String value7() {
        return getEmail();
    }

    @Override
    public String value8() {
        return getTelefonPrivat();
    }

    @Override
    public String value9() {
        return getTelefonMobile();
    }

    @Override
    public KontaktRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public KontaktRecord value2(String value) {
        setVorname(value);
        return this;
    }

    @Override
    public KontaktRecord value3(String value) {
        setNachname(value);
        return this;
    }

    @Override
    public KontaktRecord value4(String value) {
        setAdresse(value);
        return this;
    }

    @Override
    public KontaktRecord value5(Integer value) {
        setPlz(value);
        return this;
    }

    @Override
    public KontaktRecord value6(String value) {
        setOrt(value);
        return this;
    }

    @Override
    public KontaktRecord value7(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public KontaktRecord value8(String value) {
        setTelefonPrivat(value);
        return this;
    }

    @Override
    public KontaktRecord value9(String value) {
        setTelefonMobile(value);
        return this;
    }

    @Override
    public KontaktRecord values(Long value1, String value2, String value3, String value4, Integer value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IKontakt from) {
        setId(from.getId());
        setVorname(from.getVorname());
        setNachname(from.getNachname());
        setAdresse(from.getAdresse());
        setPlz(from.getPlz());
        setOrt(from.getOrt());
        setEmail(from.getEmail());
        setTelefonPrivat(from.getTelefonPrivat());
        setTelefonMobile(from.getTelefonMobile());
    }

    @Override
    public <E extends IKontakt> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KontaktRecord
     */
    public KontaktRecord() {
        super(Kontakt.KONTAKT);
    }

    /**
     * Create a detached, initialised KontaktRecord
     */
    public KontaktRecord(Long id, String vorname, String nachname, String adresse, Integer plz, String ort, String email, String telefonPrivat, String telefonMobile) {
        super(Kontakt.KONTAKT);

        setId(id);
        setVorname(vorname);
        setNachname(nachname);
        setAdresse(adresse);
        setPlz(plz);
        setOrt(ort);
        setEmail(email);
        setTelefonPrivat(telefonPrivat);
        setTelefonMobile(telefonMobile);
    }

    /**
     * Create a detached, initialised KontaktRecord
     */
    public KontaktRecord(KontaktPojo value) {
        super(Kontakt.KONTAKT);

        if (value != null) {
            setId(value.getId());
            setVorname(value.getVorname());
            setNachname(value.getNachname());
            setAdresse(value.getAdresse());
            setPlz(value.getPlz());
            setOrt(value.getOrt());
            setEmail(value.getEmail());
            setTelefonPrivat(value.getTelefonPrivat());
            setTelefonMobile(value.getTelefonMobile());
        }
    }
}