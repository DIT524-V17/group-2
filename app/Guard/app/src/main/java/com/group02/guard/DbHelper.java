package com.group02.guard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.UnsupportedEncodingException;

/**
 * Creates and houses java object responsible for managing connection to DB
 * @author Gabriel Bulai(GB), Justinas Stirbys (JS)
 * @version 1.0.1 JS
 */

public class DbHelper extends SQLiteOpenHelper {
    public static final String TAG = DbHelper.class.getSimpleName();
    public static final String DB_NAME = "G.U.A.R.D.db";
    public static final int DB_VERSION = 1;

    public static final String USER_TABLE = "users";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PASS = "password";

    /*
    create table users(
        id integer primary key autoincrement,
        email text,
        password text);
     */
    public static final String CREATE_TABLE_USERS = "CREATE TABLE " + USER_TABLE + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_EMAIL + " TEXT,"
            + COLUMN_PASS + " TEXT);";

    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_USERS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + USER_TABLE);
        onCreate(db);
    }

    /**
     * Storing user details in database
     */
    public void addUser(String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUMN_EMAIL, email);
        values.put(COLUMN_PASS, password);

        long id = db.insert(USER_TABLE, null, values);
        db.close();

        Log.d(TAG, "user inserted" + id);
    }

    /**
     * Checks to see if a user exists in the SQLite database
     * @param email Hashed email value that's entered in the login screen
     * @param pass Hashed password value that's entered in the login screen
     * @return True if user exists in the database
     */
    public boolean getUser(String email, String pass) {
        //HashMap<String, String> user = new HashMap<String, String>();
        String selectQuery = "select * from  " +
                USER_TABLE + " where " +
                COLUMN_EMAIL + " = " + "'" + email + "'" + " and " +
                COLUMN_PASS + " = " + "'" + pass + "'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        // Move to first row
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            return true;
        }
        cursor.close();
        db.close();

        return false;
    }

    /**
     * Retrieves a specific user ID from the SQLite Database
     * @param email Hashed email value that's entered in the login screen
     * @return an integer representing a user ID
     */
    public int getUserId(String email) {
        int id = -1;
        //HashMap<String, String> user = new HashMap<String, String>();
        String selectQuery = "select " + COLUMN_ID + " from  " +
                USER_TABLE + " where " +
                COLUMN_EMAIL + " = " + "'" + email + "'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        while (cursor.moveToNext()) {
            id = cursor.getInt(0);
            return id;
        }
        cursor.close();
        db.close();

        return id;
    }
}
