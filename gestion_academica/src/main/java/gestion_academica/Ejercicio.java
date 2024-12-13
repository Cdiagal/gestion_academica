package gestion_academica;

public class Ejercicio {
    static Persona persona;

    public static void main(String[] args) {
        persona = new Estudiante("Pepe","soyId", "martricula");
        System.out.println(persona.saludar());
    }
    
}
