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
    // collection of locationIds for parameters to NOAA
    private static final Map<String, Integer > locationId;
    static {
        locationId = new HashMap<>();
        locationId.put("Eureka", 9418767);
        locationId.put("Los Angeles", 9413450);
        locationId.put("Monterey", 9413450);
        locationId.put("San Diego", 9410230);
        locationId.put("Santa Barbara", 9411340);
        locationId.put("San Francisco", 9414290);
        locationId.put("San Luis Obispo", 9412110);
    }

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
        parameters.put("station", locationId.get(location));
        parameters.put("product", "waterTemp");
        parameters.put("application", "Web_Services");
        Map<String, Object> response = api.callApi("https://tidesandcurrents.noaa.gov/api/datagetter", parameters, "get");

    }


    //next take reponce and transpose the data into something useful



}
