package com.group02.guard;

import android.*;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.PopupMenu;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.UUID;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private Notification notification;
    public NotificationManager notificationManager;
    private static final String TAG = "CriticalBattNoti";
    private static final int NOTIFICATION_ID = 101;

    Button control;
    Button map;
    Button battery;
    ImageButton optionMenu;

    BluetoothAdapter mBluetoothAdapter;
    BluetoothDevice mBTDevice;
    BluetoothConnectionService mBluetoothConnection;
    Button btnStartConnection;
    private static final UUID MY_UUID_INSECURE =
            UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");

    public ArrayList<BluetoothDevice> mBTDevices = new ArrayList<>();
    public DeviceListAdapter mDeviceListAdapter;
    ListView lvNewDevices;

    Toolbar appBar;

    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            final String action = intent.getAction();
            Log.d(TAG, "onReceive: ACTION_FOUND");


            if (action.equals(BluetoothDevice.ACTION_FOUND)) {
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                mBTDevices.add(device);
                Log.d(TAG, "OnReceive: " + device.getName() + ":" + device.getAddress());
                mDeviceListAdapter = new DeviceListAdapter(context, R.layout.activity_listview, mBTDevices);
                lvNewDevices.setAdapter(mDeviceListAdapter);

            }
        }
    };
    private BroadcastReceiver mBroadcastReceiver2 = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            final String action = intent.getAction();

            if (action.equals(BluetoothDevice.ACTION_BOND_STATE_CHANGED)) {
                BluetoothDevice mDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                //Bonded already
                if (mDevice.getBondState() == BluetoothDevice.BOND_BONDED) {
                    Log.d(TAG, "BroadcastReceiver: BOND_BONDED");
                    mBTDevice = mDevice;
                }
                //creating
                if (mDevice.getBondState() == BluetoothDevice.BOND_BONDING) {
                    Log.d(TAG, "BroadcastReceiver: BOND_BONDING");
                }
                //breaking a bond
                if (mDevice.getBondState() == BluetoothDevice.BOND_NONE) {
                    Log.d(TAG, "BroadcastReceiver: BOND_NONE");
                }
            }
        }
    };

    protected void onDestroy() {
        Log.d(TAG, "onDestroy: called.");
        super.onDestroy();
        unregisterReceiver(mBroadcastReceiver);
        unregisterReceiver(mBroadcastReceiver2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(appBar);
//        appBar.setTitle("G.U.A.R.D.");

        //BLUETOOTH HANDLING

        lvNewDevices = (ListView) findViewById(R.id.lvNewDevices);
        mBTDevices = new ArrayList<>();
        btnStartConnection = (Button) findViewById(R.id.btnStartConnection);

        //broadcasts when bond state changes(ie:pairing)
        IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_BOND_STATE_CHANGED);
        registerReceiver(mBroadcastReceiver2, filter);


        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        if (!mBluetoothAdapter.isEnabled()) {
            Intent enableBTIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivity(enableBTIntent);
        }

        lvNewDevices.setOnItemClickListener(MainActivity.this);

        btnStartConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startConnection();
            }
        });

        control = (Button) findViewById(R.id.controlButton);
        control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ControllerActivity.class);
                i.putExtra("mBTDevice", mBTDevice);
                startActivity(i);
            }
        });

        map = (Button) findViewById(R.id.mapsButton);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        optionMenu = (ImageButton) findViewById(R.id.menuButton);
        battery = (Button) findViewById(R.id.batteryButton);
        setBatteryLevel(10);
    }

    public void startConnection(){
        Log.d(TAG, mBTDevice.getName() + " device name");
        Log.d(TAG, mBTDevice.getBondState() + " bond state");
        startBTConnection(mBTDevice, MY_UUID_INSECURE);
    }
    public void startBTConnection(BluetoothDevice device, UUID uuid) {
        Log.d(TAG, "startBTConnection: Initializing RFCOM Bluetooth Connection.");

        mBluetoothConnection.startClient(device, uuid);

    }

    public void btnDiscover(View view) {
        Log.d(TAG, "btnDiscover: Looking for unpaired devices.");


        if (mBluetoothAdapter.isDiscovering()) {
            mBluetoothAdapter.cancelDiscovery();

            //check bluetooth permission in manifest
            checkBTPermission();

            mBluetoothAdapter.startDiscovery();
            IntentFilter discoverDevicesIntent = new IntentFilter(BluetoothDevice.ACTION_FOUND);
            registerReceiver(mBroadcastReceiver, discoverDevicesIntent);
        }
        if (!mBluetoothAdapter.isDiscovering()) {
            //check bluetooth permission in manifest
            checkBTPermission();

            mBluetoothAdapter.startDiscovery();
            IntentFilter discoverDevicesIntent = new IntentFilter(BluetoothDevice.ACTION_FOUND);
            registerReceiver(mBroadcastReceiver, discoverDevicesIntent);
        }
    }

    // Method is required for devices running API23+
    // Android must programmatically check the permission for bluetooth, putting proper permission in menifest is not enough
    //only executed on versions > lollipop.

    public void checkBTPermission() {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            int permissionCheck = this.checkSelfPermission("Manifest.permission.ACCESS_FINE_LOCATION");
            permissionCheck += this.checkSelfPermission("Manifest.permission.ACCESS_COARSE_LOCATION");
            if (permissionCheck != 0) {

                this.requestPermissions(new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION}, 1001);

            } else {
                Log.d(TAG, "checkBTPermission: NO need to check permission. SDK version < lollipop");
            }
        }
    }


    @Override
    public void onItemClick(AdapterView<?> AdapterView, View view, int i, long l) {
        mBluetoothAdapter.cancelDiscovery();//cuz its memory intensive
        Log.d(TAG, "onItemCLick:  You clicked on a device");
        String deviceName = mBTDevices.get(i).getName();
        String deviceAddress = mBTDevices.get(i).getAddress();

        Log.d(TAG, "onItemCLick:  deviceName" + deviceName);
        Log.d(TAG, "onItemCLick:  deviceAddress" + deviceAddress);

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN_MR2) {
            Log.d(TAG, "Tring to pair with " + deviceName);
            mBTDevices.get(i).createBond();

            mBTDevice = mBTDevices.get(i);
            mBluetoothConnection = new BluetoothConnectionService(MainActivity.this);

        }

    }

    /**
     * @author justinas
     * @purpose creates a popup option menu
     * @linked in activity_main.xml with the ImageButton id/menuButton
     * @param v
     */
    public void showOptionMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_options, popup.getMenu());
        popup.show();
    }

    /**
     * @author justinas
     * @purpose is to identify selected option from menu ny comparing their ids
     * TODO change from Toast to actual Intent that initiate new activities
     * @param item >>> one of the options in the menu
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_profile:
                Toast.makeText(MainActivity.this, "Profile Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_security:
                Toast.makeText(MainActivity.this, "Security Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_settings:
                Toast.makeText(MainActivity.this, "Settings Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_themes:
                Toast.makeText(MainActivity.this, "App Themes Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_feedback:
                Toast.makeText(MainActivity.this, "Help & Feedback Selected", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public Button setBatteryLevel(double analogReadVoltage) {
        double voltage = getVoltage(analogReadVoltage);
        battery.setText(String.format("%.2f", voltage)+ " V");
        battery.setTextColor(Color.WHITE);
        voltage /=8;

        if(voltage >= 1.40) {
            battery.setBackgroundResource(R.drawable.full_battery);
        }
        else if(voltage >= 1.30 && voltage < 1.40) {
            battery.setBackgroundResource(R.drawable.charged_battery);
        }
        else if(voltage >= 1.20 && voltage < 1.30) {
            battery.setBackgroundResource(R.drawable.half_charged_battery);
        }
        else if(voltage >= 1.10 && voltage < 1.20) {
            battery.setBackgroundResource(R.drawable.low_battery);
        }
        if(voltage < 1){
            battery.setBackgroundResource(R.drawable.empty_battery);
            criticalBatteryLevelToast();
            criticalBatteryLevelNotification();
        }
        return battery;
    }

    public Toast criticalBatteryLevelToast(){
        Context context = getApplicationContext();
        CharSequence text = "Critical battery level!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        return toast;
    }

    public void criticalBatteryLevelNotification(){
        notification = new Notification.Builder(this)
                .setContentTitle("SmartCar Critical Battery Level")
                .setContentText("placeholder")
                .setSmallIcon(R.drawable.notification_battery)
                .setLargeIcon(BitmapFactory.decodeResource(this.getResources(),
                        R.mipmap.guard))
                .setAutoCancel(true)
                .build();
        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        notificationManager.notify(TAG, NOTIFICATION_ID, notification);
    }

    public double getVoltage(double analogReadVoltage){
        double voltage = analogReadVoltage * (5.0 / 1023.0); // Converts the analog reading to voltage
        voltage *= 5; //Restores the actual voltage measured (divided by 5 from the voltage divider before entiring the Arduino
        return voltage;
    }
}
