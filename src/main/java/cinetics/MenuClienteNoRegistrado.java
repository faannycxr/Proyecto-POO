package cinetics;

import java.util.Scanner;

public class MenuClienteNoRegistrado {

    private static Sucursales sucursales = new Sucursales();
    private static Sucursal sucursalActual = sucursales.getCU();
    private static carteleraPrecargada carteleraBase = new carteleraPrecargada();
    private static boolean carteleraCargada = false;

    private static productosPrecargados productosBD = new productosPrecargados();


    public static Sucursal getSucursalActual() {
        return sucursalActual;
    }

    public static void setSucursalActual(Sucursal nueva) {
        sucursalActual = nueva;
    }


    public static void cargarCarteleraEnSucursales() {
        if (!carteleraCargada) {
            for (Cartelera c : carteleraBase.getListaCartelera()) {
                sucursales.agregarCartelera(c);
            }
            carteleraCargada = true;
        }
    }

    public static void mostrarEslogan() {
        System.out.println("Cine-TICs");
        System.out.println("Trayendo historias especiales para personas especiales");
    }

    public static void mostrarMenu() {
        System.out.println("1) Iniciar Sesion");
        System.out.println("2) Ingresar como Invitado");
        System.out.println("3) Salir");
    }


    public static void MenuInicial() {
        Scanner sc = new Scanner(System.in);

        try {
            mostrarEslogan();
            mostrarMenu();
            System.out.print("Selecciona una opcion: ");

            int opMenu = sc.nextInt();

            switch (opMenu) {

                case 1:
                    inicioSesion login = new inicioSesion();
                    boolean acceso = login.iniciar();

                    if (acceso) {
                        System.out.println("Inicio de sesion exitoso");
                    } else {
                        System.out.println("ID o contrasena incorrectos");
                    }
                    break;

                case 2:
                    System.out.println("Ingresando como invitado...");
                    menuClientes(new String[0]);
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    System.out.println("Esperamos con ansias tu regreso :D");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        } catch (Exception e) {
            System.out.println("Entrada invalida");
        }
    }


    public static void menuClientes(String[] args) {
        Scanner sc = new Scanner(System.in);

        cargarCarteleraEnSucursales();
        sucursalActual = sucursales.getCU();

        while (true) {
            try {

                System.out.println("\nSucursal actual: " + sucursalActual.getNombre());

                if (!inicioSesion.isSesionIniciada()) {
                    System.out.println("Usted ha iniciado como invitado");
                } else {
                    clientes c = inicioSesion.getClienteActual();
                    System.out.println("Bienvenido " + c.getNombre());
                }

                System.out.println("1. Ver cartelera");
                System.out.println("2. Buscar Pelicula");
                System.out.println("3. Cambiar sucursal");
                System.out.println("4. Iniciar sesion");
                System.out.println("5. Buscar producto");
                System.out.println("6. Ver carrito");
                System.out.println("7. Actualizar datos personales");
                System.out.println("8. Registrarse");
                System.out.println("9. Ver compras");
                System.out.println("10. Ver mis puntos");
                System.out.println("11. Salir");
                System.out.print("Selecciona una opcion: ");

                int op = sc.nextInt();

                switch (op) {

                    case 1:
                        System.out.println("\nCARTELERA EN " + sucursalActual.getNombre());
                        sucursalActual.imprimirCarteleras();
                        break;

                    case 2:
                        BuscarPelicula.buscarPelicula(sucursalActual);
                        break;

                    case 3:
                        sucursalActual = CambiarSucursal.cambiarSucursal(sucursales, sucursalActual);
                        break;

                    case 4:
                        try {
                            if (!inicioSesion.isSesionIniciada()) {
                                inicioSesion login = new inicioSesion();
                                login.iniciar();
                            }
                        } catch (Exception e) {
                            System.out.println("Usted ya inicio sesion");
                        }
                        break;

                    case 5:
                        buscarProducto.buscarProducto(sucursalActual);
                        break;

                    case 6:
                        break;

                    case 7:
                        modificarDatosCliente.modificarClienteSesion();
                        break;

                    case 8:
                        registroCliente.registrarNuevoCliente();
                        break;

                    case 9:
                        if (!inicioSesion.isSesionIniciada()) {
                            System.out.println("Solo puede ver sus compras si inicio sesion");
                        }
                        break;

                    case 10:
                        try {
                            if (!inicioSesion.isSesionIniciada()) {
                                System.out.println("Solo puede ver sus puntos si inicio sesion");
                            } else {
                                clientes c = inicioSesion.getClienteActual();
                                if (!c.isSocioLealtad()) {
                                    System.out.println("No esta registrado en el programa de lealtad.");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");

                                    int r = sc.nextInt();
                                    if (r == 1) c.activarLealtad();

                                } else {
                                    c.verificarPrograma();
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Error al acceder al programa de lealtad.");
                        }
                        break;

                    case 11:
                        System.out.println("Regresando al menu principal...");
                        return;

                    default:
                        System.out.println("Opcion no implementada.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Entrada invalida");
            }
        }
    }

    public static void menuAdministradores(String[] args) {
        Scanner sc = new Scanner(System.in);
        cargarCarteleraEnSucursales();
        sucursalActual = sucursales.getCU();

        while (true) {
            try {

                System.out.println("\nSucursal actual: " + sucursalActual.getNombre());

                if (!inicioSesion.isSesionIniciada()) {
                    System.out.println("Usted ha iniciado como invitado");
                } else {
                    clientes c = inicioSesion.getClienteActual();
                    System.out.println("Bienvenido " + c.getNombre());
                }

                System.out.println("1. Iniciar Simulacion");
                System.out.println("2. Actualizar Cartelera");
                System.out.println("3. Ver Productos");
                System.out.println("4. Actualizar Stock de productos");
                System.out.println("5. Agregar producto");
                System.out.println("6. Ver empleados");
                System.out.println("7. Agregar empleados");
                System.out.println("8. Ver estadisticas de ventas");
                System.out.println("9. Generar estadisticas de ventas");
                System.out.println("10. Salir");
                System.out.print("Selecciona una opcion: ");

                int opAd = sc.nextInt();

                switch (opAd) {

                    case 1:
                        break;

                    case 2:
                        System.out.println("\nCARTELERA EN " + sucursalActual.getNombre());
                        System.out.println("1. Agregar funcion");
                        System.out.println("2. Borrar funcion");
                        System.out.println("3. Ver cartelera Actual");
                        System.out.println("4. Cambiar de sucursal");
                        System.out.println("5. Regresar");
                        int opAd1 = sc.nextInt();

                        switch (opAd1) {

                            case 1: carteleraBase.agregarCartelera(); break;
                            case 2: carteleraBase.eliminarCartelera(); break;

                            case 3:
                                System.out.println("\nCARTELERA EN " + sucursalActual.getNombre());
                                sucursalActual.imprimirCarteleras();
                                break;

                            case 4:
                                sucursalActual = CambiarSucursal.cambiarSucursal(sucursales, sucursalActual);
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Error, ingrese una opcion valida");
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("¿En que escala desea ver los productos?");
                        System.out.println("1. Por sucursal");
                        System.out.println("2. Global");
                        System.out.println("3. Salir");
                        int opProd = sc.nextInt();
                        switch(opProd){
                            case 1:
                                productosPrecargados.tablaStockSucursal(productosBD, sucursalActual);
                                System.out.println("Deseas cambiar de sucursal?");
                                System.out.println("1.Si");
                                System.out.println("2. Regresar");
                                int opProd2 = sc.nextInt();
                                switch(opProd2){
                                    case 1:
                                        sucursalActual = CambiarSucursal.cambiarSucursal(sucursales, sucursalActual);
                                        break;
                                     
                                    case 2:
                                        break;
                                        
                                    default:
                                        System.out.println("Opcion invalida. Ingresa una opcion valida");
                                        break;
                                }
                                break;
                            
                            case 2:
                                productosPrecargados.tablaProductos(productosBD);
                                break;
                            
                            case 3:
                                break;
                                
                            default:
                                System.out.println("Opcion invalida. Ingresa una opcion valida");
                                break;
                        }
                        break;

                    case 4: 
                        modificarStock.modificar(productosBD, sucursalActual);
                        break;


                    case 5:
                        agregarProducto.agregarProducto(productosBD);
                        break;

                    case 6:
                        empleadosPrecargados.imprimirListaEmpleados();
                        break;

                    case 7:
                    empleadosPrecargados.altaEmpleado();
                        break;

                    case 8:
                        break;

                    case 9:
                        break;

                    case 10:
                        System.out.println("Regresando al menu principal...");
                        return;

                    default:
                        System.out.println("Opcion no implementada.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Entrada invalida");
            }
        }
    }
}
