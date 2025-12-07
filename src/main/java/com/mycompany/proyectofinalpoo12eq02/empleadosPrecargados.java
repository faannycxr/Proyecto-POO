package com.mycompany.proyectofinalpoo12eq02;

import java.util.ArrayList;
import java.util.Scanner;

public class empleadosPrecargados {

    private static ArrayList<empleados> listaEmpleados = new ArrayList<>();

    static {
        try {
            // CU
            listaEmpleados.add(new empleados(
                    "Carlos", "Ramirez", "Soto",
                    "Av Reforma 123", "5512345678", "carlos.ramirez@gmail.com",
                    "CAR123456A1", "5839201746", "Cajero", "CU",
                    "9384726150", "rojoA!5"));

            listaEmpleados.add(new empleados(
                    "Elena", "Gomez", "Hernandez",
                    "Av Central 200", "5545678901", "elena.gomez@gmail.com",
                    "GOM918273D4", "1745938260", "Cajero", "CU",
                    "7150938246", "azulB@7"));

            listaEmpleados.add(new empleados(
                    "Luis", "Fernandez", "Lopez",
                    "Calle Sur 45", "5523456789", "luis.fernandez@gmail.com",
                    "FER987654B2", "9274615382", "Gerente", "CU",
                    "1239847562", "verdeC#9"));

            // Universidad
            listaEmpleados.add(new empleados(
                    "Ana", "Martinez", "Diaz",
                    "Calle Norte 50", "5534567890", "ana.martinez@gmail.com",
                    "MAR564738C3", "5048271936", "Cajero", "Universidad",
                    "8472619350", "rosaD$2"));

            listaEmpleados.add(new empleados(
                    "Mario", "Santos", "Vega",
                    "Calle 8", "5556789012", "mario.santos@gmail.com",
                    "SAN726354E5", "7293641850", "Cajero", "Universidad",
                    "6204981375", "negroE&4"));

            listaEmpleados.add(new empleados(
                    "Ricardo", "Nava", "Sierra",
                    "Calle 20", "5589012345", "ricardo.nava@gmail.com",
                    "NAV918273H8", "9364758201", "Gerente", "Universidad",
                    "5081937462", "blancoF*6"));

            // Delta
            listaEmpleados.add(new empleados(
                    "Lucia", "Torres", "Mora",
                    "Av Juarez 300", "5590123456", "lucia.torres@gmail.com",
                    "TOR564738I9", "2859173640", "Cajero", "Delta",
                    "2847561093", "grisG?3"));

            listaEmpleados.add(new empleados(
                    "Jorge", "Hernandez", "Rojas",
                    "Av Las Flores", "5567890123", "jorge.hernandez@gmail.com",
                    "HER827364F6", "5847209136", "Cajero", "Delta",
                    "9501374628", "verdeH=8"));

            listaEmpleados.add(new empleados(
                    "Sofia", "Aguilar", "Campos",
                    "Privada 12", "5578901234", "sofia.aguilar@gmail.com",
                    "AGU283746G7", "7201963845", "Gerente", "Delta",
                    "3746195820", "doradoI+1"));

            // Xochimilco
            listaEmpleados.add(new empleados(
                    "Fernando", "Cruz", "Beltran",
                    "Calle Robles", "5501234567", "fernando.cruz@gmail.com",
                    "CRU827364J1", "9173645280", "Cajero", "Xochimilco",
                    "1739502846", "azulJ!4"));

            listaEmpleados.add(new empleados(
                    "Claudia", "Perez", "Mora",
                    "Camino Viejo 22", "5549087234", "claudia.perez@gmail.com",
                    "PER736452L2", "6509182734", "Cajero", "Xochimilco",
                    "9283746150", "rojoK@7"));

            listaEmpleados.add(new empleados(
                    "Hector", "Campos", "Vega",
                    "Canal Nacional 10", "5590873412", "hector.campos@gmail.com",
                    "CAM918273M3", "8091327465", "Gerente", "Xochimilco",
                    "4758192036", "negroL#9"));

            // Polanco
            listaEmpleados.add(new empleados(
                    "Daniel", "Lopez", "Rincon",
                    "Av Masaryk 100", "5587654321", "daniel.lopez@gmail.com",
                    "LOP736452N4", "9381047652", "Cajero", "Polanco",
                    "9374618250", "verdeM$5"));

            listaEmpleados.add(new empleados(
                    "Paola", "Sierra", "Campos",
                    "Calle Horacio 250", "5556784321", "paola.sierra@gmail.com",
                    "SIE283746O5", "6175948302", "Cajero", "Polanco",
                    "6482013957", "rosaN&8"));

            listaEmpleados.add(new empleados(
                    "Roberto", "Gonzalez", "Mora",
                    "Av Newton 33", "5545671234", "roberto.gonzalez@gmail.com",
                    "GON918273P6", "7203986415", "Gerente", "Polanco",
                    "7194038652", "negroO*1"));

        } catch (Exception e) {
            System.out.println("Error al cargar empleados base");
        }
    }

    public static ArrayList<empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public static void agregarEmpleado(empleados e) {
        try {
            listaEmpleados.add(e);
        } catch (Exception ex) {
            System.out.println("No se pudo agregar el empleado");
        }
    }

    public static void imprimirListaEmpleados() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("¿En que escala desea ver los empleados?");
            System.out.println("1. Por sucursal");
            System.out.println("2. Global");
            System.out.println("3. Salir");
            System.out.print("Seleccion: ");
            int op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    System.out.print("Ingresa la sucursal (CU, Universidad, Delta, Xochimilco, Polanco): ");
                    String suc = sc.nextLine();
                    int indexSuc = 1;
                    for (empleados e : listaEmpleados) {
                        if (e.getSucursal().equalsIgnoreCase(suc)) {
                            System.out.println(indexSuc + ". " +
                                    e.getNombre() + " " + e.getApellidoPaterno() + " " + e.getApellidoMaterno() +
                                    " | ID: " + e.getId() +
                                    " | Numero Trabajador: " + e.getNumeroTrabajador() +
                                    " | Tipo: " + e.getTipoTrabajador() +
                                    " | Sucursal: " + e.getSucursal() +
                                    " | Cel: " + e.getCelular() +
                                    " | Correo: " + e.getCorreo());
                            indexSuc++;
                        }
                    }
                    break;
                case 2:
                    int indexGlobal = 1;
                    for (empleados e : listaEmpleados) {
                        System.out.println(indexGlobal + ". " +
                                e.getNombre() + " " + e.getApellidoPaterno() + " " + e.getApellidoMaterno() +
                                " | ID: " + e.getId() +
                                " | Numero Trabajador: " + e.getNumeroTrabajador() +
                                " | Tipo: " + e.getTipoTrabajador() +
                                " | Sucursal: " + e.getSucursal() +
                                " | Cel: " + e.getCelular() +
                                " | Correo: " + e.getCorreo());
                        indexGlobal++;
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion invalida. Ingresa una opcion valida");
                    break;
            }
        } catch (Exception e) {
            System.out.println("No se pudo imprimir la lista de empleados");
        }
    }

    public static void altaEmpleado() {
        Scanner sc = new Scanner(System.in);

        try {
            boolean confirmar = false;

            while (!confirmar) {
                System.out.println("Alta de Empleados:");
                System.out.println("Ingresa los datos del empleado correctamente:");

                System.out.print("1. Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("2. Apellido Paterno: ");
                String apPat = sc.nextLine();

                System.out.print("3. Apellido Materno: ");
                String apMat = sc.nextLine();

                System.out.print("4. Direccion: ");
                String direccion = sc.nextLine();

                System.out.print("5. Celular: ");
                String celular = sc.nextLine();

                System.out.print("6. Correo: ");
                String correo = sc.nextLine();

                System.out.print("7. RFC: ");
                String rfc = sc.nextLine();

                System.out.print("8. Numero Trabajador: ");
                String numTrab = sc.nextLine();

                System.out.print("9. Tipo Trabajador: ");
                String tipo = sc.nextLine();

                System.out.print("10. Sucursal: ");
                String sucursal = sc.nextLine();

                System.out.print("11. ID: ");
                String id = sc.nextLine();

                System.out.print("12. Contrasenia: ");
                String contra = sc.nextLine();

                System.out.println("Estan correctos todos los datos?");
                System.out.println("1. Si");
                System.out.println("2. No");
                System.out.print("Seleccion: ");

                int op = Integer.parseInt(sc.nextLine());

                if (op == 1) {
                    empleados nuevo = new empleados(
                            nombre, apPat, apMat,
                            direccion, celular, correo,
                            rfc, numTrab, tipo, sucursal,
                            id, contra
                    );

                    agregarEmpleado(nuevo);
                    System.out.println("Empleado agregado correctamente");
                    confirmar = true;
                }
            }

        } catch (Exception e) {
            System.out.println("Error en la captura de datos");
        }
    }
}
