package com.example.proyectomoviles;

public class Artista {

    private String nombre;

    private int imagen;

    public Artista(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Artista(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
