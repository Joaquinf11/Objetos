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

    public EstadoOrden getEstado() {
        return estado;
    }

    public void aceptar(){
        this.estado=EstadoOrden.ACEPTADA;
    }

    public void rechazar(){
        this.estado=EstadoOrden.RECHAZADA;
    }

    public void agregarProducto(Producto producto,int cantidad) {
        Detalle detalle= buscarDetalle(producto);
        if (detalle == null) {
            this.detalles.add(new Detalle(producto, cantidad));
        }
        else {
            detalle.agregarCantidad(cantidad);
        }
    }

    //lo use para agregar producto pero creo que no es necesario lo dejo por las du
//    public boolean hasProducto(Producto producto){
//        for (Detalle detalle : detalles){
//            if(detalle.getProducto().getNombre().equals(producto.getNombre())){
//                return true;
//            }
//        }
//        return false;
//    }

    public Detalle buscarDetalle(Producto producto){
        for (Detalle detalle : detalles){
            if(detalle.getProducto().getNombre().equals(producto.getNombre())){
                return detalle;
            }
        }
        return null;
    }

}
