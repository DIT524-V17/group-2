package com.group02.guard;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.UnsupportedEncodingException;

/**
 * The class creates an activity that handles database and session and allows the user to log in
 * @author Gabriel Bulai(GB), Justinas Stirbys (JS)
 * @version 1.0.1 JS
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etEmail;
    private EditText etPass;
    private DbHelper db;
    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new DbHelper(this);
        session = new Session(this);
        Button login = (Button) findViewById(R.id.btnLogin);
        Button register = (Button) findViewById(R.id.btnReg);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPass = (EditText) findViewById(R.id.etPass);
        login.setOnClickListener(this);
        register.setOnClickListener(this);

        if (session.loggedin()) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }
    }

    /**
     * Listens and responds to button clicks that happen in the LoginActivity
     * @param v View belonging to a button
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogin:
                login();
                break;
            case R.id.btnReg:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;
            default:
        }
    }

    /**
     * Responsible for signing into the Traveller account
     */
    private void login() {
        String email = etEmail.getText().toString();
        String pass = etPass.getText().toString();
        String salt = "";


        AsyncReachInternet reachInternet = new AsyncReachInternet();
        reachInternet.execute();

        //Hashing password
        String hashedPass = null;
        try {
            hashedPass = HashInformation.Hash(pass, salt);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //Hashing email
        String hashedEmail = null;
        try {
            hashedEmail = HashInformation.Hash(email, salt);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //Checking if something is entered in both fields
        if (etEmail.getText().toString().isEmpty() || etPass.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Email/password is empty",
                    Toast.LENGTH_SHORT).show();
        }

        //Check to see if internet connection is available to get information from DB
        if (reachInternet.getInternet()){
            AsyncGetTravellerData getTraveller = new AsyncGetTravellerData(this, session);
            String url = "http://129.16.155.11:3000/guard/travellers";
            getTraveller.execute(url, hashedEmail, hashedPass);

        //Unavailable connection get data from SQL DB inside phone
        }else{
            //Storing values in preferences if user exists app without logout we still have them
            SharedPreferences.Editor editor =
                    getSharedPreferences("Traveller Info", MODE_PRIVATE).edit();
            editor.putString("email", hashedEmail);
            editor.putString("password", hashedPass);
            editor.apply();

            Log.e("processFinish", hashedEmail + " pass: " + hashedPass);

            loginSql(hashedEmail, hashedPass);
        }
    }

    /**
     * Uses SQLDatabase to login with the param values
     * @param email The hashed emailed entered when login in
     * @param password The hashed password entered when login in
     */
    public void loginSql(String email, String password){
        if(db.getUser(email, password)){
            session.setLoggedin(true);
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }else{
            Toast.makeText(this, "Wrong email/password", Toast.LENGTH_SHORT).show();
        }
    }
}
