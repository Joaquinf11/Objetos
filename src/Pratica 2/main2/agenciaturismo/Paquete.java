package agenciaturismo;

import java.util.ArrayList;

public class Paquete {
    private Cliente cliente;
    private String destino;
    private Proveedor transporte;
    private Proveedor hospedaje;
    private ArrayList<Proveedor> excursiones;

    public Paquete(Cliente cliente, String destino, Proveedor transporte, Proveedor hospedaje) {
        this.cliente = cliente;
        this.destino = destino;
        this.transporte = transporte;
        this.hospedaje = hospedaje;
        this.excursiones = new ArrayList<>();
    }

    public void agregarExcursion(Proveedor excursion){
        this.excursiones.add(excursion);
    }
}
