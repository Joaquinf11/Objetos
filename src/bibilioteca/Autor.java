package bibilioteca;


import java.util.ArrayList;
import java.util.Objects;

public class Autor {
    private final String nombreAutor;
    private final String nacionalidad;

    public Autor(String autor,String nacionalidad) {
        this.nombreAutor = autor;
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public String getnombreAutor() {
        return this.nombreAutor;
    }


}
