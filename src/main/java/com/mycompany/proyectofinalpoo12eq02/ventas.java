package com.mycompany.proyectofinalpoo12eq02;

import java.util.Scanner;

public class ventas {

    private Scanner sc = new Scanner(System.in);

    public ventaResultado comprarProducto(Sucursal sucursalActual) {

        int totalProductosComprados = 0;
        double montoTotal = 0;

        try {
            boolean seguirComprando = true;

            while (seguirComprando) {

                producto encontrado = buscarProductoInterno(sucursalActual);

                if (encontrado == null) {
                    return null;
                }

                System.out.println("¿Deseas este producto?");
                System.out.println("1. Sí");
                System.out.println("2. No");

                int op = sc.nextInt();

                if (op != 1) {
                    return null;
                }

                System.out.println("¿Cuántos " + encontrado.getNombreProducto() + " deseas comprar?");
                int cantidad = sc.nextInt();

                if (cantidad <= 0) {
                    return null;
                }

                System.out.println("Perfecto, compraste " + cantidad + " unidades:");
                imprimirProducto(encontrado, sucursalActual);

                System.out.println("¿Está todo correcto?");
                System.out.println("1. Sí");
                System.out.println("2. No");

                int confirmar = sc.nextInt();

                if (confirmar != 1) {
                    return null;
                }

                if (!reducirStockSucursal(sucursalActual, encontrado, cantidad)) {
                    return null;
                }

                totalProductosComprados += cantidad;
                montoTotal += encontrado.getPrecio() * cantidad;

                System.out.println("Perfecto, agregando productos al carro de compras...");

                System.out.println("¿Deseas comprar otro producto?");
                System.out.println("1. Sí");
                System.out.println("2. No");

                int otra = sc.nextInt();

                if (otra != 1) {
                    seguirComprando = false;
                }
            }

        } catch (Exception e) {
            sc.nextLine();
            return null;
        }

        return new ventaResultado(totalProductosComprados, montoTotal, sucursalActual);
    }

    private producto buscarProductoInterno(Sucursal sucursalActual) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa el nombre del producto a buscar:");
            String nombre = sc.nextLine();

            for (producto p : sucursalActual.getProducto()) {
                if (p.getNombreProducto().toLowerCase().contains(nombre.toLowerCase())) {
                    imprimirProducto(p, sucursalActual);
                    return p;
                }
            }

        } catch (Exception e) {
        }
        return null;
    }

    private boolean reducirStockSucursal(Sucursal s, producto p, int cantidad) {
        try {
            String suc = s.getNombre().toLowerCase();

            switch (suc) {
                case "cu":
                    if (p.getStockCU() < cantidad) return false;
                    p.setStockCU(p.getStockCU() - cantidad);
                    break;
                case "uni":
                    if (p.getStockUni() < cantidad) return false;
                    p.setStockUni(p.getStockUni() - cantidad);
                    break;
                case "carso":
                    if (p.getStockCarso() < cantidad) return false;
                    p.setStockCarso(p.getStockCarso() - cantidad);
                    break;
                case "xochimilco":
                    if (p.getStockXochimilco() < cantidad) return false;
                    p.setStockXochimilco(p.getStockXochimilco() - cantidad);
                    break;
                case "polanco":
                    if (p.getStockPolanco() < cantidad) return false;
                    p.setStockPolanco(p.getStockPolanco() - cantidad);
                    break;
                default:
                    return false;
            }

            return true;

        } catch (Exception e) {
            return false;
        }
    }

    private void imprimirProducto(producto p, Sucursal sucActual) {
        try {
            System.out.println("Nombre: " + p.getNombreProducto());
            System.out.println("Categoria: " + p.getCategoria());
            System.out.println("Precio: $" + p.getPrecio());
            System.out.println("Codigo: " + p.getCodigoProducto());
            System.out.println("Stock en esta sucursal: " + sucActual.obtenerStockProducto(p));
        } catch (Exception e) {
        }
    }
    
    public ventaResultado compraBoleto(Cartelera cartelera) {

    try {
        System.out.println("¿Cuántos boletos de adulto deseas?");
        int adulto = sc.nextInt();

        System.out.println("¿Cuántos boletos de niño deseas?");
        int nino = sc.nextInt();

        int total = adulto + nino;

        if (total <= 0) {
            return null;
        }

        double totalPagar = (adulto * 95)
                          + (nino * 60);

        return new ventaResultado(
                adulto,
                nino,
                total,
                totalPagar,
                cartelera
        );

    } catch (Exception e) {
        sc.nextLine();
        return null;
    }
}

}
