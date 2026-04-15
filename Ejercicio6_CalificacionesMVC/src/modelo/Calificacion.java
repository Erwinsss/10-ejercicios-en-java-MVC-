package modelo;

public class Calificacion {
    private String nombre;
    private String materia;
    private double calificacion;

    public Calificacion(String nombre, String materia, double calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }

    public double getCalificacion() {
        return calificacion;
    }
    
    // Método para verificar si está aprobado
    public boolean estaAprobado() {
        return calificacion >= 6;
    }
    
    // Método para mostrar información bonita
    public String mostrarInfo() {
        String estado = estaAprobado() ? "✅ APROBADO" : "❌ REPROBADO";
        return "👤 Nombre: " + nombre + "\n" +
               "   📚 Materia: " + materia + "\n" +
               "   🎯 Calificación: " + String.format("%.2f", calificacion) + " - " + estado;
    }
}