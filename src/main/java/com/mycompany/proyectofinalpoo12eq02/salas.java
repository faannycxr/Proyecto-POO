package com.mycompany.proyectofinalpoo12eq02;

public class salas {

    private String sucursal;
    private String numeroSala;
    private int capacidad;

    public salas(String sucursal, String numeroSala, int capacidad) {
        this.sucursal = sucursal;
        this.numeroSala = numeroSala;
        this.capacidad = capacidad;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getNumeroSala() {
        return numeroSala;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
