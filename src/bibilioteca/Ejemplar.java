package bibilioteca;

import java.util.ArrayList;

public class Ejemplar {
    private final Libro libro;
    private boolean disponible;
    private int ejemplares_prestados;
    private int ejemplares_disponibles;

    public Ejemplar(Libro libro, boolean disponible) {
        this.libro = libro;
        this.disponible = disponible;
        this.ejemplares_prestados=0;
        this.ejemplares_disponibles=0;
    }

    public Libro getLibro() {
        return this.libro;
    }

    public int getEjemplares_prestados() {
        return this.ejemplares_prestados;
    }

    public int getEjemplares_disponibles() {
        return this.ejemplares_disponibles;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(){
        this.disponible= ejemplares_disponibles > 1;
    }

    public void restarEjemplar(){
        this.ejemplares_disponibles--;
        this.ejemplares_prestados++;
    }

    public void sumarEjemplar(){
        this.ejemplares_disponibles++;
        this.ejemplares_prestados--;
    }


}
