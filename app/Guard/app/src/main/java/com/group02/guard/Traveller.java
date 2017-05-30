package com.group02.guard;

/**
 * Creates a Traveller object
 * @author Justinas Stirbys
 * @version 1.0.0
 */

public class Traveller {

    int userId;
    String email;
    String password;
    int adminStatus;

    /**
     * Default public constructor
     */
    public Traveller(){}

    /**
     * Constructor with values
     * @param userId, Unique identifier for users
     * @param email, Email used to sign in/up
     * @param password, Password used to sign in/up
     * @param adminStatus, Administrator status
     */
    public Traveller(int userId, String email, String password, int adminStatus) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.adminStatus = adminStatus;
    }

    /**
     * Sets new unique identifier for user
     * @param newId, New ID
     */
    public void setUserId(int newId){
        this.userId = newId;
    }

    /**
     * Sets new email for user
     * @param newEmail, New email
     */
    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    /**
     * Sets new password for user
     * @param newPassword, new password
     */
    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    /**
     * Sets new admin status for user
     * @param status, int representing admin status
     */
    public void setAdminStatus(int status){
        this.adminStatus = status;
    }

    /**
     * @return Email of a user
     */
    public String getEmail(){
        return this.email;
    }

    /**
     * @return user's password
     */
    public String getPassword(){
        return this.password;
    }

    /**
     * @return user's unique ID
     */
    public int getUserId(){
        return userId;
    }

    /**
     * @return user's admin status
     */
    public int getAdminStatus() { return adminStatus; }

}
