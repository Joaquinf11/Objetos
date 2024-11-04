package ejparcial;

public class Main {

    public static void main(String[] args){
        PruebaContador prueba= new PruebaContador();
        prueba.comenzar();
        System.out.println(prueba.getContador().getValor());
    }
}
