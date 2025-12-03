package com.mycompany.proyectofinalpoo12eq02;

import java.util.Scanner;

public class MenuClienteNoRegistrado {

    private static Sucursales sucursales = new Sucursales();
    private static Sucursal sucursalActual = sucursales.getCU();
    private static carteleraPrecargada carteleraBase = new carteleraPrecargada();
    private static boolean carteleraCargada = false;

    public static void cargarCarteleraEnSucursales() {
        if (!carteleraCargada) {
            for (Cartelera c : carteleraBase.getListaCartelera()) {
                sucursales.agregarCartelera(c);
            }
            carteleraCargada = true;
        }
    }

    public static void mostrarEslogan() {
        System.out.println("Cine-TICs");
        System.out.println("Trayendo historias especiales para personas especiales");
    }

    public static void mostrarMenu() {
        System.out.println("1) Iniciar Sesion");
        System.out.println("2) Ingresar como Invitado");
        System.out.println("3) Salir");
    }

    public static void MenuInicial() {
        Scanner sc = new Scanner(System.in);

        try {
            mostrarEslogan();
            mostrarMenu();
            System.out.print("Selecciona una opcion: ");

            int opMenu = sc.nextInt();
            sc.nextLine();

            switch (opMenu) {
                case 1:
                    inicioSesion login = new inicioSesion();
                    boolean acceso = login.iniciar();

                    if (acceso) {
                        System.out.println("Inicio de sesion exitoso");
                    } else {
                        System.out.println("ID o contrasena incorrectos");
                    }
                    break;

                case 2:
                    System.out.println("Ingresando como invitado...");
                    menuNoRegistrado(new String[0]);
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    System.out.println("Esperamos con ansias tu regreso :D");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        } catch (Exception e) {
            System.out.println("Entrada invalida");
        }
    }

    public static void menuNoRegistrado(String[] args) {
        Scanner sc = new Scanner(System.in);

        cargarCarteleraEnSucursales();
        sucursalActual = sucursales.getCU();

        while (true) {
            try {
                System.out.println("\nSucursal actual: " + sucursalActual.getNombre());
                if (!inicioSesion.isSesionIniciada()) {
                    System.out.println("Usted ha iniciado como invitado");
                } else {
                    clientes c = inicioSesion.getClienteActual();
                    System.out.println("Bienvenido " + c.getNombre());
                }

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
                System.out.print("Selecciona una opcion: ");

                int op = sc.nextInt();
                sc.nextLine(); // limpiar

                switch (op) {

                    case 1:
                        System.out.println("\nCARTELERA EN " + sucursalActual.getNombre());
                        sucursalActual.imprimirCarteleras();
                        break;

                    case 2:
                        BuscarPelicula.buscarPelicula(sucursalActual);
                        break;

                    case 3:
                        sucursalActual = CambiarSucursal.cambiarSucursal(sucursales, sucursalActual);
                        break;

                    case 4:
                        try {
                            if (!inicioSesion.isSesionIniciada()) {
                                inicioSesion login = new inicioSesion();
                                login.iniciar();
                            }
                        } catch (Exception e) {
                            System.out.println("Usted ya inicio sesion");
                        }
                        break;

                    case 5:
                        buscarProducto.buscarProducto(sucursalActual);
                        break;

                    case 6:
                        break;

                    case 7:
                        modificarDatosCliente.modificarClienteSesion();
                        break;

                    case 8:
                        registroCliente.registrarNuevoCliente();
                        
                    case 9:
                        if (!inicioSesion.isSesionIniciada()) {
                            System.out.println("Solo puede ver sus compras si inicio sesion");
                        }
                        break;

                    case 10:
                        try {
                            if (!inicioSesion.isSesionIniciada()) {
                                System.out.println("Solo puede ver sus puntos si inicio sesion");
                            } else {
                                clientes c = inicioSesion.getClienteActual();
                                if (!c.isSocioLealtad()) {
                                    System.out.println("No esta registrado en el programa de lealtad.");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");

                                    int r = sc.nextInt();
                                    sc.nextLine();

                                    if (r == 1) c.activarLealtad();
                                } else {
                                    c.verificarPrograma();
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Error al acceder al programa de lealtad.");
                        }
                        break;

                    case 11:
                        System.out.println("Regresando al menu principal...");
                        return;

                    default:
                        System.out.println("Opcion no implementada.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida");
                sc.nextLine(); // limpiar error
            }
        }
    }
}
