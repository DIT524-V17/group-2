package com.group02.guard;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Runs in the background thread for the purpose of adding/deleting a Traveller as well as updating
 * the Travellers password to and from the Database
 * @author Justinas Stirbys (JS)
 * @version 1.0.0
 */

public class AsyncChangeTravellerData extends AsyncTask<String, Void, Integer> {

    private int responseCode;
    private String method;
    private Context context;

    /**
     * Default empty constructor
     */
    AsyncChangeTravellerData(){}

    AsyncChangeTravellerData(Context context){
        this.context = context;
    }

    /**
     * Adds/updates/deletes data from the Database
     * @param params Values passed with the AsyncChangeTravellerData.execute(String... params)
     *               Required: url, email, password, desired method name and user_id
     * @return an Integer representing the response code when executing task
     */
    @Override
    protected Integer doInBackground(String... params) {
        //Receiving values from the execute method
        String urlString = params[0];
        String charset = "UTF-8";
        String email = params[1];
        String pass = params[2];
        this.method = params[3];
        String userId = params[4];
        URL url;
        HttpURLConnection connection;
        OutputStreamWriter outputWriter;

        //Adding required credentials to get passed authentication
        String guardUser = "GeorgeWBushIsThe";
        String guardPass = "PerpetratorOf911";
        String auth = guardUser + ":" + guardPass;
        String encoded = Base64.encodeToString(auth.getBytes(), Base64.NO_WRAP);

        try {
            //Making url
            if(method.equals("PUTemail")){
                url = new URL(urlString + "/" + userId);
            }else{
                url = new URL(urlString);
            }

            //Encoding the hashed email and password to be able to POST
            String query = String.format("email=%s&password=%s",
                    URLEncoder.encode(email, charset),
                    URLEncoder.encode(pass, charset));

            //Opening connection
            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestProperty("Authorization", "Basic " + encoded);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            //Setting the requested method based on received method string
            if(method.equals("POST"))  {
                connection.setRequestMethod("POST");
            }else if(method.equals("PUTpass") || method.equals("PUTemail")){
                connection.setRequestMethod("PUT");
            }else if(method.equals("DELETE")){
                connection.setRequestMethod("DELETE");
            }

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

    /**
     * Runs on UI thread used to display Toast
     * @param result response code, which is received after the doInBackground() is finished
     */
    @Override
    protected void onPostExecute(Integer result){
        String messageToDisplay;

        if(result == 200 || result == 201)  {
            handleMethodResponse(result);

        } else if(result == 400){
            messageToDisplay = "Error with email/password syntax! Try different email/password";
            Log.e("AddTraveller", messageToDisplay);
            Toast.makeText(context, messageToDisplay, Toast.LENGTH_LONG).show();

        }else if(result == 404){
            messageToDisplay = "Page not found. Database has been moved, try again later";
            Log.e("AddTraveller", messageToDisplay);
            Toast.makeText(context, messageToDisplay, Toast.LENGTH_LONG).show();

        }else if(result == 500){
            messageToDisplay = "Server error. Try again later ";
            Log.e("AddTraveller", messageToDisplay);
            Toast.makeText(context, messageToDisplay, Toast.LENGTH_LONG).show();

        }else if(result == 503){
            messageToDisplay = "Connection error. Check your Internet connection";
            Log.e("AddTraveller", messageToDisplay);
            Toast.makeText(context, messageToDisplay, Toast.LENGTH_LONG).show();

        }else{
            messageToDisplay = "Error while registering. Error code: " + result;
            Log.e("AddTraveller", messageToDisplay);
            Toast.makeText(context, messageToDisplay, Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Displays messages based on requested method when the connection returns a successful code
     * @param responseCode A code received form the HTTP connection
     */
    private void handleMethodResponse(Integer responseCode){
        String messageToDisplay;
        if(responseCode == 200 && this.method.equals("POST")) {
            messageToDisplay = "Email already in use";
            Log.e("AddTraveller", messageToDisplay);
            Toast.makeText(context, messageToDisplay, Toast.LENGTH_LONG).show();

        }else if(responseCode == 201 && this.method.equals("POST")){
            messageToDisplay = "Traveller registered";
            Log.e("AddTraveller", messageToDisplay);
            Toast.makeText(context, messageToDisplay, Toast.LENGTH_LONG).show();

        }else if(responseCode == 200 && this.method.equals("PUTpass")){
            messageToDisplay = "Password updated";
            Log.e("AddTraveller", messageToDisplay);
            Toast.makeText(context, messageToDisplay, Toast.LENGTH_LONG).show();

        }else if(responseCode == 200 && this.method.equals("PUTemail")){
            messageToDisplay = "Password updated";
            Log.e("AddTraveller", messageToDisplay);
            Toast.makeText(context, messageToDisplay, Toast.LENGTH_LONG).show();

        }else if(responseCode == 200 && this.method.equals("DELETE")) {
            messageToDisplay = "Traveller deleted";
            Log.e("AddTraveller", messageToDisplay);
            Toast.makeText(context, messageToDisplay, Toast.LENGTH_LONG).show();

        }else if(responseCode == 200 && this.method.equals("PUTcoords")){
            messageToDisplay = "Coordinates updated";
            Log.e("UpdateCoordinates", messageToDisplay);
        }
    }

    /**
     * Setter for subclass to set method
     * @param method the type of request method
     */
    void setMethod(String method) {
        this.method = method;
    }
}
