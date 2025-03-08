package Taller16__PrincipioDeInversionDeDependencias.Ejercicio2;


public interface Almacenamiento {
    void guardarArchivo(String nombre);
    String recuperarArchivo(String nombre);
}
