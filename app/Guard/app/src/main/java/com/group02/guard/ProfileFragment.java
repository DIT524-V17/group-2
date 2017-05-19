package com.group02.guard;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.UnsupportedEncodingException;

/**
 * Creates a Traveller Profile page
 * @author Justinas Stirbys
 * @version 1.0.0
 */

public class TravellerProfileFragment extends Fragment implements View.OnClickListener{
    private EditText newEmail;
    private EditText oldPass;
    private EditText newPass1;
    private EditText newPass2;

    private String email;
    private String password;
    private int userId;

    /**
     * Default empty constructor
     */
    public TravellerProfileFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_traveller_profile, parent, false);
//        //Get arguments from activity
//        Bundle bundle = this.getArguments();
//        this.email = bundle.getString("EMAIL");
//        this.password = bundle.getString("PASSWORD");
//        this.userId = bundle.getInt("ID");

        //Initiate objects in layout
        Button updateEmail = (Button) view.findViewById(R.id.updateEmail);
        Button updatePassword = (Button) view.findViewById(R.id.updatePassword);
        newEmail = (EditText) view.findViewById(R.id.emailTextBox);
        oldPass = (EditText) view.findViewById(R.id.oldPasswordTextBox);
        newPass1 = (EditText) view.findViewById(R.id.newPasswordTextBox1);
        newPass2 = (EditText) view.findViewById(R.id.newPasswordTextBox2);

        updateEmail.setOnClickListener(this);
        updatePassword.setOnClickListener(this);
        return view;
    }

    /**
     * Listens and responds to button clicks
     * @param v View belonging to a button
     */
    @Override
    public void onClick(View v) {
        String url = "http://129.16.155.11:3000/guard/travellers";
        switch (v.getId()) {
            case R.id.updateEmail:
                updateEmail(url);
                break;
            case R.id.updatePassword:
                updatePassword(url);
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
     * @param url A URL directing to the node.js server
     */
    public void updateEmail(String url){
        if(newEmail.getText().toString().isEmpty()) {
            Toast.makeText(getActivity(), "Email is empty",
                    Toast.LENGTH_SHORT).show();
        }else{
            String email = hash(newEmail.getText().toString());
            AsyncChangeTravellerData updateEmail = new AsyncChangeTravellerData(getActivity());
            updateEmail.execute(url, email, this.password, "PUTemail", this.userId +"");
        }
    }

    /**
     * Method used to update the password
     * @param url A URL directing to the node.js server
     */
    public void updatePassword(String url) {
        String pass1 = newPass1.getText().toString();
        String pass2 = newPass2.getText().toString();
        String oldPassword = oldPass.getText().toString();

        //If password fields are valid update DB
        if(checkPasswords(pass1, pass2, oldPassword)) {
            String password = hash(pass1);
            DbHelper db = new DbHelper(getActivity());
            db.addUser(this.email, password);
            AsyncChangeTravellerData updatePass = new AsyncChangeTravellerData(getActivity());
            updatePass.execute(url, this.email, password, "PUTpass", this.userId + "");
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
            Toast.makeText(getActivity(), "Passwords can't be empty",
                    Toast.LENGTH_SHORT).show();
            return false;

        //Checks if passwords are 8 characters
        }else if(password1.length() < 8 || password2.length() < 8){
            Toast.makeText(getActivity(), "Password must be at least 8 characters",
                    Toast.LENGTH_SHORT).show();
            return false;

        //Checking if both new password are the same
        }else if(!password1.equals(password2)){
            Toast.makeText(getActivity(), "Passwords don't match",
                    Toast.LENGTH_SHORT).show();
            return false;

        }else if(!hashedOldPass.equals(this.password)){
            Toast.makeText(getActivity(), "Incorrect old password",
                    Toast.LENGTH_SHORT).show();
            return false;

        //Return true if all criteria are met
        }else{
            return true;
        }
    }
}
