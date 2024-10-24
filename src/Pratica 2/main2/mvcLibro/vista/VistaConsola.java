package mvcLibro.vista;

import mvcLibro.controlador.Controlador;
import mvcLibro.modelo.ILibro;

import java.util.List;
import java.util.Scanner;

public class VistaConsola {
    private Controlador controlador;

    private Scanner scanner;

    public VistaConsola() {
        this.scanner = new Scanner(System.in);
    }

    public void registrarControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenuInicial() {
        System.out.println("Ingrese el ISBN");
        String isbn = this.scanner.nextLine();
        System.out.println("Ingrese el título");
        String titulo = this.scanner.nextLine();
        System.out.println("Ingrese el autor");
        String autor = this.scanner.nextLine();
        System.out.println("Ingrese la cantidad de ejemplares");
        Integer cantidad = this.scanner.nextInt();
        this.controlador.agregarLibro(
                isbn,
                titulo,
                autor,
                cantidad
        );
    }

    public void mostrarLibros(List<ILibro> libros) {
        for (ILibro libro: libros) {
            System.out.println(
                    libro.getIsbn() + "," +
                            libro.getAutor()
            );
        }
    }
}
