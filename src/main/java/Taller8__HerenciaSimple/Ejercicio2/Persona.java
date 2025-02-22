package Taller8__HerenciaSimple.Ejercicio2;



public class Persona {

    protected String nombre;
    protected  int edad;

    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
