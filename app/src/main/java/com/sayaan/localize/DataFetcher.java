package com.sayaan.localize;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by sayaan on 7/9/17.
 */

public class DataFetcher {
    public float waterTemp(String urlSpec) throws IOException {
        URL url = new URL(urlSpec);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try {
            float waterTemperature = 0;

            return waterTemperature;
        } finally {
            connection.disconnect();
        }
    }

}
