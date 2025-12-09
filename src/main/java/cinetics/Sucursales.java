package cinetics;

public class Sucursales {

    private Sucursal cu;
    private Sucursal universidad;
    private Sucursal carso;
    private Sucursal xochimilco;
    private Sucursal polanco;

    public Sucursales() {
        cu = new Sucursal("CU");
        universidad = new Sucursal("Universidad");
        carso = new Sucursal("Carso");
        xochimilco = new Sucursal("Xochimilco");
        polanco = new Sucursal("Polanco");
    }

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

    public void agregarStockSucursal(String sucursal, String producto, int cantidad) {
        switch (sucursal) {
            case "CU":
                cu.agregarStock(producto, cantidad);
                break;
            case "Universidad":
                universidad.agregarStock(producto, cantidad);
                break;
            case "Carso":
                carso.agregarStock(producto, cantidad);
                break;
            case "Xochimilco":
                xochimilco.agregarStock(producto, cantidad);
                break;
            case "Polanco":
                polanco.agregarStock(producto, cantidad);
                break;
            default:
                System.out.println("Sucursal no reconocida");
        }
    }

    public Sucursal getCU() { return cu; }
    public Sucursal getUniversidad() { return universidad; }
    public Sucursal getCarso() { return carso; }
    public Sucursal getXochimilco() { return xochimilco; }
    public Sucursal getPolanco() { return polanco; }
}
