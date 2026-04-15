package controlador;

import java.io.*;
import java.util.ArrayList;
import modelo.Estudiante;

public class ControladorEstudiante {
    
    private final String ARCHIVO = "estudiantes.txt";
    
    // Guardar estudiante
    public void registrar(Estudiante estudiante) {
        try {
            FileWriter fw = new FileWriter(ARCHIVO, true);
            PrintWriter pw = new PrintWriter(fw);
            
            // Formato: NumControl|Nombre|Carrera|Promedio
            pw.println(estudiante.getNumControl() + "|" + 
                       estudiante.getNombre() + "|" + 
                       estudiante.getCarrera() + "|" + 
                       estudiante.getPromedio());
            
            pw.close();
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Obtener todos los estudiantes
    public ArrayList<Estudiante> obtenerTodos() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(ARCHIVO));
            String linea;
            
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");
                if (datos.length == 4) {
                    double promedio = Double.parseDouble(datos[3]);
                    Estudiante e = new Estudiante(datos[0], datos[1], datos[2], promedio);
                    estudiantes.add(e);
                }
            }
            br.close();
            
        } catch (FileNotFoundException e) {
            // Archivo no existe aún, regresa lista vacía
            return estudiantes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return estudiantes;
    }
    
    // Verificar si ya existe un estudiante con ese número de control
    public boolean existeNumControl(String numControl) {
        ArrayList<Estudiante> estudiantes = obtenerTodos();
        for (Estudiante e : estudiantes) {
            if (e.getNumControl().equalsIgnoreCase(numControl)) {
                return true;
            }
        }
        return false;
    }
    
    // Obtener estudiante por número de control
    public Estudiante obtenerPorNumControl(String numControl) {
        ArrayList<Estudiante> estudiantes = obtenerTodos();
        for (Estudiante e : estudiantes) {
            if (e.getNumControl().equalsIgnoreCase(numControl)) {
                return e;
            }
        }
        return null;
    }
    
    // Obtener estudiantes por carrera
    public ArrayList<Estudiante> obtenerPorCarrera(String carrera) {
        ArrayList<Estudiante> todos = obtenerTodos();
        ArrayList<Estudiante> filtrados = new ArrayList<>();
        
        for (Estudiante e : todos) {
            if (e.getCarrera().equalsIgnoreCase(carrera)) {
                filtrados.add(e);
            }
        }
        return filtrados;
    }
    
    // Calcular promedio general de todos los estudiantes
    public double promedioGeneral() {
        ArrayList<Estudiante> estudiantes = obtenerTodos();
        if(estudiantes.isEmpty()) return 0;
        
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getPromedio();
        }
        return suma / estudiantes.size();
    }
    
    // Contar estudiantes aprobados (promedio >= 6)
    public int contarAprobados() {
        ArrayList<Estudiante> estudiantes = obtenerTodos();
        int contador = 0;
        for (Estudiante e : estudiantes) {
            if (e.getPromedio() >= 6) {
                contador++;
            }
        }
        return contador;
    }
    
    // Contar estudiantes reprobados (promedio < 6)
    public int contarReprobados() {
        ArrayList<Estudiante> estudiantes = obtenerTodos();
        int contador = 0;
        for (Estudiante e : estudiantes) {
            if (e.getPromedio() < 6) {
                contador++;
            }
        }
        return contador;
    }
    
    // Obtener número total de estudiantes
    public int totalEstudiantes() {
        return obtenerTodos().size();
    }
}