package com.group02.guard;

import android.content.Intent;
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
 * @author Gabriel Bulai
 * @version 1.0.0
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button login, register;
    private EditText etEmail, etPass;
    private DbHelper db;
    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new DbHelper(this);
        session = new Session(this);
        login = (Button) findViewById(R.id.btnLogin);
        register = (Button) findViewById(R.id.btnReg);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPass = (EditText) findViewById(R.id.etPass);
        login.setOnClickListener(this);
        register.setOnClickListener(this);

        if (session.loggedin()) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }
    }

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

    private void login() {
        String email = etEmail.getText().toString();
        String pass = etPass.getText().toString();
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

        if (etEmail.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "e-mail is empty",
                    Toast.LENGTH_SHORT).show();
        }else if(etPass.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "password is empty",
                    Toast.LENGTH_SHORT).show();
        }else{
            AsyncGetTravellerData getTraveller = new AsyncGetTravellerData(this, session);
            final String url = "http://129.16.229.198:3030/guard/travellers";
//            String url = "http://129.16.155.11:3000/guard/travellers";
            getTraveller.execute(url, hashedEmail, hashedPass);
        }
    }
}
