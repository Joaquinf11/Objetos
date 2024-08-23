package bibilioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Ejemplar {
    private final Libro libro;
    private boolean disponible;
    private  Prestamo prestamo;

    public Ejemplar(Libro libro) {
        this.libro = libro;
        this.disponible= true;
    }


    public Libro getLibro() {
        return this.libro;
    }



    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible= disponible;
    }


    public void setPrestamo(Prestamo prestamo){
        this.prestamo=prestamo;
    }




}
