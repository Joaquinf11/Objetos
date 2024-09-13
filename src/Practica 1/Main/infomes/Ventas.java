package infomes;

import java.util.ArrayList;

public class Ventas {
    private ArrayList <Orden> ordenes;
    private Stock stock;

    public Ventas() {
        this.ordenes= new ArrayList<>();
        this.stock= new Stock();
    }

    public void agregarOrden (int numeroOrden){
        this.ordenes.add(new Orden(numeroOrden));
    }

    public void procesarOrdenes(){
        for (Orden orden : ordenes){
            if(orden.getEstado()== EstadoOrden.SIN_PROCESAR){
                for (Detalle detalle : orden.getDetalles()){
                    if (this.stock.hayDisponible(detalle.getProducto(),detalle.getCantidad())){
                        mantenerStock(detalle.getProducto(),detalle.getCantidad());
                    }
                    else {
                        orden.rechazar();
                        return;
                    }
                }
                orden.aceptar();
            }
        }
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

    public void altaStock(Producto producto,int cantidad){
        this.stock.agregarStock(producto,cantidad);
    }

    public void mantenerStock(Producto producto,int cantidad){
        this.stock.descontarStock(producto,cantidad);
    }

    public void generarInforme(){
        int aceptadas= ordenesAceptadas();
        int rechazadas= ordenesRechazadas();
        System.out.println("Las cantidad de ordenes aceptas son " + aceptadas +
                    " y las rechazadas son " + rechazadas);
    }
}
