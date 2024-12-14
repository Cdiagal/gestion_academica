package gestion_academica;
/**
 * Clase Materia.
 * 
 * Funciones: detalles().
 * @author cdiagal
 * @version 1.0.0
 */

public class Materia {
    private String nombre;
    private String codigo;

    public Materia() {
    }

    public Materia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
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
    /**
     * Función que muestra los detalles de la materia.
     * @return detalles.
     */
    public void detalles() {
        System.out.println("Materia: " + nombre + ", Código: " + codigo);
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}

