package com.mycompany.proyectofinalpoo12eq02;

public class Sucursal {

    private Sucursal cu;
    private Sucursal universidad;
    private Sucursal carso;
    private Sucursal xochimilco;
    private Sucursal polanco;

    public Sucursal() {
        cu = new Sucursal("CU");
        universidad = new Sucursal("Universidad");
        carso = new Sucursal("Carso");
        xochimilco = new Sucursal("Xochimilco");
        polanco = new Sucursal("Polanco");
    }

    // ============================
    // MÉTODO PRINCIPAL
    // Guarda la cartelera donde corresponde
    // ============================
    public void agregarCartelera(Cartelera c) {
        String suc = c.getSucursal();

        switch (suc) {
            case "CU":
                cu.agregarCartelera(c);
                break;
            case "Universidad":
                universidad.agregarCartelera(c);
                break;
            case "Carso":
                carso.agregarCartelera(c);
                break;
            case "Xochimilco":
                xochimilco.agregarCartelera(c);
                break;
            case "Polanco":
                polanco.agregarCartelera(c);
                break;
            default:
                System.out.println("Sucursal no reconocida: " + suc);
        }
    }

    // Getters para acceder a cada sucursal
    public Sucursal getCU() { return cu; }
    public Sucursal getUniversidad() { return universidad; }
    public Sucursal getCarso() { return carso; }
    public Sucursal getXochimilco() { return xochimilco; }
    public Sucursal getPolanco() { return polanco; }
}
