package com.group02.guard;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
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

public class AsyncGetConnectivityData extends AsyncTask<Void, Void, AsyncGetConnectivityData.Wrapper> {

    private final String TAG = "ASYNCGETCONNECTIVITY";
    int responseCode;
    private String ssid;
    private String password;
    private String ipAddress;

    private Context context;

    public interface AsyncResponse {
        void processFinish(Wrapper output);
    }

    public AsyncResponse delegate = null;

    public AsyncGetConnectivityData(AsyncResponse delegate, Context context){
        this.delegate = delegate;
        this.context = context;
    }

    @Override
    protected void onPostExecute(Wrapper result) {

        handleResponseCode(responseCode);
        Log.d("processFinish", "onPostExecute()");
        delegate.processFinish(result);
        Toast.makeText(context, "Finished", Toast.LENGTH_LONG);
    }

    @Override
    protected Wrapper doInBackground(Void... params) {

        Log.d("processFinish", "doInBackground()");

        String urlString = "http://129.16.155.11:3000/guard/connectivity";

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
                Log.d(TAG, inputLine);
            }

            //Closing the connection
            Log.d(TAG, "CLOSING CONNECTION");
            inputReader.close();
            bufferedReader.close();
            connection.disconnect();
            responseCode = connection.getResponseCode();
            parseResponse(response.toString());

        } catch (IOException e) {
            Log.e("IOException", "Problem encountered while retrieving connection info");
        }
        Log.d(TAG, "" + responseCode);

        Wrapper w = new Wrapper();
        w.ssid = ssid;
        w.ip = ipAddress;
        w.password = password;

        return w;
    }

    /**
     * Receives connection data from Database
     * @param params URL passed through the execute method
     * @return a response code from the connection
     */

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
                this.ssid = travellerObject.getJSONObject(i).getString("ssid");
                Log.d("AsyncGetConnectivity", ssid);
                this.password = travellerObject.getJSONObject(i).getString("password");
                Log.d("AsyncGetConnectivity", password);
                this.ipAddress = travellerObject.getJSONObject(i).getString("ip_address");
                Log.d("AsyncGetConnectivity", ipAddress);
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

    public class Wrapper {
        public String ssid;
        public String password;
        public String ip;
    }
}
