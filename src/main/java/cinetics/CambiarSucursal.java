
package cinetics;

import java.util.Scanner;

public class CambiarSucursal {

    public static Sucursal cambiarSucursal(Sucursales sucursales, Sucursal sucursalActual) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Te encuentras en la sucursal de " + sucursalActual.getNombre());
            System.out.println("A que sucursal te quieres mover?");
            System.out.println("1. CU");
            System.out.println("2. Carso");
            System.out.println("3. Universidad");
            System.out.println("4. Xochimilco");
            System.out.println("5. Polanco");

            int opcion = sc.nextInt();
            Sucursal nueva = sucursalActual;

            switch (opcion) {

                case 1:
                    nueva = sucursales.getCU();
                    break;

                case 2:
                    nueva = sucursales.getCarso();
                    break;

                case 3:
                    nueva = sucursales.getUniversidad();
                    break;

                case 4:
                    nueva = sucursales.getXochimilco();
                    break;

                case 5:
                    nueva = sucursales.getPolanco();
                    break;

                default:
                    System.out.println("Opcion invalida");
                    return sucursalActual;
            }

            if (nueva == sucursalActual) {
                System.out.println("Usted se encuentra en la sucursal de " + sucursalActual.getNombre());
                return sucursalActual;
            }

            sucursalActual = nueva;
            System.out.println("Usted ha cambiado a la sucursal de " + sucursalActual.getNombre());

        } catch (Exception e) {
            System.out.println("Entrada invalida");
        }

        return sucursalActual;
    }
}
