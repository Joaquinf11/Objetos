package figurasgeometricas;

public class TresDimensiones extends Figura{
    private double volumen;

    public TresDimensiones(String nombre){
        super(nombre);
    }

    public double getVolumen() {
        return this.volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}
