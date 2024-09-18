package repuestosproductos;

import java.util.HashMap;

public class Stock {
    private HashMap<Producto, Integer> stock;

    public Stock() {
        this.stock = new HashMap<>();
    }

    public boolean hayDisponible(Producto producto, int cantidad){
        return this.stock.containsKey(producto) &&
                this.stock.get(producto) >= cantidad;
    }

    public void agregarStock(Producto producto, int cantidad){
        if(this.stock.containsKey(producto)) {
            this.stock.put(producto, this.stock.get(producto) + cantidad);
        }
        else{
            this.stock.put(producto,cantidad);
        }
    }

    public void descontarStock(Producto producto, int cantidad){
        if(this.stock.containsKey(producto)){
            this.stock.put(
                    producto,
                    this.stock.get(producto) - cantidad
            );
        }
        //aca creo que prodia haber un trowhs ExceptioN porque si no esta en el stock no lo puedo descontar pero como lo manejo?
    }
}
