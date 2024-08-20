package bibilioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private ArrayList<Socio> socios;
    private ArrayList<Autor> autores;
    private ArrayList <Ejemplar> ejemplares;

    public Biblioteca(){
        this.socios= new ArrayList<Socio>();
        this.autores= new ArrayList<Autor>();
        this.ejemplares= new ArrayList<Ejemplar>();

    }

    public ArrayList<Socio> getSocios() {
        return this.socios;
    }

    public ArrayList<Autor> getAutores() {
        return this.autores;
    }

    public void altaSocio(String nombreSocio,int idSocio){
        socios.add(new Socio(nombreSocio,idSocio));
    }

    public void altaAutor(String nombreAutor, String nacionalidad){
        autores.add(new Autor(nombreAutor,nacionalidad));
    }

    public void altaLibro(String nombreAutor,String titulo,int cantidadPaginas){
        Libro libro= new Libro(titulo,cantidadPaginas);
        agregarEjemplar(ejemplares,new Ejemplar());


    }
}
