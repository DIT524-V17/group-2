package com.group02.guard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Creates and houses java object responsible for managing connection to DB
 * @author Gabriel Bulai(GB)
 * @version 1.0.0 GB
 */

public class DbHelper extends SQLiteOpenHelper {
    public static final String TAG = DbHelper.class.getSimpleName();
    public static final String DB_NAME = "G.U.A.R.D.db";
    public static final int DB_VERSION = 1;

    public static final String USER_TABLE = "users";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PASS = "password";

    /** Create table users(
        id integer primary key autoincrement,
        email text,
        password text);
     */
    public static final String CREATE_TABLE_USERS = "CREATE TABLE " + USER_TABLE + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_EMAIL + " TEXT,"
            + COLUMN_PASS + " TEXT);";

    /**
     * Constructor with parameters
     * @param context, Activity context
     */
    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    /**
     * Creates new SQLite database table when DbHelper is created
     * @param db, SQLite database to create
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_USERS);
    }

    /**
     * Replaces SQLite database with newer version if database already exist
     * @param db, SQLite database to create
     * @param oldVersion, old version of DB
     * @param newVersion, newer version of DB
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + USER_TABLE);
        onCreate(db);
    }

    /**
     * Storing user data in SQLite database
     * @param email, Entered email during registration
     * @param password, Entered password during registration
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
     * Retrieves user from SQLite database
     * @param email, Entered email during login
     * @param pass, Entered password during login
     * @return True if user exist in SQLite daabase, false otherwise
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
}
