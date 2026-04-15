package modelo;

public class Pedido {
    private String cliente;
    private String producto;
    private int cantidad;

    public Pedido(String cliente, String producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    // Método para mostrar pedido en formato bonito
    public String mostrarInfo() {
        return " Cliente: " + cliente + "\n" +
               "    Producto: " + producto + "\n" +
               "    Cantidad: " + cantidad;
    }
}