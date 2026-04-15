package controlador;

import java.io.*;
import modelo.Asistencia;

public class ControladorAsistencia {

    public void guardar(Asistencia a) {
        try {
            try (FileWriter fw = new FileWriter("asistencia.txt", true); 
                    PrintWriter pw = new PrintWriter(fw)) {
                
                pw.println(a.getNombre() + "," + a.getFecha() + "," + a.getEstado());
                
            }

        } catch (IOException e) {
        }
    }

    public String listar() {
        String datos = "";

        try {
            try (BufferedReader br = new BufferedReader(new FileReader("asistencia.txt"))) {
                String linea;
                
                while ((linea = br.readLine()) != null) {
                    String[] d = linea.split(",");
                    
                    datos += "Nombre: " + d[0] +
                            " | Fecha: " + d[1] +
                            " | Estado: " + d[2] + "\n";
                }
            }

        } catch (IOException e) {
        }

        return datos;
    }
}