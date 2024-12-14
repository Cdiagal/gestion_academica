package gestion_academica;
/**
 * Clase Profesor.
 * 
 * Métodos: enseniar().
 * @author cdiagal
 * @version 1.0.0
 */

public class Profesor extends Persona{
    private String especialidad;

    public Profesor(){

    }

    /*
     * Getters y setters de especialidad.
     * @param especialidad.
     */

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    public Profesor(String id, String nombre, String especialidad){
        super(id, nombre);
        this.especialidad = especialidad;
    }

    /**
     * Función enseñar
     * @return String de qué profesor está asociado con especialidad.
     */
    public void ensenar() {
        System.out.println(getNombre() + " está enseñando la especialidad de " + especialidad + ".");
    }

    @Override
    String pensar(){
        return "Soy profesor.";
    }

    @Override
    public String toString() {
        return "{" +
            " El profesor" + getNombre() + "especialidad='" + getEspecialidad() + "'" +
            "}";
    }


    

    //TODO: HAY QUE CREAR EL CONSTRUCTOR VACÍO Y LOS GETTERS Y SETTERS.
    
}
