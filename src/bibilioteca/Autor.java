package bibilioteca;


import java.util.ArrayList;
import java.util.Objects;

public class Autor {
    private final String nombreAutor;
    private final String nacionalidad;
    private ArrayList<Libro> libros;

    public Autor(String autor,String nacionalidad) {
        this.nombreAutor = autor;
        this.nacionalidad = nacionalidad;
        libros= new ArrayList<Libro>();
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public String getnombreAutor() {
        return this.nombreAutor;
    }


    public void addLibros(Libro libro){
        libros.add(libro);

    }

    public Libro getLibro(String titulo){
        for (Libro libro: libros){
            if(Objects.equals(libro.getTitulo(), titulo)){
                return libro;
            }
        }
        return null;
    }

    public Autor getAutor( ArrayList<Autor>autores,String nombre){
        for (Autor autor :autores){
            if (Objects.equals(autor.getnombreAutor(),nombre))
                return autor;
        }
        return null;
    }
}
