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
                            "4 - Agregar un ejemplar de un libro \n" +
                            "5 - Ingresar un nuevo Prestamo \n" +
                            "6 - Ingresar una Devolucion\n "

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
                biblioteca.mostrarAutores();
            }
            if (accion ==3){
                System.out.print("Ingrese el titulo del libro: ");
                String titulo=sc.nextLine();
                System.out.print("Ingrese la cantidad de paginas: ");
                int cantPaginas= sc.nextInt();
                System.out.print("Ingrese el nombre del autor: ");
                sc.nextLine();
                String nombreAutor=sc.nextLine();
                biblioteca.altaLibro(titulo,cantPaginas,nombreAutor);
                biblioteca.mostrarEjemplares();
            }
            if (accion == 4){
                System.out.print("Ingrese el titulo del libro: ");
                String titulo=sc.nextLine();
                biblioteca.agregarEjemplar(titulo);
                biblioteca.mostrarEjemplares();
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
