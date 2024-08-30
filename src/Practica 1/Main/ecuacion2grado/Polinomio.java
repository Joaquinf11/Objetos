package ecuacion2grado;

public class Polinomio {
    private final int a;
    private final int b;
    private final int c;

    public Polinomio(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] calcularRaices(){
      double determinante= calcularDeterminante();
      double raiz_1= (-b + determinante) / (2*a);
      double raiz_2= (-b - determinante) / (2*a);
      double[] resultado;
      if (determinante > 0){
          resultado=new double[2];
          resultado[0]= raiz_1;
          resultado[1]= raiz_2;
      }
      else if(determinante == 0){
          resultado= new double[1];
          resultado[0]= raiz_1;
      }
      else{
          return null;
      }
      return resultado;
    }

    public  double calcularDeterminante(){
        return Math.sqrt(Math.pow(b,2) - 4 * a * c );
    }

    public static void mostrarRaices(double[] raices){
        System.out.print("[");
        for (double raiz : raices){
            System.out.print(raiz + "\t");
        }
        System.out.println("]");
    }
}

