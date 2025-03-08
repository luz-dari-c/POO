package Taller12__PrincipioDeResponsabilidadUnica.Ejercicio3;


public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Julio Andrade", "julioandrade@gmail.com", "999999");
        UsuarioAutenticacion autenticacion = new UsuarioAutenticacion();
        UsuarioValidacion validacion = new UsuarioValidacion();

        System.out.println("Autenticación: " + autenticacion.autenticar(usuario, "julioandrade@gmail.com", "999999"));
        System.out.println("Correo válido: " + validacion.validarCorreo(usuario.getCorreo()));
    }
}
