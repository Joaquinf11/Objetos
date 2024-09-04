package billetera;

public class Dinero {
    private double monto;
    private Moneda moneda;

    public Dinero(double monto, String nombreMoneda,double cotizacionMoneda) {
        this.monto = monto;
        this.moneda = new Moneda(nombreMoneda,cotizacionMoneda);
    }

    public double getMonto() {
        return monto;
    }

    public Moneda getMoneda() {
        return moneda;
    }
}
