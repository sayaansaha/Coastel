package com.sayaan.localize;

import android.net.Uri;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Created by sayaan on 7/9/17.
 */

public class DataFetcher {
    static HttpURLConnection createURLConnection(String urlPath, String httpMethod, int timeoutSeconds) throws IOException {
        URL url = new URL(urlPath);
        HttpURLConnection connection =(HttpURLConnection) url.openConnection();
        connection.setRequestMethod(httpMethod);
        connection.setConnectTimeout(timeoutSeconds * 1000);


        return connection;
    }

    public static HttpURLConnection createURLConnection(String urlPath, String httpMethod) throws IOException{
        String fullPath;

        if (urlPath.startsWith("http")) {
            fullPath = urlPath;
        }
        else {
            fullPath = "http//" + urlPath;
        }
        return createURLConnection(fullPath, httpMethod, 400);
    }

    public static getApiData() {

    }

    private static String attachGetParams(String path, Map<String, Object> params) {
        if (params == null) {
            return path;
        }
        else{
            Uri.Builder builder = Uri.parse(path).buildUpon();
            for (Map.Entry<String, Object> pair : params.entrySet()) {
                if (pair.getValue() == null) {
                    continue;
                }
                builder.appendQueryParameter(pair.getKey(), pair.getValue().toString());
            }
            return builder.build().toString();
        }
    }

    private static void attachPostParams(HttpURLConnection connection, Map<String, Object> params) throws IOException{
        OutputStream os = connection.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
        String query = getQuery(params);
        writer.write(query);
        writer.close();
        os.close();
    }

    private static String getQuery(Map<String, Object> params) {
        if (params == null) {
            return "";
        }
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, Object> pair : params.entrySet()) {
            if (pair.getValue() == null) {
                Log.w("App Error","Request parameter for key: " + pair.getKey() + " is null.");
                continue;
            }
            builder.appendQueryParameter(pair.getKey(), pair.getValue().toString());
        }
        return builder.build().getEncodedQuery();
    }


}
