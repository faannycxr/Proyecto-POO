package cinetics;

public class ventaProductosResultados {

    private producto productoComprado;
    private int cantidad;
    private double total;

    public ventaProductosResultados(producto productoComprado, int cantidad, double total) {
        this.productoComprado = productoComprado;
        this.cantidad = cantidad;
        this.total = total;
    }

    public producto getProductoComprado() {
        return productoComprado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }
}
