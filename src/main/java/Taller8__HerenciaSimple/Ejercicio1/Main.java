package Taller8__HerenciaSimple.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Lamborguini", 210);
        Coche coche = new Coche(4, "Ferrari", 185);

        vehiculo.mostrarInformacion();
        coche.mostrarInformacion();


    }
}

