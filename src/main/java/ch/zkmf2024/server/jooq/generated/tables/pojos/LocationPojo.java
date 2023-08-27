/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.pojos;

import ch.zkmf2024.server.jooq.generated.enums.LocationLocationType;
import ch.zkmf2024.server.jooq.generated.tables.interfaces.ILocation;

import java.math.BigDecimal;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class LocationPojo implements ILocation {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String address;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private LocationLocationType locationType;
    private String capacity;
    private String modules;
    private Long einspiellokalId;
    private Long instrumentendepotId;
    private Long juryfeedbackId;

    public LocationPojo() {
    }

    public LocationPojo(ILocation value) {
        this.id = value.getId();
        this.name = value.getName();
        this.address = value.getAddress();
        this.latitude = value.getLatitude();
        this.longitude = value.getLongitude();
        this.locationType = value.getLocationType();
        this.capacity = value.getCapacity();
        this.modules = value.getModules();
        this.einspiellokalId = value.getEinspiellokalId();
        this.instrumentendepotId = value.getInstrumentendepotId();
        this.juryfeedbackId = value.getJuryfeedbackId();
    }

    public LocationPojo(
            Long id,
            String name,
            String address,
            BigDecimal latitude,
            BigDecimal longitude,
            LocationLocationType locationType,
            String capacity,
            String modules,
            Long einspiellokalId,
            Long instrumentendepotId,
            Long juryfeedbackId
    ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.locationType = locationType;
        this.capacity = capacity;
        this.modules = modules;
        this.einspiellokalId = einspiellokalId;
        this.instrumentendepotId = instrumentendepotId;
        this.juryfeedbackId = juryfeedbackId;
    }

    /**
     * Getter for <code>location.id</code>.
     */
    @Override
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>location.id</code>.
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>location.name</code>.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>location.name</code>.
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>location.address</code>.
     */
    @Override
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for <code>location.address</code>.
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter for <code>location.latitude</code>.
     */
    @Override
    public BigDecimal getLatitude() {
        return this.latitude;
    }

    /**
     * Setter for <code>location.latitude</code>.
     */
    @Override
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * Getter for <code>location.longitude</code>.
     */
    @Override
    public BigDecimal getLongitude() {
        return this.longitude;
    }

    /**
     * Setter for <code>location.longitude</code>.
     */
    @Override
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * Getter for <code>location.location_type</code>.
     */
    @Override
    public LocationLocationType getLocationType() {
        return this.locationType;
    }

    /**
     * Setter for <code>location.location_type</code>.
     */
    @Override
    public void setLocationType(LocationLocationType locationType) {
        this.locationType = locationType;
    }

    /**
     * Getter for <code>location.capacity</code>.
     */
    @Override
    public String getCapacity() {
        return this.capacity;
    }

    /**
     * Setter for <code>location.capacity</code>.
     */
    @Override
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * Getter for <code>location.modules</code>.
     */
    @Override
    public String getModules() {
        return this.modules;
    }

    /**
     * Setter for <code>location.modules</code>.
     */
    @Override
    public void setModules(String modules) {
        this.modules = modules;
    }

    /**
     * Getter for <code>location.einspiellokal_id</code>.
     */
    @Override
    public Long getEinspiellokalId() {
        return this.einspiellokalId;
    }

    /**
     * Setter for <code>location.einspiellokal_id</code>.
     */
    @Override
    public void setEinspiellokalId(Long einspiellokalId) {
        this.einspiellokalId = einspiellokalId;
    }

    /**
     * Getter for <code>location.instrumentendepot_id</code>.
     */
    @Override
    public Long getInstrumentendepotId() {
        return this.instrumentendepotId;
    }

    /**
     * Setter for <code>location.instrumentendepot_id</code>.
     */
    @Override
    public void setInstrumentendepotId(Long instrumentendepotId) {
        this.instrumentendepotId = instrumentendepotId;
    }

    /**
     * Getter for <code>location.juryfeedback_id</code>.
     */
    @Override
    public Long getJuryfeedbackId() {
        return this.juryfeedbackId;
    }

    /**
     * Setter for <code>location.juryfeedback_id</code>.
     */
    @Override
    public void setJuryfeedbackId(Long juryfeedbackId) {
        this.juryfeedbackId = juryfeedbackId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final LocationPojo other = (LocationPojo) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        } else if (!this.id.equals(other.id))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        if (this.address == null) {
            if (other.address != null)
                return false;
        } else if (!this.address.equals(other.address))
            return false;
        if (this.latitude == null) {
            if (other.latitude != null)
                return false;
        } else if (!this.latitude.equals(other.latitude))
            return false;
        if (this.longitude == null) {
            if (other.longitude != null)
                return false;
        } else if (!this.longitude.equals(other.longitude))
            return false;
        if (this.locationType == null) {
            if (other.locationType != null)
                return false;
        } else if (!this.locationType.equals(other.locationType))
            return false;
        if (this.capacity == null) {
            if (other.capacity != null)
                return false;
        } else if (!this.capacity.equals(other.capacity))
            return false;
        if (this.modules == null) {
            if (other.modules != null)
                return false;
        } else if (!this.modules.equals(other.modules))
            return false;
        if (this.einspiellokalId == null) {
            if (other.einspiellokalId != null)
                return false;
        } else if (!this.einspiellokalId.equals(other.einspiellokalId))
            return false;
        if (this.instrumentendepotId == null) {
            if (other.instrumentendepotId != null)
                return false;
        } else if (!this.instrumentendepotId.equals(other.instrumentendepotId))
            return false;
        if (this.juryfeedbackId == null) {
            if (other.juryfeedbackId != null)
                return false;
        } else if (!this.juryfeedbackId.equals(other.juryfeedbackId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
        result = prime * result + ((this.latitude == null) ? 0 : this.latitude.hashCode());
        result = prime * result + ((this.longitude == null) ? 0 : this.longitude.hashCode());
        result = prime * result + ((this.locationType == null) ? 0 : this.locationType.hashCode());
        result = prime * result + ((this.capacity == null) ? 0 : this.capacity.hashCode());
        result = prime * result + ((this.modules == null) ? 0 : this.modules.hashCode());
        result = prime * result + ((this.einspiellokalId == null) ? 0 : this.einspiellokalId.hashCode());
        result = prime * result + ((this.instrumentendepotId == null) ? 0 : this.instrumentendepotId.hashCode());
        result = prime * result + ((this.juryfeedbackId == null) ? 0 : this.juryfeedbackId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LocationPojo (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(address);
        sb.append(", ").append(latitude);
        sb.append(", ").append(longitude);
        sb.append(", ").append(locationType);
        sb.append(", ").append(capacity);
        sb.append(", ").append(modules);
        sb.append(", ").append(einspiellokalId);
        sb.append(", ").append(instrumentendepotId);
        sb.append(", ").append(juryfeedbackId);

        sb.append(")");
        return sb.toString();
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
    }

    @Override
    public <E extends ILocation> E into(E into) {
        into.from(this);
        return into;
    }
}