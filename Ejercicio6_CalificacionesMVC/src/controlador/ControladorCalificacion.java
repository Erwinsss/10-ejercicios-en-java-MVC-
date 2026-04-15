package controlador;

import java.io.*;
import java.util.ArrayList;
import modelo.Calificacion;

public class ControladorCalificacion {
    
    private final String ARCHIVO = "calificaciones.txt";
    
    // Guardar calificación
    public void registrar(Calificacion calificacion) {
        try {
            FileWriter fw = new FileWriter(ARCHIVO, true);
            PrintWriter pw = new PrintWriter(fw);
            
            // Formato: Nombre|Materia|Calificacion
            pw.println(calificacion.getNombre() + "|" + 
                       calificacion.getMateria() + "|" + 
                       calificacion.getCalificacion());
            
            pw.close();
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Obtener todas las calificaciones
    public ArrayList<Calificacion> obtenerTodas() {
        ArrayList<Calificacion> calificaciones = new ArrayList<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(ARCHIVO));
            String linea;
            
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");
                if (datos.length == 3) {
                    double calif = Double.parseDouble(datos[2]);
                    Calificacion c = new Calificacion(datos[0], datos[1], calif);
                    calificaciones.add(c);
                }
            }
            br.close();
            
        } catch (FileNotFoundException e) {
            return calificaciones;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return calificaciones;
    }
    
    // Obtener calificaciones de un alumno específico
    public ArrayList<Calificacion> obtenerPorAlumno(String nombre) {
        ArrayList<Calificacion> todas = obtenerTodas();
        ArrayList<Calificacion> filtradas = new ArrayList<>();
        
        for (Calificacion c : todas) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                filtradas.add(c);
            }
        }
        return filtradas;
    }
    
    // Obtener calificaciones de una materia específica
    public ArrayList<Calificacion> obtenerPorMateria(String materia) {
        ArrayList<Calificacion> todas = obtenerTodas();
        ArrayList<Calificacion> filtradas = new ArrayList<>();
        
        for (Calificacion c : todas) {
            if (c.getMateria().equalsIgnoreCase(materia)) {
                filtradas.add(c);
            }
        }
        return filtradas;
    }
    
    // Calcular promedio general
    public double promedioGeneral() {
        ArrayList<Calificacion> calificaciones = obtenerTodas();
        if(calificaciones.isEmpty()) return 0;
        
        double suma = 0;
        for (Calificacion c : calificaciones) {
            suma += c.getCalificacion();
        }
        return suma / calificaciones.size();
    }
    
    // Contar aprobados
    public int contarAprobados() {
        ArrayList<Calificacion> calificaciones = obtenerTodas();
        int contador = 0;
        for (Calificacion c : calificaciones) {
            if (c.estaAprobado()) {
                contador++;
            }
        }
        return contador;
    }
    
    // Contar reprobados
    public int contarReprobados() {
        ArrayList<Calificacion> calificaciones = obtenerTodas();
        int contador = 0;
        for (Calificacion c : calificaciones) {
            if (!c.estaAprobado()) {
                contador++;
            }
        }
        return contador;
    }
    
    // Total de calificaciones registradas
    public int totalCalificaciones() {
        return obtenerTodas().size();
    }
}