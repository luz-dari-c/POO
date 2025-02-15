package Taller4__ModificadorDeAccesoPrivate.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Sydierg", 18, 4.9);

        System.out.println("Datos iniciales:");
        estudiante.mostrarInfo();

        estudiante.setNombre("Daniel");
        estudiante.setEdad(48);
        estudiante.setNotaPromedio(3);

        System.out.println("Datos actualizados:");
        estudiante.mostrarInfo();
    }
}
