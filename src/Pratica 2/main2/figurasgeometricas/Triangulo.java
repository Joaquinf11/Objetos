package figurasgeometricas;

public class Triangulo extends DosDimensiones{
    private double base;
    private double altura;

    public Triangulo(String nombre,double base, double altura){
        super(nombre);
        this.base=base;
        this.altura=altura;
        setArea(this.calcularArea());

    }

    public double calcularArea(){
        return (base * altura) / 2;
    }
}
