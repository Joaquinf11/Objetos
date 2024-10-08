package localderopa;

public abstract class Conjunto implements Vendible {
    private Prenda prenda;
    private Remera remera;

    public Conjunto( Remera remera,Prenda prenda){
        this.prenda=prenda;
        this.remera=remera;
    }

    public Prenda getPrenda() {
        return this.prenda;
    }

    public Remera getRemera() {
        return this.remera;
    }
}
