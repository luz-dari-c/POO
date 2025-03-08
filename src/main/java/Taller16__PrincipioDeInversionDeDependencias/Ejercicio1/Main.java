package Taller16__PrincipioDeInversionDeDependencias.Ejercicio1;


public class Main {
    public static void main(String[] args) {

        GestorAutenticacion gestor1 = new GestorAutenticacion(new AutenticacionLocal());
        gestor1.iniciarSesion("Administrador", "0011");

        GestorAutenticacion gestor2 = new GestorAutenticacion(new AutenticacionOAuth());
        gestor2.iniciarSesion("usuario@oauth.com", "secreto");
    }
    }

