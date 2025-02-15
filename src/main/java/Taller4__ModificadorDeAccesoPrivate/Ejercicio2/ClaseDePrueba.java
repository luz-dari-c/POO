package Taller4__ModificadorDeAccesoPrivate.Ejercicio2;


public class ClaseDePrueba {
    public static void main(String[] args) {


        Coche coche = new Coche("Ford", "SIX4", 190);

        // Intentamos acceder directamente a las propiedades privadas
        // coche.marca = "Ford";  // Provocará error ya que marca tiene acceso privado
        // coche.velocidadMaxima = 250;  // Provocará un error ya que velocidadMaxima tiene acceso privado

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad Máxima: " + coche.getVelocidadMaxima());


        // Intento de acelerar con un valor negativo y positivo
        coche.acelerar(20);  // Aumento válido
        coche.acelerar(-10); // Intento inválido
    }
}
