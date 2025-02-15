package Taller4__ModificadorDeAccesoPrivate.Ejercicio2;

public class Coche {

    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        setVelocidadMaxima(velocidadMaxima);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("La marca no puede estar vacía");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("El modelo no puede estar vacío.");
        }
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("Velocidad máxima inválida. Debe ser mayor que 0.");
        }
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("Velocidad aumentada\n"+  "Nueva velocidad máxima: " + velocidadMaxima + " km/h");
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }
}
