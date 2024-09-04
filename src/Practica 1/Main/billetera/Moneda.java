package billetera;

public class Moneda {
    private double cotizacion;
    private String nombreMoneda;

    public Moneda(String nombreMoneda, double cotizacionMoneda) {
        this.cotizacion = cotizacionMoneda;
        this.nombreMoneda = nombreMoneda;
    }
}
