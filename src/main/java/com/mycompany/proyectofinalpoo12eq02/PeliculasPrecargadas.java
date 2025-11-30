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
            "Un guardia de seguridad descubre que los animatonicos estan vivos."
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
            "Un hacker descubre que el mundo es una simulacion controlada por maquinas."
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
            "Deadpool une fuerzas con Wolverine en una mision que altera el multiverso."
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
            "La historia del creador de la bomba atomica y el Proyecto Manhattan."
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
            "Rapidos y Furiosos 10",
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
            "Mario y Luigi deben salvar el Reino Champiñon del malvado Bowser."
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
            "Godzilla y Kong deben enfrentar juntos a un nuevo enemigo titanico."
        );
        listaPeliculas.add(p8);


        // ======================================================
        // 9. Hércules (version moderna o 2014)
        // ======================================================
        ArrayList<String> actores9 = new ArrayList<>();
        actores9.add("Dwayne Johnson");

        Pelicula p9 = new Pelicula(
            "Hercules",
            "B",
            "Brett Ratner",
            99,
            actores9,
            "Hercules lucha por redimirse mientras lidera un grupo de mercenarios."
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
        // 11. El Rey Leon: Mufasa
        // ======================================================
        ArrayList<String> actores11 = new ArrayList<>();
        actores11.add("Aaron Pierre");
        actores11.add("Kelvin Harrison Jr.");

        Pelicula p11 = new Pelicula(
            "El Rey Leon: Mufasa",
            "A",
            "Barry Jenkins",
            120,
            actores11,
            "La historia del origen de Mufasa, el legendario rey de la sabana."
        );
        listaPeliculas.add(p11);


        // ======================================================
        // 12. El Rey Leon
        // ======================================================
        ArrayList<String> actores12 = new ArrayList<>();
        actores12.add("James Earl Jones");
        actores12.add("Donald Glover");

        Pelicula p12 = new Pelicula(
            "El Rey Leon",
            "A",
            "Jon Favreau",
            118,
            actores12,
            "Simba lucha por reclamar su lugar legitimo como rey de la sabana."
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
            "Fede Alvarez",
            120,
            actores13,
            "Un grupo de jovenes colonos enfrenta el horror de una nueva criatura xenomorfa."
        );
        listaPeliculas.add(p13);
        
        // ======================================================
        // 14. Superman
        // ======================================================
        ArrayList<String> actores14 = new ArrayList<>();
        actores14.add("David Corenswet");
        actores14.add("Rachel Brosnahan");
        actores14.add("Nicholas Hoult");

        Pelicula p14 = new Pelicula(
            "Superman (2025)",
            "B",
            "James Gunn",
            125,
            actores14,
            "Clark Kent inicia su vida como Superman mientras intenta equilibrar su identidad humana y heroica."
        );
        listaPeliculas.add(p14);

        // ======================================================
        // 15. Jurassic World Rebirth
        // ======================================================

        ArrayList<String> actores15 = new ArrayList<>();
        actores15.add("Chris Pratt");
        actores15.add("Bryce Dallas Howard");
        actores15.add("Mahershala Ali");

        Pelicula p15 = new Pelicula(
            "Jurassic World: Rebirth",
            "B",
            "Gareth Edwards",
            140,
            actores15,
            "Una nueva era comienza cuando la humanidad intenta coexistir con dinosaurios en libertad."
        );
        listaPeliculas.add(p15);

        // ======================================================
        // 16. Mision Imposible
        // ======================================================

        ArrayList<String> actores16 = new ArrayList<>();
        actores16.add("Tom Cruise");
        actores16.add("Hayley Atwell");
        actores16.add("Rebecca Ferguson");

        Pelicula p16 = new Pelicula(
            "Mission: Impossible - Dead Reckoning Part Two",
            "B15",
            "Christopher McQuarrie",
            156,
            actores16,
            "Ethan Hunt enfrenta la mision mas peligrosa de su carrera para detener una amenaza global definitiva."
        );
        listaPeliculas.add(p16);


        // ======================================================
        // 17. The End of Evangelion
        // ======================================================
        ArrayList<String> actores17 = new ArrayList<>();
        actores17.add("Megumi Ogata");
        actores17.add("Megumi Hayashibara");
        actores17.add("Yuko Miyamura");

        Pelicula p17 = new Pelicula(
            "The End of Evangelion",
            "+16",
            "Hideaki Anno",
            87,
            actores17,
            "La confrontacion final entre NERV y SEELE mientras Shinji enfrenta el destino de la humanidad."
        );
        listaPeliculas.add(p17);


    }

    public ArrayList<Pelicula> getPeliculas() {
        return listaPeliculas;
    }
}

