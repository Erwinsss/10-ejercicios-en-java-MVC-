package modelo;

public class Estudiante {
    private String numControl;
    private String nombre;
    private String carrera;
    private double promedio;

    public Estudiante(String numControl, String nombre, String carrera, double promedio) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getNumControl() {
        return numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }
    
    // Método para mostrar estudiante en formato bonito
    public String mostrarInfo() {
        String estado;
        if(promedio >= 6) {
            estado = "✅ APROBADO";
        } else {
            estado = "❌ REPROBADO";
        }
        
        return "🎓 Matrícula: " + numControl + "\n" +
               "   👤 Nombre: " + nombre + "\n" +
               "   📚 Carrera: " + carrera + "\n" +
               "   🎯 Promedio: " + String.format("%.2f", promedio) + " - " + estado;
    }
}