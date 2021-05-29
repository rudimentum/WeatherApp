package com.rudimentum.weatherapp.utils;

import android.net.Uri;

import java.net.MalformedURLException;
import java.net.URL;

public class NetworkUtils {
    private static final String OWM_BASE_API = "https://api.openweathermap.org/";
    private static final String DATA_API = "data/2.5/weather";
    private static final String PARAM_CITY = "q";
    private static final String PARAM_TOKEN = "appid";
    private static final String PARAM_UNITS = "units";

    public static URL generateURL(String userCity) {
        Uri builtUri = Uri.parse(OWM_BASE_API + DATA_API)
                .buildUpon()
                .appendQueryParameter(PARAM_CITY, userCity)
                .appendQueryParameter(PARAM_TOKEN, "4e2ab79173bd043b42a072e7d3f4d751")
                .appendQueryParameter(PARAM_UNITS, "metric")
                .build();

        URL url = null;
        try {
            url = new URL(builtUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }
}
