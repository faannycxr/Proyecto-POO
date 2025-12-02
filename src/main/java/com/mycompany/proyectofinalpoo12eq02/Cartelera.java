package com.mycompany.proyectofinalpoo12eq02;

public class Cartelera {

    private Pelicula pelicula;
    private String horario;
    private String sala;
    private String sucursal;


    public Cartelera(Pelicula pelicula, String horario, String sala, String sucursal) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.sala = sala;
        this.sucursal = sucursal;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void imprimirCartelera() {
        System.out.println("=========================================");
        System.out.println("PELICULA: " + pelicula.getNombrePelicula());
        System.out.println("Clasificacion: " + pelicula.getClasificacion());
        System.out.println("Director: " + pelicula.getDirector());
        System.out.println("Duracion: " + pelicula.getDuracion() + " min");
        System.out.println("Actores: " + pelicula.getActores());
        System.out.println("Sinopsis: " + pelicula.getSinopsis());
        System.out.println("Horario: " + horario);
        System.out.println("Sala: " + sala);
        System.out.println("Sucursal: " + sucursal);
        System.out.println("=========================================");
    }
}
