package bibilioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private ArrayList<Socio> socios;
    private ArrayList<Autor> autores;

    public Biblioteca(){
        this.socios= new ArrayList<Socio>();
        this.autores= new ArrayList<Autor>();
    }

    public ArrayList<Socio> getSocios() {
        return this.socios;
    }

    public ArrayList<Autor> getAutores() {
        return this.autores;
    }


    public void altaAutor(String nombre, String nacionalidad){
        autores.add(new Autor(nombre,nacionalidad);
    }

    public void altaLibro(String autor,String titulo,String cantidadPaginas){

    }
}
