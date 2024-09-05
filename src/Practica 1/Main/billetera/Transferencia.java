package billetera;

public class Transferencia {
    private final Billetera origen;
    private final Billetera destino;
    private Dinero monto;

    public Transferencia(Billetera origen, Billetera destino, Dinero monto) {
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;
    }

    public Billetera getOrigen() {
        return this.origen;
    }

    public Billetera getDestino() {
        return this.destino;
    }

    public Dinero getMonto() {
        return this.monto;
    }

    public void transferir(){
        if (getOrigen().desacreditar(getMonto())){
            getDestino().acreditar(getMonto());
        }
    }
}
