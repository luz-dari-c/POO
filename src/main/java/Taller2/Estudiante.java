package Taller2;


public class Estudiante {

    public String nombre;
    public int edad;

    public Estudiante(){
      this("Manuel", 19);
    }

    public Estudiante (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void detalleEstudiante(){
        System.out.println("Estudiante\nNombre: " + nombre + "\nEdad: " + edad);
    }

}
