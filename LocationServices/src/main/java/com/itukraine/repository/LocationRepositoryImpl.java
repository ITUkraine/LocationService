package com.itukraine.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Circle;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.itukraine.model.Location;

@Repository
public class LocationRepositoryImpl implements LocationRepositoryCustom {

	private static final double EARTH_RADIUS = 3963.192;

	@Autowired
	MongoTemplate template;

	@Override
	public List<Location> findLocationsWithinProximity(double latitude, double longitude, double distance) {
		Circle circle = new Circle(latitude, longitude, distance / EARTH_RADIUS);
		Query query = new Query(Criteria.where("location").within(circle));
		List<Location> locations = template.find(query, Location.class);
		return locations;
	}
}
