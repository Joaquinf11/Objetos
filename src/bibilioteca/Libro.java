package bibilioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Libro {
    private  final String titulo;
    private final int cantidadPaginas;
    private Ejemplar[] ejemplares;

    public Libro(String titulo, int cantidadPaginas) {
        this.titulo = titulo;
        this.cantidadPaginas = cantidadPaginas;
        this.ejemplares= new Ejemplar[0];
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public static Libro buscarLibro(Libro[] libros, String titulo){
        for( Libro libro : libros){
            if (libro.titulo.equals(titulo)){
                return libro;
            }
        }
        return null;
    }

    public void agregarEjemplar(Libro libro){
        Ejemplar[] nuevoArreglo = new Ejemplar[ejemplares.length + 1];
        System.arraycopy(ejemplares, 0, nuevoArreglo, 0, ejemplares.length);
        nuevoArreglo[nuevoArreglo.length - 1] = new Ejemplar(libro);
        ejemplares = nuevoArreglo;
    }


}
