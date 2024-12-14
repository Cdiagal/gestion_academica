package gestion_academica;

/**
 * Clase Libro.
 * 
 * Funciones: detalles().
 * @author cdiagal
 * @version 1.0.0
 */

public class Libro {
    
    private String titulo;
    private String autor;

    public Libro() {
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Función que proporciona los detalles del libro.
     * @return detalles
     */
    public void detalles() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
