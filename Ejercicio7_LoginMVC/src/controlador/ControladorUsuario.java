package controlador;

import java.io.*;
import modelo.Usuario;

public class ControladorUsuario {

    public void registrar(Usuario u) {
        try {
            FileWriter fw = new FileWriter("usuarios.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(u.getUsuario() + "," + u.getContraseña());

            pw.close();
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validar(String user, String pass) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos[0].equals(user) && datos[1].equals(pass)) {
                    br.close();
                    return true;
                }
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}