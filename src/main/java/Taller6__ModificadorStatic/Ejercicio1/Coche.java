package Taller6__ModificadorStatic.Ejercicio1;


public class Coche {
    public String modelo;
    public String marca;
    static int contadorCoches = 0;

    public Coche(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
        contadorCoches++;

    }

    public static void cochesCreados(){
        System.out.println("Coches creados: " + contadorCoches);
    }


}




