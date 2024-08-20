package bibilioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private static Socio[] socios;
    private Autor[] autores;
    private Ejemplar[] ejemplares;

    public Biblioteca(){
        socios= new Socio[0];
        this.autores= new Autor[0];
        this.ejemplares= new Ejemplar[0];

    }

    public Socio[] getSocios() {
        return socios;
    }

    public Autor[] getAutores() {
        return this.autores;
    }

    public Ejemplar[] getEjemplares(){ return this.ejemplares;}


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
    public void altaAutor(String nombreAutor, String nacionalidad){

    }

    public void altaLibro(String nombreAutor,String titulo,int cantidadPaginas){
        Libro libro= new Libro(titulo,cantidadPaginas);
        //gregarEjemplar(ejemplares,new Ejemplar());


    }
}
