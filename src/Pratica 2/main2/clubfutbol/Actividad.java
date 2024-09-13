package clubfutbol;

import java.util.ArrayList;

public class Actividad {
    private String nombre;
    private TipoSuscripcion nivelMinimo;

    public Actividad(String nombre, TipoSuscripcion nivelMinimo) {
        this.nombre = nombre;
        this.nivelMinimo = nivelMinimo;
    }

    public TipoSuscripcion getNivelMinimo(){
        return  this.nivelMinimo;
    }

    public String getNombre(){
        return this.nombre;
    }
}
