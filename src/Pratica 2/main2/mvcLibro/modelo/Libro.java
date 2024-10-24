package mvcLibro.modelo;


public class Libro implements ILibro {
    private Isbn isbn;
    private String titulo;
    private String autor;
    private int ejemplaresDisponibles;
    private int ejemplaresPrestados;

    public Libro(Isbn isbn, String titulo, String autor, int ejemplaresDisponibles) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
        this.ejemplaresPrestados = 0;
    }

    @Override
    public Isbn getIsbn() {
        return isbn;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    @Override
    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public boolean estaDisponible() {
        return ejemplaresDisponibles > 0;
    }

    public boolean hayPrestados() {
        return ejemplaresPrestados > 0;
    }

    public void prestar() {
        if (estaDisponible()) {
            ejemplaresDisponibles--;
            ejemplaresPrestados++;
        } else {
            System.out.println("No hay ejemplares disponibles para préstamo de este libro.");
        }
    }

    public void devolver() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            ejemplaresDisponibles++;
        } else {
            System.out.println("No hay ejemplares prestados de este libro.");
        }
    }

}


