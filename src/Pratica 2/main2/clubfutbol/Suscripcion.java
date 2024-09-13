package clubfutbol;

import java.util.ArrayList;

public class Suscripcion {
    private TipoSuscripcion tipo;
    private ArrayList<String> actividades;

    public Suscripcion(String tipo) {
         setSuscripcion(tipo);
         this.actividades= new ArrayList<>();
    }

    public void setSuscripcion(String tipoSuscripcion){
        if (tipoSuscripcion.equals("Basica")){
            this.tipo= TipoSuscripcion.BASICA;
        }
        if (tipoSuscripcion.equals("Intermedia")){
            this.tipo= TipoSuscripcion.INTERMEDIA;
        }if (tipoSuscripcion.equals("Destacada")){
            this.tipo= TipoSuscripcion.DESTACADA;
        }
    }

    public void agregarActividades
}
