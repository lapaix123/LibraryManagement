package org.library.repositories;

import org.library.models.Location;
import java.util.List;
import java.util.UUID;

public interface LocationRepository {
    void save(Location location);
    Location findById(UUID locationId);
    List<Location> findByType(String locationType);
    List<Location> findAll();
}
