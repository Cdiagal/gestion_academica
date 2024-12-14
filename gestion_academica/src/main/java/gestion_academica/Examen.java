package gestion_academica;

import java.time.LocalDate;

/**
 * Clase Exámen.
 * 
 * Funciones: programarExamen().
 * @author cdiagal
 * @version 1.0.0
 */

public class Examen {
    
    private LocalDate fecha;
    private Materia materia;

    public Examen() {
    }

    public Examen(LocalDate fecha, Materia materia) {
        this.fecha = fecha;
        this.materia = materia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    /**
     * Funcion de programar un examen.
     * @param fecha
     * @param materia
     */
    public void programarExamen(LocalDate fecha, Materia materia) {
        this.fecha = fecha;
        this.materia = materia;
        System.out.println("Examen programado para la materia " + materia.getNombre() + " en la fecha " + fecha + ".");
    }

    @Override
    public String toString() {
        return "Examen{" +
                "fecha=" + fecha +
                ", materia=" + materia +
                '}';
    }
}
