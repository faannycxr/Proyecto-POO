package com.mycompany.proyectofinalpoo12eq02;

import java.util.Random;
import java.util.Scanner;

public class registroCliente {

    public static void registrarNuevoCliente() {
        try {
            Scanner scn = new Scanner(System.in);

            System.out.println(" Registro de nuevo cliente ");
            System.out.println("¡¡Nos alegramos de que te unas a nuestra familia!!");
            System.out.println("Ingresa los datos que solicitamos y tu cuenta estara lista");

            System.out.print("Nombre: ");
            String nombre = scn.nextLine();

            System.out.print("Apellido paterno: ");
            String ap1 = scn.nextLine();

            System.out.print("Apellido materno: ");
            String ap2 = scn.nextLine();

            System.out.print("Direccion: ");
            String dir = scn.nextLine();

            System.out.print("Telefono: ");
            String tel = scn.nextLine();

            System.out.print("Correo: ");
            String correo = scn.nextLine();

            String IDtemp = generarID();

            System.out.print("Contrasena: ");
            String pass = scn.nextLine();

            clientes nuevo = new clientes(nombre, ap1, ap2, dir, tel, correo, IDtemp, pass, false);

            try {
                clientesPrecargados.agregarCliente(nuevo);
            } catch (Exception e) {
                System.out.println("No se pudo agregar el cliente a la lista");
            }

            System.out.println("\n Datos capturados ");
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido paterno: " + ap1);
            System.out.println("Apellido materno: " + ap2);
            System.out.println("Direccion: " + dir);
            System.out.println("Telefono: " + tel);
            System.out.println("Correo: " + correo);
            System.out.println("ID asignado: " + IDtemp);

            System.out.println("\nTodo esta correcto?");
            System.out.println("1. Si");
            System.out.println("2. No");

            int op = 0;
            try {
                op = Integer.parseInt(scn.nextLine().trim());
            } catch (Exception e) {
                op = 0;
            }

            clientes clienteEnSesion = null;
            for (clientes c : clientesPrecargados.getListaClientes()) {
                if (c.getNumeroCuenta().equals(IDtemp)) {
                    clienteEnSesion = c;
                    break;
                }
            }

            if (clienteEnSesion == null) {
                System.out.println("Error: no se encontro el cliente registrado.");
                return;
            }

            inicioSesion.setSesionIniciada(true);

            // ************** CORRECCION IMPORTANTE **************
            // Ya NO se accede a clienteActual directamente (era privado).
            inicioSesion.setClienteActual(clienteEnSesion);
            // ****************************************************

            switch (op) {
                case 1:
                    System.out.println("Cliente registrado con exito");
                    break;

                case 2:
                    try {
                        modificarDatosCliente.modificarClienteSesion();
                    } catch (Exception e) {
                        System.out.println("No se pudo acceder al editor de datos.");
                    }
                    break;

                default:
                    System.out.println("Opcion invalida, se procede a registrar el cliente");
                    break;
            }

            try {
                clientes c = inicioSesion.getClienteActual();
                if (c == null) {
                    System.out.println("Error: no hay cliente en sesion");
                    return;
                }

                if (!c.getInscritoLealtad()) {
                    System.out.println("No esta registrado en el programa de lealtad.");
                    System.out.println("Desea registrarse?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    System.out.print("Opcion: ");

                    int r = 0;
                    try {
                        r = Integer.parseInt(scn.nextLine().trim());
                    } catch (Exception e) {
                        r = 0;
                    }

                    switch (r) {
                        case 1:
                            try {
                                c.setInscritoLealtad(true);
                                programaLealtad p = new programaLealtad(true);
                                p.activarRegistro();
                            } catch (Exception e) {
                                System.out.println("Error activando lealtad");
                            }
                            break;

                        case 2:
                            System.out.println("Continuando sin registrarse...");
                            break;

                        default:
                            System.out.println("Opcion invalida. Continuando...");
                            break;
                    }

                } else {
                    try {
                        programaLealtad p = new programaLealtad(true);
                        c.verificarPrograma();
                    } catch (Exception e) {
                        System.out.println("Error en el programa de lealtad");
                    }
                }

            } catch (Exception e) {
                System.out.println("Error al acceder al programa de lealtad.");
            }

        } catch (Exception e) {
            System.out.println("No se pudo registrar el cliente");
        }
    }

    private static String generarID() {
        try {
            Random rnd = new Random();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                sb.append(rnd.nextInt(10));
            }
            return sb.toString();
        } catch (Exception e) {
            return "0000000000";
        }
    }
}
