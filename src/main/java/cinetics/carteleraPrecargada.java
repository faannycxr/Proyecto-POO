
package cinetics;

import java.util.ArrayList;
import java.util.Scanner;

public class carteleraPrecargada {

    private ArrayList<Cartelera> listaCartelera;
    private PeliculasPrecargadas peliculasBase;
    private salasPrecargadas salasBase;

    public carteleraPrecargada() {
        listaCartelera = new ArrayList<>();
        peliculasBase = new PeliculasPrecargadas();
        salasBase = new salasPrecargadas();
        cargarCartelera();
    }

    private Pelicula buscarPelicula(String nombre) {
        for (Pelicula p : peliculasBase.getPeliculas()) {
            if (p.getNombrePelicula().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        System.out.println("PELICULA NO ENCONTRADA: " + nombre);
        return null;
    }

    private void cargarCartelera() {
        // ============================
        // SUCURSAL CU
        // ============================
        listaCartelera.add(new Cartelera(
            buscarPelicula("Five Nights at Freddy´s"),
            "22:00 a 00:00",
            "4",
            "CU"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Matrix"),
            "19:30 a 21:30",
            "2",
            "CU"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Deadpool & Wolverine"),
            "18:00 a 20:00",
            "1",
            "CU"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Oppenheimer"),
            "19:30 a 21:30",
            "3",
            "CU"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Barbie"),
            "16:00 a 17:30",
            "5",
            "CU"
        ));
        
         listaCartelera.add(new Cartelera(
            buscarPelicula("The End Of Evangelion"),
            "17:00 a 19:00",
            "1",
            "CU"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Jurassic World: Rebirth"),
            "16:30 a 19:00",
            "2",
            "CU"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Superman (2025)"),
            "16:00 a 18:00",
            "1",
            "CU"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Mission: Impossible - Dead Reckoning Part Two"),
            "12:30 a 14:30",
            "3",
            "CU"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Barbie"),
            "13:00 a 14:30",
            "5",
            "CU"
        ));

        // ============================
        // SUCURSAL UNIVERSIDAD
        // ============================
        listaCartelera.add(new Cartelera(
            buscarPelicula("Five Nights at Freddy´s"),
            "20:30 a 22:30",
            "1",
            "Universidad"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Rapidos y Furiosos 10"),
            "18:00 a 20:00",
            "2",
            "Universidad"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Super Mario Bros"),
            "13:00 a 15:00",
            "3",
            "Universidad"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Deadpool & Wolverine"),
            "20:30 a 22:30",
            "5",
            "Universidad"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Godzilla vs Kong 2"),
            "13:00 a 15:00",
            "4",
            "Universidad"
        ));
        
        listaCartelera.add(new Cartelera(
            buscarPelicula("Five Nights at Freddy´s"), 
            "13:00 a 15:00", 
            "1", 
            "Universidad"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("Hellboy"), 
            "16:00 a 18:00", 
            "2",
            "Universidad"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("Hercules"), 
            "18:30 a 20:00", 
            "3", 
            "Universidad"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("El Rey Leon"), 
            "14:30 a 16:00", 
            "4", 
            "Universidad"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("Godzilla vs Kong 2"), 
            "20:30 a 22:30", 
            "5", 
            "Universidad"));


        // ============================
        // SUCURSAL CARSO
        // ============================
        listaCartelera.add(new Cartelera(
            buscarPelicula("Hercules"),
            "16:00 a 17:30",
            "5",
            "Carso"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Hellboy"),
            "22:00 a 00:00",
            "2",
            "Carso"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Super Mario Bros"),
            "16:30 a 19:00",
            "4",
            "Carso"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("El Rey Leon: Mufasa"),
            "16:30 a 19:00",
            "1",
            "Carso"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Deadpool & Wolverine"),
            "22:00 a 00:00",
            "3",
            "Carso"
        ));
        
        listaCartelera.add(new Cartelera(
            buscarPelicula("Jurassic World: Rebirth"), 
            "12:30 a 15:00", 
            "1", 
            "Carso"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("Mission: Impossible - Dead Reckoning Part Two"), 
            "15:30 a 18:00", 
            "2", 
            "Carso"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("Superman (2025)"), 
            "18:30 a 20:30", 
            "3", 
            "Carso"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("The End of Evangelion"), 
            "21:00 a 22:30", 
            "4", 
            "Carso"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("Alien Romulus"), 
            "13:00 a 15:00", 
            "5", 
            "Carso"));


        // ============================
        // SUCURSAL XOCHIMILCO
        // ============================
        listaCartelera.add(new Cartelera(
            buscarPelicula("Hercules"),
            "13:00 a 15:00",
            "3",
            "Xochimilco"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Deadpool & Wolverine"),
            "19:30 a 21:30",
            "1",
            "Xochimilco"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Super Mario Bros"),
            "16:00 a 17:30",
            "5",
            "Xochimilco"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("El Rey Leon"),
            "14:00 a 15:30",
            "2",
            "Xochimilco"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Alien Romulus"),
            "20:30 a 22:30",
            "4",
            "Xochimilco"
        ));
        
        listaCartelera.add(new Cartelera(
            buscarPelicula("Hercules"), 
            "12:00 a 13:30", 
            "1", 
            "Xochimilco"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("Barbie"), 
            "14:00 a 15:45", 
            "2", 
            "Xochimilco"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("Hellboy"), 
            "16:00 a 18:00", 
            "3", 
            "Xochimilco"));
        listaCartelera.add(new Cartelera(
        buscarPelicula("Super Mario Bros"), 
            "18:30 a 20:00", 
            "4", 
            "Xochimilco"));
        listaCartelera.add(new Cartelera(
        buscarPelicula("Matrix"), 
            "20:30 a 22:30",
            "5", 
            "Xochimilco"));


        // ============================
        // SUCURSAL POLANCO
        // ============================
        listaCartelera.add(new Cartelera(
            buscarPelicula("El Rey Leon"),
            "14:00 a 15:30",
            "2",
            "Polanco"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Super Mario Bros"),
            "16:30 a 19:00",
            "3",
            "Polanco"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Five Nights at Freddy´s"),
            "20:30 a 22:30",
            "1",
            "Polanco"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Rapidos y Furiosos 10"),
            "18:00 a 20:00",
            "5",
            "Polanco"
        ));

        listaCartelera.add(new Cartelera(
            buscarPelicula("Super Mario Bros"),
            "13:00 a 15:00",
            "4",
            "Polanco"
        ));
        
        listaCartelera.add(new Cartelera(
            buscarPelicula("El Rey Leon: Mufasa"), 
            "12:00 a 14:00", 
            "1", 
            "Polanco"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("Oppenheimer"), 
            "14:30 a 17:30", 
            "2", 
            "Polanco"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("The End of Evangelion"), 
            "18:00 a 19:30", 
            "3", 
            "Polanco"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("Rapidos y Furiosos 10"), 
            "20:00 a 22:20", 
            "4", 
            "Polanco"));
        listaCartelera.add(new Cartelera(
            buscarPelicula("Superman (2025)"), 
            "16:00 a 18:00", 
            "5", 
            "Polanco"));

    }


    private void agregar(String sucursal, String nombrePeli, String horario, String sala) {

        try {
            Pelicula p = buscarPelicula(nombrePeli);
            if (p == null) return;

            salas salaEncontrada = salasBase.buscarSala(sucursal, sala);
            if (salaEncontrada == null) {
                System.out.println("ERROR: Sala " + sala + " no existe en " + sucursal);
                return;
            }

            listaCartelera.add(new Cartelera(
                p,
                horario,
                sala,
                sucursal
            ));

            listaCartelera.get(listaCartelera.size() - 1).setCapacidad(salaEncontrada.getCapacidad());

        } catch (Exception e) {
            System.out.println("ERROR al cargar cartelera: " + nombrePeli);
        }
    }

    public ArrayList<Cartelera> getListaCartelera() {
        return listaCartelera;
    }

    public void agregarCartelera() {

        Sucursal sucursalActual = MenuClienteNoRegistrado.getSucursalActual();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nAGREGAR CARTELERA");

        System.out.print("Nombre de la película: ");
        String nombre = sc.nextLine();

        Pelicula peli = buscarPelicula(nombre);
        if (peli == null) {
            System.out.println("No se puede crear cartelera porque la película no existe.");
            return;
        }

        System.out.print("Horario: ");
        String horario = sc.nextLine();

        System.out.print("Número de sala: ");
        String sala = sc.nextLine();

        salas salaEncontrada = salasBase.buscarSala(sucursalActual.getNombre(), sala);
        if (salaEncontrada == null) {
            System.out.println("ERROR: Esa sala no existe en esta sucursal.");
            return;
        }

        try {
            Cartelera nueva = new Cartelera(
                peli,
                horario,
                sala,
                sucursalActual.getNombre()
            );

            nueva.setCapacidad(salaEncontrada.getCapacidad());

            listaCartelera.add(nueva);

            System.out.println("Cartelera agregada con capacidad: " + salaEncontrada.getCapacidad());

        } catch (Exception e) {
            System.out.println("Error al agregar la cartelera.");
        }
    }

    public void eliminarCartelera() {

        Sucursal sucursalActual = MenuClienteNoRegistrado.getSucursalActual();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nELIMINAR CARTELERA");

        System.out.print("Nombre de la pelicula a eliminar: ");
        String nombre = sc.nextLine();

        System.out.print("Horario de la funcion: ");
        String horario = sc.nextLine();

        System.out.print("Numero de sala: ");
        String sala = sc.nextLine();

        Cartelera encontrada = null;

        for (Cartelera c : listaCartelera) {
            if (c.getPelicula().getNombrePelicula().equalsIgnoreCase(nombre)
                    && c.getSucursal().equalsIgnoreCase(sucursalActual.getNombre())
                    && c.getHorario().equalsIgnoreCase(horario)
                    && c.getSala().equalsIgnoreCase(sala)) {
                encontrada = c;
                break;
            }
        }

        if (encontrada == null) {
            System.out.println("No se encontro una cartelera con esos datos en la sucursal "
                    + sucursalActual.getNombre());
            return;
        }

        try {
            listaCartelera.remove(encontrada);
            System.out.println("Cartelera eliminada correctamente.");
        } catch (Exception e) {
            System.out.println("No se pudo eliminar la cartelera.");
        }
    }
}

    