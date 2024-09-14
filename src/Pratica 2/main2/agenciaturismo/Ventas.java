package agenciaturismo;

import java.time.LocalDate;

public class Ventas {
    private Paquete paquete;
    private Cliente cliente;
    private LocalDate fecha;

    public Ventas(Paquete paquete, Cliente cliente) {
        this.paquete = paquete;
        this.cliente = cliente;
        this.fecha = LocalDate.now();
    }
}
