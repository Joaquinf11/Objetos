package ar.edu.unlu.poo.biblioteca.vistas;

import java.util.Scanner;

public class VistaDevolucionLibro extends Vista {
    public int solicitarIdLibro() {
        Scanner scanner = new Scanner(System.in);
        mostrarMensaje("Ingrese el ID del libro que desea devolver:");
        return scanner.nextInt();
    }

    public void mostrarResultadoDevolucionExitosa() {
        mostrarMensaje("Devolución exitosa. El ejemplar ha sido devuelto.");
    }

    public void mostrarResultadoDevolucionFallida() {
        mostrarMensaje("No se pudo realizar la devolución. No hay ejemplares prestados.");
    }
}


