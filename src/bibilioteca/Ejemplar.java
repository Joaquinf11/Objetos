package bibilioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Ejemplar {
    private Libro libro;
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


    public void agregarEjemplar(Libro nuevoLibro){
        if (Objects.equals(libro.getTitulo(),nuevoLibro.getTitulo())) {
            this.libro= nuevoLibro;
            this.ejemplares_disponibles++;
            if (getEjemplares_prestados()==1){
                this.disponible=false;
            }
        }
    }

    public void sacarEjemplar(Libro viejoLibro){
        if (Objects.equals(libro.getTitulo(),viejoLibro.getTitulo()) && getEjemplares_disponibles() > 1){
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
