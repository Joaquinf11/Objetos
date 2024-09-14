package agenciaturismo;

import java.util.ArrayList;

public class Paquete {
    private String destino;
    private Proveedor transporte;
    private Proveedor hospedaje;
    private ArrayList<Proveedor> excursiones;

    public Paquete( String destino, Proveedor transporte, Proveedor hospedaje) {
        this.destino = destino;
        this.transporte = transporte;
        this.hospedaje = hospedaje;
        this.excursiones = new ArrayList<>();
    }

    public void agregarExcursion(Proveedor excursion){
        this.excursiones.add(excursion);
    }
}
