package cinetics.personas;

import cinetics.sistema.*;
import java.util.*;

public class Persona {
    
    //----------------------------------------------------
    //              ATRIBUTOS
    //----------------------------------------------------
    
    private String nombre = "";
    private String apellidoPaterno = "";
    private String apellidoMaterno = "";
    private String direccion = "";
    private String correo = "";
    private String celular = "";
    private String password = "";
    private String noTarjeta = "";
    private String RFC = "";
    private String direccionFiscal = "";

    private boolean inicioSesion = false;

    private String sucursalSeleccionada = "";

    private float misPuntos = 0;
    private int nivelCuenta = 0;

    private ArrayList<Ticket> misCompras = new ArrayList<>();

    private Carrito carrito = new Carrito();



    //----------------------------------------------------
    //                    SETTERS
    //----------------------------------------------------
    
    public void setNombre(String n) {
        this.nombre = n;
    }
    
    public void setAPaterno(String p) {
        this.apellidoPaterno = p;
    }
    
    public void setAMaterno(String m) {
        this.apellidoMaterno = m;
    }
    
    public void setDireccion(String d) {
        this.direccion = d;
    }
    
    public void setCorreo(String c) {
        this.correo = c;
    }
    
    public void setCelular(String cel) {
        this.celular = cel;
    }
    
    public void setPassword(String pwd) {
        this.password = pwd;
    }
    
    public void setNoTarjeta(String t) {
        this.noTarjeta = t;
    }
    
    public void setRFC(String r) {
        this.RFC = r;
    }
    
    public void setDireccionFiscal(String df) {
        this.direccionFiscal = df;
    }
    
    public void setSucursal(String suc) {
        this.sucursalSeleccionada = suc;
    }

    public void setSesionActiva(boolean estado) {
        this.inicioSesion = estado;
    }



    //----------------------------------------------------
    //                    GETTERS
    //----------------------------------------------------

    public String getNombre() {
        return this.nombre;
    }

    public String getAPaterno() {
        return this.apellidoPaterno;
    }

    public String getAMaterno() {
        return this.apellidoMaterno;
    }

    public String getCorreo() {
        return this.correo;
    }

    public String getCelular() {
        return this.celular;
    }

    public String getPassword() {
        return this.password;
    }

    public String getNoTarjeta() {
        return this.noTarjeta;
    }

    public String getRFC() {
        return this.RFC;
    }

    public String getDireccionFiscal() {
        return this.direccionFiscal;
    }

    public String getSucursal() {
        return this.sucursalSeleccionada;
    }

    public Carrito getCarrito() {
        return this.carrito;
    }



    //----------------------------------------------------
    //                SESIÓN DE USUARIO
    //----------------------------------------------------
    
    public boolean sesionActiva() {
        return this.inicioSesion;
    }


    // Este método coincide con lo que usa tu MAIN
    public boolean iniciarSesion() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Inicio de Sesión ---");

        System.out.print("Correo: ");
        String validarCorreo = sc.nextLine().trim();

        System.out.print("Contraseña: ");
        String validarPassword = sc.nextLine().trim();

        if (this.correo.equals(validarCorreo) && this.password.equals(validarPassword)) {

            this.inicioSesion = true;

            System.out.println("Inicio de sesión correcto, bienvenido " + this.nombre);

            return true;
        }

        System.out.println("Credenciales incorrectas.");

        return false;
    }




    //----------------------------------------------------
    //            PROGRAMA DE LEALTAD
    //----------------------------------------------------
    
    public void registroProgramaLealtad() {

        if (!this.inicioSesion) {
            System.out.println("Debes iniciar sesión para acceder al programa.");
            return;
        }

        System.out.println("\n--- Programa de Lealtad CineTICs ---");
        System.out.println("Acumula puntos y sube de nivel con tus compras.");

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Deseas registrarte? [S/N]: ");

        if (sc.nextLine().trim().equalsIgnoreCase("s")) {
            System.out.println("Registro exitoso en el programa de lealtad.");
        }
    }




    //----------------------------------------------------
    //              BÚSQUEDA DE PELÍCULA
    //----------------------------------------------------
    
    public Pelicula buscarPelicula(ArrayList<Pelicula> lista) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Lista de Películas ---");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i).getNombre());
        }

        while (true) {
            try {

                System.out.print("Elija una opción: ");
                int opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= lista.size()) {
                    return lista.get(opcion - 1);
                }

                System.out.println("Índice inválido.");

            }
            catch (Exception e) {
                System.out.println("Entrada inválida.");
                sc.nextLine();
            }
        }
    }




    //----------------------------------------------------
    //         SISTEMA DE PUNTOS Y NIVELES
    //----------------------------------------------------
    
    public void verMisPuntos() {
        System.out.println("Puntos actuales: " + this.misPuntos);
    }

    public void calcularPuntos(int totalCompra) {

        double porcentaje = obtenerNivel();

        double puntosGanados = totalCompra * porcentaje;

        this.misPuntos += puntosGanados;

        System.out.println("Ganaste " + puntosGanados + " puntos.");
    }


    private double obtenerNivel() {

        int total = 0;

        for (Ticket t : this.misCompras) {
            total += t.getTotalTicket();
        }

        if (total < 1000)   { nivelCuenta = 1;  return 0.01; }
        if (total < 2000)   { nivelCuenta = 2;  return 0.01; }
        if (total < 3000)   { nivelCuenta = 3;  return 0.01; }
        if (total < 4000)   { nivelCuenta = 4;  return 0.01; }
        if (total < 5200)   { nivelCuenta = 5;  return 0.085; }
        if (total < 6400)   { nivelCuenta = 6;  return 0.085; }
        if (total < 7600)   { nivelCuenta = 7;  return 0.085; }
        if (total < 8800)   { nivelCuenta = 8;  return 0.085; }
        if (total < 10000)  { nivelCuenta = 9;  return 0.085; }
        if (total < 11350)  { nivelCuenta = 10; return 0.16; }
        if (total < 12700)  { nivelCuenta = 11; return 0.16; }
        if (total < 14050)  { nivelCuenta = 12; return 0.16; }
        if (total < 15400)  { nivelCuenta = 13; return 0.16; }
        if (total < 16750)  { nivelCuenta = 14; return 0.16; }

        nivelCuenta = 15;
        return 0.16;
    }




    //----------------------------------------------------
    //             COMPRAS Y TICKETS
    //----------------------------------------------------
    
    public void verMisCompras() {

        if (!inicioSesion) {
            System.out.println("Debe iniciar sesión.");
            return;
        }

        for (Ticket t : this.misCompras) {
            t.imprimirTicket(this.sucursalSeleccionada);
        }
    }


    public int realizarCompra() {

        if (!inicioSesion) {
            System.out.println("Debes iniciar sesión para realizar compras.");
            return 0;
        }

        int total = carrito.pagarCarrito();

        calcularPuntos(total);

        return total;
    }


    public Ticket nuevoTicket() {

        Ticket nuevo = new Ticket();

        nuevo.setBoletos(carrito.getBoletosCarrito());
        nuevo.setProductos(carrito.getProductosCarrito());

        misCompras.add(nuevo);

        return nuevo;
    }


    public void nuevoCarrito() {
        this.carrito = new Carrito();
    }




    //----------------------------------------------------
    //                    CARRITO
    //----------------------------------------------------
    
    public void verCarrito(Sucursal sucursal, Persona cliente) {
        this.carrito.verCarrito(sucursal, cliente);
    }

}
