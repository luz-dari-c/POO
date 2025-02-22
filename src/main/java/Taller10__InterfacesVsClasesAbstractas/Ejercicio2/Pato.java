package Taller10__InterfacesVsClasesAbstractas.Ejercicio2;


public class Pato implements Nadador, Volador {
    @Override
    public void nadar() {
        System.out.println("El pato esta nadando");
    }

    @Override
    public void volar() {
        System.out.println("El pato esta volando");
    }
}
