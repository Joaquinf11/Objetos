package infomes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Orden {
    private LocalDate fecha;
    private int numeroOrden;
    private ArrayList<Detalle> detalles;
    private EstadoOrden estado;

    public Orden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
        this.fecha= LocalDate.now();
        this.estado= EstadoOrden.SIN_PROCESAR;
        this.detalles= new ArrayList<>();
    }

    public void agregarProducto(Producto producto,int cantidad) {
        if (hasProducto(producto)) {
            this.detalles.add(new Detalle(producto, cantidad));
        }
        else {
            Detalle actual=buscarProducto(producto);
            actual.agregarCantidad(cantidad);
        }
    }

    public boolean hasProducto(Producto producto){
        for (Detalle detalle : detalles){
            if(Objects.equales(detalle.getProducto()))
        }
    }

}
