package com.mycompany.proyectofinalpoo12eq02;

import java.util.ArrayList;

public class PeliculasPrecargadas {

    private ArrayList<Pelicula> listaPeliculas;

    public PeliculasPrecargadas() {
        listaPeliculas = new ArrayList<>();
        cargarPeliculas();
    }

    private void cargarPeliculas() {

        // ======================================================
        // 1. Five Nights at Freddy´s
        // ======================================================
        ArrayList<String> actores1 = new ArrayList<>();
        actores1.add("Josh Hutcherson");
        actores1.add("Elizabeth Lail");
        actores1.add("Matthew Lillard");

        Pelicula p1 = new Pelicula(
            "Five Nights at Freddy´s",
            "B15",
            "Emma Tammi",
            110,
            actores1,
            "Un guardia de seguridad descubre que los animatrónicos están vivos."
        );
        listaPeliculas.add(p1);


        // ======================================================
        // 2. Matrix
        // ======================================================
        ArrayList<String> actores2 = new ArrayList<>();
        actores2.add("Keanu Reeves");
        actores2.add("Carrie-Anne Moss");
        actores2.add("Laurence Fishburne");

        Pelicula p2 = new Pelicula(
            "Matrix",
            "B15",
            "Hermanas Wachowski",
            136,
            actores2,
            "Un hacker descubre que el mundo es una simulación controlada por máquinas."
        );
        listaPeliculas.add(p2);


        // ======================================================
        // 3. Deadpool & Wolverine
        // ======================================================
        ArrayList<String> actores3 = new ArrayList<>();
        actores3.add("Ryan Reynolds");
        actores3.add("Hugh Jackman");
        actores3.add("Emma Corrin");

        Pelicula p3 = new Pelicula(
            "Deadpool & Wolverine",
            "B15",
            "Shawn Levy",
            128,
            actores3,
            "Deadpool une fuerzas con Wolverine en una misión que altera el multiverso."
        );
        listaPeliculas.add(p3);


        // ======================================================
        // 4. Oppenheimer
        // ======================================================
        ArrayList<String> actores4 = new ArrayList<>();
        actores4.add("Cillian Murphy");
        actores4.add("Emily Blunt");
        actores4.add("Robert Downey Jr.");

        Pelicula p4 = new Pelicula(
            "Oppenheimer",
            "C",
            "Christopher Nolan",
            180,
            actores4,
            "La historia del creador de la bomba atómica y el Proyecto Manhattan."
        );
        listaPeliculas.add(p4);


        // ======================================================
        // 5. Barbie
        // ======================================================
        ArrayList<String> actores5 = new ArrayList<>();
        actores5.add("Margot Robbie");
        actores5.add("Ryan Gosling");

        Pelicula p5 = new Pelicula(
            "Barbie",
            "A",
            "Greta Gerwig",
            114,
            actores5,
            "Barbie y Ken comienzan un viaje para descubrir el mundo real."
        );
        listaPeliculas.add(p5);


        // ======================================================
        // 6. Rápidos y Furiosos 10
        // ======================================================
        ArrayList<String> actores6 = new ArrayList<>();
        actores6.add("Vin Diesel");
        actores6.add("Michelle Rodriguez");
        actores6.add("Jason Momoa");

        Pelicula p6 = new Pelicula(
            "Rápidos y Furiosos 10",
            "B15",
            "Louis Leterrier",
            141,
            actores6,
            "Dom Toretto enfrenta a un nuevo enemigo que busca destruir su familia."
        );
        listaPeliculas.add(p6);


        // ======================================================
        // 7. Super Mario Bros
        // ======================================================
        ArrayList<String> actores7 = new ArrayList<>();
        actores7.add("Chris Pratt");
        actores7.add("Anya Taylor-Joy");
        actores7.add("Jack Black");

        Pelicula p7 = new Pelicula(
            "Super Mario Bros",
            "A",
            "Aaron Horvath",
            92,
            actores7,
            "Mario y Luigi deben salvar el Reino Champiñón del malvado Bowser."
        );
        listaPeliculas.add(p7);


        // ======================================================
        // 8. Godzilla vs Kong 2 (Godzilla x Kong: The New Empire)
        // ======================================================
        ArrayList<String> actores8 = new ArrayList<>();
        actores8.add("Rebecca Hall");
        actores8.add("Brian Tyree Henry");

        Pelicula p8 = new Pelicula(
            "Godzilla vs Kong 2",
            "B",
            "Adam Wingard",
            115,
            actores8,
            "Godzilla y Kong deben enfrentar juntos a un nuevo enemigo titánico."
        );
        listaPeliculas.add(p8);


        // ======================================================
        // 9. Hércules (versión moderna o 2014)
        // ======================================================
        ArrayList<String> actores9 = new ArrayList<>();
        actores9.add("Dwayne Johnson");

        Pelicula p9 = new Pelicula(
            "Hércules",
            "B",
            "Brett Ratner",
            99,
            actores9,
            "Hércules lucha por redimirse mientras lidera un grupo de mercenarios."
        );
        listaPeliculas.add(p9);


        // ======================================================
        // 10. Hellboy
        // ======================================================
        ArrayList<String> actores10 = new ArrayList<>();
        actores10.add("David Harbour");

        Pelicula p10 = new Pelicula(
            "Hellboy",
            "B15",
            "Neil Marshall",
            121,
            actores10,
            "Hellboy debe enfrentar a una hechicera ancestral que amenaza al mundo."
        );
        listaPeliculas.add(p10);


        // ======================================================
        // 11. El Rey León: Mufasa
        // ======================================================
        ArrayList<String> actores11 = new ArrayList<>();
        actores11.add("Aaron Pierre");
        actores11.add("Kelvin Harrison Jr.");

        Pelicula p11 = new Pelicula(
            "El Rey León: Mufasa",
            "A",
            "Barry Jenkins",
            120,
            actores11,
            "La historia del origen de Mufasa, el legendario rey de la sabana."
        );
        listaPeliculas.add(p11);


        // ======================================================
        // 12. El Rey León
        // ======================================================
        ArrayList<String> actores12 = new ArrayList<>();
        actores12.add("James Earl Jones");
        actores12.add("Donald Glover");

        Pelicula p12 = new Pelicula(
            "El Rey León",
            "A",
            "Jon Favreau",
            118,
            actores12,
            "Simba lucha por reclamar su lugar legítimo como rey de la sabana."
        );
        listaPeliculas.add(p12);


        // ======================================================
        // 13. Alien Romulus
        // ======================================================
        ArrayList<String> actores13 = new ArrayList<>();
        actores13.add("Cailee Spaeny");
        actores13.add("Isabela Merced");

        Pelicula p13 = new Pelicula(
            "Alien Romulus",
            "B15",
            "Fede Álvarez",
            120,
            actores13,
            "Un grupo de jóvenes colonos enfrenta el horror de una nueva criatura xenomorfa."
        );
        listaPeliculas.add(p13);

    }

    public ArrayList<Pelicula> getPeliculas() {
        return listaPeliculas;
    }
}

