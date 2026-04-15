package modelo;

public class Venta {
    private final String fecha;
    private final String producto;
    private final int cantidad;
    private final double total;

    public Venta(String fecha, String producto, int cantidad, double total) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }
    
    // Método para mostrar venta en formato bonito
    public String mostrarInfo() {
        return "📅 Fecha: " + fecha + "\n" +
               "   📦 Producto: " + producto + "\n" +
               "   🔢 Cantidad: " + cantidad + "\n" +
               "   💰 Total: $" + String.format("%.2f", total);
    }
}