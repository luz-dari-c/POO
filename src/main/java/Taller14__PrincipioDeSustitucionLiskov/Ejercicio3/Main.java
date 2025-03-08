package Taller14__PrincipioDeSustitucionLiskov.Ejercicio3;



public class Main {
    public static void main(String[] args) {

        Transporte bicicleta = new Bicicleta();
        Transporte coche = new Coche();

        bicicleta.moverse();
        coche.moverse();

    }
}
