package Taller8__HerenciaSimple.Ejercicio2;


public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Anderson", 27);
        Estudiante estudiante = new Estudiante("Juliet", 20, "D5900PL");

        persona.mostrarInformacion();
        estudiante.mostrarInformacion();
    }
}
