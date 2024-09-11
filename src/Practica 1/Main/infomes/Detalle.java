package infomes;

public class Detalle {
    private Producto producto;
    private int cantidad;

    public Detalle(Producto producto,int cantidad){
        this.producto=producto;
        this.cantidad=cantidad;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void agregarCantidad(int cantidad){
        this.cantidad += cantidad;
    }
}
