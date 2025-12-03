package com.mycompany.proyectofinalpoo12eq02;

import java.util.Scanner;

public class modificarDatosCliente {

    public static void modificarClienteSesion() {

        try {
            if (!inicioSesion.isSesionIniciada() || inicioSesion.getClienteActual() == null) {
                System.out.println("Usted no ha iniciado sesion.");
                return;
            }

            clientes clienteMod = inicioSesion.getClienteActual();
            Scanner sc = new Scanner(System.in);

            int opc = -1;

            while (opc != 0) {

                try {
                    System.out.println("\n=== Que deseas modificar? ===");
                    System.out.println("1. Nombre");
                    System.out.println("2. Apellido paterno");
                    System.out.println("3. Apellido materno");
                    System.out.println("4. Direccion");
                    System.out.println("5. Telefono");
                    System.out.println("6. Correo");
                    System.out.println("7. Contrasena");
                    System.out.println("10. Modificar todo");
                    System.out.println("11. Borrar mi cuenta");
                    System.out.println("0. Salir");
                    System.out.print("Elige una opcion: ");

                    opc = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Opcion invalida.");
                    opc = -1;
                }

                switch (opc) {

                    case 1:
                        try {
                            System.out.print("Nuevo nombre: ");
                            clienteMod.setNombre(sc.nextLine());
                            System.out.println("Nombre actualizado correctamente.");
                        } catch (Exception e) {
                            System.out.println("No se pudo modificar el nombre.");
                        }
                        break;

                    case 2:
                        try {
                            System.out.print("Nuevo apellido paterno: ");
                            clienteMod.setApellidoPaterno(sc.nextLine());
                            System.out.println("Apellido paterno actualizado.");
                        } catch (Exception e) {
                            System.out.println("No se pudo modificar el apellido paterno.");
                        }
                        break;

                    case 3:
                        try {
                            System.out.print("Nuevo apellido materno: ");
                            clienteMod.setApellidoMaterno(sc.nextLine());
                            System.out.println("Apellido materno actualizado.");
                        } catch (Exception e) {
                            System.out.println("No se pudo modificar el apellido materno.");
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("Nueva direccion: ");
                            clienteMod.setDireccion(sc.nextLine());
                            System.out.println("Direccion actualizada.");
                        } catch (Exception e) {
                            System.out.println("No se pudo modificar la direccion.");
                        }
                        break;

                    case 5:
                        try {
                            System.out.print("Nuevo telefono: ");
                            clienteMod.setTelefono(sc.nextLine());
                            System.out.println("Telefono actualizado.");
                        } catch (Exception e) {
                            System.out.println("No se pudo modificar el telefono.");
                        }
                        break;

                    case 6:
                        try {
                            System.out.print("Nuevo correo: ");
                            clienteMod.setCorreo(sc.nextLine());
                            System.out.println("Correo actualizado.");
                        } catch (Exception e) {
                            System.out.println("No se pudo modificar el correo.");
                        }
                        break;

                    case 7:
                        try {
                            System.out.print("Nueva contrasena: ");
                            clienteMod.setContrasena(sc.nextLine());
                            System.out.println("Contrasena actualizada.");
                        } catch (Exception e) {
                            System.out.println("No se pudo modificar la contrasena.");
                        }
                        break;

                    case 10:
                        try {
                            System.out.println("Modificar todo:");

                            System.out.print("Nuevo nombre: ");
                            clienteMod.setNombre(sc.nextLine());

                            System.out.print("Nuevo apellido paterno: ");
                            clienteMod.setApellidoPaterno(sc.nextLine());

                            System.out.print("Nuevo apellido materno: ");
                            clienteMod.setApellidoMaterno(sc.nextLine());

                            System.out.print("Nueva direccion: ");
                            clienteMod.setDireccion(sc.nextLine());

                            System.out.print("Nuevo telefono: ");
                            clienteMod.setTelefono(sc.nextLine());

                            System.out.print("Nuevo correo: ");
                            clienteMod.setCorreo(sc.nextLine());

                            System.out.print("Nueva contrasena: ");
                            clienteMod.setContrasena(sc.nextLine());

                            System.out.println("Todos los datos han sido modificados.");
                        } catch (Exception e) {
                            System.out.println("Hubo un error al modificar todos los datos.");
                        }
                        break;

                    case 11:
                        try {
                            System.out.print("Seguro que desea borrar su cuenta? (si/no): ");
                            String conf = sc.nextLine();

                            if (conf.equalsIgnoreCase("si")) {

                                clientesPrecargados.getListaClientes().remove(clienteMod);

                                inicioSesion.setSesionIniciada(false);

                                System.out.println("Cuenta eliminada exitosamente.");
                                return;

                            } else {
                                System.out.println("Operacion cancelada.");
                            }
                        } catch (Exception e) {
                            System.out.println("No se pudo borrar la cuenta.");
                        }
                        break;

                    case 0:
                        System.out.println("Saliendo del menu de modificacion...");
                        break;

                    default:
                        System.out.println("Opcion no valida.");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("Error en menu de modificacion.");
        }
    }
}
