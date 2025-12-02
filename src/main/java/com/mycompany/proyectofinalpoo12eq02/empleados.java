package com.mycompany.proyectofinalpoo12eq02;

//Clase Empleado - Representa a un empleado de CINE-TICs.
// Esta clase hereda todos sus atributos de datosPersonas

public class empleados extends datosPersonas {

    /* * Constructor del empleado, reutilizando por completo la estructura de la superclase datosPersonas. Por tanto, los parámetros a utilizar son: 
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param direccion
     * @param celular
     * @param correo
     * @param rfc
     * @param numeroTrabajador
     * @param tipoTrabajador
     * @param sucursal
     * @param id
     * @param contrasenia
     */
    public empleados(String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String celular, String correo,
                    String rfc, String numeroTrabajador, String tipoTrabajador, String sucursal,  String id, String contrasenia) {
    //Constructor
        super(nombre, apellidoPaterno, apellidoMaterno, direccion,
              celular, correo, rfc, numeroTrabajador,
              tipoTrabajador, sucursal, id, contrasenia);
    }

    /** Método para mostrar información completa del empleado. */
    public void mostrarInfoEmpleado() {
        System.out.println("\n----- Informacion del Empleado -----");
        System.out.println("Nombre completo: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno);
        System.out.println("RFC: " + rfc);
        System.out.println("Numero trabajador: " + numeroTrabajador);
        System.out.println("Tipo trabajador: " + tipoTrabajador);
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Correo: " + correo);
        System.out.println("Celular: " + celular);
        System.out.println("ID de acceso: " + id);
    }
}


