package com.mycompany.proyectofinalpoo12eq02;

import java.util.ArrayList;

public class productosPrecargados {

    private ArrayList<producto> listaProductos;

    public productosPrecargados() {
        listaProductos = new ArrayList<>();
        cargarProductos();
    }

    private void cargarProductos() {

        // 1. Refresco Grande
        producto pr1 = new producto(
            "Refresco Grande",
            75007614,
            85,
            "Bebidas",
            50,
            110,
            52,
            200,
            78
        );
        listaProductos.add(pr1);

        // 2. Refresco Mediano
        producto pr2 = new producto(
            "Refresco Mediano",
            75007615,
            65,
            "Bebidas",
            80,
            110,
            5,
            200,
            122
        );
        listaProductos.add(pr2);

        // 3. ICEE
        producto pr3 = new producto(
            "ICEE",
            75007616,
            95,
            "Bebidas",
            0,
            80,
            44,
            100,
            50
        );
        listaProductos.add(pr3);

        // 4. Palomitas Jumbo
        producto pr4 = new producto(
            "Palomitas Jumbo",
            75007624,
            100,
            "Botana",
            130,
            200,
            120,
            263,
            300
        );
        listaProductos.add(pr4);

        // 5. Palomitas Grandes
        producto pr5 = new producto(
            "Palomitas Grandes",
            75007617,
            85,
            "Botana",
            93,
            45,
            31,
            143,
            98
        );
        listaProductos.add(pr5);

        // 6. Palomitas Medianas
        producto pr6 = new producto(
            "Palomitas Medianas",
            75007618,
            60,
            "Botana",
            72,
            13,
            65,
            112,
            210
        );
        listaProductos.add(pr6);

        // 7. Hotdog
        producto pr7 = new producto(
            "Hotdog",
            75007619,
            60,
            "Comida",
            37,
            25,
            80,
            99,
            75
        );
        listaProductos.add(pr7);

        // 8. Nachos
        producto pr8 = new producto(
            "Nachos",
            75007620,
            70,
            "Comida",
            63,
            30,
            305,
            210,
            181
        );
        listaProductos.add(pr8);

        // 9. Nerds
        producto pr9 = new producto(
            "Nerds",
            75007621,
            45,
            "Dulces",
            90,
            90,
            0,
            90,
            8
        );
        listaProductos.add(pr9);

        // 10. M&M's
        producto pr10 = new producto(
            "M&M's",
            75007622,
            53,
            "Dulces",
            130,
            45,
            3,
            0,
            42
        );
        listaProductos.add(pr10);

        // 11. Peluche Rob
        producto pr11 = new producto(
            "Peluche Rob",
            75007623,
            450,
            "Recuerdos",
            5,
            35,
            43,
            89,
            32
        );
        listaProductos.add(pr11);

        // 12. Emperador
        producto pr12 = new producto(
            "Emperador",
            75007625,
            35,
            "Galletas",
            80,
            220,
            139,
            213,
            115
        );
        listaProductos.add(pr12);

        // 13. Palomera
        producto pr13 = new producto(
            "Palomera",
            75007626,
            210,
            "Recuerdos",
            120,
            120,
            120,
            120,
            20
        );
        listaProductos.add(pr13);
    }

    public ArrayList<producto> getProductos() {
        return listaProductos;
    }


public static void tablaProductos(productosPrecargados productosBD) {

    String formato = "%-20s %-15s %-10s %-12s %-10s %-18s %-15s %-18s %-15s%n";

    System.out.printf(formato,
        "Nombre",
        "Codigo",
        "Precio",
        "Categoria",
        "Stock CU",
        "Stock Uni",
        "Stock Carso",
        "Stock Xochimilco",
        "Stock Polanco"
    );

    System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

    for (producto p : productosBD.getProductos()) {
        System.out.printf(formato,
            p.getNombreProducto(),
            p.getCodigoProducto(),
            "$" + p.getPrecio(),
            p.getCategoria(),
            p.getStockCU(),
            p.getStockUni(),
            p.getStockCarso(),
            p.getStockXochimilco(),
            p.getStockPolanco()
        );
    }
}
    public static void tablaStockSucursal(productosPrecargados productosBD, Sucursal sucursalActual) {

        String formato = "%-20s %-15s %-10s %-12s %-10s%n";

        String nombreSucursal = sucursalActual.getNombre().toLowerCase();

        System.out.printf(formato,
            "Nombre",
            "Codigo",
            "Precio",
            "Categoria",
            "Stock " + nombreSucursal
        );

        System.out.println("----------------------------------------------------------------------------");

        for (producto p : productosBD.getProductos()) {

            int stock = 0;

            switch (nombreSucursal) {
                case "cu": stock = p.getStockCU(); break;
                case "uni": stock = p.getStockUni(); break;
                case "carso": stock = p.getStockCarso(); break;
                case "xochimilco": stock = p.getStockXochimilco(); break;
                case "polanco": stock = p.getStockPolanco(); break;
                default:
                    System.out.println("Sucursal no valida.");
                    return;
            }

            System.out.printf(formato,
                p.getNombreProducto(),
                p.getCodigoProducto(),
                "$" + p.getPrecio(),
                p.getCategoria(),
                stock
            );
        }
    }
}

