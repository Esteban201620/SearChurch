package com.udistrital.marlonestebanosoriorico.searchurch;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by esteban on 24/05/2017.
 */

public class Iglesia {
    LatLng posicion;
    String nombre;

    public Iglesia(LatLng posicion, String nombre){
        this.posicion = posicion;
        this.nombre = nombre;

    }


}
