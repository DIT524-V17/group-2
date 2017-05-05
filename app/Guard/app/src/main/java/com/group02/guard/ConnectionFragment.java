package com.group02.guard;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ConnectionFragment extends Fragment {

    private final String TAG = "ConnectionFragment";
    // The thread that does all the work
    BluetoothThread btt;

    // MAC address to the SmartCar
    private String address = "20:15:10:20:11:37";
    // Handler for writing messages to the Bluetooth connection
    private Handler writeHandler;

    public ConnectionFragment() {
        // Required empty public constructor
        super();
        Log.d(TAG,  this + ": this() " + this);
    }

    private void startThread(){

        if (!BluetoothThread.threadStarted) {
            Log.d(TAG, "Start Thread: startThread initiated.");
            // Initialize the Bluetooth thread, passing in a MAC address
            // and a Handler that will receive incoming messages
            btt = new BluetoothThread(address, new Handler() {
                @Override
                public void handleMessage(Message message) {
                    sendMessage(message);
                }
            });
            // Get the handler that is used to send messages
            writeHandler = btt.getWriteHandler();
            // Run the thread
            btt.start();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d(TAG, this + ": onCreate()");
        setRetainInstance(true);
        startThread();
    }

    /*
     * All methods below is saved for modularity.
     * EAsy following of execution is achieved by logging called methods.
     * @param activity
     */
    @Override
    public void onAttach(final Activity activity)
    {
        super.onAttach(activity);
        Log.d(TAG, this + ": onAttach(" + activity + ")");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, this + ": onActivityCreated()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        Log.d(TAG, this + ": onCreateView()");
        return null;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, this + ": onViewCreated()");
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        Log.d(TAG, this + ": onDestroyView()");
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        Log.d(TAG, this + ": onDetach()");
    }

    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(TAG, this + ": onStart()");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.d(TAG, this + ": onResume()");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.d(TAG, this + ": onPause()");
    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.d(TAG, this + ": onStop()");
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG, this + ": onDestroy()");
    }

}


