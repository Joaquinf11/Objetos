package bibilioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Socio {
    private final String nombreSocio;
    private final int idSocio;
    private Prestamo[] prestamos;

    public Socio(String nombre,int idSocio) {
        this.nombreSocio = nombre;
        this.idSocio=idSocio;
        this.prestamos=new Prestamo[0];
    }

    public int getIdSocio() {
        return idSocio;
    }



    public String getNombreSocio() {
        return this.nombreSocio;
    }

    public Prestamo[] getPrestamos() {
        return this.prestamos;
    }

    public Prestamo getPrestamo(int idPrestamo){
        for (Prestamo prestamo: prestamos){
            if (prestamo.getIdPrestamo() == idPrestamo){
                return prestamo;
            }
        }
        return null;
    }
}
