package com.mycompany.proyectofinalpoo12eq02;

import java.util.Scanner;

public class MenuClienteConSesion {

    private static Scanner scanner = new Scanner(System.in); // Scanner para leer datos del usuario

    private String clienteID; // ID del cliente que inició sesión. Esto permite que cada cliente vea su propia info.

  /* Constructor que recibe el ID del cliente que inició sesión desde IniciarSesion.java */

    public void mostrarMenu() { //metodo que crea un menu intercativo con el usuario
        int opcion;
    do {
            System.out.println(" Menu del cliente con sesion inciada\n");
            System.out.println("Bienvenido Cliente ID: " + clienteID + "\n"); //Bienvenida al usuario
            // Todas las opciones que puede hacer un usuario con sesion de acuerdo a los requerimientos del PDF
            System.out.println("1. Ver Cartelera");
            System.out.println("2. Buscar Pelicula");
            System.out.println("3. Cambiar Sucursal");
            System.out.println("4. Buscar Producto");
            System.out.println("5. Ver Carrito");
            System.out.println("   a) Editar carrito");
            System.out.println("   b) Comprar");
            System.out.println("6. Actualizar Datos Personales");
            System.out.println("7. Ver Mis Compras");
            System.out.println("8. Ver Mis Puntos");
            System.out.println("9. Salir");
            System.out.print("\nSeleccione una opcion (numero): ");

       opcion = pedirEntero(); // Evita errores si el usuario pone texto

      switch (opcion) { // Condicionales para cada una de las opciones seleccionadas
          case 1: // Ver cartelera
                    Cartelera.mostrarCartelera();
                    break;
           case 2: // Buscar Pelicula
                    BuscarPelicula.buscar();
                    break;
          case 3: // Cambiar Sucursal 
                    CambiarSucursal.cambiar();
                    break;
          case 4: // Buscar producto
                    buscarProducto.buscar();
                    break;
          case 5: // Manejar carrito
                    submenuCarrito();
                    break;
          case 6: // Actualizar datos personales
                    clientes.actualizarDatos(clienteID);
                    break;
          case 7: // Ver historial de compras
                    clientes.mostrarCompras(clienteID);
                    break;
           case 8: // Ver puntos del programa de lealtad
                    programaLealtad.mostrarPuntos(clienteID);
                    break;
          case 9: // Cerrar sesion
                    System.out.println("Sesion cerrada. Hasta luego!");
                    break;
          default: // En caso que el usuario ingrese texto o alguna opcion invalida, fuera de 1-9
                    System.out.println("Opcion no valida. Intente de nuevo.");
          }

        } while (opcion != 9); // Ejecutarse el menu mientras el usuario no elija opcion 9 (Cerrar Sesion)
    }
    /*
      Submenu organizado exclusivamente para el manejo del carrito cuuando el usuario seleccione opcion 5.
      Aquí el cliente puede:
        - Ver los productos en su carrito
        - Editar cantidades o eliminar productos
        - Ejecutar su compra
     */
  private void submenuCarrito() {
        int opc; // variable controladora del menu

        do {
            System.out.println("\n----- CARRITO -----");
            System.out.println("1. Ver Carrito");
            System.out.println("2. Editar Carrito");
            System.out.println("3. Comprar");
            System.out.println("4. Regresar");
            System.out.print("Seleccione una opcion (numero): ");

            opc = pedirEntero(); 
         
            switch (opc) {

                case 1: // Ver carrito
                    Carrito.verCarrito(clienteID);
                    break;
                case 2: // Editar carrito
                    Carrito.editarCarrito(clienteID);
                    break;
                case 3: // Realizar compra
                    Carrito.comprar(clienteID);
                    break;
                case 4: // Regresar
                    return;
                default: // En caso de que el usuario ingrese texto o alguna opcion fuera de 1-4
                    System.out.println("Opcion invalida.");
                 }
        } while (opc != 4); // Ejecutarse el menu mientras el usuario no elija opcion 4 (Regresar al menu principal)
    }
    /* Metodo util para evitar errores cuando el usuario escribe texto en vez de numeros.*/
    private int pedirEntero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Debe ingresar un numero.");
            scanner.next(); // se borra el texto incorrecto
        }
        return scanner.nextInt();
    }
}


          
