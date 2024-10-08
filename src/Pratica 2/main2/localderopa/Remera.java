package localderopa;

public class Remera extends Prenda{

    public Remera(double precioLista){
        super(precioLista);
    }

    @Override
    public double calcularPrecio() {
        double precioLista= getPrecioLista();
        precioLista += 100;
        return  precioLista + (precioLista/100) * getPorcentajeGanancia();
    }


}
