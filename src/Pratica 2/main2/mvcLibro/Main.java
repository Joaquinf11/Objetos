package mvcLibro;

import mvcLibro.controlador.Controlador;
import mvcLibro.modelo.Biblioteca;
import mvcLibro.vista.VistaConsola;

public class Main {

        public static void main(String[] args) {
            // Modelo
            Biblioteca biblioteca = new Biblioteca();
            // Vista
            VistaConsola vista = new VistaConsola();
            // Controlador
            Controlador controlador = new Controlador(biblioteca, vista);
            biblioteca.agregarObservador(controlador);
            controlador.iniciar();
        }


}
