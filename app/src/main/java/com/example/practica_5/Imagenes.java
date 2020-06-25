package com.example.practica_5;

import android.os.Parcelable;

import java.io.Serializable;

public class Imagenes implements Serializable {
    private int imgFoto;
    private String Nombre;
    private String Autor;
    private String Fecha;
    private String Resumen;

    public Imagenes(int imgFoto, String nombre, String autor, String fecha, String resumen) {

        this.imgFoto = imgFoto;
        Nombre = nombre;
        Autor = autor;
        Fecha = fecha;
        Resumen = resumen;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(int imgFoto) {
        this.imgFoto = imgFoto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getResumen() {
        return Resumen;
    }

    public void setResumen(String resumen) {
        Resumen = resumen;
    }

}
