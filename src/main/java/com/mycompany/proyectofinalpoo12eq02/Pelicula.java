/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalpoo12eq02;

/**
 *
 * @author caban
 */
import java.util.ArrayList;

public class Pelicula {

    private String nombrePelicula;
    private String clasificacion;
    private String director;
    private int duracion; // en minutos
    private ArrayList<String> actores;
    private String sinopsis;

    
    public Pelicula(String nombrePelicula, String clasificacion, String director,
                    int duracion, ArrayList<String> actores, String sinopsis) {

        this.nombrePelicula = nombrePelicula;
        this.clasificacion = clasificacion;
        this.director = director;
        this.duracion = duracion;
        this.actores = actores;
        this.sinopsis = sinopsis;
    }

    // ===========================
    //   Constructor vacío (opcional)
    // ===========================
    public Pelicula() {
        this.actores = new ArrayList<>(); // inicializar para evitar null
    }

    
    //Funciones Getters
    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    //      Setters
    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}


