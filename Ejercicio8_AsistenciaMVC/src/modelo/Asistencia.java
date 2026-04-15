package modelo;

public class Asistencia {
    private final String nombre;
    private final String fecha;
    private final String estado;

    public Asistencia(String nombre, String fecha, String estado) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }
}