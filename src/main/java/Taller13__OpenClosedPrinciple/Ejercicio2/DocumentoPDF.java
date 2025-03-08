package Taller13__OpenClosedPrinciple.Ejercicio2;



public class DocumentoPDF extends Documento{
    @Override
    public void exportar() {
        System.out.println("Su documento se esta exportando a PDF");
    }
}
