package Taller3.Ejercicio3;


public class Persona {

    private String nombre;
    int edad;


    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    void presentare(){

        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años!");
    }



}
