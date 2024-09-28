package figurasgeometricas;

import static java.lang.Math.pow;

public class Cubo extends TresDimensiones{
    private double arista;

    public Cubo(double artista){
        this.arista= artista;
    }

    @Override
    public double calcularArea(){
        return 6 * pow(this.arista,2);
    }

    @Override
    public double calcularVolumen(){
        return pow(this.arista,3);
    }
}
