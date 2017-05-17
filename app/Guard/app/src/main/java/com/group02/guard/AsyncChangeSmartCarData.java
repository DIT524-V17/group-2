package com.group02.guard;

import android.util.Base64;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Runs in the background thread to update the SmartCar coordinates that are stored in the Database
 * @author Erik Laurin (EL)
 * @version 1.0.0
 */

//Add the following to sync the coordinates to the DB, replace lat/long with acutal coords
//AsyncChangeSmartCarData addCoords = new AsyncChangeSmartCarData();
//addCoords.execute("http://129.16.155.11:3000/guard/cars", lat, long, "0");
    
class AsyncChangeSmartCarData extends AsyncChangeTravellerData {

    private int responseCode;

    protected Integer doInBackground(String... params) {
        String urlString = params[0];
        String SmartCarLat = params[1];
        String SmartCarLong = params[2];
        String carID = params[3];
        setMethod("PUTcoords"); //Calls setter in superclass to specify which request method used
        HttpURLConnection connection;
        OutputStreamWriter outputWriter;

        //Adding required credentials to get passed authentication
        String guardUser = "GeorgeWBushIsThe";
        String guardPass = "PerpetratorOf911";
        String auth = guardUser + ":" + guardPass;
        String encoded = Base64.encodeToString(auth.getBytes(), Base64.NO_WRAP);

        try {
            URL url = new URL(urlString);
            String query = "latitude=" + SmartCarLat + "&longitude=" + SmartCarLong + "&car_id=" + carID;

            //Opening connection
            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestProperty("Authorization", "Basic " + encoded);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestMethod("PUT");

            //Sending Data
            outputWriter = new OutputStreamWriter(connection.getOutputStream());
            outputWriter.write(query);
            outputWriter.flush();
            outputWriter.close();
            responseCode = connection.getResponseCode();
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseCode;
    }
}
