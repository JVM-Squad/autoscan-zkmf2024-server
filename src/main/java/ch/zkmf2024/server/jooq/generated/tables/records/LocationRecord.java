/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.records;

import ch.zkmf2024.server.jooq.generated.enums.LocationLocationType;
import ch.zkmf2024.server.jooq.generated.tables.Location;
import ch.zkmf2024.server.jooq.generated.tables.interfaces.ILocation;
import ch.zkmf2024.server.jooq.generated.tables.pojos.LocationPojo;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class LocationRecord extends UpdatableRecordImpl<LocationRecord> implements Record11<Long, String, String, BigDecimal, BigDecimal, LocationLocationType, String, String, Long, Long, Long>, ILocation {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>location.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>location.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>location.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>location.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>location.address</code>.
     */
    @Override
    public void setAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>location.address</code>.
     */
    @Override
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>location.latitude</code>.
     */
    @Override
    public void setLatitude(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>location.latitude</code>.
     */
    @Override
    public BigDecimal getLatitude() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>location.longitude</code>.
     */
    @Override
    public void setLongitude(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>location.longitude</code>.
     */
    @Override
    public BigDecimal getLongitude() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>location.location_type</code>.
     */
    @Override
    public void setLocationType(LocationLocationType value) {
        set(5, value);
    }

    /**
     * Getter for <code>location.location_type</code>.
     */
    @Override
    public LocationLocationType getLocationType() {
        return (LocationLocationType) get(5);
    }

    /**
     * Setter for <code>location.capacity</code>.
     */
    @Override
    public void setCapacity(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>location.capacity</code>.
     */
    @Override
    public String getCapacity() {
        return (String) get(6);
    }

    /**
     * Setter for <code>location.modules</code>.
     */
    @Override
    public void setModules(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>location.modules</code>.
     */
    @Override
    public String getModules() {
        return (String) get(7);
    }

    /**
     * Setter for <code>location.einspiellokal_id</code>.
     */
    @Override
    public void setEinspiellokalId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>location.einspiellokal_id</code>.
     */
    @Override
    public Long getEinspiellokalId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>location.instrumentendepot_id</code>.
     */
    @Override
    public void setInstrumentendepotId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>location.instrumentendepot_id</code>.
     */
    @Override
    public Long getInstrumentendepotId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>location.juryfeedback_id</code>.
     */
    @Override
    public void setJuryfeedbackId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>location.juryfeedback_id</code>.
     */
    @Override
    public Long getJuryfeedbackId() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, BigDecimal, BigDecimal, LocationLocationType, String, String, Long, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, String, BigDecimal, BigDecimal, LocationLocationType, String, String, Long, Long, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Location.LOCATION.ID;
    }

    @Override
    public Field<String> field2() {
        return Location.LOCATION.NAME;
    }

    @Override
    public Field<String> field3() {
        return Location.LOCATION.ADDRESS;
    }

    @Override
    public Field<BigDecimal> field4() {
        return Location.LOCATION.LATITUDE;
    }

    @Override
    public Field<BigDecimal> field5() {
        return Location.LOCATION.LONGITUDE;
    }

    @Override
    public Field<LocationLocationType> field6() {
        return Location.LOCATION.LOCATION_TYPE;
    }

    @Override
    public Field<String> field7() {
        return Location.LOCATION.CAPACITY;
    }

    @Override
    public Field<String> field8() {
        return Location.LOCATION.MODULES;
    }

    @Override
    public Field<Long> field9() {
        return Location.LOCATION.EINSPIELLOKAL_ID;
    }

    @Override
    public Field<Long> field10() {
        return Location.LOCATION.INSTRUMENTENDEPOT_ID;
    }

    @Override
    public Field<Long> field11() {
        return Location.LOCATION.JURYFEEDBACK_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getAddress();
    }

    @Override
    public BigDecimal component4() {
        return getLatitude();
    }

    @Override
    public BigDecimal component5() {
        return getLongitude();
    }

    @Override
    public LocationLocationType component6() {
        return getLocationType();
    }

    @Override
    public String component7() {
        return getCapacity();
    }

    @Override
    public String component8() {
        return getModules();
    }

    @Override
    public Long component9() {
        return getEinspiellokalId();
    }

    @Override
    public Long component10() {
        return getInstrumentendepotId();
    }

    @Override
    public Long component11() {
        return getJuryfeedbackId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getAddress();
    }

    @Override
    public BigDecimal value4() {
        return getLatitude();
    }

    @Override
    public BigDecimal value5() {
        return getLongitude();
    }

    @Override
    public LocationLocationType value6() {
        return getLocationType();
    }

    @Override
    public String value7() {
        return getCapacity();
    }

    @Override
    public String value8() {
        return getModules();
    }

    @Override
    public Long value9() {
        return getEinspiellokalId();
    }

    @Override
    public Long value10() {
        return getInstrumentendepotId();
    }

    @Override
    public Long value11() {
        return getJuryfeedbackId();
    }

    @Override
    public LocationRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public LocationRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public LocationRecord value3(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public LocationRecord value4(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    @Override
    public LocationRecord value5(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    @Override
    public LocationRecord value6(LocationLocationType value) {
        setLocationType(value);
        return this;
    }

    @Override
    public LocationRecord value7(String value) {
        setCapacity(value);
        return this;
    }

    @Override
    public LocationRecord value8(String value) {
        setModules(value);
        return this;
    }

    @Override
    public LocationRecord value9(Long value) {
        setEinspiellokalId(value);
        return this;
    }

    @Override
    public LocationRecord value10(Long value) {
        setInstrumentendepotId(value);
        return this;
    }

    @Override
    public LocationRecord value11(Long value) {
        setJuryfeedbackId(value);
        return this;
    }

    @Override
    public LocationRecord values(Long value1, String value2, String value3, BigDecimal value4, BigDecimal value5, LocationLocationType value6, String value7, String value8, Long value9, Long value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ILocation from) {
        setId(from.getId());
        setName(from.getName());
        setAddress(from.getAddress());
        setLatitude(from.getLatitude());
        setLongitude(from.getLongitude());
        setLocationType(from.getLocationType());
        setCapacity(from.getCapacity());
        setModules(from.getModules());
        setEinspiellokalId(from.getEinspiellokalId());
        setInstrumentendepotId(from.getInstrumentendepotId());
        setJuryfeedbackId(from.getJuryfeedbackId());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends ILocation> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LocationRecord
     */
    public LocationRecord() {
        super(Location.LOCATION);
    }

    /**
     * Create a detached, initialised LocationRecord
     */
    public LocationRecord(Long id, String name, String address, BigDecimal latitude, BigDecimal longitude, LocationLocationType locationType, String capacity, String modules, Long einspiellokalId, Long instrumentendepotId, Long juryfeedbackId) {
        super(Location.LOCATION);

        setId(id);
        setName(name);
        setAddress(address);
        setLatitude(latitude);
        setLongitude(longitude);
        setLocationType(locationType);
        setCapacity(capacity);
        setModules(modules);
        setEinspiellokalId(einspiellokalId);
        setInstrumentendepotId(instrumentendepotId);
        setJuryfeedbackId(juryfeedbackId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised LocationRecord
     */
    public LocationRecord(LocationPojo value) {
        super(Location.LOCATION);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setAddress(value.getAddress());
            setLatitude(value.getLatitude());
            setLongitude(value.getLongitude());
            setLocationType(value.getLocationType());
            setCapacity(value.getCapacity());
            setModules(value.getModules());
            setEinspiellokalId(value.getEinspiellokalId());
            setInstrumentendepotId(value.getInstrumentendepotId());
            setJuryfeedbackId(value.getJuryfeedbackId());
            resetChangedOnNotNull();
        }
    }
}