package palabras;

import java.util.ArrayList;

public class Jugador {
    private final String nombre;
    private ArrayList<Palabra> palabras;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }


}
