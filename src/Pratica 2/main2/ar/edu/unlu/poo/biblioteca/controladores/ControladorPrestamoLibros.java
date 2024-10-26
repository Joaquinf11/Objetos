package ar.edu.unlu.poo.biblioteca.controladores;

import ar.edu.unlu.poo.biblioteca.modelos.Libro;
import ar.edu.unlu.poo.biblioteca.modelos.ModeloLibros;
import ar.edu.unlu.poo.biblioteca.vistas.VistaPrestamoLibro;

public class ControladorPrestamoLibros {
    private VistaPrestamoLibro vista;
    private ModeloLibros modelo;

    public ControladorPrestamoLibros(VistaPrestamoLibro vista, ModeloLibros modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciarPrestamo() {
        int idLibro = vista.solicitarIdLibro();
        Libro libro = modelo.obtenerLibroPorId(idLibro);

        if (libro != null) {
            if (libro.estaDisponible()) {
                libro.prestar();
                vista.mostrarResultadoPrestamoExitoso();
            } else {
                vista.mostrarResultadoPrestamoFallido();
            }
        } else {
            vista.mostrarMensaje("El libro con ID " + idLibro + " no existe.");
        }
    }
}

