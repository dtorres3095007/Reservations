package com.example.damian.reservations;

/**
 * Created by android on 02/11/2017.
 */

public class Establecimientos {
    private String id;
    private  String nombre;
    private  String direccion;

    public Establecimientos(String id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;

        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}