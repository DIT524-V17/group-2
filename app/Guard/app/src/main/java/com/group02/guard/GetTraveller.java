package com.group02.guard;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by User on 27/04/2017.
 */

public class GetTraveller extends AsyncTask<String, String, Traveller> {
    private Context context;
    private int responseCode;
    private Traveller traveller;
    private Session session;
    private String password;
    private String email;


    //Default empty constructor
    public GetTraveller(){}

    public GetTraveller(Context context, Session session){
        this.context = context;
        this.session = session;
    }

    @Override
    protected void onPreExecute(){
        this.traveller = new Traveller();
    }

    //GET
    @Override
    protected Traveller doInBackground(String... params) {
        this.email = params[0];
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

    @Override
    protected void onPostExecute(Traveller result){
        handleResponseCode(responseCode);
        if (this.password.equals(result.getPassword())) {
            //|| db.getUser(hashedEmail, hashedPass)
            //db.checkUser(travellerEmail, travellerPass, hashedEmail, hashedPass) not working
            session.setLoggedin(true);
            Intent mainActivity = new Intent(context, MainActivity.class);
            context.startActivity(mainActivity);
        } else {
            Toast.makeText(context, "Wrong email/password", Toast.LENGTH_SHORT).show();
        }
    }

    private void parseJsonResponse(Traveller traveller, String response){
        int userId;
        String password;
        int adminStatus;

        try{
            JSONObject jsonObject = new JSONObject(response);
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

