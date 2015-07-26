package com.itukraine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.itukraine.model.Location;
import com.itukraine.service.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationController {

	private final LocationService service;

	@Autowired
	LocationController(LocationService service) {
		this.service = service;
	}

	/**
	 * Creates and stores new location for specified subjectId
	 * @param sID
	 * @param location
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	Location create(@RequestParam(value="s") long sID, @RequestBody Location location) {
		location.setSubjectID(sID);
		return service.create(location);
	}

	
	/**
	 * Returns all locations 
	 * @return Location list
	 */
	@RequestMapping(value="/all", method = RequestMethod.GET)
	List<Location> findAll() {
		return service.findAll();
	}

	/**
	 * Returns locations within proximity of a location 
	 * @param latitude
	 * @param longitude
	 * @param distance
	 * @param timeMillis1
	 * @param timeMillis2
	 * @param sIDs
	 * @return Location list
	 */
	@RequestMapping(method = RequestMethod.GET)
	List<Location> findLocationsWithinProximity(
			@RequestParam(value = "lat") double latitude,
			@RequestParam(value = "long") double longitude,
			@RequestParam(value = "d") double distance,
			@RequestParam(value = "t1", required = false) Long timeMillis1,
			@RequestParam(value = "t2",required = false) Long timeMillis2,
			@RequestParam(value = "s",required = false) List<Long> sIDs) {
		return service.findLocationsWithinProximity(latitude, longitude,
				distance);
	}
}
