package com.mycompany.proyectofinalpoo12eq02;
// Esta clase representa a un GERENTE de CINE-TICs.

public class Gerente extends datosPersonas {
/**
     * Constructor del gerente, reutilizando por completo la estructura de la superclase datosPersonas. Por tanto, los parámetros a utilizar son: 
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param direccion
     * @param celular
     * @param correo
     * @param rfc
     * @param numeroTrabajador
     * @param sucursal
     * @param id
     * @param contrasenia
     */
public Gerente(String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String celular, String correo,
                   String rfc, String numeroTrabajador, String sucursal, String id, String contrasenia) {
 //Constructor
        super(nombre, apellidoPaterno, apellidoMaterno, direccion,
              celular, correo, rfc, numeroTrabajador,
              "Gerente", sucursal, id, contrasenia);
}

  /** Método para mostrar información completa del gerente.*/
    public void mostrarInfoGerente() {
        System.out.println("\n ----- Informacion del Gerente ----");
        System.out.println("Nombre completo: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno);
        System.out.println("RFC: " + rfc);
        System.out.println("Número trabajador: " + numeroTrabajador);
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Correo: " + correo);
        System.out.println("Celular: " + celular);
        System.out.println("ID de acceso: " + id);
    }
}
