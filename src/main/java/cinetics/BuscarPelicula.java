package cinetics;

import java.util.Scanner;

public class BuscarPelicula {

    public static ventaResultado buscarPelicula(Sucursal sucursalActual) {

        Scanner sc = new Scanner(System.in);
        String nombreBuscado = "";

        try {
            System.out.println("Ingrese el nombre de la película a buscar:");
            nombreBuscado = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Error al leer el nombre.");
            return null;
        }

        boolean encontrada = false;
        Cartelera resultado = null;

        try {
            for (int i = 0; i < sucursalActual.getCartelera().size(); i++) {
                Cartelera c = sucursalActual.getCartelera().get(i);
                if (c.getPelicula().getNombrePelicula().toLowerCase()
                        .contains(nombreBuscado.toLowerCase())) {

                    encontrada = true;
                    resultado = c;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al buscar la película.");
            return null;
        }

        if (encontrada) {
            System.out.println("Película encontrada:");
            resultado.imprimirCartelera();

            ventas v = new ventas();
            return v.compraBoleto(resultado);

        } else {
            System.out.println("No contamos con dicha película en este momento");
            System.out.println("Pero podemos ofrecerte estas funciones:");

            try {
                for (int i = 0; i < sucursalActual.getCartelera().size(); i++) {
                    Cartelera c = sucursalActual.getCartelera().get(i);
                    System.out.println(c.getPelicula().getNombrePelicula());
                }
            } catch (Exception e) {
                System.out.println("Error al mostrar las películas disponibles.");
            }
        }

        return null;
    }
}
