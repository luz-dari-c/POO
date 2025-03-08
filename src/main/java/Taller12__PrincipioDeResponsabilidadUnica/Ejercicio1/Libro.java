package Taller12__PrincipioDeResponsabilidadUnica.Ejercicio1;



public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int precio;

    public Libro(){
        titulo = "En busca de la felicidad";
        autor = "Sydierg Zemog";
        isbn = "89282";
        precio = 200000;
    }

    public Libro(String titulo, String autor, String isbn, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }
    public  int getPrecio(){
        return precio;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}
