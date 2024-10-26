package ar.edu.unlu.poo.biblioteca.controladores;

import ar.edu.unlu.poo.biblioteca.modelos.Libro;
import ar.edu.unlu.poo.biblioteca.modelos.ModeloLibros;
import ar.edu.unlu.poo.biblioteca.vistas.VistaAltaLibro;

public class ControladorAltaLibro {
    private VistaAltaLibro vista;
    private ModeloLibros modelo;

    public ControladorAltaLibro(VistaAltaLibro vista, ModeloLibros modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciarAlta() {
        Libro nuevoLibro = vista.solicitarDatosLibro();
        modelo.agregarLibro(nuevoLibro);
        vista.mostrarMensaje("Libro agregado con éxito. ID: " + nuevoLibro.getId());
    }
}
