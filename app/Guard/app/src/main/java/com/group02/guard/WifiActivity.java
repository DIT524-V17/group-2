package com.group02.guard;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.wifi.WpsInfo;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import java.util.ArrayList;

/**
 * Created by justinas on 05/03/2017.
 */

public class WifiActivity extends MainActivity {
    private WifiP2pManager wifiManager;
    private WifiP2pManager.Channel wifiChannel;
    private BroadcastReceiver wifiReceiver;
    private IntentFilter wifiIntentFilter;
    private WifiP2pDevice targetDevice;
    ListView peerView;
    boolean wifiDirectEnabled;
    static ToggleButton onOff;
    TextView connectedDeviceName;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);

        wifiManager = (WifiP2pManager) getSystemService(Context.WIFI_P2P_SERVICE);
        wifiChannel = wifiManager.initialize(this, getMainLooper(), null);

        wifiIntentFilter = new IntentFilter();
        wifiIntentFilter.addAction(WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION);
        wifiIntentFilter.addAction(WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION);
        wifiIntentFilter.addAction(WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION);
        wifiIntentFilter.addAction(WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION);
        wifiReceiver = new WifiBroadcastReceiver(wifiManager, wifiChannel, this);
        registerReceiver(wifiReceiver, wifiIntentFilter);

        onOff = (ToggleButton) findViewById(R.id.buttonOnOff);
        connectedDeviceName = (TextView) findViewById(R.id.connectedDevice);
        peerView = (ListView) findViewById(R.id.peerList);

        preferences = getPreferences(MODE_PRIVATE);
        boolean wifiOnOff = preferences.getBoolean("wifiOnOff", false);
        onOff.setChecked(wifiOnOff);

        onOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onOff.isChecked()){
                    findPeers(v);
                    onOff.setChecked(true);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putBoolean("wifiOnOff", true);
                    editor.commit();
                }
                else{
                    onOff.setChecked(false);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putBoolean("wifiOnOff", false);
                    editor.commit();
                }
            }
        });
    }

    // register the broadcast receiver with the intent values to be matched
    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(wifiReceiver, wifiIntentFilter);
    }

    // unregister the broadcast receiver
    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(wifiReceiver);
    }

    public void setWifiDirectEnabled(boolean wifiDirectEnabled) {
        this.wifiDirectEnabled = wifiDirectEnabled;
    }

    public void findPeers(View view) {
        wifiManager.discoverPeers(wifiChannel, null);
    }

    public void clearPeers(){
        peerView.setAdapter(null);
    }

    public void displayPeers(final WifiP2pDeviceList peers) {
        //Dialog to show errors/status
        final AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("WiFi Direct File Transfer");

        ArrayList<String> peerDevices = new ArrayList<>();

        //Fill array list with strings of peer names
        for(WifiP2pDevice wd : peers.getDeviceList()) {
            peerDevices.add(wd.deviceName);
        }

        peerView.setClickable(true);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, peerDevices.toArray());
        peerView.setAdapter(arrayAdapter);

        peerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View view, int arg2,long arg3) {
                TextView tv = (TextView) view;
                WifiP2pDevice device = null;

                for(WifiP2pDevice wd : peers.getDeviceList()) {
                    if(wd.deviceName.equals(tv.getText()))
                        device = wd;
                }

                if(device != null && onOff.isChecked()) {
                    connect(device);
                    connectedDeviceName.setText("Currently connected to: " + device.deviceName);
                }

                else {
                    dialog.setMessage("Failed");
                    dialog.show();
                }
            }
        });
    }

    public void connect(final WifiP2pDevice wifiPeer) {
        this.targetDevice = wifiPeer;
        WifiP2pConfig config = new WifiP2pConfig();
        config.deviceAddress = wifiPeer.deviceAddress;
        config.wps.setup = WpsInfo.PBC;

        if(onOff.isChecked()){
            wifiManager.connect(wifiChannel, config, new WifiP2pManager.ActionListener()  {
                public void onSuccess() {
//                Toast.makeText(WifiActivity.this, "Connect to" + targetDevice.deviceName + "successful", Toast.LENGTH_LONG).show();
                }

                public void onFailure(int reason) {
                    Toast.makeText(WifiActivity.this, "Connect to" + targetDevice.deviceName + "failed", Toast.LENGTH_LONG).show();
                }
            });
        }
        else{
            Toast.makeText(WifiActivity.this, "Can't connect while WiFi Direct is off", Toast.LENGTH_LONG).show();
        }
    }
}