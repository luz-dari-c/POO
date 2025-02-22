package Taller7__ClasesAbstractas.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(23);
        Rectangulo rectangulo = new Rectangulo(8,19);


        System.out.println("Circulo");
        circulo.mostrarArea();
        System.out.println("Rectangulo");
        rectangulo.mostrarArea();

    }
}
