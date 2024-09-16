package figurasgeometricas;

public class Paralelepipedo extends TresDimensiones{
    private double[] aristas;

    public  Paralelepipedo(String nombre,double arista1,double arista2,double arista3){
        super(nombre);
        this.aristas= new double[3];
        this.aristas[0] = arista1;
        this.aristas[1] = arista2;
        this.aristas[2] = arista3;
        setArea(this.calcularArea());
        setVolumen(this.calcularVolumen());
    }

    public double calcularArea(){
        return 2 * (this.aristas[0] * this.aristas[1] + this.aristas[0] * this.aristas[2] + this.aristas[1] * this.aristas[2]);
    }

    public double calcularVolumen(){
        return this.aristas[0] * this.aristas[1] * this.aristas[2];
    }
}
