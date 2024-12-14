package gestion_academica;

/**
 * Clase Estudiante.
 * 
 * Métodos: estudiar().
 * @author cdiagal
 * @version 1.0.0
 */

public class Estudiante extends Persona{
    private String matricula;
    
    public Estudiante(){

    }
    /**
     * Constructor con los parámetros 
     * de la clase Persona, llamando a super en la primera línea
     * @param nombre
     * @param id
     * @param matricula
     */
    public Estudiante(String nombre, String id, String matricula){
        super(id, nombre);
        this.matricula = matricula;

    }

    /**
     * Función de estudiar.
     * @return String de estudiar.
     */
    public String estudiar(){
        return "Estudio 1ºDAM";
    }
    @Override
    String pensar(){
        return "Soy estudiante y tengo examen el martes";
    }
    
}
