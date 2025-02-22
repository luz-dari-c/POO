package Taller8__UsoDeSuper.Ejercicio2;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Mamífero");
        Pez pez = new Pez("Piraña", "Agua Salada");

        animal.mostrarEspecie();
        pez.mostrarEspecie();
    }
}
