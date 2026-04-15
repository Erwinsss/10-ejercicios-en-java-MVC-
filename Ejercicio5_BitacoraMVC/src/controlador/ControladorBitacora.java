package controlador;

import java.io.*;
import java.util.ArrayList;
import modelo.Actividad;

public class ControladorBitacora {
    
    private final String ARCHIVO = "bitacora.txt";
    
    // Guardar actividad
    public void registrar(Actividad actividad) {
        try {
            FileWriter fw = new FileWriter(ARCHIVO, true);
            PrintWriter pw = new PrintWriter(fw);
            
            // Formato: Fecha|Actividad
            pw.println(actividad.getFecha() + "|" + actividad.getActividad());
            
            pw.close();
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Obtener todas las actividades
    public ArrayList<Actividad> obtenerTodas() {
        ArrayList<Actividad> actividades = new ArrayList<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(ARCHIVO));
            String linea;
            
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");
                if (datos.length == 2) {
                    Actividad a = new Actividad(datos[0], datos[1]);
                    actividades.add(a);
                }
            }
            br.close();
            
        } catch (FileNotFoundException e) {
            // Archivo no existe aún, regresa lista vacía
            return actividades;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return actividades;
    }
    
    // Obtener número total de actividades
    public int totalActividades() {
        return obtenerTodas().size();
    }
}