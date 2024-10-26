package ar.edu.unlu.poo.biblioteca.vistas;

import ar.edu.unlu.poo.biblioteca.modelos.Libro;

import java.util.Scanner;

public class VistaAltaLibro extends Vista {
    public Libro solicitarDatosLibro() {
        Scanner scanner = new Scanner(System.in);
        mostrarMensaje("Ingrese los datos del nuevo libro:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Número de ejemplares disponibles: ");
        int ejemplaresDisponibles = scanner.nextInt();

        return new Libro(titulo, autor, ejemplaresDisponibles);
    }
}
