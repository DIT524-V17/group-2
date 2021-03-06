package com.group02.guard;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Implements the google API and uses it to retreive current location of the phone
 * @author Gabriel Bulai
 * @version 2.0.0 GB
 */

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener, LocationListener {
    private static final int ERROR_DIALOG_REQUEST = 9001;
    private static final int MY_PERMISSIONS_REQUEST_FINE_LOCATION = 101;
    private static final int MY_PERMISSIONS_REQUEST_COARSE_LOCATION = 102;
    private static final int REQUEST_CHECK_SETTINGS = 0x1;
    private static final String BROADCAST_ACTION = "android.location.PROVIDERS_CHANGED";
    public static Double currentLatitude = 0.0;
    public static Double currentLongitude = 0.0;
    public static Handler handler;
    ClientSendThread clientSendThread;
    ClientReceiveThread clientReceiveThread;
    //String serverAddress = "192.168.1.101";
    String serverAddress = "129.16.155.11";
    int port = 8000;
    Marker phoneMarker = null;
    Marker carMarker = null;
    int clickCount = 0;
    boolean activated = false;
    int checked = 0;
    private GoogleApiClient mGoogleApiClient;
    private GoogleMap mMap;
    private FusedLocationProviderApi locationProvider = LocationServices.FusedLocationApi;
    private LocationRequest locationRequest;
    private boolean permissionIsGranted = false;
    private String title = "";
    private Switch mySwitch;
    private TextView switchState;

    /**
     * Broadcast receiver to check status of GPS
     */
    private BroadcastReceiver gpsLocationReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {

            //If Action is Location
            if (intent.getAction().matches(BROADCAST_ACTION)) {
                LocationManager locationManager =
                        (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
                //Check if GPS is turned ON or OFF
                if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                    Toast.makeText(getApplicationContext(),
                            "GPS is Enabled in your device",
                            Toast.LENGTH_SHORT).show();
                    Log.e("About GPS", "GPS is Enabled in your device");
                } else {
                    //If GPS turned OFF show Location Dialog
                    //new Handler().postDelayed(new MyRunnable(), 10);
                    // showSettingDialog();
                    Toast.makeText(getApplicationContext(),
                            "GPS is Disabled in your device",
                            Toast.LENGTH_SHORT).show();
                    Log.e("About GPS", "GPS is Disabled in your device");
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (servicesOK()) {
            setContentView(R.layout.activity_maps);
            initSwitch();
            if (android.os.Build.VERSION.SDK_INT > 9) {
                StrictMode.ThreadPolicy policy =
                        new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);
            }
            //initMap();
            if (initMap()) {
                initGoogleAPIClient();
            } else {
                Toast.makeText(this, "Map Not Connected!", Toast.LENGTH_SHORT).show();
            }
        } else {
            setContentView(R.layout.activity_main);
        }

        ToolbarBottomFragment fragment = (ToolbarBottomFragment)getSupportFragmentManager()
                .findFragmentById(R.id.bottomBar);
        fragment.buttonChecked("maps");
        fragment.mapsNav.setClickable(false);
    }

    /**
     * Creates Switch at the bottom of the Activity
     */
    public void initSwitch() {
        switchState = (TextView) findViewById(R.id.switchText);
        mySwitch = (Switch) findViewById(R.id.switch1);
        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (mySwitch.isChecked()) {
                    initFollowing("3 0");
                    switchState.setText("FollowMe");
                    Toast.makeText(getApplicationContext(),
                            "FollowMe Activated",
                            Toast.LENGTH_SHORT).show();
                    checked++;
                } else if (checked == 3) {
                    checked = 0;
                    switchState.setText("FollowMe");
                    Toast.makeText(getApplicationContext(),
                            "FollowMe Activated",
                            Toast.LENGTH_SHORT).show();
                    initFollowing("3 0");
                } else {
                    if (!mySwitch.isChecked()) {
                        initFollowing("2 0");
                        checked++;
                        switchState.setText("FollowMe");
                        Toast.makeText(getApplicationContext(),
                                "FollowMe Deactivated",
                                Toast.LENGTH_SHORT).show();
                        initFollowing("2 0");
                    }
                }
            }

        });
    }

    /**
     * Sends message when GPS following initiated
     * @param s, message to Send
     */
    private void initFollowing(String s) {
        clientSendThread.txMsg(s);
    }

    private void initGoogleAPIClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();
        Toast.makeText(this, "Map Connected", Toast.LENGTH_SHORT).show();
        showSettingDialog();
    }

    /**
     * Checks if necessary connections are established
     * @return true, if connected to google services
     */
    public boolean servicesOK() {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(this);

        if (resultCode == ConnectionResult.SUCCESS) {
            return true; //the user can make a mapping request
        } else if (apiAvailability.isUserResolvableError(resultCode)) {
            apiAvailability.getErrorDialog(this, resultCode, ERROR_DIALOG_REQUEST)
                    .show();
        } else {
            Toast.makeText(this, "Could not connect to mapping service", Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    /**
     * Creates and initiates the map
     * @return true if all permissions are granted
     */
    public boolean initMap() {
        if (mMap == null) {
            SupportMapFragment mapFragment =
                    (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    mMap = googleMap;
                    if (ActivityCompat.checkSelfPermission(getApplicationContext(),
                            Manifest.permission.ACCESS_FINE_LOCATION) !=
                            PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),
                                    Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                    PackageManager.PERMISSION_GRANTED) {
                        return;
                    }
                    mMap.getUiSettings().setZoomControlsEnabled(true);
                    mMap.getUiSettings().setAllGesturesEnabled(true);
                    mMap.getUiSettings().setMyLocationButtonEnabled(true);
                    mMap.getUiSettings().setCompassEnabled(true);
                    MapStyleOptions retroMap =
                            MapStyleOptions.loadRawResourceStyle(getApplicationContext(),
                                    R.raw.maps_retro);
                    MapStyleOptions nightMap =
                            MapStyleOptions.loadRawResourceStyle(getApplicationContext(),
                                    R.raw.maps_night);
                    try {
                        // Customise the styling of the base map using a JSON object defined
                        // in a raw resource file.
                        mMap.setMapStyle(retroMap);

                    } catch (Resources.NotFoundException e) {
                    }
                }
            });
        }
        return true;
    }

    /**
     * Listens to when the map is created
     * @param googleMap, a map object
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
    }

    /**
     * Switches and position the focus the location to the new position
     * @param lat, new device latitude
     * @param lng, new device longitude
     * @param zoom, zoom in value
     */
    private void gotoLocation(double lat, double lng, int zoom) {
        //create LatLng object with the coordinates passed in the method
        LatLng phoneLatLng = new LatLng(lat, lng);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(phoneLatLng, zoom);
        mMap.animateCamera(update);
        if (serverOK()) {
            LatLng carLatLng = new LatLng(Double.parseDouble(getCarCoords()[0]),
                    Double.parseDouble(getCarCoords()[1]));
            if (carMarker != null) {
                carMarker.remove();
            }
            MarkerOptions carMarkerOptions = new MarkerOptions()
                    .position(carLatLng)
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.guard_launcher))
                    .title("SmartCar");
            carMarker = mMap.addMarker(carMarkerOptions);
        }
    }

    @Override
    public void onConnected(Bundle bundle) {
        requestLocationUpdates();
    }

    /**
     * Asks the user to grant location permissions
     */
    private void requestLocationUpdates() {
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this,
                        Manifest.permission.ACCESS_COARSE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{ Manifest.permission.ACCESS_FINE_LOCATION},
                        MY_PERMISSIONS_REQUEST_FINE_LOCATION);
            } else {
                //ensures we can run the app below api 23
                showSettingDialog();
            }
            return;
        }
        locationProvider.requestLocationUpdates(mGoogleApiClient, locationRequest, this);
    }

    private void showSettingDialog() {
        locationRequest = LocationRequest.create();
        locationRequest.setInterval(5 * 1000);
        locationRequest.setFastestInterval(1 * 1000);
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder()
                .addLocationRequest(locationRequest);
        //show dialog always when GPS is off
        builder.setAlwaysShow(true);

        PendingResult<LocationSettingsResult> result =
                LocationServices.SettingsApi.checkLocationSettings(mGoogleApiClient,
                        builder.build());

        result.setResultCallback(new ResultCallback<LocationSettingsResult>() {
            @Override
            public void onResult(LocationSettingsResult result) {
                final Status status = result.getStatus();
                final LocationSettingsStates state = result.getLocationSettingsStates();
                switch (status.getStatusCode()) {
                    case LocationSettingsStatusCodes.SUCCESS:
                        // All location settings are satisfied. The client can initialize location
                        // requests here.
                        break;
                    case LocationSettingsStatusCodes.RESOLUTION_REQUIRED:
                        // Location settings are not satisfied, but could be fixed by showing
                        // the user a dialog.
                        try {
                            // Show the dialog by calling startResolutionForResult(),
                            // and check the result in onActivityResult().
                            status.startResolutionForResult(MapsActivity.this,
                                    REQUEST_CHECK_SETTINGS);
                        } catch (IntentSender.SendIntentException e) {
                            e.printStackTrace();
                            // Ignore the error.
                        }
                        break;
                    case LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE:
                        // Location settings are not satisfied. However, we have no way to fix the
                        // settings so we won't show the dialog.
                        break;
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            // Check for the integer request code originally supplied to startResolutionForResult().
            case REQUEST_CHECK_SETTINGS:
                switch (resultCode) {
                    case RESULT_OK:
                        Log.e("Settings", "Result OK");
                        Toast.makeText(getApplicationContext(),
                                "GPS is Enabled in your device",
                                Toast.LENGTH_LONG).show();
                        //startLocationUpdates();
                        break;
                    case RESULT_CANCELED:
                        Log.e("Settings", "Result Cancel");
                        Toast.makeText(getApplicationContext(),
                                "GPS is Disabled in your device",
                                Toast.LENGTH_LONG).show();
                        break;
                }
                break;
        }
    }

    /**
     * Responds connection lost
     * @param i, connection response code
     */
    @Override
    public void onConnectionSuspended(int i) {

    }

    /**
     * Responds if failed to connect
     * @param connectionResult, Connection result object with information if successfully connected
     */
    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
    }

    /**
     * Creates marker on the map to illustrate device location
     * @param latLng, device latitude
     * @param title, devic longitude
     */
    private void initMarkers(LatLng latLng, String title) {
        if (phoneMarker != null) {
            phoneMarker.remove();
        }

        MarkerOptions phoneMarkerOptions = new MarkerOptions()
                .position(latLng)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
                .title(title);
        phoneMarker = mMap.addMarker(phoneMarkerOptions);
        phoneMarker.showInfoWindow();
        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                if (marker.equals(phoneMarker)) {
                    if (activated) {
                        activated = false;
                        initFollowing("3 0");
                    } else {
                        activated = true;
                        initFollowing("2 0");
                    }
                }
                activated = false;
            }
        });
    }

    /**
     * Listens and calls necessary method when device's location changed
     * @param location, Location object representing the physical whereabouts of the device
     */
    @Override
    public void onLocationChanged(Location location) {
        currentLatitude = location.getLatitude();
        currentLongitude = location.getLongitude();

        //create LatLng with current location
        final LatLng phoneLatLng = new LatLng(currentLatitude, currentLongitude);
        initMarkers(phoneLatLng, title);
        gotoLocation(currentLatitude, currentLongitude, 15);
        //send location to the Pi if it is accurate = means if the gps is set tu high Accuracy
        if (location.hasAccuracy()) {
            clientSendThread.txMsg(currentLatitude.toString() + " " + currentLongitude.toString());
        } else {
            clientSendThread.txMsg("1");
        }
    }

    /**
     * @return True if connected to java server, false otherwise
     */
    public boolean serverOK() {
        if (clientReceiveThread.otherLine != null) {
            return true;
        }
        return false;
    }

    /**
     * @return SmartCar's coordinates
     */
    public String[] getCarCoords() {
        String[] splitted = new String[2];
        if (serverOK()) {
            String abc = clientReceiveThread.otherLine;
            splitted = abc.split(" ");
        }
        return splitted;
    }

    /**
     * Initiates clients when activity started
     */
    @Override
    protected void onStart() {
        super.onStart();
        mGoogleApiClient.connect();
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                String message = (String) msg.obj;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

            }
        };
        clientSendThread = new ClientSendThread(
                serverAddress,
                port);
        clientSendThread.start();
        clientReceiveThread = new ClientReceiveThread(
                serverAddress,
                port);
        clientReceiveThread.start();
    }

    /**
     * Runs the google client when the Activity is entered again
     */
    @Override
    protected void onResume() {
        super.onResume();
        if (permissionIsGranted) {
            if (mGoogleApiClient.isConnected()) {
                requestLocationUpdates();
            }
        }
        //Register broadcast receiver to check the status of GPS
        registerReceiver(gpsLocationReceiver, new IntentFilter(BROADCAST_ACTION));
    }

    /**
     * Used when activity is temporarily exited
     */
    @Override
    protected void onPause() {
        super.onPause();
        if (permissionIsGranted) {
            locationProvider.removeLocationUpdates(mGoogleApiClient, this);
        }
    }

    /**
     * Disconnects from google client when activity stops
     */
    @Override
    protected void onStop() {
        super.onStop();
        if (permissionIsGranted) {
            mGoogleApiClient.disconnect();
            //Unregister receiver on destroy
        } else if (gpsLocationReceiver != null)
            unregisterReceiver(gpsLocationReceiver);
    }

    /**
     * Used when requesting necessary permissions for map
     * @param requestCode, code representing the desired permission
     * @param permissions, String array of all permissions
     * @param grantResults, int array of response codes for the permissions
     */
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        //permission handler according to which type of permission we want to check
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_FINE_LOCATION:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    //permission granted
                    permissionIsGranted = true;
                } else {
                    //permission denied
                    permissionIsGranted = false;
                    Toast.makeText(getApplicationContext(),
                            "This app requires permission to be granted",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case MY_PERMISSIONS_REQUEST_COARSE_LOCATION:
                // code for coarse location
                break;
        }
    }

    /**
     * Listens and reacts when the back button is pressed
     */
    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertbox = new AlertDialog.Builder(this);

        alertbox.setMessage("Exiting this view will trigger the manual mode. Continue?");
        alertbox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            // do something when the button is clicked
            public void onClick(DialogInterface arg0, int arg1) {
                initFollowing("2 0");
                Toast.makeText(getApplicationContext(),
                        "FollowMe Stopped",
                        Toast.LENGTH_LONG).show();
                clickCount = 0;
                finish();
            }
        });
        alertbox.setNegativeButton("No", new DialogInterface.OnClickListener() {

            // do something when the button is clicked
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });

        AlertDialog dialog = alertbox.create();
        dialog.show();
    }
}
