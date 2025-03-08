package Taller15__PrincipioDeSegregacionDeInterfaces.Ejercicio3;


public class Main {
    public static void main(String[] args) {


        Conduccion carro = new Carro();
        Conduccion camion = new Camion();
        CargaMercancia cargaCamion = new Camion();

        carro.conducir();
        camion.conducir();
        cargaCamion.cargarMercancia();
    }
}

