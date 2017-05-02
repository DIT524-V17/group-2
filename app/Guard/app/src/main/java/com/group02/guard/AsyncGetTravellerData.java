package com.group02.guard;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Runs in the background thread for the purpose of getting Traveller data
 * @author Justinas Stirbys (JS)
 * @version 1.0.0
 */

public class AsyncGetTravellerData extends AsyncTask<String, String, Traveller> {
    private Context context;
    private int responseCode;
    private Traveller traveller;
    private Session session;
    private String password;

    /**
     * Default empty constructor
     */
    public AsyncGetTravellerData(){}

    /**
     * Constructor used to make object representing the class
     * @param context Activity context used to make Toast
     * @param session Login session
     */
    public AsyncGetTravellerData(Context context, Session session){
        this.context = context;
        this.session = session;
    }

    /**
     * Makes a new Traveller object that is passed to doInBackground()
     */
    @Override
    protected void onPreExecute(){
        this.traveller = new Traveller();
    }

    /**
     * Receives Traveller data from Database
     * @param params  Values passed with the AsyncGetTravellerData.execute(String... params)
     *               Required: email, url, password
     * @return a filled Traveller object
     */
    @Override
    protected Traveller doInBackground(String... params) {
        String email = params[0];
        String urlString = params[1]+"/"+ email;
        this.password = params[2];
        this.traveller.setEmail(email);
        InputStreamReader inputReader;
        StringBuilder response = new StringBuilder();

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            inputReader = new InputStreamReader(connection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputReader);

            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                response.append(inputLine);
            }

            inputReader.close();
            bufferedReader.close();
            responseCode = connection.getResponseCode();
            connection.disconnect();
            parseJsonResponse(this.traveller, response.toString());

        } catch (Exception e) {
            Log.e("Exception", "Problem encountered while retrieving traveller");
        }

        return this.traveller;

    }

    /**
     * Stores Traveller data in bundle if the password from DB matches the entered one
     * @param result Traveller object passed form doInBackground()
     */
    @Override
    protected void onPostExecute(Traveller result){
        handleResponseCode(responseCode);
        if (this.password.equals(result.getPassword())) {
            session.setLoggedin(true);
            Intent mainActivity = new Intent(context, MainActivity.class);
            Bundle travellerData = new Bundle();

            travellerData.putString("EMAIL", traveller.getEmail());
            travellerData.putString("PASSWORD", traveller.getPassword());
            travellerData.putInt("ID", traveller.getUserId());
            travellerData.putInt("STATUS", traveller.getAdminStatus());
            mainActivity.putExtras(travellerData);
            context.startActivity(mainActivity);
            Log.e("Print" , password+ " entered: " + result.getPassword());
        } else {
            Toast.makeText(context, "Wrong email/password", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Parses JSON objects and stores them in Traveller object
     * @param traveller Traveller object with information to be stored in
     * @param databaseResponse The complete response from the database
     */
    private void parseJsonResponse(Traveller traveller, String databaseResponse){
        int userId;
        String password;
        int adminStatus;

        try{
            JSONObject jsonObject = new JSONObject(databaseResponse);
            JSONArray travellerObject = jsonObject.getJSONArray("Traveller");

            for(int i=0; i< travellerObject.length(); i++) {
                userId = travellerObject.getJSONObject(i).getInt("user_id");
                password = travellerObject.getJSONObject(i).getString("password");
                adminStatus = travellerObject.getJSONObject(i).getInt("admin_status");
                traveller.setUserId(userId);
                traveller.setPassword(password);
                traveller.setAdminStatus(adminStatus);
            }
        }
        catch (JSONException e){
            Log.d("JSONException", "JSON exception caught while parsing traveller data");
        }
    }

    /**
     * Displays message for app user based on the response code
     * @param responseCode Integer that is received from the HttpUrlConnection informing of the
     *                     request's status
     */
    private void handleResponseCode(int responseCode){
        if(responseCode == 200) {
            Toast.makeText(context, "Welcome back to G.U.A.R.D.",
                    Toast.LENGTH_SHORT).show();

        }else if(responseCode == 400){
            Toast.makeText(context, "Error with email/password syntax!",
                    Toast.LENGTH_LONG).show();

        }else if(responseCode == 404){
            Toast.makeText(context, "Page not found. Database has been moved, try again later",
                    Toast.LENGTH_LONG).show();

        }else if (responseCode == 422){
            Toast.makeText(context, "Unable to process request! Please try again later",
                    Toast.LENGTH_LONG).show();

        }else if(responseCode == 500){
            Toast.makeText(context, "Server error. Try again later ",
                    Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(context, "Error while registering. Please try again",
                    Toast.LENGTH_LONG).show();
        }
    }

}

