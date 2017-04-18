package com.group02.guard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import java.util.ArrayList;

/**
 * @author Justinas Stirbys (JS)
 * Creates a the possibility to connect to other devices via WiFi-Direct (Peer2Peer).
 * Layout used for the class is actiivity_wifi.xml
 * @version 1.0.0
 */
public class WifiActivity extends AppCompatActivity {
    private WifiP2pManager wifiManager;
    private WifiP2pManager.Channel wifiChannel;
    private BroadcastReceiver wifiReceiver;
    private IntentFilter wifiIntentFilter;
    private WifiP2pDevice targetDevice;
    ListView peerView;
    boolean wifiDirectEnabled;
    ToggleButton onOff;
    TextView connectedDeviceName;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

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

        preferences = getPreferences(MODE_PRIVATE);
        onOff = (ToggleButton) findViewById(R.id.buttonOnOff);
        connectedDeviceName = (TextView) findViewById(R.id.connectedDevice);
        peerView = (ListView) findViewById(R.id.peerList);

        boolean wifiOnOff = preferences.getBoolean("wifiOnOff", false);
        onOff.setChecked(wifiOnOff);
        editor = preferences.edit();
        onOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onOff.isChecked()){
                    findPeers(v);
                    onOff.setChecked(true);
                    editor.putBoolean("wifiOnOff", true);
                    editor.commit();
                } else{
                    onOff.setChecked(false);
                    editor.putBoolean("wifiOnOff", false);
                    editor.commit();
                }
            }
        });
        ToolbarBottomFragment fragment = (ToolbarBottomFragment)getSupportFragmentManager()
                .findFragmentById(R.id.bottomBar);
        fragment.buttonChecked("connect");
    }

    /**
     * Registers the broadcast receiver with the intent values
     */
    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(wifiReceiver, wifiIntentFilter);
    }

    /**
     * Unregister the broadcast receiver
     */
    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(wifiReceiver);
    }

    /**
     * Locates possible WiFi direct peers
     * @param v Current view
     */
    public void findPeers(View v) {
        wifiManager.discoverPeers(wifiChannel, null);
    }

    /**
     * Removes currently displayed peers when called
     */
    public void clearPeers(){
        peerView.setAdapter(null);
    }

    /**
     * Displays found peers in a ListView on the app
     * @param peerList A final list where all found WiFi direct peers are stored
     */
    public void displayPeers(final WifiP2pDeviceList peerList) {
        ArrayList<String> peerDevices = new ArrayList<>();
        for(WifiP2pDevice wd : peerList.getDeviceList()) {
            peerDevices.add(wd.deviceName);
        }
        peerView.setClickable(true);
        ArrayAdapter wifiAdapter = new ArrayAdapter(WifiActivity.this,
                android.R.layout.simple_list_item_1, peerDevices.toArray());
        peerView.setAdapter(wifiAdapter);

        peerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View v, int arg2, long arg3) {
                TextView tv = (TextView) v;
                WifiP2pDevice device = null;

                for(WifiP2pDevice wd : peerList.getDeviceList()) {
                    if(wd.deviceName.equals(tv.getText()))
                        device = wd;
                }
                if(device != null && onOff.isChecked()) {
                    connect(device);
                    connectedDeviceName.setText("Currently connected to: " + device.deviceName);
                }
            }
        });
    }

    /**
     * Connects to the selected device from the ListView
     * @param wifiPeer Target device for connection
     */
    public void connect(final WifiP2pDevice wifiPeer) {
        this.targetDevice = wifiPeer;
        WifiP2pConfig config = new WifiP2pConfig();
        config.deviceAddress = wifiPeer.deviceAddress;
        if(wifiDirectEnabled){
            wifiManager.connect(wifiChannel, config, new WifiP2pManager.ActionListener() {
                public void onSuccess() {
//                    Toast.makeText(WifiActivity.this,
//                            "Connect to" + targetDevice.deviceName + "successful",
//                            Toast.LENGTH_LONG).show();
                }
                public void onFailure(int reason) {
                    Toast.makeText(WifiActivity.this,
                            "Connect to" + targetDevice.deviceName + "failed",
                            Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    /**
     * @return onOff ToggleButton responsible for enabling/disabling WiFi Direct via GUI
     */
    public ToggleButton getOnOffButton() {
        return onOff;
    }

    /**
     * Setter method for boolean wifiDirectEnabled, responsible for the state of WiFi Direct
     * @param wifiDirectEnabled Boolean used to keep track of WifiDirect state
     */
    public void setWifiDirectEnabled(boolean wifiDirectEnabled) {
        this.wifiDirectEnabled = wifiDirectEnabled;
    }
}