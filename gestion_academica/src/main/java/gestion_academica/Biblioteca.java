package gestion_academica;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Biblioteca.
 * 
 * Funciones: listarLibros().
 * @author cdiagal
 * @version 1.0.0
 */

public class Biblioteca {
    
    private String nombre;
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro " + libro.getTitulo() + " registrado en la biblioteca " + nombre + ".");
    }

    public void listarLibros() {
        System.out.println("Libros disponibles en la biblioteca " + nombre + ":");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + libros +
                '}';
    }
}
