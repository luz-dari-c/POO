package Taller4__ModificadorDeAccesoPublic.Ejercicio3;



public class Utilidades {

    public double suma (double a, double b){
        return   a + b;
    }

    public double resta (double a, double b){
        return a - b;
    }

    public double division (double a, double b){
        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }
        return a / b;
    }

    public double multiplicaion (double a, double b){
        return a*b;
    }

}
