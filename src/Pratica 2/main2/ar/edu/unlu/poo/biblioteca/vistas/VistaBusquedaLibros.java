package ar.edu.unlu.poo.biblioteca.vistas;

import ar.edu.unlu.poo.biblioteca.modelos.Libro;

import java.util.List;
import java.util.Scanner;

public class VistaBusquedaLibros extends Vista {
    public String obtenerCriterioBusqueda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el criterio de búsqueda: ");
        return scanner.nextLine();
    }

    public void mostrarResultadoBusqueda(String resultado) {
        System.out.println("Resultados de la búsqueda:");
        System.out.println(resultado);
    }

    public String solicitarOpcionBusqueda() {
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú de opciones de búsqueda
        mostrarMensaje("Opciones de búsqueda:");
        mostrarMensaje("1. Búsqueda por título");
        mostrarMensaje("2. Búsqueda por autor");  // Agregar otras opciones si es necesario
        mostrarMensaje("3. Mostrar todos los libros");
        mostrarMensaje("4. Busqueda por ID");
        mostrarMensaje("0. Volver al menú anterior");
        mostrarMensaje("Seleccione una opción: ");

        return scanner.nextLine();
    }

    public String solicitarTituloParaBusqueda() {
        Scanner scanner = new Scanner(System.in);
        mostrarMensaje("Ingrese el título que desea buscar: ");
        return scanner.nextLine();
    }

    public String solicitarIdParaBusqueda() {
        Scanner scanner = new Scanner(System.in);
        mostrarMensaje("Ingrese el título que desea buscar: ");
        return scanner.nextLine();
    }

    public void mostrarResultadosBusqueda(List<Libro> librosEncontrados) {
        if (librosEncontrados.isEmpty()) {
            mostrarMensaje("No se encontraron libros con el criterio especificado.");
            return;
        }

        mostrarMensaje("Resultados de la búsqueda: ");
        int resultadosPorPagina = 3; // Puedes ajustar el número de resultados por página según tus preferencias.
        int paginaActual = 0;
        Scanner scanner = new Scanner(System.in);

        while (paginaActual * resultadosPorPagina < librosEncontrados.size()) {
            int inicio = paginaActual * resultadosPorPagina;
            int fin = Math.min((paginaActual + 1) * resultadosPorPagina, librosEncontrados.size());

            for (int i = inicio; i < fin; i++) {
                Libro libro = librosEncontrados.get(i);
                mostrarMensaje("ID: " + libro.getId());
                mostrarMensaje("Título: " + libro.getTitulo());
                mostrarMensaje("Autor: " + libro.getAutor());
                mostrarMensaje("Ejemplares disponibles: " + libro.getEjemplaresDisponibles());
                mostrarMensaje("-------------");
            }

            mostrarMensaje("Página " + (paginaActual + 1) + " de " + (librosEncontrados.size() / resultadosPorPagina + 1));
            mostrarMensaje("Presione Enter para ver más resultados o 'q' para salir.");

            String opcion = scanner.nextLine();
            if ("q".equalsIgnoreCase(opcion)) {
                break;
            }

            paginaActual++;
        }
    }
}
