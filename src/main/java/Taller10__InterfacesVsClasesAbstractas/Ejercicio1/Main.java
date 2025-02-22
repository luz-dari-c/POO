package Taller10__InterfacesVsClasesAbstractas.Ejercicio1;


public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(23,3);
        Triangulo triangulo = new Triangulo(45,2);

        System.out.println("Área del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Área del Triangulo: " + triangulo.calcularArea());
    }
}
