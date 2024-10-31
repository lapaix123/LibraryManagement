package org.library.models;

import java.util.UUID;

public class Location {
    private UUID locationId;
    private String locationCode;
    private String locationName;
    private String locationType;
    private UUID parentId;

    // Constructors, Getters, and Setters
    public Location(UUID locationId, String locationCode, String locationName, String locationType, UUID parentId) {
        this.locationId = locationId;
        this.locationCode = locationCode;
        this.locationName = locationName;
        this.locationType = locationType;
        this.parentId = parentId;
    }

    public UUID getLocationId() {
        return locationId;
    }

    public void setLocationId(UUID locationId) {
        this.locationId = locationId;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public UUID getParentId() {
        return parentId;
    }

    public void setParentId(UUID parentId) {
        this.parentId = parentId;
    }
}
