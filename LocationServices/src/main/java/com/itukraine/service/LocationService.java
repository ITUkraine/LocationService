package com.itukraine.service;

import java.util.List;

import com.itukraine.model.Location;

public interface LocationService {

    Location create(Location location);

    List<Location> findAll();

    List<Location> findLocationsWithinProximity(double latitude, double longitude, double distance);

}