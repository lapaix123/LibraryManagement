package org.library.controllers;

import org.library.services.LocationService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LocationController {

    @Autowired
    private LocationService locationService;

    public void addLocation(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String locationCode = request.getParameter("locationCode");
        String locationName = request.getParameter("locationName");
        String locationType = request.getParameter("locationType");
        String parentId = request.getParameter("parentId");

        locationService.addLocation(locationCode, locationName, locationType,
                parentId != null ? UUID.fromString(parentId) : null);

        request.getRequestDispatcher("locationList.jsp").forward(request, response);
    }
}
