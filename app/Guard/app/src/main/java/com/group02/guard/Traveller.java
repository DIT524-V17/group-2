package com.group02.guard;

/**
 * Created by User on 30/04/2017.
 */

public class Traveller {

    int userId;
    String email;
    String password;
    int adminStatus;

    //Default public constructor
    public Traveller(){}

    public Traveller(int userId, String email, String password, int adminStatus) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.adminStatus = adminStatus;
    }

    //Setters
    public void setUserId(int newId){
        this.userId = newId;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    public void setAdminStatus(int status){
        this.adminStatus = status;
    }

    //Getters
    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }
    public int getUserId(){
        return userId;
    }

    public int getAdminStatus(){
        return adminStatus;
    }
}
