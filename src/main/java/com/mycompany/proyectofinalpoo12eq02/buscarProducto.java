package com.mycompany.proyectofinalpoo12eq02;

import java.util.Scanner;

public class buscarProducto {

    public static void buscarProducto(Sucursal sucursalActual) {

        Scanner sc = new Scanner(System.in);
        String nombreBuscado = "";

        try {
            System.out.println("Ingresa el nombre del producto a buscar:");
            nombreBuscado = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Error al leer el nombre.");
            return;
        }

        boolean encontrado = false;
        producto resultado = null;

        try {
            for (int i = 0; i < sucursalActual.getProducto().size(); i++) {
                producto p = sucursalActual.getProducto().get(i);

                if (p.getNombreProducto().toLowerCase()
                        .contains(nombreBuscado.toLowerCase())) {

                    encontrado = true;
                    resultado = p;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el producto.");
            return;
        }

        if (encontrado) {
            System.out.println("Producto encontrado:");
            imprimirProducto(resultado, sucursalActual);

            ventas v = new ventas();
            v.comprarProducto(sucursalActual);

        } else {
            System.out.println("No contamos con ese producto en este momento.");
            System.out.println("Pero podemos ofrecerte estos productos:");

            try {
                for (int i = 0; i < sucursalActual.getProducto().size(); i++) {
                    producto p = sucursalActual.getProducto().get(i);
                    System.out.println("- " + p.getNombreProducto());
                }
            } catch (Exception e) {
                System.out.println("Error al mostrar los productos disponibles.");
            }
        }
    }

    public static void imprimirProducto(producto p, Sucursal sucursalActual) {

        System.out.println("Nombre: " + p.getNombreProducto());
        System.out.println("Categoria: " + p.getCategoria());
        System.out.println("Precio: $" + p.getPrecio());
        System.out.println("Codigo: " + p.getCodigoProducto());
        System.out.println("Stock en esta sucursal: " + sucursalActual.obtenerStockProducto(p));
    }
}
