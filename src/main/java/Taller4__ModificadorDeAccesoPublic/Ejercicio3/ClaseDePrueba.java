package Taller4__ModificadorDeAccesoPublic.Ejercicio3;


public class ClaseDePrueba {
    public static void main(String[] args) {

        Utilidades u = new Utilidades();
        System.out.println("Suma: " + u.suma(12,8));

        System.out.println("Resta: " + u.resta(10, 5));

        System.out.println("Multiplicacion: " + u.multiplicaion(5,5));

        System.out.println("Division: " + u.division(20, 2));
    }
}
