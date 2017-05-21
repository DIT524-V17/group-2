package com.group02.guard;
/**
 * The class creates an activity that handles database and session and allows the user to log in
 *
 * @author Gabriel Bulai
 * @version 1.0
 */
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
            startActivity(new Intent(LoginActivity.this, NavigationActivity.class));
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
        if (hasConnection()){
            AsyncGetTravellerData getTraveller = new AsyncGetTravellerData(this, session);
            String url = "http://129.16.155.11:3000/guard/travellers";
            getTraveller.execute(url, hashedEmail, hashedPass);

        //Unavailable connection get data from SQL DB inside phone
        }else{
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
            startActivity(new Intent(LoginActivity.this, NavigationActivity.class));
            finish();
        }else{
            Toast.makeText(this, "Wrong email/password", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Checks to see if WiFi connection exist
     * @return True if WiFi connection available
     */
    public boolean hasConnection(){
        //Used to check connection state
        ConnectivityManager conn = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo info = conn.getActiveNetworkInfo();

        return (info != null && info.isConnected() &&
                info.getType() == ConnectivityManager.TYPE_WIFI);

    }
}
