package localderopa;

public class Conjunto2x1 extends Conjunto{

    public Conjunto2x1(Remera remera, Prenda prenda){
        super(remera,prenda);
    }

    @Override
    public double calcularPrecio(){
        double precioPrenda= this.getPrenda().calcularPrecio();
        double precioRemera= this.getRemera().calcularPrecio();
        if (precioRemera > precioPrenda){
            return precioPrenda;
        }
        else {
            return precioRemera;
        }
    }
}
