package com.itukraine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itukraine.model.Location;
import com.itukraine.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService{
	
	    private final LocationRepository repository;
	 
	    @Autowired
	    LocationServiceImpl(LocationRepository repository) {
	        this.repository = repository;
	    }

	  	public Location create(Location location) {
	    	Location persisted = location;
	        persisted = repository.save(persisted);
	        return persisted;
	    }
	  	
	    public List<Location> findAll() {
	      return repository.findAll();
	    }
	    
	    public List<Location> findLocationsWithinProximity(double latitude, double longitude, double distance){
	    	return repository.findLocationsWithinProximity(latitude, longitude, distance);
	    }
	 
}
