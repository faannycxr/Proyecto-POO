package cinetics;

import java.util.Scanner;

public class modificarStock {

    public static void modificar(productosPrecargados productosBD, Sucursal sucursalActual) {

        Scanner sc = new Scanner(System.in);

        try {
            String suc = sucursalActual.getNombre().toLowerCase();
            System.out.println("Modificar Producto:");
            System.out.println("Sucursal " + sucursalActual.getNombre());
            System.out.println("Que producto desea modificar?");

            int index = 1;

            for (producto p : productosBD.getProductos()) {
                int stock = 0;

                switch (suc) {
                    case "cu": stock = p.getStockCU(); break;
                    case "uni": stock = p.getStockUni(); break;
                    case "carso": stock = p.getStockCarso(); break;
                    case "xochimilco": stock = p.getStockXochimilco(); break;
                    case "polanco": stock = p.getStockPolanco(); break;
                }

                System.out.println(index + ". " + p.getNombreProducto() + " | Stock: " + stock);
                index++;
            }

            System.out.print("Seleccione el numero del producto: ");
            int op = sc.nextInt();

            if (op < 1 || op > productosBD.getProductos().size()) {
                System.out.println("Opcion invalida");
                return;
            }

            producto elegido = productosBD.getProductos().get(op - 1);

            System.out.println("Que desea realizar?");
            System.out.println("1. Agregar producto");
            System.out.println("2. Retirar producto");
            System.out.print("Seleccione una opcion: ");

            int accion = sc.nextInt();

            if (accion != 1 && accion != 2) {
                System.out.println("Opcion invalida");
                return;
            }

            System.out.print("Cantidad: ");
            int cant = sc.nextInt();

            if (cant < 0) {
                System.out.println("Cantidad invalida");
                return;
            }

            switch (suc) {

                case "cu":
                    if (accion == 1) 
                        elegido.setStockCU(elegido.getStockCU() + cant);
                    else elegido.setStockCU(Math.max(0, elegido.getStockCU() - cant));
                    break;

                case "uni":
                    if (accion == 1) 
                        elegido.setStockUni(elegido.getStockUni() + cant);
                    else elegido.setStockUni(Math.max(0, elegido.getStockUni() - cant));
                    break;

                case "carso":
                    if (accion == 1) 
                        elegido.setStockCarso(elegido.getStockCarso() + cant);
                    else elegido.setStockCarso(Math.max(0, elegido.getStockCarso() - cant));
                    break;

                case "xochimilco":
                    if (accion == 1) 
                        elegido.setStockXochimilco(elegido.getStockXochimilco() + cant);
                    else elegido.setStockXochimilco(Math.max(0, elegido.getStockXochimilco() - cant));
                    break;

                case "polanco":
                    if (accion == 1) 
                        elegido.setStockPolanco(elegido.getStockPolanco() + cant);
                    else elegido.setStockPolanco(Math.max(0, elegido.getStockPolanco() - cant));
                    break;
            }

            System.out.println("Stock actualizado correctamente.");

        } catch (Exception e) {
            System.out.println("Entrada invalida");
        }
    }
}
