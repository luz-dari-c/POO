package Taller11__Polimorfismo.Ejercicio4;


public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo();
        Vehiculo vehiculo1 = new Bicicleta();
        Vehiculo vehiculo2 = new Coche();

        vehiculo.mover();
        vehiculo1.mover();
        vehiculo2.mover();
    }
}
