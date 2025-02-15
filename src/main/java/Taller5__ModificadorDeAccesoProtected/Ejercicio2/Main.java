package Taller5__ModificadorDeAccesoProtected.Ejercicio2;


public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Carro", "Ford");
        vehiculo.mostrarInformacion();

        Moto moto = new Moto("Kawasaki", "Moto", 150);
        moto.mostrarInformacion();
    }
}
