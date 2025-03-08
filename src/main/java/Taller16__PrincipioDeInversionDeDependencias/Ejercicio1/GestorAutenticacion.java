package Taller16__PrincipioDeInversionDeDependencias.Ejercicio1;


public class GestorAutenticacion {

    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }
    public void iniciarSesion(String usuario, String contraseña) {
        if (servicioAutenticacion.autenticar(usuario, contraseña)) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Ha ocurrido un error");
        }
    }

}
