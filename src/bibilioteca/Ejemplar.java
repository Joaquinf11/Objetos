package bibilioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Ejemplar {
    private ArrayList<Libro> libros;
    private boolean disponible;
    private int ejemplares_prestados;
    private int ejemplares_disponibles;

    public Ejemplar() {
        this.libros = new ArrayList<Libro>();
        this.ejemplares_prestados=0;
        this.ejemplares_disponibles=0;
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

    public Ejemplar buscarEjemplar(ArrayList<Ejemplar> ejemplares,Libro libro){
        for (Ejemplar ejemplar: ejemplares){
            if (Objects.equals(libro.buscarLibro(libros,libro.getTitulo()).getTitulo(), libro.getTitulo())){
                    return ejemplar;
            }
        }
        return null;
    }

    public void agregarEjemplar(ArrayList<Ejemplar>ejemplares,Ejemplar ejemplar ){
        ejemplares.add(ejemplar);
    }

}
