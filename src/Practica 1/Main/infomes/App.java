package infomes;

import java.util.ArrayList;

public class App {
    private ArrayList <Orden> ordenes;

    public App() {
        this.ordenes= new ArrayList<>();
    }

    public void agregarOrden (int numeroOrden){
        this.ordenes.add(new Orden(numeroOrden));
    }

    public int ordenesAceptadas(){
        int contador = 0;
        for (Orden orden : ordenes){
            if (orden.getEstado() == EstadoOrden.ACEPTADA){
                contador++;
            }
        }
        return contador;
    }
    public int ordenesRechazadas(){
        int contador = 0;
        for (Orden orden : ordenes){
            if (orden.getEstado() == EstadoOrden.RECHAZADA){
                contador++;
            }
        }
        return contador;
    }

    public void generarInforme(){
        int aceptadas= ordenesAceptadas();
        int rechazadas= ordenesRechazadas();
        System.out.println("Las cantidad de ordenes aceptas son " + aceptadas +
                    " y las rechazadas son " + rechazadas);
    }
}
