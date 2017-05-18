package com.group02.guard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager;

/**
 * @author Justinas Stirbys (JS)
 * A BroadcastReceiver that notifies of important WiFi Direct (Peer2Peer) events.
 * @version  1.0.0
 * @deprecated from sprint 7 and onwards
 */
public class WifiBroadcastReceiver extends BroadcastReceiver {
    private WifiP2pManager wifiManager;
    private WifiP2pManager.Channel wifiChannel;
    private WifiActivity wifiActivity;

    /**
     * Creates a WiFi Broadcaster object that is responsible for changes in WiFi Direct activity
     * @param manager Manages WiFi Direct connectivity, like discovering peers etc.
     * @param channel Manages the connection to WiFi Direct framework
     * @param activity Instance of our WiFi activity
     */
    public WifiBroadcastReceiver(WifiP2pManager manager, WifiP2pManager.Channel channel,
                                 WifiActivity activity) {
        super();
        this.wifiManager = manager;
        this.wifiChannel = channel;
        this.wifiActivity = activity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION.equals(action)) {
            // Check to see if WiFi is enabled
            int state = intent.getIntExtra(WifiP2pManager.EXTRA_WIFI_STATE, -1);
            if (state == WifiP2pManager.WIFI_P2P_STATE_ENABLED) {
                wifiActivity.setWifiDirectEnabled(true);
            } else {
                wifiActivity.setWifiDirectEnabled(false);
                wifiActivity.clearPeers();
            }
        } else if (WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION.equals(action)) {
            if(wifiActivity.getOnOffButton().isChecked()) {
                wifiManager.requestPeers(wifiChannel, new WifiP2pManager.PeerListListener() {
                    public void onPeersAvailable(WifiP2pDeviceList peers) {
                        wifiActivity.displayPeers(peers);
                    }
                });
            } else{
                wifiActivity.clearPeers();
            }
        } else if (WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action)) {
            // Respond to new connection or disconnections
            NetworkInfo networkState = intent.getParcelableExtra(WifiP2pManager.EXTRA_NETWORK_INFO);
            if(networkState.isConnected()) {
                networkState.getExtraInfo();
//                wifiManager.requestConnectionInfo(wifiChannel, wifiActivity);
            } else {
                wifiManager.cancelConnect(wifiChannel, null);
            }
        } else if (WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION.equals(action)) {
            // Respond to this device's wifi state changing
        }
    }
}

