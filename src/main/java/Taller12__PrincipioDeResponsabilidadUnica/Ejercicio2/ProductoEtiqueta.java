package Taller12__PrincipioDeResponsabilidadUnica.Ejercicio2;


import java.util.UUID;

class ProductoEtiqueta {
    public void generarEtiqueta(Producto producto) {
        String etiquetaAleatoria = UUID.randomUUID().toString().substring(0, 4);
        System.out.println("Etiqueta: " + producto.getCodigo() + "-" + etiquetaAleatoria);
    }
}

