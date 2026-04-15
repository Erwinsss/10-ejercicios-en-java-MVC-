package modelo;

public class Actividad {
    private String fecha;
    private String actividad;

    public Actividad(String fecha, String actividad) {
        this.fecha = fecha;
        this.actividad = actividad;
    }

    public String getFecha() {
        return fecha;
    }

    public String getActividad() {
        return actividad;
    }
    
    // Método para mostrar actividad en formato bonito
    public String mostrarInfo() {
        return "📅 Fecha: " + fecha + " | 📝 Actividad: " + actividad;
    }
}