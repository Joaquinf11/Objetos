package mvcLibro.controlador;

import mvcLibro.modelo.Biblioteca;
import mvcLibro.modelo.Evento;
import mvcLibro.modelo.ILibro;
import mvcLibro.observer.Observador;
import mvcLibro.vista.VistaConsola;

import java.util.List;

public class Controlador implements Observador {
    private VistaConsola vista;

    private Biblioteca biblioteca;

    public Controlador(Biblioteca biblioteca, VistaConsola vista) {
        vista.registrarControlador(this);
        this.vista = vista;
        this.biblioteca = biblioteca;
    }

    @Override
    public void notificar(Evento evento) {
        switch (evento){
            case LIBRO_AGREGADO:
                List<ILibro> libros = this.biblioteca.listarLibros();
                this.vista.mostrarLibros(libros);
                break;
        }
    }

    public void iniciar() {
        this.vista.mostrarMenuInicial();
    }

    public void agregarLibro(String isbn, String titulo, String autor, Integer cantidad) {
        this.biblioteca.agregarLibro(
                isbn,
                titulo,
                autor,
                cantidad
        );
    }
}
