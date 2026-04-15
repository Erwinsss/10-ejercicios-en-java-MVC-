package modelo;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    // Método para mostrar producto en formato bonito
    public String mostrarInfo() {
        return " ID: " + id + "\n" +
               "    Nombre: " + nombre + "\n" +
               "    Precio: $" + String.format("%.2f", precio) + "\n" +
               "    Cantidad: " + cantidad;
    }
    
    // Calcular valor total del producto (precio * cantidad)
    public double valorTotal() {
        return precio * cantidad;
    }
}