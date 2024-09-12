package infomes;

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
        if(this.stock.containsKey(producto)){ //esta condicion creo que no hace falta porque sino agrega solo la cantidad y si el producto no esta tengo que hacer lo mismo
            this.stock.put(
                    producto,
                    this.stock.get(producto) + cantidad
            );
        }
    }

    public void descontarStock(Producto producto, int cantidad){
        if(this.stock.containsKey(producto)){
            this.stock.put(
                    producto,
                    this.stock.get(producto) - cantidad
            );
        }
    }
}
