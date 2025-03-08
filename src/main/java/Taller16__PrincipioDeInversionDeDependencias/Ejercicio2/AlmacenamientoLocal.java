package Taller16__PrincipioDeInversionDeDependencias.Ejercicio2;


public class AlmacenamientoLocal  implements  Almacenamiento{

    @Override
    public void guardarArchivo(String nombre){
        System.out.println("Archivo: " + nombre + " Guardado en disco local");
    }

    @Override
    public  String recuperarArchivo(String nombre){
        return "Recuperando archivo " + nombre + " del disco local";
    }
}
