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

    public Autor getAutor(String nombreAutor){
        for (Autor autor: getAutores()){
            if (Objects.equals(autor.getnombreAutor(),nombreAutor)){
                return  autor;
            }
        }
        return null;
    }
    public boolean hasAutor(String nombreAutor){
        for (Autor autor: getAutores()){
            if (Objects.equals(autor.getnombreAutor(),nombreAutor)){
                return  true;
            }
        }
        return false;
    }

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

    public void mostrarAutores(){
        System.out.println("-----Los autores cargados son:---------");
        for (Autor autor:autores){
            System.out.println("Nombre y apellido: " + autor.getnombreAutor() + " Nacionalidad del autor: " + autor.getNacionalidad() );
        }
    }

    public void altaLibro(String titulo,int cantidadPaginas,String nombreAutor){
        Libro libro= new Libro(titulo,cantidadPaginas);
        altaEjemplar(libro);
        Autor autor= getAutor(nombreAutor);
        autor.agregarLibro(libro);
    }

    public void altaEjemplar(Libro nuevoLibro){
        Ejemplar[] nuevoArreglo = new Ejemplar[ejemplares.length + 1];
        System.arraycopy(ejemplares, 0, nuevoArreglo, 0, ejemplares.length);
        nuevoArreglo[nuevoArreglo.length - 1] = new Ejemplar(nuevoLibro);
        ejemplares = nuevoArreglo;
    }

    public void mostrarEjemplares(){
        for (Ejemplar ejemplar:ejemplares){
            Libro libro=ejemplar.getLibro( );
            System.out.println(libro.getTitulo());
        }
    }
}
