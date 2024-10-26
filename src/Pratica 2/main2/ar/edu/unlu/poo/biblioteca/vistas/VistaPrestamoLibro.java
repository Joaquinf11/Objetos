package ar.edu.unlu.poo.biblioteca.vistas;

import java.util.Scanner;

public class VistaPrestamoLibro extends Vista {
    public int solicitarIdLibro() {
        Scanner scanner = new Scanner(System.in);
        mostrarMensaje("Ingrese el ID del libro que desea prestar:");
        return scanner.nextInt();
    }

    public void mostrarResultadoPrestamoExitoso() {
        mostrarMensaje("Prestamo exitoso. El libro ha sido prestado.");
    }

    public void mostrarResultadoPrestamoFallido() {
        mostrarMensaje("No se pudo realizar el préstamo. El libro no está disponible.");
    }
}

