package gestion_academica;

public class Director extends Profesor{
    
    public Director(String id, String nombre, String especialidad){
        super(id, nombre, especialidad);

    }

    @Override
    String pensar(){
        return "Pienso como un director. ";
    }

}
