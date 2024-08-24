package bibilioteca;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ObjectType;

import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private static Socio[] socios;
    private static Autor[] autores;


    public Biblioteca(){
        socios= new Socio[0];
        autores= new Autor[0];
    }

    public Socio[] getSocios() {
        return socios;
    }

    public static Autor[] getAutores() {
        return autores;
    }



    public Autor getAutor(String nombreAutor){
        for (Autor autor: getAutores()){
            if (Objects.equals(autor.getnombreAutor(),nombreAutor)){
                return  autor;
            }
        }
        return null;
    }


    public  void altaSocio(String nombreSocio, int idSocio){
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

    public  void altaAutor(String nombreAutor, String nacionalidad){
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

    public void altaLibro(String titulo,int cantidadPaginas,String nombreAutor) {
        Libro libro = new Libro(titulo, cantidadPaginas);
        Autor autor = getAutor(nombreAutor);
        if (autor != null) {
            autor.agregarLibro(libro);
        }
        else{
            System.out.println("Debe dar de alta el autor");
        }
    }

    public void altaEjemplar(String titulo) {
        Libro libro= Autor.buscarLibro(autores,titulo);
        if (libro != null) {
            libro.agregarEjemplar(libro);
        }
    }

    public void cargarPrestamo(int idPrestamo,String nombreSocio,String titulo){
        Libro libro= Autor.buscarLibro(autores,titulo);

        Ejemplar ejemplar= libro.getDisponible();

        Socio socio = buscarSocio(nombreSocio);
        socio.agregarPrestamo(new Prestamo(idPrestamo,ejemplar));
        if (libro == null || ejemplar == null || socio== null){
            System.out.println("No se pudo cargar prestamo");
        }
    }

    public void cargarDevolucion(int idPrestamo,String nombreSocio){
        Socio socio=buscarSocio(nombreSocio);
        Prestamo prestamo=Prestamo.buscarPrestamo(socio.getPrestamos(),idPrestamo);
        prestamo.altaDevolucion();
    }


    public void mostrarDescripcion(String titulo){
        Autor autor= Autor.buscarAutorPorLibro(autores,titulo);
        Libro libro= Autor.buscarLibro(autores,titulo);
        System.out.println("El libro " + libro.getTitulo() + "creado por el autor " + autor.getnombreAutor()
                            + " tiene " + libro.getCantidadPaginas() + " cantidad de paginas, quedan " +
                            libro.ejemplaresDisponibles() + " y se prestaron " + libro.ejemplaresPrestados());
    }

}
