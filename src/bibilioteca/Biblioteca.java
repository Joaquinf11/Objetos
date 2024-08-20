package bibilioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private static  ArrayList<Socio> socios;
    private ArrayList<Autor> autores;
    private ArrayList <Ejemplar> ejemplares;

    public Biblioteca(){
        socios= new ArrayList<>();
        this.autores= new ArrayList<Autor>();
        this.ejemplares= new ArrayList<Ejemplar>();

    }

    public static ArrayList<Socio> getSocios() {
        return socios;
    }

    public ArrayList<Autor> getAutores() {
        return this.autores;
    }

    public static void altaSocio(String nombreSocio, int idSocio){
      socios.add(new Socio(nombreSocio,idSocio));
    }

    public void altaAutor(String nombreAutor, String nacionalidad){
        autores.add(new Autor(nombreAutor,nacionalidad));
    }

    public void altaLibro(String nombreAutor,String titulo,int cantidadPaginas){
        Libro libro= new Libro(titulo,cantidadPaginas);
        //gregarEjemplar(ejemplares,new Ejemplar());


    }
}
