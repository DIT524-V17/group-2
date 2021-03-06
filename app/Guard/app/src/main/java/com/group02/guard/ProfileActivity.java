package com.group02.guard;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Creates a Traveller Profile page
 * @author Justinas Stirbys
 * @version 1.0.1
 */

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText oldEmail;
    private EditText newEmail;
    private EditText oldPass;
    private EditText newPass1;
    private EditText newPass2;

    private String email;
    private String password;
    private int userId;

    private DbHelper db;
    /**
     * Default empty constructor
     */
    public ProfileActivity() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        db = new DbHelper(this);

        //Getting values from shared preferences and passing them to profile activity
        SharedPreferences preferences = getSharedPreferences("Traveller Info", MODE_PRIVATE);
        userId = preferences.getInt("userId", 0);
        email = preferences.getString("email", null);
        password = preferences.getString("password", null);

        //Initiate objects in layout
        Button updateEmailButton = (Button) findViewById(R.id.updateEmail);
        Button updatePasswordButton = (Button) findViewById(R.id.updatePassword);
        Button deleteAccountButton = (Button) findViewById(R.id.deleteAccount);

        oldEmail = (EditText) findViewById(R.id.oldEmail);
        newEmail = (EditText) findViewById(R.id.emailTextBox);
        oldPass = (EditText) findViewById(R.id.oldPasswordTextBox);
        newPass1 = (EditText) findViewById(R.id.newPasswordTextBox1);
        newPass2 = (EditText) findViewById(R.id.newPasswordTextBox2);

        updateEmailButton.setOnClickListener(this);
        updatePasswordButton.setOnClickListener(this);
        deleteAccountButton.setOnClickListener(this);


        //Changing colour of the profile button in the bottom toolbar
        ToolbarBottomFragment fragment = (ToolbarBottomFragment)getSupportFragmentManager()
                .findFragmentById(R.id.bottomBar);
        fragment.buttonChecked("profile");
        fragment.profileNav.setClickable(false);
    }

    /**
     * Listens and responds to button clicks
     * @param v View belonging to a button
     */
    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.updateEmail:
                    updateEmail();
                    break;
                case R.id.updatePassword:
                    updatePassword();
                    break;
                case R.id.deleteAccount:
                    deleteMyAccount();
                    break;
                default:
            }
    }

    /**
     * Used to hash email and password before sending them
     * @param value String value to be hashed
     * @return A hashed values
     */
    public String hash(String value){
        String salt = "";
        String hashedValue = null;
        try {
            hashedValue = HashInformation.Hash(value, salt);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return hashedValue;
    }

    /**
     * Method used to update the email
     */
    public void updateEmail(){
        String url = "http://129.16.155.11:3000/guard/email";
        String oldEmailHash = hash(oldEmail.getText().toString());

        if(newEmail.getText().toString().isEmpty() || oldEmail.getText().toString().isEmpty()) {
            Toast.makeText(this,
                    "Email cannot be empty",
                    Toast.LENGTH_SHORT).show();
        }else if (!oldEmailHash.equals(this.email)) {
            Toast.makeText(this,
                    "Incorrect old email",
                    Toast.LENGTH_SHORT).show();
        }else if (!isEmailValid(newEmail.getText().toString())){
            Toast.makeText(this,
                    "New email is not valid",
                    Toast.LENGTH_SHORT).show();
        }else{
            String email = hash(newEmail.getText().toString());
            AsyncChangeTravellerData updateEmail = new AsyncChangeTravellerData(this);
            db.addUser(email, this.password);
            updateEmail.execute(url, email, this.password, "PUTemail", userId + "");
        }
    }

    /**
     * Method used to update the password
     */
    public void updatePassword() {
        String url = "http://129.16.155.11:3000/guard/password";

        String pass1 = newPass1.getText().toString();
        String pass2 = newPass2.getText().toString();
        String oldPassword = oldPass.getText().toString();

        //If password fields are valid update DB
        if(checkPasswords(pass1, pass2, oldPassword)) {
            String password = hash(pass1);

            db.addUser(this.email, password);
            AsyncChangeTravellerData updatePass = new AsyncChangeTravellerData(this);
            updatePass.execute(url, this.email, password, "PUTpass", userId + "");
        }
    }

    /**
     * Checks if the password fields are valid
     * @param password1 New password
     * @param password2 Confirming new password
     * @param oldPassword Current/old password
     * @return True if passwords are valid
     */
    public boolean checkPasswords(String password1, String password2, String oldPassword){
        String hashedOldPass = hash(oldPassword);

        //Checks if there is something in all password fields
        if(newPass1.getText().toString().isEmpty() ||
                newPass2.getText().toString().isEmpty() ||
                oldPass.getText().toString().isEmpty()){
            Toast.makeText(this, "Passwords can't be empty",
                    Toast.LENGTH_SHORT).show();
            return false;

            //Checks if passwords are 8 characters
        }else if(password1.length() < 8 || password2.length() < 8){
            Toast.makeText(this, "Password must be at least 8 characters",
                    Toast.LENGTH_SHORT).show();
            return false;

            //Checking if both new password are the same
        }else if(!password1.equals(password2)){
            Toast.makeText(this, "Passwords don't match",
                    Toast.LENGTH_SHORT).show();
            return false;

        }else if(!hashedOldPass.equals(this.password)){
            Toast.makeText(this, "Incorrect old password",
                    Toast.LENGTH_SHORT).show();
            return false;

            //Return true if all criteria are met
        }else{
            return true;
        }
    }

    /**
     * Checks the email validity and syntax
     * @param email The new email that will be put in the database
     * @return Boolean indicating if the email is valid
     */
    public boolean isEmailValid(String email) {
        final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        final Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * Creates a dialog and allows to delete the traveller account from the database
     */
    public void deleteMyAccount(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ProfileActivity.this);
        alertDialogBuilder.setTitle("Account Deletion");

        alertDialogBuilder
                .setMessage("Are you sure you want to delete your account?")
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    @SuppressLint("ShowToast")
                    public void onClick(DialogInterface dialog, int id) {
                        String url = "http://129.16.155.11:3000/guard/travellers";
                        AsyncChangeTravellerData deleteAccount =
                            new AsyncChangeTravellerData(ProfileActivity.this);
                        deleteAccount.execute(url, email, password, "DELETE", userId + "");
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(ProfileActivity.this,
                                "Account deletion aborted",
                                Toast.LENGTH_SHORT).show();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}