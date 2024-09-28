package figurasgeometricas;

import static java.lang.Math.pow;

public class Circulo extends Figura{
    private double radio;
    private final double PI= 3.14;

    public Circulo(double radio){
        this.radio=radio;
    }

    @Override
    public double calcularArea(){
        return PI * (pow(radio,2));
    }


}
