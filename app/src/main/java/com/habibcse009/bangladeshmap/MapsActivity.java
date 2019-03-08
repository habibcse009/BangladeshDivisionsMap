package com.habibcse009.bangladeshmap;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        if (Build.VERSION.SDK_INT>=23){
            requestPermission();
        }
        else {
            //nothing
        }
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String getName = getIntent().getExtras().getString("Place_no");
        if (getName.equals("one")) {
            LatLng dhaka = new LatLng(23.810331, 90.412521);
            mMap.addMarker(new MarkerOptions().position(dhaka).title("Marker in Dhaka"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(dhaka));
            //zoom coltrol
            float zoomLevel = 12.2f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dhaka, zoomLevel));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dhaka, zoomLevel));
        } else if (getName.equals("two")) {
            LatLng chittagong = new LatLng(22.355479, 91.822055);
            mMap.addMarker(new MarkerOptions().position(chittagong).title("Marker in Chittagong"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(chittagong));
            //zoom coltrol
            float zoomLevel = 12.2f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chittagong, zoomLevel));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(chittagong, zoomLevel));
        } else if (getName.equals("three")) {
            LatLng rajshahi = new LatLng(24.363588, 88.624138);
            mMap.addMarker(new MarkerOptions().position(rajshahi).title("Marker in Rajshahi"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(rajshahi));
            //zoom coltrol
            float zoomLevel = 12.2f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rajshahi, zoomLevel));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(rajshahi, zoomLevel));

        } else if (getName.equals("four")) {
            LatLng khulna = new LatLng(22.845640, 89.540329);
            mMap.addMarker(new MarkerOptions().position(khulna).title("Marker in Khulna"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(khulna));
            //zoom coltrol
            float zoomLevel = 12.2f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(khulna, zoomLevel));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(khulna, zoomLevel));

        } else if (getName.equals("five")) {
            LatLng barisal = new LatLng(22.701002, 90.353455);
            mMap.addMarker(new MarkerOptions().position(barisal).title("Marker in Barisal"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(barisal));
            //zoom coltrol
            float zoomLevel = 12.2f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(barisal, zoomLevel));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(barisal, zoomLevel));

        } else if (getName.equals("six")) {
            LatLng sylhet = new LatLng(24.894930, 91.868706);
            mMap.addMarker(new MarkerOptions().position(sylhet).title("Marker in Sylhet"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sylhet));
            //zoom coltrol
            float zoomLevel = 12.2f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sylhet, zoomLevel));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sylhet, zoomLevel));

        } else if (getName.equals("seven")) {
            LatLng mymensingh = new LatLng(24.747149, 90.420273);
            mMap.addMarker(new MarkerOptions().position(mymensingh).title("Marker in Mymensingh"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(mymensingh));
            //zoom coltrol
            float zoomLevel = 12.2f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mymensingh, zoomLevel));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mymensingh, zoomLevel));

        } else if (getName.equals("eight")) {
            LatLng rangpur = new LatLng(25.743893, 89.275230);
            mMap.addMarker(new MarkerOptions().position(rangpur).title("Marker in Rangpur"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(rangpur));
            //zoom coltrol
            float zoomLevel = 12.2f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rangpur, zoomLevel));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(rangpur, zoomLevel));

        }








        // Add a marker in Sydney and move the camera
       /* LatLng chittagong = new LatLng(22.355479, 91.822055);
        mMap.addMarker(new MarkerOptions().position(chittagong).title("Marker in Chittagong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chittagong));*/
        //   mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE); //for satellite mode
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID); //for hybrid mode

       /* //zoom coltrol
        float zoomLevel = 12.2f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chittagong, zoomLevel));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(chittagong, zoomLevel));*/

        //location access
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);

    }
    public void requestPermission(){
        Dexter.withActivity(this)
                .withPermission(Manifest.permission.ACCESS_FINE_LOCATION)
                .withListener(new PermissionListener() {
                    @Override public void onPermissionGranted(PermissionGrantedResponse response) {
                        Toast.makeText(MapsActivity.this,"Parmission Granted",Toast.LENGTH_SHORT).show();
                    }
                    @Override public void onPermissionDenied(PermissionDeniedResponse response) {
                        Toast.makeText(MapsActivity.this,"Please Allow Location Parmission",Toast.LENGTH_SHORT).show();

                    }
                    @Override public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
                        token.continuePermissionRequest();}
                }).check();
    }
}
