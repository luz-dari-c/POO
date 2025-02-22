package Taller8__HerenciaSimple.Ejercicio2;


public class Estudiante  extends Persona{
    private String matricula;

    public Estudiante (String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + "Matrícula: \" + matricula");
    }
}
