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


    public void mostrarRaices() {
        if (raices == null) {
            System.out.println("No tiene raices reales");
        } else {
            System.out.print("[");
            for (double raiz : raices) {
                System.out.print(raiz+ "\t" );
            }
            System.out.println("]");
        }
    }

     public static void main(String [] args){
        Polinomio polinomio= new Polinomio(1,-5,6);  //2 raices
     //   Polinomio polinomio= new Polinomio(1,-4,4);  //1 raiz
     //   Polinomio polinomio= new Polinomio(1,4,5);   //sin raices

         Calculadora calculadora= new Calculadora(polinomio);
         double[] raices_pol1 =calculadora.getPolinomio().calcularRaices();
         calculadora.setRaices(raices_pol1);
         calculadora.mostrarRaices();
     }
}

