package com.example.zalwe.restapiasynctask;

import android.net.Uri;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class LocationNetworkUtils {
    private final static String TAG= "LocationNetworkUtils";
    private final static String WEATHERDB_BASE_URL =
            "http://dataservice.accuweather.com/locations/v1/cities/search";

    private final static String API_KEY = "rzWQXkNKWUAXbQxDpMa77LO02nfTYu8U";

    private final static String PARAM_API_KEY = "apikey";

    private final static String Q= "q";

    private final static String PARAM_Q = "Lodz";


    public static URL buildUrlForLocation(){
        Uri buildUri = Uri.parse(WEATHERDB_BASE_URL).buildUpon()
                .appendQueryParameter(PARAM_API_KEY,API_KEY)
                .appendQueryParameter(Q,PARAM_Q)
                .build();
        URL url =null;


        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        Log.i(TAG,"buildUrlForLocation: url: "+url);
        return url;
    }

    public static String getResponseFromHttpUrl(URL url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();


        try {
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                return scanner.next();
            }else {
                return null;
            }
        }finally {
            urlConnection.disconnect();
        }
    }
}


