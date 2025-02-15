package Taller5__ModificadorDeAccesoProtected.Ejercicio2.Prueba;


import Taller5__ModificadorDeAccesoProtected.Ejercicio2.Vehiculo;

public class Prueba {
    public static void main(String[] args) {


        Vehiculo vehiculo = new Vehiculo("Camión", "Volvo");

        // Intento de acceso directo a atributos protected (Generará error)

        // System.out.println("Tipo: " + vehiculo.tipo);         ------>  Genera error porque tipo tiene acceso protected.
        // System.out.println("Marca: " + vehiculo.marca); ------>  Genera error, porque marca tiene acceso protected.

        vehiculo.mostrarInformacion();   // ----->   Metodo mostrarInformacion() si funciona, porque es público.



    }
        }

