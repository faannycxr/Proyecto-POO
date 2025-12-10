package cinetics.personas;

import cinetics.sistema.*;
import java.util.*;

public class Persona {

    //----------------------------------------------------
    // ATRIBUTOS
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
    // SETTERS
    //----------------------------------------------------

    public void setNombre(String n) { this.nombre = n; }
    public void setAPaterno(String p) { this.apellidoPaterno = p; }
    public void setAMaterno(String m) { this.apellidoMaterno = m; }
    public void setDireccion(String d) { this.direccion = d; }
    public void setCorreo(String c) { this.correo = c; }
    public void setCelular(String cel) { this.celular = cel; }
    public void setPassword(String pwd) { this.password = pwd; }
    public void setNoTarjeta(String t) { this.noTarjeta = t; }
    public void setRFC(String r) { this.RFC = r; }
    public void setDireccionFiscal(String df) { this.direccionFiscal = df; }
    public void setSucursal(String suc) { this.sucursalSeleccionada = suc; }
    public void setSesionActiva(boolean estado) { this.inicioSesion = estado; }



    //----------------------------------------------------
    // GETTERS
    //----------------------------------------------------

    public String getNombre() { return this.nombre; }
    public String getAPaterno() { return this.apellidoPaterno; }
    public String getAMaterno() { return this.apellidoMaterno; }

    // Compatibilidad con metodos usados en otras clases
    public String getApellidoP() { return this.apellidoPaterno; }
    public String getApellidoM() { return this.apellidoMaterno; }

    public String getCorreo() { return this.correo; }
    public String getCelular() { return this.celular; }
    public String getPassword() { return this.password; }
    public String getNoTarjeta() { return this.noTarjeta; }
    public String getRFC() { return this.RFC; }
    public String getDireccionFiscal() { return this.direccionFiscal; }
    public String getSucursal() { return this.sucursalSeleccionada; }
    public Carrito getCarrito() { return this.carrito; }

    public boolean sesionActiva() { return this.inicioSesion; }



    //----------------------------------------------------
    // INICIO DE SESION (compatible con tu main)
    //----------------------------------------------------

    public boolean iniciarSesion() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- INICIAR SESION ---");
        System.out.print("Correo o celular: ");
        String validar = sc.nextLine().trim();

        System.out.print("Contrasena: ");
        String validarPassword = sc.nextLine().trim();

        boolean coincideCorreo = this.correo.equals(validar);
        boolean coincideCelular = this.celular.equals(validar);
        boolean coincidePassword = this.password.equals(validarPassword);

        if ((coincideCorreo || coincideCelular) && coincidePassword) {
            this.inicioSesion = true;
            System.out.println("Inicio de sesion correcto, bienvenido " + this.nombre);
            return true;
        }

        System.out.println("Credenciales incorrectas.");
        return false;
    }



    //----------------------------------------------------
    // BUSCAR PELICULA (lo usa Rob y tu main)
    //----------------------------------------------------

    public Pelicula buscarPelicula(ArrayList<Pelicula> lista) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Lista de Peliculas ---");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i).getNombre());
        }

        while (true) {
            try {
                System.out.print("Elija una opcion: ");
                int opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= lista.size()) {
                    return lista.get(opcion - 1);
                }

                System.out.println("Indice invalido.");
            }
            catch (Exception e) {
                System.out.println("Entrada invalida.");
                sc.nextLine();
            }
        }
    }



    //----------------------------------------------------
    // PROGRAMA DE PUNTOS
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

        if (total < 1000) return 0.01;
        if (total < 2000) return 0.01;
        if (total < 3000) return 0.01;
        if (total < 4000) return 0.01;
        if (total < 5200) return 0.085;

        return 0.16;
    }



    //----------------------------------------------------
    // TICKETS Y COMPRAS
    //----------------------------------------------------

    public int realizarCompra() {

        if (!inicioSesion) {
            System.out.println("Debes iniciar sesion.");
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


    //----------------------------------------------------
    // VISUALIZAR COMPRAS
    //----------------------------------------------------

    public void verMisCompras() {

        if (!inicioSesion) {
            System.out.println("Debe iniciar sesion.");
            return;
        }

        for (Ticket t : this.misCompras) {
            t.imprimirTicket(this.sucursalSeleccionada);
        }
    }



    //----------------------------------------------------
    // CARRITO
    //----------------------------------------------------

    public void verCarrito(Sucursal sucursal, Persona cliente) {
        this.carrito.verCarrito(sucursal, cliente);
    }

    public void nuevoCarrito() {
        this.carrito = new Carrito();
    }
}
