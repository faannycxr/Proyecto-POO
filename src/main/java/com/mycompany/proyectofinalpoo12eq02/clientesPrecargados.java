package com.mycompany.proyectofinalpoo12eq02;

import java.util.ArrayList;

public class clientesPrecargados {

    private static ArrayList<clientes> listaClientes = new ArrayList<>();

    static {
        try {
            listaClientes.add(new clientes("Luis", "Perez", "Lopez",
                    "Calle Norte 123", "5544332211", "perezlopezluis@gmail.com",
                    "4829103746", "tigre123A!", false));

            listaClientes.add(new clientes("Maria", "Gomez", "Rojas",
                    "Av Central 45", "5511223344", "gomezrojasmaria@gmail.com",
                    "9201184735", "lobo777B#", false));

            listaClientes.add(new clientes("Jorge", "Ramirez", "Diaz",
                    "Calle Sur 89", "5522334455", "ramirezdiazjorge@gmail.com",
                    "1048295538", "oso321C$", false));

            listaClientes.add(new clientes("Ana", "Santos", "Mora",
                    "Col Reforma 21", "5533445566", "santosmoraana@gmail.com",
                    "3382910475", "gato999D%", false));

            listaClientes.add(new clientes("Pedro", "Vega", "Cruz",
                    "Col Centro 10", "5544556677", "vegacruzpedro@gmail.com",
                    "8801449272", "zorro555E&", false));

            // 5 con true
            listaClientes.add(new clientes("Laura", "Nieves", "Soto",
                    "Calle Real 77", "5555667788", "nievessotolaura@gmail.com",
                    "5629104738", "puma111F@", true));

            listaClientes.add(new clientes("Ricardo", "Marin", "Flores",
                    "Av Norte 56", "5566778899", "marinflorezricardo@hotmail.com",
                    "7192045582", "rana222G?", true));

            listaClientes.add(new clientes("Carla", "Duran", "Silva",
                    "Cerrada 102", "5577889900", "duransilvacarla@gmail.com",
                    "2910047388", "oso444H*", true));

            listaClientes.add(new clientes("Diego", "Torres", "Beltran",
                    "Privada Azul 5", "5588990011", "torresbeltrandiego@gmail.com",
                    "1002849377", "toro888J+", true));

            listaClientes.add(new clientes("Elena", "Montes", "Aguilar",
                    "Av Sur 300", "5599001122", "montesaguilarelena@gmail.com",
                    "8392017455", "ave123K=", true));
            listaClientes.add(new clientes("Jesus", "Cabanzo", "Lopez",
                    "Calle Doctores 210", "5545765560", "cabanzolopezjesus@gmail.com",
                    "322138915", "pez123X?", true));

        } catch (Exception e) {
            System.out.println("Error al cargar clientes base");
        }
    }

    public static ArrayList<clientes> getListaClientes() {
        return listaClientes;
    }

    public static void agregarCliente(clientes c) {
        try {
            listaClientes.add(c);
        } catch (Exception e) {
            System.out.println("No se pudo agregar el cliente");
        }
    }
}
