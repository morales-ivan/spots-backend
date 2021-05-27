package com.spots.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "photographs")
public class Photograph {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty("spotId")
    private int spot_id;

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

    @JsonIgnore
    public int getSpot_id() {
        return spot_id;
    }

    public void setSpot_id(int spot_id) {
        this.spot_id = spot_id;
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

    public Photograph(int id, int spot_id, int spotter_id, String url) {
        this.id = id;
        this.spot_id = spot_id;
        this.spotter_id = spotter_id;
        this.url = url;
    }
}
