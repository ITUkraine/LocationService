package com.itukraine.model;

import org.springframework.data.annotation.Id;

public class Location {

    @Id
    private String id;

    private Coordinats location;
    private long timestamp;
    private long subjectID;

    public Location() {
    }

    public Coordinats getLocation() {
	return location;
    }

    public void setLocation(Coordinats location) {
	this.location = location;
    }

    public long getTimestamp() {
	return timestamp;
    }

    public void setTimestamp(long timestamp) {
	this.timestamp = timestamp;
    }

    public long getSubjectID() {
	return subjectID;
    }

    public void setSubjectID(long subjectID) {
	this.subjectID = subjectID;
    }

    class Coordinats {
	private double latitude;
	private double longitude;

	public Coordinats() {
	}

	public double getLatitude() {
	    return latitude;
	}

	public void setLatitude(double latitude) {
	    this.latitude = latitude;
	}

	public double getLongitude() {
	    return longitude;
	}

	public void setLongitude(double longitude) {
	    this.longitude = longitude;
	}
    }
}
