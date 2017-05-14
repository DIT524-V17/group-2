package com.group02.guard;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Runs in the background thread for the purpose of getting connection info
 * @author Justinas Stirbys (JS)
 * @version 1.0.0
 */

public class AsyncGetConnectivityData extends AsyncTask<String, String, Integer> {

    int responseCode;
    private String ssid;
    private String password;
    private String ipAddress;

    private Context context;
    private Session session;

    /**
     * Default empty constructor
     */
    public AsyncGetConnectivityData(){}

    /**
     * Constructor used to make object representing the class
     * @param context Activity context used to make Toast
     * @param session Login session
     */
    public AsyncGetConnectivityData(Context context, Session session){
        this.context = context;
        this.session = session;
    }

    /**
     * Receives connection data from Database
     * @param params URL passed through the execute method
     * @return a response code from the connection
     */
    @Override
    protected Integer doInBackground(String... params) {
        String urlString = params[0];

        //Creating readers to get data
        InputStreamReader inputReader;
        StringBuilder response = new StringBuilder();

        //Required to get passed authentication
        String guardUser = "GeorgeWBushIsThe" ;
        String guardPass = "PerpetratorOf911";
        String auth = guardUser + ":" + guardPass;
        String encoded = Base64.encodeToString(auth.getBytes(), Base64.NO_WRAP);

        try {
            //Opening a connection
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Authorization", "Basic " + encoded);
            inputReader = new InputStreamReader(connection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputReader);

            //Building the response into a String
            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                response.append(inputLine);
            }

            //Closing the connection
            inputReader.close();
            bufferedReader.close();
            responseCode = connection.getResponseCode();
            connection.disconnect();
            parseResponse(response.toString());

        } catch (IOException e) {
            Log.e("IOException", "Problem encountered while retrieving connection info");
        }
        return responseCode;
    }

    /**
     * Calls a metod to handle the response code
     * @param result The response code returned from doInBackground()
     */
    @Override
    protected void onPostExecute(Integer result){
        handleResponseCode(result);
    }

    /**
     * Parses JSON object to collect the required data
     * @param result String of the result received from the DB
     */
    private void parseResponse(String result){

        try{
            JSONObject jsonObject = new JSONObject(result);
            JSONArray travellerObject = jsonObject.getJSONArray("Info");

            //Going through the JSON array to find the fields needed
            for(int i=0; i< travellerObject.length(); i++) {
                ssid = travellerObject.getJSONObject(i).getString("ssid");
                password = travellerObject.getJSONObject(i).getString("password");
                ipAddress = travellerObject.getJSONObject(i).getString("ip_address");
            }
        }
        catch (JSONException e){
            Log.d("JSONException", "JSON exception caught while parsing traveller data");
        }
    }

    /**
     * Logs message based on the response code
     * @param responseCode Integer received from the connection informing of the request's status
     */
    private void handleResponseCode(int responseCode){
        String messageToDisplay;
        if(responseCode == 200) {
            messageToDisplay = "Connection info received";
            Log.e("GetConnectivity", messageToDisplay);

        }else if(responseCode == 400){
            messageToDisplay = "Syntax error in url";
            Log.e("GetConnectivity", messageToDisplay);

        }else if(responseCode == 404){
            messageToDisplay = "Page not found. Database has been moved, try again later";
            Log.e("GetConnectivity", messageToDisplay);

        }else if(responseCode == 500){
            messageToDisplay = "Server error. Try again later ";
            Log.e("GetConnectivity", messageToDisplay);

        }else if(responseCode == 503){
            messageToDisplay = "Connection error. Check your Internet connection";
            Log.e("GetConnectivity", messageToDisplay);

        }else{
            messageToDisplay = "Error while getting connection info. Error code: " + responseCode;
            Log.e("GetConnectivity", messageToDisplay);
        }
    }
    public String getSsid() {
        return ssid;
    }

    public String getPassword() {
        return password;
    }

    public String getIpAddress() {
        return ipAddress;
    }

}
