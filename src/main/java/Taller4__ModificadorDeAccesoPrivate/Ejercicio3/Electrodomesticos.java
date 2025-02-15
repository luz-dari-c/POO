package Taller4__ModificadorDeAccesoPrivate.Ejercicio3;


public class Electrodomesticos {

    private String marca;
    private String modelo;
    private double potencia;
    private  String color;
    private int precio;

    public Electrodomesticos(String marca, String modelo, double potencia, String color, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
