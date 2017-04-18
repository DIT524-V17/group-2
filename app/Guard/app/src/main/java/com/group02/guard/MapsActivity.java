package com.group02.guard;
/**
 * @author Gabriel Bulai
 * This class implements the google API and uses it to retreive current location of the phone
 * @version 1.0.0 GB
 */
import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.group02.guard.Coordinates.parserino;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener, LocationListener {
    private static final int ERROR_DIALOG_REQUEST = 9001;
    private static final int MY_PERMISSIONS_REQUEST_FINE_LOCATION = 101;
    private static final int MY_PERMISSIONS_REQUEST_COARSE_LOCATION = 102;
    public static Double currentLatitude = 0.0;
    public static Double currentLongitude = 0.0;
    TextView curLat;
    TextView curLng;
    ClientHandler clientHandler;
    ClientThread clientThread;
    String address = "129.16.155.11";
    int port = 8000;
    private GoogleApiClient mGoogleApiClient;
    private GoogleMap mMap;
    private FusedLocationProviderApi locationProvider = LocationServices.FusedLocationApi;
    private LocationRequest locationRequest;
    private boolean permissionIsGranted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (servicesOK()) {
            setContentView(R.layout.activity_maps);
            if (android.os.Build.VERSION.SDK_INT > 9) {
                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);
            }
            //initMap();
            if (initMap()) {
                Toast.makeText(this, "Map Connected", Toast.LENGTH_SHORT).show();
                mGoogleApiClient = new GoogleApiClient.Builder(this)
                        .addApi(LocationServices.API)
                        .addConnectionCallbacks(this)
                        .addOnConnectionFailedListener(this)
                        .build();
                locationRequest = new LocationRequest();
                locationRequest.setInterval(5 * 1000);
                locationRequest.setFastestInterval(1 * 1000);
                locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
                // locationRequest.getSmallestDisplacement(10);
            } else {
                Toast.makeText(this, "Map Not Connected!", Toast.LENGTH_SHORT).show();
            }
        } else {
            setContentView(R.layout.activity_maps);
        }
        curLat = (TextView) findViewById(R.id.curLat);
        curLng = (TextView) findViewById(R.id.curLong);
        clientHandler = new ClientHandler(this);
        clientThread = new ClientThread(
                address,
                port,
                clientHandler);
        clientThread.start();
        Toast.makeText(getApplicationContext(), "Thread has been started", Toast.LENGTH_LONG).show();
    }

    public void parse(View view) {
        EditText latitude = (EditText) findViewById(R.id.latitude);
        EditText longitude = (EditText) findViewById(R.id.longitude);

        String lat = String.valueOf(parserino(latitude.getText().toString()));
        String lng = String.valueOf(parserino(longitude.getText().toString()));

        double newLat = Double.parseDouble(lat);
        double newLong = Double.parseDouble(lng);
        gotoLocation(newLat, newLong, 15);

    }

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

    public boolean initMap() {
        if (mMap == null) {
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    mMap = googleMap;
                    gotoLocation(currentLatitude, currentLongitude, 5);
                    if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                        return;
                    }
//                    mMap.setMyLocationEnabled(true);
                    mMap.getUiSettings().setZoomControlsEnabled(true);
                    mMap.getUiSettings().setAllGesturesEnabled(true);
                    mMap.getUiSettings().setMyLocationButtonEnabled(true);
                    mMap.getUiSettings().setCompassEnabled(true);
                }
            });
        }
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
    private void gotoLocation(double lat, double lng, float zoom) {
        LatLng latlng = new LatLng(lat, lng);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(latlng, zoom);
        mMap.addMarker(new MarkerOptions().position(latlng).title("Location"));
        mMap.animateCamera(update);
    }

    @Override
    public void onConnected(Bundle bundle) {
        requestLocationUpdates();
    }

    private void requestLocationUpdates() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSIONS_REQUEST_FINE_LOCATION);
            } else {
                //ensures we can run the app below api 23
                permissionIsGranted = true;
            }
            return;
        }
        locationProvider.requestLocationUpdates(mGoogleApiClient, locationRequest, this);
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    public void onLocationChanged(Location location) {
        currentLatitude = location.getLatitude();
        currentLongitude = location.getLongitude();
        curLat.setText(String.valueOf(currentLatitude));
        curLng.setText(String.valueOf(currentLongitude));
        //navigate to the current location
        gotoLocation(currentLatitude, currentLongitude, 20);
        //send coordinates to the server using a thread
        clientThread.txMsg(currentLatitude.toString() + " " + currentLongitude.toString());
    }

    @Override
    protected void onStart() {
        super.onStart();
        mGoogleApiClient.connect();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (permissionIsGranted) {
            if (mGoogleApiClient.isConnected()) {
                requestLocationUpdates();
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (permissionIsGranted) {
            locationProvider.removeLocationUpdates(mGoogleApiClient, this);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (permissionIsGranted) {
            mGoogleApiClient.disconnect();
        } else if (clientThread != null) {
            clientThread.setRunning(false);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
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
                    Toast.makeText(getApplicationContext(), "This app requires permission to be granted", Toast.LENGTH_SHORT).show();
                    //code to exit the map view
//                    startActivity(new Intent(MapsActivity.this, MainActivity.class));
                }
                break;
            case MY_PERMISSIONS_REQUEST_COARSE_LOCATION:
                // code for coarse location
                break;
        }
    }

    private void clientEnd() {
        clientThread = null;
    }

    /**
     * The class implements some variables that can be manipulated to discover the different
     * states the communication
     */
    public static class ClientHandler extends Handler {
        public static final int UPDATE_STATE = 0;
        public static final int UPDATE_MSG = 1;
        public static final int UPDATE_END = 2;
        private MapsActivity parent;

        public ClientHandler(MapsActivity parent) {
            super();
            this.parent = parent;
        }

        @Override
        public void handleMessage(Message msg) {

            switch (msg.what) {
                case UPDATE_END:
                    parent.clientEnd();
                    break;
                default:
                    super.handleMessage(msg);
            }

        }

    }

}