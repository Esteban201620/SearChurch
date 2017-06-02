package com.udistrital.marlonestebanosoriorico.searchurch;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Ubicacion extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private GoogleMap mMap2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

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


        Iglesia miIglesia;
        mMap = googleMap;
        mMap2 = googleMap;
        mMap2.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        UiSettings uisettings= mMap2.getUiSettings();
        uisettings.setZoomControlsEnabled(true);

        LatLng bogota = new LatLng(4.6097100, -74.0817500);

        float zoomlevel=11;

        for (int i = 0; i< Banco.iglesias.size(); i++){
            mMap2.addMarker(new MarkerOptions().position(Banco.iglesias.get(i).posicion).title(Banco.iglesias.get(i).nombre).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE
            )));
        }

        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(bogota,zoomlevel));
    }
}
