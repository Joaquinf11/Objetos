package mvcLibro.modelo;


import mvcLibro.observer.Observado;
import mvcLibro.observer.Observador;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Observado {

    private List<Libro> libros;

    private List<Observador> observadores;

    public Biblioteca(){
        this.libros = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    public List<Libro> buscarLibrosPorTitulo(String parteDelTitulo) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getTitulo().toLowerCase().contains(parteDelTitulo.toLowerCase())) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public Libro buscarLibrosPorIsbn(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(new Isbn(isbn))) {
                return libro;
            }
        }
        return null;
    }


    public void agregarLibro(String isbn, String titulo, String autor, int cantidad) {
        this.libros.add(new Libro(new Isbn(isbn), titulo, autor, cantidad));
        this.notificar(Evento.LIBRO_AGREGADO);
    }

    public void prestar(String isbn) {
        Libro libro = this.buscarLibrosPorIsbn(isbn);
        if(libro != null){
            libro.prestar();
        }
    }

    public void devolver(String isbn) {
        Libro libro = this.buscarLibrosPorIsbn(isbn);
        if(libro != null){
            libro.devolver();
        }
    }


    public List<ILibro> listarLibros() {
        List<ILibro> libros = new ArrayList<>();
        for (Libro libro : this.libros){
            libros.add(libro);
        }
        return  libros;
    }

    @Override
    public void agregarObservador(Observador observador) {
        if(!this.observadores.contains(observador)){
            this.observadores.add(observador);
        }
    }

    @Override
    public void notificar(Evento evento) {
        for (Observador observador: this.observadores){
            observador.notificar(evento);
        }
    }
}

