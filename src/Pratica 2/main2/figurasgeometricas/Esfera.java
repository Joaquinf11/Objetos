package figurasgeometricas;

import static java.lang.Math.pow;

public class Esfera extends  TresDimensiones{
    private final double PI=3.14;
    private double radio;

    public  Esfera(String nombre,double radio){
        super(nombre);
        this.radio=radio;
        setArea(this.calcularArea());
        setVolumen(this.calcularVolumen());
    }

    public double calcularArea(){
        return  4 * PI * pow(radio,2);
    }

    public double calcularVolumen(){
        return ((double) 4 /3) * PI * pow(radio,3);
    }
}
