package com.group02.guard;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Ju on 25/04/2017.
 */

public class AddTraveller extends AsyncTask<String, Void, Integer> {

    private int responseCode;
    private Context context;

    //Default empty constructor
    AddTraveller(){}

    AddTraveller (Context context){
        this.context = context;
    }

    //post
    @Override
    protected Integer doInBackground(String... params) {

        String urlString = params[0];
        String charset = "UTF-8";
        String email = params[1];
        String pass = params[2];
        URL url;
        HttpURLConnection connection;
        OutputStreamWriter outputWriter;

        try {
            url = new URL(urlString);
            String query = String.format("email=%s&password=%s",
                    URLEncoder.encode(email, charset),
                    URLEncoder.encode(pass, charset));
            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

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

    @Override
    protected void onPostExecute(Integer result){
        if(responseCode == 200) {
            Toast.makeText(context, "Traveller registered!",
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
