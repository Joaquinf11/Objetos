package figurasgeometricas;

public class Paralelepipedo extends TresDimensiones{
    private double[] aristas;

    public  Paralelepipedo(double arista1,double arista2,double arista3){
        this.aristas= new double[3];
        this.aristas[0] = arista1;
        this.aristas[1] = arista2;
        this.aristas[2] = arista3;

    }

    @Override
    public double calcularArea(){
        return 2 * (this.aristas[0] * this.aristas[1] + this.aristas[0] * this.aristas[2] + this.aristas[1] * this.aristas[2]);
    }

    @Override
    public double calcularVolumen(){
        return this.aristas[0] * this.aristas[1] * this.aristas[2];
    }
}
