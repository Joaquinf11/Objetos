package bibilioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private static Socio[] socios;
    private static Autor[] autores;
    private static Ejemplar[] ejemplares;

    public Biblioteca(){
        socios= new Socio[0];
        autores= new Autor[0];
        ejemplares= new Ejemplar[0];

    }

    public Socio[] getSocios() {
        return socios;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public Ejemplar[] getEjemplares(){ return ejemplares;}


    public static void altaSocio(String nombreSocio, int idSocio){

        Socio[] nuevoArreglo = new Socio[socios.length + 1];
        System.arraycopy(socios, 0, nuevoArreglo, 0, socios.length);
        nuevoArreglo[nuevoArreglo.length - 1] = new Socio(nombreSocio,idSocio);
        socios = nuevoArreglo;
    }

    public void mostrarSocios(){
        for (Socio socio:socios){
            System.out.println(socio.getNombreSocio());
        }
    }

    public static void altaAutor(String nombreAutor, String nacionalidad){
        Autor[] nuevoArreglo = new Autor[autores.length + 1];
        System.arraycopy(autores, 0, nuevoArreglo, 0, autores.length);
        nuevoArreglo[nuevoArreglo.length - 1] = new Autor(nombreAutor,nacionalidad);
        autores = nuevoArreglo;
    }

    public void mostrarAutor(){
        for (Autor autor:autores){
            System.out.println(autor.getnombreAutor());
        }
    }

    public void altaLibro(String nombreAutor,String titulo,int cantidadPaginas){
        Libro libro= new Libro(titulo,cantidadPaginas);
        //gregarEjemplar(ejemplares,new Ejemplar());


    }
}
