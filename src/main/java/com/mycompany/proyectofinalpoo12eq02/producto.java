package com.mycompany.proyectofinalpoo12eq02;

public class producto {

    private String nombreProducto;
    private int codigoProducto;
    private int precio;
    private String categoria;

    private int stockCU;
    private int stockUni;
    private int stockCarso; 
    private int stockXochimilco;
    private int stockPolanco;

    // Constructor completo
    public producto(String nombreProducto, int codigoProducto, int precio, String categoria,
                     int stockCU, int stockUni, int stockCarso, int stockXochimilco, int stockPolanco) {

        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.categoria = categoria;

        this.stockCU = stockCU;
        this.stockUni = stockUni;
        this.stockCarso = stockCarso;
        this.stockXochimilco = stockXochimilco;
        this.stockPolanco = stockPolanco;
    }

    // Constructor vacio
    public producto() {
    }

    // Getters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getStockCU() {
        return stockCU;
    }

    public int getStockUni() {
        return stockUni;
    }

    public int getStockCarso() {
        return stockCarso;
    }

    public int getStockXochimilco() {
        return stockXochimilco;
    }

    public int getStockPolanco() {
        return stockPolanco;
    }

    // Setters
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setStockCU(int stockCU) {
        this.stockCU = stockCU;
    }

    public void setStockUni(int stockUni) {
        this.stockUni = stockUni;
    }

    public void setStockCarso(int stockCarso) {
        this.stockCarso = stockCarso;
    }

    public void setStockXochimilco(int stockXochimilco) {
        this.stockXochimilco = stockXochimilco;
    }

    public void setStockPolanco(int stockPolanco) {
        this.stockPolanco = stockPolanco;
    }
}
    