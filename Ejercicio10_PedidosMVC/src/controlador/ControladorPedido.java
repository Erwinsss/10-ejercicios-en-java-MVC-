package controlador;

import java.io.*;
import java.util.ArrayList;
import modelo.Pedido;

public class ControladorPedido {
    
    private final String ARCHIVO = "pedidos.txt";
    
    // Guardar pedido
    public void registrar(Pedido pedido) {
        try {
            FileWriter fw = new FileWriter(ARCHIVO, true);
            PrintWriter pw = new PrintWriter(fw);
            
            // Formato: Cliente|Producto|Cantidad
            pw.println(pedido.getCliente() + "|" + pedido.getProducto() + "|" + pedido.getCantidad());
            
            pw.close();
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Obtener todos los pedidos
    public ArrayList<Pedido> obtenerTodos() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(ARCHIVO));
            String linea;
            
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");
                if (datos.length == 3) {
                    int cantidad = Integer.parseInt(datos[2]);
                    Pedido p = new Pedido(datos[0], datos[1], cantidad);
                    pedidos.add(p);
                }
            }
            br.close();
            
        } catch (FileNotFoundException e) {
            // Archivo no existe aún, regresa lista vacía
            return pedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return pedidos;
    }
    
    // Obtener pedidos de un cliente específico
    public ArrayList<Pedido> obtenerPorCliente(String cliente) {
        ArrayList<Pedido> todos = obtenerTodos();
        ArrayList<Pedido> filtrados = new ArrayList<>();
        
        for (Pedido p : todos) {
            if (p.getCliente().equalsIgnoreCase(cliente)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
    
    // Obtener cantidad total de productos pedidos
    public int totalProductosVendidos() {
        ArrayList<Pedido> pedidos = obtenerTodos();
        int total = 0;
        for (Pedido p : pedidos) {
            total += p.getCantidad();
        }
        return total;
    }
    
    // Obtener número total de pedidos
    public int totalPedidos() {
        return obtenerTodos().size();
    }
}