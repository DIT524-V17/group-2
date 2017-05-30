package com.group02.guard;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * The class generates a hash string which will be used to encrypt user input
 * @author Gabriel Bulai
 * @version 1.0
 */

public class HashInformation {

    /**
     * Used to hash information
     * @param data, Value to be hashed
     * @param salt, salt used for hashing
     * @return a hashed string of the data
     * @throws UnsupportedEncodingException If cannot use UTF-8
     */
    public static String Hash(String data, String salt) throws UnsupportedEncodingException {

        String generatedData = null;

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt.getBytes("UTF-8"));

            byte[] bytes = md.digest(data.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();


            for (int i = 0; i < bytes.length; i++) {

                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            generatedData = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedData;
    }
}



