package bibilioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Libro {
    private  final String titulo;
    private final int cantidadPaginas;

    public Libro(String titulo, int cantidadPaginas) {
        this.titulo = titulo;
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }


}
