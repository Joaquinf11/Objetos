package ar.edu.unlu.poo.biblioteca;

import ar.edu.unlu.poo.biblioteca.controladores.ControladorAltaLibro;
import ar.edu.unlu.poo.biblioteca.controladores.ControladorBusquedaLibros;
import ar.edu.unlu.poo.biblioteca.controladores.ControladorDevolucionLibros;
import ar.edu.unlu.poo.biblioteca.controladores.ControladorPrestamoLibros;
import ar.edu.unlu.poo.biblioteca.modelos.Libro;
import ar.edu.unlu.poo.biblioteca.modelos.ModeloLibros;
import ar.edu.unlu.poo.biblioteca.vistas.VistaAltaLibro;
import ar.edu.unlu.poo.biblioteca.vistas.VistaBusquedaLibros;
import ar.edu.unlu.poo.biblioteca.vistas.VistaDevolucionLibro;
import ar.edu.unlu.poo.biblioteca.vistas.VistaPrestamoLibro;

import java.util.Scanner;

public class SistemaBibliotecaApp {
    public static void main(String[] args) {
        ModeloLibros modelo = new ModeloLibros();

        Libro libro1 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", 10);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 15);
        Libro libro3 = new Libro("1984", "George Orwell", 8);
        Libro libro4 = new Libro("To Kill a Mockingbird", "Harper Lee", 12);
        Libro libro5 = new Libro("Matar un ruiseñor", "Harper Lee", 9);
        Libro libro6 = new Libro("Dune", "Frank Herbert", 8);
        Libro libro7 = new Libro("Fundación", "Isaac Asimov", 10);
        Libro libro8 = new Libro("Neuromante", "William Gibson", 6);
        Libro libro9 = new Libro("Segunda Fundación", "Isaac Asimov", 7);
        Libro libro10 = new Libro("¿Sueñan los androides con ovejas eléctricas?", "Philip K. Dick", 9);

        modelo.agregarLibro(libro1);
        modelo.agregarLibro(libro2);
        modelo.agregarLibro(libro3);
        modelo.agregarLibro(libro4);
        modelo.agregarLibro(libro5);
        modelo.agregarLibro(libro6);
        modelo.agregarLibro(libro7);
        modelo.agregarLibro(libro8);
        modelo.agregarLibro(libro9);
        modelo.agregarLibro(libro10);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Búsqueda de Libros");
            System.out.println("2. Alta de Libro");
            System.out.println("3. Préstamo de Libro");
            System.out.println("4. Devolución de Libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    VistaBusquedaLibros vistaBusqueda = new VistaBusquedaLibros();
                    ControladorBusquedaLibros controladorBusqueda = new ControladorBusquedaLibros(vistaBusqueda, modelo);
                    controladorBusqueda.iniciarBusqueda();
                    break;
                case 2:
                    VistaAltaLibro vistaAlta = new VistaAltaLibro();
                    ControladorAltaLibro controladorAlta = new ControladorAltaLibro(vistaAlta, modelo);
                    controladorAlta.iniciarAlta();
                    break;
                case 3:
                    VistaPrestamoLibro vistaPrestamo = new VistaPrestamoLibro();
                    ControladorPrestamoLibros controladorPrestamo = new ControladorPrestamoLibros(vistaPrestamo, modelo);
                    controladorPrestamo.iniciarPrestamo();
                    break;
                case 4:
                    VistaDevolucionLibro vistaDevolucion = new VistaDevolucionLibro();
                    ControladorDevolucionLibros controladorDevolucion = new ControladorDevolucionLibros(vistaDevolucion, modelo);
                    controladorDevolucion.iniciarDevolucion();
                    break;
                case 5:
                    System.out.println("Gracias por usar el Sistema de Gestión de Biblioteca. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        }
    }
}


