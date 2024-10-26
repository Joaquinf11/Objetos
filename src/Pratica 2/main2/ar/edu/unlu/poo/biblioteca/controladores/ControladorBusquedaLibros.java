package ar.edu.unlu.poo.biblioteca.controladores;

import ar.edu.unlu.poo.biblioteca.modelos.Libro;
import ar.edu.unlu.poo.biblioteca.modelos.ModeloLibros;
import ar.edu.unlu.poo.biblioteca.vistas.VistaBusquedaLibros;

import java.util.ArrayList;
import java.util.List;

public class ControladorBusquedaLibros {
    private VistaBusquedaLibros vista;
    private ModeloLibros modelo;

    public ControladorBusquedaLibros(VistaBusquedaLibros vista, ModeloLibros modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciarBusqueda() {
        String opcionBusqueda = vista.solicitarOpcionBusqueda();

        if (opcionBusqueda.equals("1")) {
            // Búsqueda por título
            String titulo = vista.solicitarTituloParaBusqueda();
            List<Libro> librosEncontrados = modelo.buscarLibrosPorTitulo(titulo);

            if (!librosEncontrados.isEmpty()) {
                vista.mostrarResultadosBusqueda(librosEncontrados);
            } else {
                vista.mostrarMensaje("No se encontraron libros con ese título.");
            }
        } else if (opcionBusqueda.equals("2")) {
            // Otras opciones de búsqueda
            // ...
        } else if (opcionBusqueda.equals("3")) {
            List<Libro> todosLosLibros = modelo.obtenerTodosLosLibros();
            vista.mostrarResultadosBusqueda(todosLosLibros);
        }  else if (opcionBusqueda.equals("4")) {
            String id = vista.solicitarIdParaBusqueda();
            Libro libro = modelo.obtenerLibroPorId(Integer.parseInt(id));
            ArrayList<Libro> libros = new ArrayList<>();
            libros.add(libro);
            vista.mostrarResultadosBusqueda(libros);
        } else if (opcionBusqueda.equals("0")) {
            vista.mostrarMensaje("Volviendo al menú anterior.");
        } else {
            vista.mostrarMensaje("Opción de búsqueda no válida.");
        }
    }
}
