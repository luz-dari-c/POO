package Taller16__PrincipioDeInversionDeDependencias.Ejercicio1;



public class AutenticacionOAuth  implements  ServicioAutenticacion{
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        System.out.println("Se está autenticando con OAuth");
        return usuario.endsWith("@oauth.com");
    }
}
