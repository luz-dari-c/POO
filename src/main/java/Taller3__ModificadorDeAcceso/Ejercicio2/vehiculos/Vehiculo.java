package Taller3__ModificadorDeAcceso.Ejercicio2.vehiculos;



class Vehiculo {

    String tipo;

    Vehiculo (String tipo){
        this.tipo = tipo;

    }

    void mostrarTipo(){
        System.out.println("Tipo de vehiculo: " + tipo);
    }

}
