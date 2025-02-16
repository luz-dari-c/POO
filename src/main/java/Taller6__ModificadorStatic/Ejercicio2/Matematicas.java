package Taller6__ModificadorStatic.Ejercicio2;


public class Matematicas {

    public static double suma (double a, double b){
        return a+b;
    }
    public static double resta (double a, double b){
        return a-b;
    }
    public static double multiplicacion (double a, double b){
        return a*b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }
        return a / b;
    }


}
