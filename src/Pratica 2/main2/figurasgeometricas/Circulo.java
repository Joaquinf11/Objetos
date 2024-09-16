package figurasgeometricas;

import static java.lang.Math.pow;

public class Circulo extends DosDimensiones{
    private double radio;
    private final double PI= 3.14;

    public Circulo(String nombre,double radio){
        super(nombre);
        this.radio=radio;
        setArea(this.calcularArea());
    }

    public double calcularArea(){
        return PI* (pow(radio,2));
    }


}
