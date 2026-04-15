package controlador;

import java.io.*;
import modelo.Contacto;

public class ControladorContacto {

    public void guardar(Contacto c) {
        try {
            FileWriter fw = new FileWriter("contactos.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(c.getNombre() + "," + c.getTelefono() + "," + c.getEmail());

            pw.close();
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String listar() {
        String datos = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader("contactos.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] d = linea.split(",");

                datos += "Nombre: " + d[0] +
                         " | Tel: " + d[1] +
                         " | Email: " + d[2] + "\n";
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return datos;
    }
}