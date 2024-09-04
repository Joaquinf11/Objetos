package billetera;

public class Moneda {
    private double cotizacion;
    private final String nombreMoneda;

    public Moneda(String nombreMoneda, double cotizacionMoneda) {
        this.cotizacion = cotizacionMoneda;
        this.nombreMoneda = nombreMoneda;
    }

    public double getCotizacion() {
        return cotizacion;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setCotizacion(double cotizacion) {
        this.cotizacion = cotizacion;
    }
}
