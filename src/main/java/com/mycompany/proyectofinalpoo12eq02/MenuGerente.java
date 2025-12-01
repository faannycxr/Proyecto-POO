package com.mycompany.proyectofinalpoo12eq02;

import java.util.Scanner;
/*               MENU DEL GERENTE - CINE-TICs
 * Este menú contiene TODAS las opciones administrativas el proyecto exige para el rol "Gerente".
 * Desde aquí se controla:
 *   - Cartelera
 *   - Productos
 *   - Stock
 *   - Empleados
 *   - Estadísticas
 *   - Reportes
 *   - Simulaciones
 */
public class MenuGerente {

    private static Scanner scanner = new Scanner(System.in);
    private String gerenteID;

  /* Constructor que recibe el ID del gerente loggeado (inicio de sesion)*/
    public MenuGerente(String gerenteID) {
        this.gerenteID = gerenteID;
    }

    /* Método que muestra el menú principal del gerente*/
    public void mostrarMenu() {
        int opcion;

      do {
            System.out.println("\n----- MENU DEL GERENTE --------");
            System.out.println("Gerente ID: " + gerenteID);
            System.out.println("-----------------------------");

            System.out.println("1. Iniciar Simulacion");
            System.out.println("2. Actualizar Cartelera");
            System.out.println("3. Ver Productos");
            System.out.println("4. Actualizar Stock");
            System.out.println("5. Agregar Producto");
            System.out.println("6. Ver Empleados");
            System.out.println("7. Agregar Empleado");
            System.out.println("8. Ver Estadisticas");
            System.out.println("9. Generar Reporte de Ventas");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opcion (numero): ");

            opcion = pedirEntero();

            switch (opcion) {

                case 1:
                    iniciarSimulacion();
                    break;

                case 2:
                    actualizarCartelera();
                    break;

                case 3:
                    verProductos();
                    break;

                case 4:
                    actualizarStock();
                    break;

                case 5:
                    agregarProducto();
                    break;

                case 6:
                    verEmpleados();
                    break;

                case 7:
                    agregarEmpleado();
                    break;

                case 8:
                    verEstadisticas();
                    break;

                case 9:
                    generarReporteVentas();
                    break;

                case 10:
                    System.out.println("Cerrando sesion de gerente...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 10);
    }
  // Metodos para cada una de las opciones del menu
  private void iniciarSimulacion() {
        System.out.println("\n[Simulacion iniciada ]");
        // Aquí se conectará Simulacion.java
    }

    private void actualizarCartelera() {
        System.out.println("\n[Actualización de cartelera ]");
        // Aquí se conectará Cartelera.java
    }

    private void verProductos() {
        System.out.println("\n[Mostrando productos]");
        // Aquí se conectará Inventario.java
    }

    private void actualizarStock() {
        System.out.println("\n[Actualizando stock ]");
        // Aquí se conectará ActualizarStock.java
    }

    private void agregarProducto() {
        System.out.println("\n[Agregar producto ]");
        // Aquí se conectará Productos.java
    }

    private void verEmpleados() {
        System.out.println("\n[Mostrando empleados ]");
        // Aquí se conectará EmpleadosPrecargados.java
    }

    private void agregarEmpleado() {
        System.out.println("\n[Agregar empleado ]");
        // Aquí se conectará RegistroEmpleado.java
    }

    private void verEstadisticas() {
        System.out.println("\n[Mostrando estadisticas ]");
        // Aquí se conectará EstadisticasVentas.java
    }

    private void generarReporteVentas() {
        System.out.println("\n[Generando reporte de ventas -]");
        // Aquí se conectará ReporteVentas.java
    }
// Metodo para validar que el usuario escriba numeros 
private int pedirEntero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Debe ingresar un numero.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
