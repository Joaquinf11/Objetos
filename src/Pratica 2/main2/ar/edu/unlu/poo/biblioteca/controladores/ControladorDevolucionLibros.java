package ar.edu.unlu.poo.biblioteca.controladores;

import ar.edu.unlu.poo.biblioteca.modelos.Libro;
import ar.edu.unlu.poo.biblioteca.modelos.ModeloLibros;
import ar.edu.unlu.poo.biblioteca.vistas.VistaDevolucionLibro;

public class ControladorDevolucionLibros {
    private VistaDevolucionLibro vista;
    private ModeloLibros modelo;

    public ControladorDevolucionLibros(VistaDevolucionLibro vista, ModeloLibros modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciarDevolucion() {
        int idLibro = vista.solicitarIdLibro();
        Libro libro = modelo.obtenerLibroPorId(idLibro);

        if (libro != null) {
            if (libro.hayPrestados()) {
                libro.devolver();
                vista.mostrarResultadoDevolucionExitosa();
            } else {
                vista.mostrarResultadoDevolucionFallida();
            }
        } else {
            vista.mostrarMensaje("El libro con ID " + idLibro + " no existe.");
        }
    }
}
