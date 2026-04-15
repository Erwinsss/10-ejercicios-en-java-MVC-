package controlador;

import java.io.*;
import java.util.ArrayList;
import modelo.Producto;

public class ControladorProducto {
    
    private final String ARCHIVO = "productos.txt";
    
    // Guardar producto
    public void registrar(Producto producto) {
        try {
            FileWriter fw = new FileWriter(ARCHIVO, true);
            PrintWriter pw = new PrintWriter(fw);
            
            // Formato: ID|Nombre|Precio|Cantidad
            pw.println(producto.getId() + "|" + 
                       producto.getNombre() + "|" + 
                       producto.getPrecio() + "|" + 
                       producto.getCantidad());
            
            pw.close();
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Obtener todos los productos
    public ArrayList<Producto> obtenerTodos() {
        ArrayList<Producto> productos = new ArrayList<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(ARCHIVO));
            String linea;
            
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");
                if (datos.length == 4) {
                    double precio = Double.parseDouble(datos[2]);
                    int cantidad = Integer.parseInt(datos[3]);
                    Producto p = new Producto(datos[0], datos[1], precio, cantidad);
                    productos.add(p);
                }
            }
            br.close();
            
        } catch (FileNotFoundException e) {
            // Archivo no existe aún, regresa lista vacía
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return productos;
    }
    
    // Verificar si ya existe un producto con ese ID
    public boolean existeID(String id) {
        ArrayList<Producto> productos = obtenerTodos();
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
    
    // Obtener producto por ID
    public Producto obtenerPorID(String id) {
        ArrayList<Producto> productos = obtenerTodos();
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }
    
    // Obtener cantidad total de productos en inventario
    public int totalUnidades() {
        ArrayList<Producto> productos = obtenerTodos();
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
    
    // Obtener valor total del inventario
    public double valorTotalInventario() {
        ArrayList<Producto> productos = obtenerTodos();
        double total = 0;
        for (Producto p : productos) {
            total += p.valorTotal();
        }
        return total;
    }
    
    // Obtener número total de productos diferentes
    public int totalProductos() {
        return obtenerTodos().size();
    }
}