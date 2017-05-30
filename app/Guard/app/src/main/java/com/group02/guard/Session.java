package com.group02.guard;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * The class creates a "session" held in shared preferences of the app.
 * There all user information will be stored
 * @author Gabriel Bulai
 * @version 1.0
 */

public class Session {
    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    Context context;

    /**
     * Default empty constructor
     */
    public Session(){}

    /**
     * Session constructor
     * @param ctx, context from activities
     */
    public Session(Context ctx) {
        this.context = ctx;
        prefs = ctx.getSharedPreferences("G.U.A.R.D", Context.MODE_PRIVATE);
        editor = prefs.edit();
    }

    /**
     * Sets the session to logged in, o no longer require login o enter app
     * @param loggedIn, Boolean representing session
     */
    public void setLoggedIn(boolean loggedIn) {
        editor.putBoolean("loggedInmode", loggedIn);
        editor.commit();
    }

    /**
     * @return logged in values
     */
    public boolean getLoggedIn() {
        return prefs.getBoolean("loggedInmode", false);
    }
}
