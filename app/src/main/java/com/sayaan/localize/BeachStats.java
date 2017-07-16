package com.sayaan.localize;

/**
 * Created by sayaan on 7/15/17.
 */

public class BeachStats {

    private float waterTemp, airTemp;
    private boolean windy;
    private String weatherConditions, location;


    public BeachStats(String locationChoosen) {
        location = locationChoosen;
    }

    public float getAirTemp() {
        return airTemp;
    }

    public float getWaterTemp() {
        return waterTemp;
    }

    public String getWeatherConditions() {
        return weatherConditions;
    }

    public boolean getWindy() {
        return windy;
    }

    private DataFetcher api = new DataFetcher();

    // first call NOAA back end and get back a response



    //next take reponce and transpose the data into something useful



}
