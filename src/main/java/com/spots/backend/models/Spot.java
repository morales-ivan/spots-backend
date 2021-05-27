package com.spots.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "spots")
public class Spot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    @JsonProperty("spotterId")
    private int spotter_id;

    private double latitude;

    private double longitude;

    public Spot() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonIgnore
    public int getSpotter_id() {
        return spotter_id;
    }

    public void setSpotter_id(int spotter_id) {
        this.spotter_id = spotter_id;
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

    public Spot(int id, String name, String description, int spotter_id, double latitude, double longitude) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.spotter_id = spotter_id;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
