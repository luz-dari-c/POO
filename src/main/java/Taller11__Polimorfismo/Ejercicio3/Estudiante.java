package Taller11__Polimorfismo.Ejercicio3;


public class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }

    public void estudiar() {
        System.out.println("Estoy estudiando.");
    }
}
