package com.mycompany.proyectofinalpoo12eq02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sucursal {

    private final String nombre;
    private final List<Cartelera> cartelera = new ArrayList<>();
    private final HashMap<String, Integer> stockProductos = new HashMap<>();

    private final List<producto> listaDeObjetosProducto = new ArrayList<>();

    public Sucursal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Cartelera> getCartelera() {
        return cartelera;
    }

    public void agregarCartelera(Cartelera c) {
        if (c != null) {
            cartelera.add(c);
        }
    }

    public void imprimirCarteleras() {
        if (cartelera.isEmpty()) {
            System.out.println("No hay funciones disponibles en " + nombre + ".");
            return;
        }
        System.out.println("Funciones en " + nombre + ":");
        for (Cartelera c : cartelera) {
            c.imprimirCartelera();
        }
    }

    // Manejo de productos
    public void agregarStock(String producto, int cantidad) {
        if (producto == null || cantidad <= 0) return;
        int actual = stockProductos.getOrDefault(producto, 0);
        stockProductos.put(producto, actual + cantidad);
    }

    public boolean reducirStock(String producto, int cantidad) {
        if (producto == null || cantidad <= 0) return false;

        int actual = stockProductos.getOrDefault(producto, 0);
        if (actual < cantidad) {
            return false;
        }
        stockProductos.put(producto, actual - cantidad);
        return true;
    }

    public int consultarStock(String producto) {
        if (producto == null) return 0;
        return stockProductos.getOrDefault(producto, 0);
    }

    public void imprimirStock() {
        System.out.println("Stock de productos en " + nombre + ":");
        if (stockProductos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }
        for (String p : stockProductos.keySet()) {
            System.out.println(p + ": " + stockProductos.get(p));
        }
    }

    public List<producto> getProducto() {
        return listaDeObjetosProducto;
    }

    public int obtenerStockProducto(producto p) {
        if (p == null) return 0;
        return consultarStock(p.getNombreProducto());
    }
}