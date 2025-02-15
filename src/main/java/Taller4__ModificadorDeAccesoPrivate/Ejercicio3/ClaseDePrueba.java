package Taller4__ModificadorDeAccesoPrivate.Ejercicio3;

public class ClaseDePrueba {
    public static void main(String[] args) {

        Electrodomesticos electrodomesticos = new Electrodomesticos("Visivo", "LV", 212, "Azul" , 190000000);
        //System.out.println("Marca: " + electrodomesticos.marca); //Causará error porque es privado, necesita del metodo get.
        System.out.println("Marca: " + electrodomesticos.getMarca());   //Manera correcta.

        System.out.println("------------------------------------------------------------------------------");

        Zapato zapato = new Zapato(35);
        zapato.talla; //No es accesible



    }
}
