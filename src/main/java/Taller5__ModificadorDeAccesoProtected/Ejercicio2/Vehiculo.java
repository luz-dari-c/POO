package Taller5__ModificadorDeAccesoProtected.Ejercicio2;


public class Vehiculo {

    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo de Vehículo: " + tipo);
        System.out.println("Marca: " + marca);
    }
}
