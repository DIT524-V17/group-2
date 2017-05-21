package com.group02.guard;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class AsyncReachInternet extends AsyncTask<String, String, String> {

    public boolean url;

    @Override
    protected String doInBackground(String... params) {
        try {
            HttpURLConnection urlc = (HttpURLConnection)
                    (new URL("http://clients3.google.com/generate_204")
                    .openConnection());
            urlc.setRequestProperty("User-Agent", "Test");
            urlc.setRequestProperty("Connection", "close");
            urlc.setConnectTimeout(1500);
            urlc.connect();
            url = (urlc.getResponseCode() == 200);
            String str = String.valueOf(url);
            return str;
        } catch (IOException e) {
        }
        return null;
    }

    public boolean getInternet() {
        if (url) {
            return true;
        } else {
            return false;
        }
    }

}