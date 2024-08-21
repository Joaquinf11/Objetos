package bibilioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Ejemplar {
    private final Libro libro;
    private boolean disponible;
    private int ejemplares_prestados;
    private int ejemplares_disponibles;

    public Ejemplar(Libro libro) {
        this.libro = libro;
        this.ejemplares_prestados=0;
        this.ejemplares_disponibles=1;
        this.disponible=false;
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

    public void sumarEjemplar(){
        this.ejemplares_disponibles++;
        if (ejemplares_disponibles > 1){
            this.disponible=true;
        }
    }


    public void restarEjemplar(){
        if (getEjemplares_disponibles() > 1){
            this.ejemplares_disponibles--;
            this.ejemplares_prestados++;
            if (getEjemplares_prestados()==1){
                this.disponible=false;
            }
        }
        else{
            System.out.println("No se puede prestar libro porque solo queda uno");
        }
    }

}
