package com.mycompany.proyectofinalpoo12eq02;

public class metodoPago {

    private String nombreTitular;
    private int numTarjeta;
    private int fechaVigencia;
    private int codVeri;
    private String tipoTarjeta;


    public metodoPago() {
    }


    public metodoPago(String nombreTitular, int numTarjeta, int fechaVigencia, int codVeri, String tipoTarjeta) {
        this.nombreTitular = nombreTitular;
        this.numTarjeta = numTarjeta;
        this.fechaVigencia = fechaVigencia;
        this.codVeri = codVeri;
        this.tipoTarjeta = tipoTarjeta;
    }


    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public int getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(int fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public int getCodVeri() {
        return codVeri;
    }

    public void setCodVeri(int codVeri) {
        this.codVeri = codVeri;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public void imprimirMetodoPago() {
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Numero de tarjeta: " + numTarjeta);
        System.out.println("Fecha de vigencia: " + fechaVigencia);
        System.out.println("Codigo de verificacion: " + codVeri);
        System.out.println("Tipo de tarjeta: " + tipoTarjeta);
    }
}
