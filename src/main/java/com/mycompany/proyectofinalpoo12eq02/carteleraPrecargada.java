package com.mycompany.proyectofinalpoo12eq02;

import java.util.ArrayList;

public class carteleraPrecargada {

    private ArrayList<Cartelera> listaCartelera;
    private PeliculasPrecargadas peliculasBase;

    public carteleraPrecargada() {
        listaCartelera = new ArrayList<>();
        peliculasBase = new PeliculasPrecargadas();
        cargarCartelera();
    }

      private Pelicula buscarPelicula(String nombre) 
      {
        for (Pelicula p : peliculasBase.getPeliculas()) 
        {
            if (p.getNombrePelicula().equalsIgnoreCase(nombre)) 
            {
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

    public ArrayList<Cartelera> getListaCartelera() {
        return listaCartelera;
    }
}
