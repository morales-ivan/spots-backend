package com.spots.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "photographs")
public class Photograph {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "spot_id")
    private int spotId;

    @JsonProperty("spotterId")
    private int spotter_id;

    private String url;

    public Photograph() {    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    @JsonIgnore
    public int getSpotter_id() {
        return spotter_id;
    }

    public void setSpotter_id(int spotter_id) {
        this.spotter_id = spotter_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public Photograph(int id, int spotId, int spotter_id, String url) {
        this.id = id;
        this.spotId = spotId;
        this.spotter_id = spotter_id;
        this.url = url;
    }
}
