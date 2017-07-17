package com.sayaan.localize;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sayaan on 7/15/17.
 */

public class BeachStats {

    private float waterTemp, airTemp;
    private boolean windy;
    private String weatherConditions, location;
    private DataFetcher api = new DataFetcher();



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

    private void setWindy(boolean condition) {
        windy = condition;
    }

    private void setAirTemp(float temp) {
        airTemp = temp;
    }

    private void setWaterTemp(float temp) {
        waterTemp = temp;
    }

    // first call NOAA back end and get back a response
    private void getData() throws IOException{
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("format", "json");
        parameters.put("units", "english");
        parameters.put("timezone","lst");
        parameters.put("date","latest");
        parameters.put("station", location);
        Map<String, Object> info = api.callApi("https://tidesandcurrents.noaa.gov/api/datagetter", parameters, "get");

    }


    //next take reponce and transpose the data into something useful



}
