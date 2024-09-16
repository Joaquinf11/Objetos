package figurasgeometricas;

public class Cuadrado extends DosDimensiones{
    private double lado;

    public Cuadrado(String nombre,double lado) {
        super(nombre);
        this.lado=lado;
        setArea(this.calcularArea());
    }

    public double calcularArea(){
        return this.lado * this.lado;
    }

}
