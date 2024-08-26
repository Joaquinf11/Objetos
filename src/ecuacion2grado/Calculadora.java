package ecuacion2grado;

public class Calculadora {
    Polinomio polinomio;
    double[] raices;

    public Calculadora(Polinomio polinomio) {
        this.polinomio = polinomio;
    }

    public Polinomio getPolinomio() {
        return this.polinomio;
    }

    public double[] getRaices() {
        return raices;
    }

    public void setRaices(double[] raices) {
        this.raices = raices;
    }


    public void mostrarRaices(){
        System.out.print("[");
        for (double raiz : raices){
            System.out.print(raiz + "\t");
        }
        System.out.println("]");
    }

    Calculadora calculadora= new Calculadora(new Polinomio(1,1,1));

     double[] raices_pol1 =calculadora.getPolinomio().calcularRaices();

     calculadora.setRaices(raices_pol1);


}
