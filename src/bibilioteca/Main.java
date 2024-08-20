package bibilioteca;

import java.util.Scanner;

public class Main {

    public int mostrarMenu(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bienvenido al programa de la Biblioteca\n");

        System.out.print( "1 - Ingresar un  nuevo Socio\n" +
                            "2 - Ingresar un nuevo Autor\n" +
                            "5 - Ingresar un libro nuevo \n" +
                            "3 - Ingresar un nuevo Prestamo \n" +
                            "4 - Ingresar una Devolucion\n "
                            );
        return scanner.nextInt();
    }

    public static void main(String args[]){
        
    }
}
