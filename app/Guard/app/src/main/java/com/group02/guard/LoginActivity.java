package com.group02.guard;
/**
 * The class creates an activity that handles database and session and allows the user to log in
 *
 * @author Gabriel Bulai
 * @version 1.0
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.UnsupportedEncodingException;

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

        AsyncGetTravellerData getTraveller = new AsyncGetTravellerData(this, session);
        String url = "http://192.168.1.193:3000/guard/travellers";
        getTraveller.execute(hashedEmail, url, hashedPass);

//        if (hashedPass.equals(hashedPassDb) && hashedEmail.equals(travellerEmail)) {
//            //|| db.getUser(hashedEmail, hashedPass)
//            //db.checkUser(travellerEmail, travellerPass, hashedEmail, hashedPass) not working
//            session.setLoggedin(true);
//            startActivity(new Intent(LoginActivity.this, MainActivity.class));
//            finish();
//        } else {
//            Toast.makeText(getApplicationContext(), "Wrong email/password", Toast.LENGTH_SHORT).show();
//        }
    }
}
