package modelo;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    // Método para mostrar libro en formato bonito
    public String mostrarInfo() {
        return "📖 ISBN: " + isbn + "\n" +
               "   📚 Título: " + titulo + "\n" +
               "   ✍️ Autor: " + autor;
    }
}