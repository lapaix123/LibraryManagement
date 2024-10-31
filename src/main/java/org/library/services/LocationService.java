package org.library.services;

import org.library.models.Location;
import org.library.repositories.LocationRepository;

import java.util.List;
import java.util.UUID;

public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public void addLocation(String locationCode, String locationName, String locationType, UUID parentId) {
        Location location = new Location(UUID.randomUUID(), locationCode, locationName, locationType, parentId);
        locationRepository.save(location);
    }

    public List<Location> getLocationsByType(String locationType) {
        return locationRepository.findByType(locationType);
    }

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}
