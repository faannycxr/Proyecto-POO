package com.mycompany.proyectofinalpoo12eq02;

public class ventaResultado {

    private int boletosAdulto;
    private int boletosNino;
    private int totalBoletos;
    private double montoBoletos;
    private Cartelera cartelera;

    private int totalProductos;
    private double montoProductos;
    private Sucursal sucursal;

    public ventaResultado(int boletosAdulto, int boletosNino, int totalBoletos,
                          double montoBoletos, Cartelera cartelera) {

        this.boletosAdulto = boletosAdulto;
        this.boletosNino = boletosNino;
        this.totalBoletos = totalBoletos;
        this.montoBoletos = montoBoletos;
        this.cartelera = cartelera;

        this.totalProductos = 0;
        this.montoProductos = 0;
        this.sucursal = null;
    }

    public ventaResultado(int totalProductos, double montoProductos, Sucursal sucursal) {

        this.totalProductos = totalProductos;
        this.montoProductos = montoProductos;
        this.sucursal = sucursal;

        this.boletosAdulto = 0;
        this.boletosNino = 0;
        this.totalBoletos = 0;
        this.montoBoletos = 0;
        this.cartelera = null;
    }

    public int getBoletosAdulto() {
        return boletosAdulto;
    }

    public int getBoletosNino() {
        return boletosNino;
    }

    public int getTotalBoletos() {
        return totalBoletos;
    }

    public double getMontoBoletos() {
        return montoBoletos;
    }

    public Cartelera getCartelera() {
        return cartelera;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public double getMontoProductos() {
        return montoProductos;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }
}
