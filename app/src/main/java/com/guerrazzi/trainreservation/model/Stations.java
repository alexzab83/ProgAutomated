package com.guerrazzi.trainreservation.model;

import androidx.annotation.NonNull;

public class Stations {

    private String id;
    private String shotId;
    private String description;

    public Stations(){}

    public String getShotId() {
        return shotId;
    }

    public void setShotId(String shotId) {
        this.shotId = shotId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NonNull
    @Override
    public String toString() {
        return description;
    }
}
