package com.group02.guard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The class creates an activity that handles database and session and allows the user to register
 * @author Gabriel Bulai(GB), Justinas Stirbys (JS)
 * @version 1.0.1 JS
 */

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etEmail, etPass, etPass2;
    private DbHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DbHelper(this);
        Button reg = (Button) findViewById(R.id.btnReg);
        TextView tvLogin = (TextView) findViewById(R.id.tvLogin);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPass = (EditText) findViewById(R.id.etPass);
        etPass2 = (EditText) findViewById(R.id.etPass2);
        reg.setOnClickListener(this);
        tvLogin.setOnClickListener(this);
    }


    /**
     * Listens and responds to button clicks that happen in the LoginActivity
     * @param v View belonging to a button
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnReg:
                register();
                break;
            case R.id.tvLogin:
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
                break;
            default:

        }
    }

    /**
     * Email verification
     * @param email, Entered Email
     * @return true if valid email
     */
    public boolean isEmailValid(String email) {
        final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        final Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * check password's validity
     * @param pass, entered password
     * @return boolean value for true or false
     */
    private boolean checkPassword(String pass) {
        if (pass.length() > 7) {
            return true;
        } else
            return false;
    }

    /**
     * checks if password1 == password2
     * @param pass, First password
     * @param pass2, Second password
     * @return boolean evaluating if both passwords mach
     */
    private boolean checkPassword2(String pass, String pass2) {
        if (pass.equals(pass2)) {
            return true;
        }
        displayToast("Passwords don't match");
        return false;
    }

    /**
     * Registers traveler to database and Shared Preferences
     */
    private void register() {
        String url = "http://129.16.155.11:3000/guard/travellers";
        String email = etEmail.getText().toString();
        String pass = etPass.getText().toString();
        String pass2 = etPass2.getText().toString();
        if (checkPassword(pass)) {
            if (checkPassword2(pass, pass2)) {
                if (isEmailValid(email)) {
                    String salt = "";

                    String hashedPass = null;
                    try {
                        hashedPass = HashInformation.Hash(pass, salt);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    String hashedEmail = null;
                    try {
                        hashedEmail = HashInformation.Hash(email, salt);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    if (email.isEmpty() && pass.isEmpty()) {
                        displayToast("Username/password field empty");
                    } else {
                        AsyncChangeTravellerData addTraveller = new AsyncChangeTravellerData(this);
                        addTraveller.execute(url, hashedEmail, hashedPass, "POST", "");
                        db.addUser(hashedEmail, hashedPass);
                        finish();
                    }
                } else
                    displayToast("Email not valid");
            } else
                displayToast("Passwords don't match");
        } else
            displayToast("Your passwords must be at least 8 characters");
    }

    /**
     * Displays visual message to app user
     * @param message, String of message to display
     */
    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
