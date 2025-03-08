package Taller13__OpenClosedPrinciple.Ejercicio2;


public class DocumentoWord extends Documento{
    @Override
    public void exportar() {
        System.out.println("Su documento se esta exportando a Word");
    }
}
