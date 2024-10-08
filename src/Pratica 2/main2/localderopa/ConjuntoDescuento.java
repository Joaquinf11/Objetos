package localderopa;

public class ConjuntoDescuento extends Conjunto{
    private double descuento;

    public ConjuntoDescuento(Remera remera,Prenda prenda,double descuento){
        super(remera,prenda);
        this.descuento= descuento;
    }

    @Override
    public double calcularPrecio() {
        double resultado= this.getPrenda().calcularPrecio() + this.getRemera().calcularPrecio();
        return resultado - ((resultado / 100) * this.descuento);
    }
}
