package controlador;

import java.io.*;
import java.util.ArrayList;
import modelo.Libro;

public class ControladorLibro {
    
    private final String ARCHIVO = "libros.txt";
    
    // Guardar libro
    public void registrar(Libro libro) {
        try {
            try (FileWriter fw = new FileWriter(ARCHIVO, true); 
                    PrintWriter pw = new PrintWriter(fw)) {
                
                // Formato: ISBN|Título|Autor
                pw.println(libro.getIsbn() + "|" + libro.getTitulo() + "|" + libro.getAutor());
                
            }
            
        } catch (IOException e) {
        }
    }
    
    // Obtener todos los libros
    public ArrayList<Libro> obtenerTodos() {
        ArrayList<Libro> libros = new ArrayList<>();
        
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
                String linea;
                
                while ((linea = br.readLine()) != null) {
                    String[] datos = linea.split("\\|");
                    if (datos.length == 3) {
                        Libro l = new Libro(datos[0], datos[1], datos[2]);
                        libros.add(l);
                    }
                }
            }
            
        } catch (FileNotFoundException e) {
            // Archivo no existe aún, regresa lista vacía
            return libros;
        } catch (IOException e) {
        }
        
        return libros;
    }
    
    // Verificar si ya existe un libro con ese ISBN
    public boolean existeISBN(String isbn) {
        ArrayList<Libro> libros = obtenerTodos();
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return true;
            }
        }
        return false;
    }
    
    // Obtener cantidad de libros
    public int totalLibros() {
        return obtenerTodos().size();
    }
}