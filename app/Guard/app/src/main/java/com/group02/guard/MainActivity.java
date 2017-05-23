package com.group02.guard;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Creates the "MainScreen" of the G.U.A.R.D. app. Layout used is activity_main.xml
 * @author Justinas Stirbys (JS), Gabriel Bulai(GB)
 * @version 1.1.1 JE
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button control;
    Button profile;
    Button map;
    Button reconnect;
    Button logout;

    private String mSsid = "";
    private String mIp = "";
    private String mNetworkpass = "";

    SmartCar smartCar;
    Session session;

    private boolean btCon = false;
    private boolean wifiCon = false;

    // final check number for bluetooth prompt
    private final static int REQUEST_ENABLE_BT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AsyncGetConnectivityData asyncTask = new AsyncGetConnectivityData
                (new AsyncGetConnectivityData.AsyncResponse() {
            @Override
            public void processFinish(AsyncGetConnectivityData.Wrapper output) {
                mSsid = output.ssid;
                mIp = output.ip;
                mNetworkpass = output.password;
            }
        }, this);

        asyncTask.execute();

        AsyncReachInternet reachInternet = new AsyncReachInternet();
        reachInternet.execute();

        Log.d("processFinish", "execute()");

        Log.d("processFinish", "" + asyncTask.responseCode);

        while (asyncTask.responseCode == 0 && isNetworkAvailable() && reachInternet.getInternet()) {}
        Log.d("processFinish", "" + asyncTask.responseCode);
            if (asyncTask.responseCode == 200) {
                if (mSsid.equals("")) {
                    try {
                        asyncTask.get();
                        Log.d("processFinish", "get()");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            String address = "20:15:10:20:11:37";
            Log.d("processFinish", "Creating SmartCar");
            smartCar = new SmartCar(address, mIp, mSsid, mNetworkpass);

        } else {
            Log.d("processFinish", "Creating EMPTY SmartCar");
            smartCar = new SmartCar();
        }

        BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
        if (!adapter.isEnabled()) {
            //Set a filter to only receive bluetooth state changed events.
            btCon = false;
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent , REQUEST_ENABLE_BT);
        } else {
            btCon = true;
        }

        WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        if (!wifi.isWifiEnabled()){
            turnOnWifi(wifi);
        } else {
            connectToGuard(wifi);
            wifiCon = true;
        }

        control = (Button) findViewById(R.id.controlButton);
        map = (Button) findViewById(R.id.mapsButton);
        profile = (Button) findViewById(R.id.profileButton);
        reconnect = (Button) findViewById(R.id.reconnect);
        logout = (Button) findViewById(R.id.logoutDebug);

        control.setOnClickListener(this);
        profile.setOnClickListener(this);
        map.setOnClickListener(this);
        reconnect.setOnClickListener(this);

        session = new Session(this);
        if (!session.loggedin()) {
            logout();
        }

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }


    private void logout() {
        session.setLoggedin(false);
        finish();
        startActivity(new Intent(this, LoginActivity.class));
    }

    /**
     * Starts new activities and saves booleans when buttons in the MainScreen are clicked.
     * The booleans are retrieved in other activities and are used to set the state of ToggleButton
     * @param v The current View
     */
    @Override
    public void onClick(View v) {
        Intent controlIntent = new Intent(MainActivity.this, ControllerActivity.class);
        controlIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        controlIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        controlIntent.putExtra("address", smartCar.getAddress());
        controlIntent.putExtra("btCon", btCon);
        controlIntent.putExtra("wifiCon", wifiCon);
        Intent mapIntent = new Intent(MainActivity.this, MapsActivity.class);
        mapIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        mapIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        Intent profileIntent = new Intent(this, ProfileActivity.class);
        profileIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        profileIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        switch (v.getId()) {
            case R.id.controlButton:
                startActivity(controlIntent);
                return;
            case R.id.profileButton:
                startActivity(profileIntent);
                return;
            case R.id.mapsButton:
                startActivity(mapIntent);
                return;
            case R.id.reconnect:
                startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
           default:

        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            recreate();
        }
        if (resultCode == RESULT_CANCELED) {
            btCon = false;
            disableFunctions();
        }
    }

    private void turnOnWifi(final WifiManager wifi){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Wifi Settings");

        alertDialogBuilder
                .setMessage("Do you want to enable WIFI ?")
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    @SuppressLint("ShowToast")
                    public void onClick(DialogInterface dialog, int id) {
                        //enable wifi
                        wifi.setWifiEnabled(true);
                        wifiCon = true;
                        Toast.makeText(MainActivity.this, "WiFi turned on", Toast.LENGTH_LONG);
                        connectToGuard(wifi);
                    }
                })
                .setNegativeButton("No",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //disable wifi
                        wifi.setWifiEnabled(false);
                        wifiCon = false;
                        disableFunctions();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void disableFunctions(){

        if(!btCon && !wifiCon){
            map.setClickable(false);
            map.setAlpha(0.5f);
            control.setClickable(false);
            control.setAlpha(0.5f);
        }
        reconnect.setVisibility(View.VISIBLE);
    }

    @SuppressLint("ShowToast")
    public void connectToGuard(WifiManager wifi){

        String networkSSID = smartCar.getSsid();
        String networkPass = smartCar.getNetworkPass();

        wifi.disconnect();

        WifiConfiguration conf = new WifiConfiguration();
        conf.SSID = "\"" + networkSSID + "\"";   // Please note the quotes. String should contain ssid in quotes
        conf.preSharedKey = "\""+ networkPass +"\"";
        wifi.addNetwork(conf);
        List<WifiConfiguration> list = wifi.getConfiguredNetworks();
        for( WifiConfiguration i : list ) {
            if(i.SSID != null && i.SSID.equals("\"" + networkSSID + "\"")) {
                wifi.disconnect();
                wifi.enableNetwork(i.networkId, true);
                wifi.reconnect();
                break;
            }
        }

        WifiInfo wifiInfo = wifi.getConnectionInfo();

        if(WifiInfo.getDetailedStateOf(wifiInfo.getSupplicantState()) ==
            NetworkInfo.DetailedState.CONNECTED &&
            wifiInfo.getSSID().equals(smartCar.getSsid())){

            Toast.makeText(MainActivity.this, "Connected to GUARD", Toast.LENGTH_SHORT);

        }

    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null;
    }
}
