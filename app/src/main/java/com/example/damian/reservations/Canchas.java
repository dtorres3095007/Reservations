package com.example.damian.reservations;

/**
 * Created by android on 02/11/2017.
 */

public class Canchas {
    private String id;
    private String id_establecimiento;
    private String id_foto;
    private int NumCancha;
    private int tamano;

    public Canchas(String id, String id_establecimiento, int numCancha, int tamano,String foto) {
        this.id = id;
        this.id_establecimiento = id_establecimiento;
        NumCancha = numCancha;
        this.tamano = tamano;
        this.id_foto=foto;
    }

    public Canchas() {

    }

    public String getId_foto() {
        return id_foto;
    }

    public void setId_foto(String id_foto) {
        this.id_foto = id_foto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_establecimiento() {
        return id_establecimiento;
    }

    public void setId_establecimiento(String id_establecimiento) {
        this.id_establecimiento = id_establecimiento;
    }

    public int getNumCancha() {
        return NumCancha;
    }

    public void setNumCancha(int numCancha) {
        NumCancha = numCancha;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
}
