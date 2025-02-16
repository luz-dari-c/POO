package Taller6__ModificadorStatic.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Coche coche1  = new Coche("Ford", "KL0");
        Coche coche2 = new Coche("Tesla", "GT5");
        Coche coche3 = new Coche("Honda", "BE3");

        Coche.cochesCreados();
    }
}
