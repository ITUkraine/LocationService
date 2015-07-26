package com.itukraine.repository;

import java.util.List;

import com.itukraine.model.Location;

public interface LocationRepositoryCustom {
	
	 public List<Location> findLocationsWithinProximity(double latitude, double longitude, double distance);

}
