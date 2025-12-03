package com.mycompany.proyectofinalpoo12eq02;

public class clientes {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private String telefono;
    private String correo;
    private String numeroCuenta;
    private String contrasena;

    private boolean inscritoLealtad;

    public clientes(String nombre, String apellidoPaterno, String apellidoMaterno,
                    String direccion, String telefono, String correo,
                    String numeroCuenta, String contrasena,
                    boolean inscritoLealtad) {

        try {
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.direccion = direccion;
            this.telefono = telefono;
            this.correo = correo;
            this.numeroCuenta = numeroCuenta;
            this.contrasena = contrasena;
            this.inscritoLealtad = inscritoLealtad;
        } catch (Exception e) {
            System.out.println("Error en constructor de clientes");
        }
    }

    public boolean getInscritoLealtad() {
        return inscritoLealtad;
    }

    public void setInscritoLealtad(boolean inscritoLealtad) {
        try {
            this.inscritoLealtad = inscritoLealtad;
        } catch (Exception e) {
            System.out.println("No se pudo modificar el estado de lealtad");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getId() {
        return numeroCuenta;
    }

    public String getContrasenia() {
        return contrasena;
    }

    public boolean isSocioLealtad() {
        return inscritoLealtad;
    }

    public void activarLealtad() {
        this.inscritoLealtad = true;
    }

    public String getProgramaLealtad() {
        return "Programa de lealtad activo";
    }

    public String verificarPrograma() {
        return getProgramaLealtad();
    }
}
