package org.library.repositories;

import org.library.models.Location;
import org.library.repositories.LocationRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LocationRepositoryImpl implements LocationRepository {

    private final Connection connection;

    public LocationRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Location location) {
        String query = "INSERT INTO Location (location_id, location_code, location_name, location_type, parent_id) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setObject(1, location.getLocationId());
            stmt.setString(2, location.getLocationCode());
            stmt.setString(3, location.getLocationName());
            stmt.setString(4, location.getLocationType());
            stmt.setObject(5, location.getParentId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Location findById(UUID locationId) {
        String query = "SELECT * FROM Location WHERE location_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setObject(1, locationId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Location(
                        UUID.fromString(rs.getString("location_id")),
                        rs.getString("location_code"),
                        rs.getString("location_name"),
                        rs.getString("location_type"),
                        UUID.fromString(rs.getString("parent_id"))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Location> findByType(String locationType) {
        String query = "SELECT * FROM Location WHERE location_type = ?";
        List<Location> locations = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, locationType);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                locations.add(new Location(
                        UUID.fromString(rs.getString("location_id")),
                        rs.getString("location_code"),
                        rs.getString("location_name"),
                        rs.getString("location_type"),
                        UUID.fromString(rs.getString("parent_id"))
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return locations;
    }

    @Override
    public List<Location> findAll() {
        String query = "SELECT * FROM Location";
        List<Location> locations = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                locations.add(new Location(
                        UUID.fromString(rs.getString("location_id")),
                        rs.getString("location_code"),
                        rs.getString("location_name"),
                        rs.getString("location_type"),
                        UUID.fromString(rs.getString("parent_id"))
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return locations;
    }
}
