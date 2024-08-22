package bibilioteca;

import java.util.Scanner;



public class Main {

    public static int mostrarMenu(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bienvenido al programa de la Biblioteca\n");

        System.out.print(   "0 - Salir\n" +
                            "1 - Ingresar un  nuevo Socio\n" +
                            "2 - Agregar un ejemplar de un libro \n" +
                            "3 - Ingresar un nuevo Prestamo \n" +
                            "4 - Ingresar una Devolucion\n" +
                            "5 - Mostrar informacion del libro\n" +
                            " \n Seleccione una opcion: ");
        return scanner.nextInt();
    }

    public static void main(String args[]){
        int accion=mostrarMenu();
        Scanner sc= new Scanner(System.in);
        Biblioteca biblioteca= new Biblioteca();
        while (accion != 0){
            sc.nextLine();
            if (accion == 1){
                System.out.print("Ingrese nombre de Socio: ");
                String nombreSocio= sc.nextLine();
                System.out.print("Ingrese numero de Socio: ");
                int numeroSocio= sc.nextInt();
                biblioteca.altaSocio(nombreSocio,numeroSocio);
                biblioteca.mostrarSocios();
            }

            if (accion == 2){
                System.out.print("Ingrese el nombre del autor: ");
                String nombreAutor=sc.nextLine();
                //sc.nextLine();
                if (!biblioteca.hasEjemplar(nombreAutor)){
                    System.out.println("No existe ese ejemplar. Debe ingresar los datos del libro");
                    System.out.print("Ingrese titulo del libro: ");
                    String titulo=sc.nextLine();
                   // sc.nextLine();
                    System.out.print("Ingrese cantidad de paginas: ");
                    int cantPaginas=sc.nextInt();
                   // sc.nextLine();
                    biblioteca.altaEjemplar(nombreAutor,titulo,cantPaginas);
                }
                else {
                    biblioteca.agregarEjemplar(nombreAutor);
                }
                biblioteca.mostrarEjemplares();
            }
            if (accion== 3){
                System.out.print("Ingrese el nombre del Socio: ");
                String nombreSocio= sc.nextLine();
              //  sc.nextLine();
                System.out.print("Ingrese el numero de Prestamo: ");
                int idPrestamo= sc.nextInt();
               // sc.nextLine();
                System.out.print("Ingrese el autor del libro: ");
                String nombreAutor= sc.nextLine();
               // sc.nextLine();
                biblioteca.cargarPrestamo(idPrestamo,nombreSocio,nombreAutor);
            }
            if (accion == 4){
                System.out.print("Ingrese el numero de Prestamo: ");
                int idPrestamo= sc.nextInt();
                sc.nextLine();
                System.out.println("Todavia no esta hecho");
            }
            if (accion==5){
                System.out.print("Ingrese el nombre del autor: ");
                String nombreAutor=sc.nextLine();
             //   sc.nextLine();
                biblioteca.mostrarDescripcion(nombreAutor);
            }
            accion=mostrarMenu();
        }
    }
}
