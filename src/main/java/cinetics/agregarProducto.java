package cinetics;

import java.util.Scanner;

public class agregarProducto {

    public static void agregarProducto(productosPrecargados productosBD) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine().trim();

        System.out.print("Codigo del producto: ");
        int codigo = sc.nextInt();

        System.out.print("Precio del producto: ");
        int precio = sc.nextInt();
        sc.nextLine();

        System.out.print("Categoria del producto: ");
        String categoria = sc.nextLine().trim();

        // Crear producto nuevo usando los nombres correctos
        producto nuevo = new producto(
            nombre,
            codigo,
            precio,
            categoria,
            0,  // Stock CU
            0,  // Stock Uni
            0,  // Stock Carso
            0,  // Stock Xochimilco
            0   // Stock Polanco
        );

        productosBD.getProductos().add(nuevo);

        System.out.println("\nProducto agregado correctamente.");
    }
}
