package bibilioteca;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ObjectType;

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

    public Socio buscarSocio(String nombreSocio){
        for (Socio socio: socios){
            if (Objects.equals(socio.getNombreSocio(),nombreSocio)){
                return socio;
            }
        }
        return null;
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

    public void agregarEjemplar(String titulo) {
        Ejemplar ejemplar=buscarEjemplar(titulo);
        ejemplar.sumarEjemplar();
    }

    public Ejemplar buscarEjemplar(String titulo){
        for (Ejemplar ejemplar: ejemplares){
            if (Objects.equals(ejemplar.getLibro().getTitulo(), titulo)) {
                return  ejemplar;
            }
        }
        return null;
    }

    public void mostrarEjemplares(){
        for (Ejemplar ejemplar:ejemplares){
            Libro libro=ejemplar.getLibro( );
            System.out.println("Nombre del libro: " + libro.getTitulo() + " Ejemplares disponibles:" + ejemplar.getEjemplares_disponibles() +
                                " Ejemplares prestados:" + ejemplar.getEjemplares_prestados());
        }
    }

    public void cargarPrestamo(int idPrestamo,String nombreSocio,String titulo){
        Ejemplar ejemplar= buscarEjemplar(titulo);
        if (ejemplar != null && ejemplar.isDisponible()) {
            Socio socio = buscarSocio(nombreSocio);
            socio.agregarPrestamo(new Prestamo(idPrestamo,ejemplar));
            ejemplar.restarEjemplar();
            socio.mostrarPrestamos();
        }
        else {
            System.out.println("No se pudo cargar prestamo");
        }
    }

    public void mostrarDescripcion(String titulo){
        Ejemplar ejemplar=buscarEjemplar(titulo);
        System.out.println("El libro " + ejemplar.getLibro().getTitulo() + "creado por el autor " );
    }

}
