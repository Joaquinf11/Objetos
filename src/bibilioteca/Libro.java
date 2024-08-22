package bibilioteca;

public class Libro {
    private  final String titulo;
    private final int cantidadPaginas;
    private final Autor autor;

    public Libro(String titulo, int cantidadPaginas, Autor autor) {
        this.titulo = titulo;
        this.cantidadPaginas = cantidadPaginas;
        this.autor=autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public Autor getAutor() {
        return this.autor;
    }
}
