package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

/**
 * Created by ZuZ on 16/06/2017.
 */
public class Attraction {

    private String attractionName;
    private String attractionLocation;
    private String attractionDate;
    private String attractionTime;
    private int imageResourceId;

    //Constructor in HistoricalActivity
    public Attraction(String attractionName, String attractionLocation, int imageResourseId) {
        this.attractionName = attractionName;
        this.attractionLocation = attractionLocation;
        this.imageResourceId = imageResourseId;
    }

    //Constructor in EventActivity
    public Attraction(String attractionName, String attractionLocation, String attractionDate, String attractionTime) {
        this.attractionName = attractionName;
        this.attractionLocation = attractionLocation;
        this.attractionDate = attractionDate;
        this.attractionTime = attractionTime;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public String getAttractionLocation() {
        return attractionLocation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getAttractionDate() {
        return attractionDate;
    }

    public String getAttractionTime() {
        return attractionTime;
    }

}
