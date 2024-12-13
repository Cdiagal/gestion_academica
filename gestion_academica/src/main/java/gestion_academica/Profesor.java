package gestion_academica;

public class Profesor extends Persona{
    private String especialidad;

    public Profesor(){

    }

    public Profesor(String id, String nombre, String especialidad){
        super(id, nombre);
        this.especialidad = especialidad;
    }

    @Override
    String pensar(){
        return "Soy estudiante y tengo examen el martes";
    }

    

    //TODO: HAY QUE CREAR EL CONSTRUCTOR VACÍO Y LOS GETTERS Y SETTERS.
    
}
