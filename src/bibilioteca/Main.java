package bibilioteca;

import java.util.Scanner;



public class Main {

    public static int mostrarMenu(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bienvenido al programa de la Biblioteca\n");

        System.out.print(   "0 - Salir\n" +
                            "1 - Ingresar un  nuevo Socio\n" +
                            "2 - Ingresar un nuevo Autor\n" +
                            "3 - Ingresar un libro nuevo \n" +
                            "4 - Ingresar un nuevo Prestamo \n" +
                            "5 - Ingresar una Devolucion\n "

                            );
        return scanner.nextInt();
    }

    public static void main(String args[]){
        int accion=mostrarMenu();
        Scanner sc= new Scanner(System.in);
        Biblioteca biblioteca= new Biblioteca();
        while (accion != 0){
            if (accion == 1){
                System.out.print("Ingrese nombre de Socio: ");
                String nombreSocio= sc.nextLine();
                System.out.print("Ingrese numero de Socio: ");
                int numeroSocio= sc.nextInt();
                biblioteca.altaSocio(nombreSocio,numeroSocio);
                biblioteca.mostrarSocios();
            }
            if (accion == 2){
                System.out.print("Ingrese nombre de Autor: ");
                String nombreAutor= sc.nextLine();
                System.out.print("Ingrese nacionalidad de Autor: ");
                String nacionalidad= sc.nextLine();
                biblioteca.altaAutor(nombreAutor,nacionalidad);
                biblioteca.mostrarAutor();
            }
//            if (accion== 5){
//                System.out.print("Ingrese el numero de Socio: ");
//                int numeroSocio= sc.nextInt();
//                Socio resultado=null;
//                resultado=resultado.buscarSocio(Biblioteca.getSocios(),numeroSocio);
//                System.out.println(resultado.getNombreSocio());
//
//            }
            accion=mostrarMenu();
        }
    }
}
