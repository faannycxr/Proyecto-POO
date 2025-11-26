package com.mycompany.proyectofinalpoo12eq02;

import java.util.Scanner;

public class MenuClienteNoRegistrado {

    private static Sucursales sucursales = new Sucursales();
    private static Sucursal sucursalActual = sucursales.getCU();
    private static CarteleraPrecargada carteleraBase = new CarteleraPrecargada();

    public static void cargarCarteleraEnSucursales() {
        for (Cartelera c : carteleraBase.getListaCartelera()) {
            sucursales.agregarCartelera(c);
        }
    }

    public static void mostrarEslogan() {
        System.out.println("Cine-TICs \nTrayendo historias especiales para personas especiales");
    }

    public static void mostrarMenu() {
        System.out.println("1) Iniciar Sesión");
        System.out.println("2) Ingresar como Invitado");
        System.out.println("3) Salir");
    }

    public static void MenuInicial() {
        Scanner sc = new Scanner(System.in);
        mostrarEslogan();
        mostrarMenu();
        int opMenu = sc.nextInt();

        switch (opMenu) {
            case 1:
                System.out.println("Iniciando sesión...");
                break;
            case 2:
                System.out.println("Ingresando como invitado...");
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public static void menuNoRegistrado(String[] args) {

        Scanner sc = new Scanner(System.in);
        cargarCarteleraEnSucursales();
        sucursalActual = sucursales.getCU();

        System.out.println("\nSucursal actual: " + sucursalActual.getNombre());
        System.out.println("1. Ver cartelera");
        System.out.println("2. Buscar Pelicula");
        System.out.println("3. Cambiar sucursal");
        System.out.println("4. Iniciar sesion");
        System.out.println("5. Buscar producto");
        System.out.println("6. Ver carrito");
        System.out.println("7. Actualizar datos personales");
        System.out.println("8. Registrarse");
        System.out.println("9. Ver compras");
        System.out.println("10. Ver mis puntos");
        System.out.println("11. Salir");

        int op = sc.nextInt();

        switch (op) {

            case 1:
                System.out.println("\nCARTELERA EN " + sucursalActual.getNombre());
                sucursalActual.imprimirCarteleras();
                break;

            case 2:
                BuscarPelicula.buscarPelicula(sucursalActual);
                break;
            case 3:
                
                break;
            default:
                System.out.println("Opción no implementada.");
                break;
                
            
        }
    }
}
