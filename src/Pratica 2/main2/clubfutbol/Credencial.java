package clubfutbol;

import java.util.ArrayList;

public class Credencial {
    private TipoSuscripcion suscripcion;
    private ArrayList<Actividad> actividades;

    public Credencial(TipoSuscripcion suscripcion) {
        this.suscripcion = suscripcion;
        this.actividades= new ArrayList<>();
    }

    public TipoSuscripcion getSuscripcion(){
        return this.suscripcion;
    }

    public void agregarActividad(Actividad actividad){
        this.actividades.add(actividad);
    }


}
