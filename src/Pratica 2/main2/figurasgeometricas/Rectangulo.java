package figurasgeometricas;

public class Rectangulo extends DosDimensiones{
    private double base;
    private double altura;

    public Rectangulo(String nombre,double base,double altura) {
        super(nombre);
        this.base=base;
        this.altura=altura;
        setArea(this.calcularArea());
    }

    public double calcularArea(){
        return this.base * this.altura;
    }
}
