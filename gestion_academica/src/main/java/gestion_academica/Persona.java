package gestion_academica;

/**
 * Clase Persona.
 * 
 * Métodos: saludar().
 * @author cdiagal
 * @version 1.0.0
 */

public abstract class Persona {
    private String id;
    private String nombre;
    private Fecha nacimiento;

    /**
     * Constructor
     */
    public Persona(){}
    
    public Persona(String id,String nombre){
        this.id = id;
        this.nombre = nombre;

    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Funcion de saludar
     * @return String con mensaje.
     */
    public String saludar(){
        return "Hola, yo soy" + nombre;
    }

    abstract String pensar();

    
    
}
