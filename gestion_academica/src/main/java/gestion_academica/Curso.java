package gestion_academica;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase curso.
 * 
 * Funciones: listarEstudiantes() , agregarEstudiantes().
 * @author cdiagal
 * @version 1.0.0
 */

public class Curso {

    private String nombre;
    private String codigo;
    private List<Estudiante> estudiantes;
    private Materia materia;

    public Curso() {
        estudiantes = new ArrayList<>();
    }

    public Curso(String nombre, String codigo, Materia materia) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materia = materia;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    /**
     * Función de agregar estudiantes.
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante " + estudiante.getNombre() + " agregado al curso " + nombre + ".");
    }
    /**
     * Función de listar estudiantes.
     * @param estudiante
     */
    public void listarEstudiantes() {
        System.out.println("Estudiantes inscritos en el curso " + nombre + ":");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", estudiantes=" + estudiantes +
                ", materia=" + materia +
                '}';
    }
}

