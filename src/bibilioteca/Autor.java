package bibilioteca;


import java.util.ArrayList;
import java.util.Objects;

public class Autor {
    private final String nombreAutor;
    private final String nacionalidad;
    private Libro[] libros;

    public Autor(String autor,String nacionalidad) {
        this.nombreAutor = autor;
        this.nacionalidad = nacionalidad;
        this.libros= new Libro[0];
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public String getnombreAutor() {
        return this.nombreAutor;
    }



    public Libro getLibros(String titulo){
        for (Libro libro: libros){
            if(Objects.equals(libro.getTitulo(), titulo)){
                return libro;
            }
        }
        return null;
    }


    public void agregarLibro(Libro nuevoLibro){
        Libro[] nuevoArreglo = new Libro[libros.length + 1];
        System.arraycopy(libros, 0, nuevoArreglo, 0, libros.length);
        nuevoArreglo[nuevoArreglo.length - 1] = nuevoLibro;
        libros = nuevoArreglo;
    }



    public void mostrarLibros(){
        System.out.print("[ ");
        for(Libro libro : libros){
            System.out.print(libro.getTitulo() + ", ");
        }
        System.out.println(" ]");
    }

}
