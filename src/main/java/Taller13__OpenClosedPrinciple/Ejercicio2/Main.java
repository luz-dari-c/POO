package Taller13__OpenClosedPrinciple.Ejercicio2;


public class Main {
    public static void main(String[] args) {
        Documento docPDF = new DocumentoPDF();
        Documento docWord = new DocumentoWord();
        Documento docExcel = new DocumentoExcel();

        docPDF.exportar();
        docWord.exportar();
        docExcel.exportar();
    }
}
