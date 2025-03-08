package Taller11__Polimorfismo.Ejercicio2;


public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Persona persona1 = new Estudiante();
        Persona persona2 = new Profesor();

        persona.Presentarse();
        persona1.Presentarse();
        persona2.Presentarse();

    }
}
