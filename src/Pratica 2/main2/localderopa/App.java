package localderopa;

import java.util.ArrayList;
import java.util.Objects;

public class App {
    public ArrayList<MedioDePago> medioDePagos;
    public ArrayList<Prenda> prendas;
    public ArrayList<Conjunto> conjuntos;

    public App() {
        this.medioDePagos = new ArrayList<>();
        this.prendas = new ArrayList<>();
    }

    public void agregarMedioDePago(MedioDePago medio){
        this.medioDePagos.add(medio);
    }

    public void agregarPrenda(Prenda prenda){
        this.prendas.add(prenda);
    }

    public MedioDePago buscarMedioDePago(MedioDePago medio){
        for( MedioDePago resultado : medioDePagos){
            if(Objects.equals(medio,resultado)) {
                return resultado;
            }
        }
        return null;
    }

    public Prenda buscarPrenda(Prenda prenda){
        for( Prenda resultado : prendas){
            if(Objects.equals(prenda,resultado)) {
                return resultado;
            }
        }
        return null;
    }

    public double precioPrendaConMedioDePago(Prenda prenda, MedioDePago medio){
        return  medio.calcularPrecioFinal(prenda.calcularPrecio());
    }
}
