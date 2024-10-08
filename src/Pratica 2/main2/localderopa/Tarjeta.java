package localderopa;

public class Tarjeta implements MedioDePago {
    @Override
    public double calcularPrecioFinal(double precio) {
        return  precio /  100 + precio;
    }
}
