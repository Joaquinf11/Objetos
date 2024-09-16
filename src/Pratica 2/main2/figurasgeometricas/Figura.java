package figurasgeometricas;

public class Figura {
    private double area;
    private String nombre;

    public Figura(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area){
        this.area=area;
    }

}
