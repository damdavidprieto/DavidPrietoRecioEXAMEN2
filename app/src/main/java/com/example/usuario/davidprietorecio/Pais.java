package com.example.usuario.davidprietorecio;

import java.util.ArrayList;

/**
 * Created by Usuario on 21/02/2018.
 */

public class Pais {

    private String nombreInges,nombreCastellano,clave,capital,continente,poblacion,latitud,longitud,paisesFronterizos;

    public Pais() {
        this.nombreInges = "";
        this.nombreCastellano = "";
        this.clave = "";
        this.capital = "";
        this.continente = "";
        this.poblacion = "";
        this.latitud = "";
        this.longitud = "";
        this.paisesFronterizos = "";
    }

    public Pais(String nombreInges, String nombreCastellano, String clave, String capital, String continente, String poblacion, String latitud, String longitud,String paisesFronterizos) {
        this.nombreInges = nombreInges;
        this.nombreCastellano = nombreCastellano;
        this.clave = clave;
        this.capital = capital;
        this.continente = continente;
        this.poblacion = poblacion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.paisesFronterizos = paisesFronterizos;
    }

    public String getNombreInges() {
        return nombreInges;
    }

    public void setNombreInges(String nombreInges) {
        this.nombreInges = nombreInges;
    }

    public String getNombreCastellano() {
        return nombreCastellano;
    }

    public void setNombreCastellano(String nombreCastellano) {
        this.nombreCastellano = nombreCastellano;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getPaisesFronterizos() {
        return paisesFronterizos;
    }

    public void setPaisesFronterizos(String paisesFronterizos) {
        this.paisesFronterizos = paisesFronterizos;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombreInges='" + nombreInges + '\'' +
                ", nombreCastellano='" + nombreCastellano + '\'' +
                ", clave='" + clave + '\'' +
                ", capital='" + capital + '\'' +
                ", continente='" + continente + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", latitud='" + latitud + '\'' +
                ", longitud='" + longitud + '\'' +
                ", paisesFronterizos='" + paisesFronterizos + '\'' +
                '}';
    }
}
