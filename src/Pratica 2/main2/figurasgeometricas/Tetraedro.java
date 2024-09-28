package figurasgeometricas;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Tetraedro extends TresDimensiones{
    private double arista;

    public Tetraedro(double arista){
        this.arista=arista;

    }

    @Override
    public double calcularArea(){
        return sqrt(3) * pow(this.arista,2);
    }

    @Override
    public double calcularVolumen(){
        return (sqrt(3)/12) * pow(this.arista,3);
    }

}
