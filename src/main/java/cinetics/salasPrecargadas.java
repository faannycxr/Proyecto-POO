package cinetics;

import java.util.ArrayList;

public class salasPrecargadas {

    private ArrayList<salas> salas;

    public salasPrecargadas() {
        salas = new ArrayList<>();
        cargarSalas();
    }

    public ArrayList<salas> getSalas() {
        return salas;
    }

    private void cargarSalas() {

        // CU
        salas.add(new salas("CU", "1", 120));
        salas.add(new salas("CU", "2", 150));
        salas.add(new salas("CU", "3", 200));
        salas.add(new salas("CU", "4", 225));
        salas.add(new salas("CU", "5", 250));

        // Polanco
        salas.add(new salas("Polanco", "1", 200));
        salas.add(new salas("Polanco", "2", 230));
        salas.add(new salas("Polanco", "3", 280));
        salas.add(new salas("Polanco", "4", 245));
        salas.add(new salas("Polanco", "5", 300));

        // Universidad
        salas.add(new salas("Universidad", "1", 100));
        salas.add(new salas("Universidad", "2", 160));
        salas.add(new salas("Universidad", "3", 175));
        salas.add(new salas("Universidad", "4", 235));
        salas.add(new salas("Universidad", "5", 280));

        // Delta
        salas.add(new salas("Delta", "1", 80));
        salas.add(new salas("Delta", "2", 100));
        salas.add(new salas("Delta", "3", 150));
        salas.add(new salas("Delta", "4", 185));
        salas.add(new salas("Delta", "5", 210));

        // Xochimilco
        salas.add(new salas("Xochimilco", "1", 90));
        salas.add(new salas("Xochimilco", "2", 125));
        salas.add(new salas("Xochimilco", "3", 140));
        salas.add(new salas("Xochimilco", "4", 175));
        salas.add(new salas("Xochimilco", "5", 190));
    }

    public salas buscarSala(String sucursal, String sala) {
        for (salas s : salas) {
            if (s.getSucursal().equalsIgnoreCase(sucursal)
                    && s.getNumeroSala().equalsIgnoreCase(sala)) {
                return s;
            }
        }
        return null;
    }
}
