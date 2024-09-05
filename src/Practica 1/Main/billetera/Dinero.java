package billetera;

import java.text.DecimalFormat;

public class Dinero {
    private double monto;
    private Moneda moneda;

    public Dinero(double monto, Moneda moneda) {
        this.monto = Math.round(monto * 100.0) / 100.0; //redondea a dos decimales
        this.moneda = moneda;
    }

    public double getMonto() {
        return this.monto;
    }

    public Moneda getMoneda() {
        return this.moneda;
    }
}
