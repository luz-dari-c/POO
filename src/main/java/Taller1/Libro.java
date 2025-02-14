package Taller1;


public class Libro {

    public  String titulo;
    public String autor;
    public int numeroPaginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Libro () {

        titulo = "Mil vidas mil maestros";
        autor = "Weis Brain";
        numeroPaginas = 200;
    }

    public Libro (String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDetalles(){

        System.out.println("Detalles del libro\n" + "Titulo: " + titulo + "\nAutor: " + autor+ "\nNumero de Paginas: " + numeroPaginas);

    }

    @Override
    public String toString() {
        return "Detalles del libro\n" + "Titulo: " + titulo + "\nAutor: " + autor  + "\nCantidad de Paginas: " + numeroPaginas;
    }
}
