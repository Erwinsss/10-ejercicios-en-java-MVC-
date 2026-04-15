package controlador;

import java.io.*;
import java.util.ArrayList;
import modelo.Venta;

public class ControladorVenta {
    
    private final String ARCHIVO = "ventas.txt";
    
    // Guardar venta
    public void registrar(Venta venta) {
        try {
            try (FileWriter fw = new FileWriter(ARCHIVO, true)) {
                PrintWriter pw = new PrintWriter(fw);
                
                // Formato: Fecha|Producto|Cantidad|Total
                pw.println(venta.getFecha() + "|" +
                        venta.getProducto() + "|" +
                        venta.getCantidad() + "|" +
                        venta.getTotal());
                
                pw.close();
            }
            
        } catch (IOException e) {
        }
    }
    
    // Obtener todas las ventas
    public ArrayList<Venta> obtenerTodas() {
        ArrayList<Venta> ventas = new ArrayList<>();
        
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
                String linea;
                
                while ((linea = br.readLine()) != null) {
                    String[] datos = linea.split("\\|");
                    if (datos.length == 4) {
                        int cantidad = Integer.parseInt(datos[2]);
                        double total = Double.parseDouble(datos[3]);
                        Venta v = new Venta(datos[0], datos[1], cantidad, total);
                        ventas.add(v);
                    }
                }
            }
            
        } catch (FileNotFoundException e) {
            // Archivo no existe aún, regresa lista vacía
            return ventas;
        } catch (IOException | NumberFormatException e) {
        }
        
        return ventas;
    }
    
    // Obtener ventas de un producto específico
    public ArrayList<Venta> obtenerPorProducto(String producto) {
        ArrayList<Venta> todas = obtenerTodas();
        ArrayList<Venta> filtradas = new ArrayList<>();
        
        for (Venta v : todas) {
            if (v.getProducto().equalsIgnoreCase(producto)) {
                filtradas.add(v);
            }
        }
        return filtradas;
    }
    
    // Obtener ventas por rango de fechas (simple, compara strings)
    public ArrayList<Venta> obtenerPorFecha(String fecha) {
        ArrayList<Venta> todas = obtenerTodas();
        ArrayList<Venta> filtradas = new ArrayList<>();
        
        for (Venta v : todas) {
            if (v.getFecha().equals(fecha)) {
                filtradas.add(v);
            }
        }
        return filtradas;
    }
    
    // Calcular total de ventas en dinero
    public double totalVentas() {
        ArrayList<Venta> ventas = obtenerTodas();
        double total = 0;
        for (Venta v : ventas) {
            total += v.getTotal();
        }
        return total;
    }
    
    // Calcular total de productos vendidos
    public int totalProductosVendidos() {
        ArrayList<Venta> ventas = obtenerTodas();
        int total = 0;
        for (Venta v : ventas) {
            total += v.getCantidad();
        }
        return total;
    }
    
    // Obtener número total de ventas
    public int totalVentasRegistradas() {
        return obtenerTodas().size();
    }
}   