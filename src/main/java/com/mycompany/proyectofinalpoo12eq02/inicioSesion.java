package com.mycompany.proyectofinalpoo12eq02;

import java.util.Scanner;

public class inicioSesion {

    private clientesPrecargados clientesBD;

    private static boolean sesionIniciada = false;

    private static clientes clienteActual = null;

    public inicioSesion() {
        clientesBD = new clientesPrecargados();
    }

    public static boolean isSesionIniciada() {
        return sesionIniciada;
    }

    public static void setSesionIniciada(boolean valor) {
        sesionIniciada = valor;
    }

    public static clientes getClienteActual() {
        return clienteActual;
    }

    public static void setClienteActual(clientes c) {
        clienteActual = c;
    }

    public boolean iniciar() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa tu ID: ");
            String idIngresado = sc.nextLine().trim();

            System.out.print("Ingresa tu contrasena: ");
            String contrasenaIngresada = sc.nextLine().trim();

            for (clientes c : clientesBD.getListaClientes()) {

                if (c.getId().equals(idIngresado)
                        && c.getContrasenia().equals(contrasenaIngresada)) {

                    System.out.println("Inicio de sesion exitoso.");

                    sesionIniciada = true;
                    clienteActual = c;

                    return true;
                }
            }

            System.out.println("Datos incorrectos.");
            sesionIniciada = false;
            clienteActual = null;
            return false;

        } catch (Exception e) {
            System.out.println("Ocurrio un error al intentar iniciar sesion.");
            sesionIniciada = false;
            clienteActual = null;
            return false;
        }
    }
}
