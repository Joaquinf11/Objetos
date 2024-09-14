package clubfutbol;

import java.util.ArrayList;

public class Actividad {
    private String nombre;
    private TipoSuscripcion nivelMinimo;

    public Actividad(String nombre, String nivelMinimo) {
        this.nombre = nombre;
        this.nivelMinimo= TipoSuscripcion.toTipoSuscripcion(nivelMinimo);
    }

    public TipoSuscripcion getNivelMinimo(){
        return  this.nivelMinimo;
    }

    public String getNombre(){
        return this.nombre;
    }


}
