package localderopa;

public class TarjetaDorada extends Tarjeta{

    @Override
    public double calcularPrecioFinal(double precio){
        return ((precio - (1.5 * precio) / 100) - 100);
    }
}
