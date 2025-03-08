package Taller16__PrincipioDeInversionDeDependencias.Ejercicio2;


public class Main {
    public static void main(String[] args) {
        GestorArchivos gestor1 = new GestorArchivos(new AlmacenamientoLocal());
        gestor1.subirArchivo("Cuentas.pdf");
        gestor1.descargarArchivo("Cuentas.pdf");

        GestorArchivos gestor2 = new GestorArchivos(new AlmacenamientoNube());
        gestor2.subirArchivo("Contabilidad.png");
        gestor2.descargarArchivo("Contabilidad.png");
    }
}
