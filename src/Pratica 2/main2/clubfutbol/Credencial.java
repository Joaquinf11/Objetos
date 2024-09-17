package clubfutbol;

import java.util.ArrayList;

public class Credencial {
    private TipoSuscripcion suscripcion;
    private ArrayList<Actividad> actividades;

    public Credencial(String suscripcion) {
        this.suscripcion= TipoSuscripcion.toTipoSuscripcion(suscripcion);
        this.actividades= new ArrayList<>();
    }

    public TipoSuscripcion getSuscripcion(){
        return this.suscripcion;
    }


    public void agregarActividad(Actividad actividad){
        this.actividades.add(actividad);
    }


    public Actividad getActividad(String nombre){
        for (Actividad actividad : actividades){
            if (actividad.getNombre().equals(nombre)){
                return actividad;
            }
        }
        return null;
    }

}
