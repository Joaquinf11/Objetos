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
                            "4 - Agregar un ejemplar\n" +
                            "5 - Ingresar un nuevo Prestamo \n" +
                            "6 - Ingresar una Devolucion\n" +
                            "7 - Mostrar informacion del libro\n" +
                            "8 - Comparar cantidad de paginas\n"
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
                sc.nextLine();
                System.out.print(" | Ingrese nacionalidad de Autor: ");
                String nacionalidad= sc.nextLine();
              //  sc.nextLine();
                biblioteca.altaAutor(nombreAutor,nacionalidad);
                biblioteca.mostrarAutores();
            }
            if (accion ==3){
                System.out.print("Ingrese el titulo del libro: ");
                String titulo=sc.nextLine();
                sc.nextLine();
                System.out.print("Ingrese la cantidad de paginas: ");
                int cantPaginas= sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese el nombre del autor: ");
                String nombreAutor=sc.nextLine();
                sc.nextLine();
                biblioteca.altaLibro(titulo,cantPaginas,nombreAutor);
            }
            if (accion == 4){
                System.out.print("Ingrese el nombre del autor: ");
                String nombreAutor=sc.nextLine();
                sc.nextLine();
                System.out.print("Ingrese el titulo del libro: ");
                String titulo=sc.nextLine();
                sc.nextLine();
                biblioteca.altaEjemplar(nombreAutor,titulo);
            }
            if (accion== 5){
                System.out.print("Ingrese el nombre del Socio: ");
                String nombreSocio= sc.nextLine();
                sc.nextLine();
                System.out.print("Ingrese el numero de Prestamo: ");
                int idPrestamo= sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese el nombre del autor: ");
                String nombreAutor=sc.nextLine();
                sc.nextLine();
                System.out.print("Ingrese el titulo del libro: ");
                String titulo= sc.nextLine();
                sc.nextLine();

                biblioteca.cargarPrestamo(idPrestamo,nombreSocio,nombreAutor,titulo);
            }
            if (accion == 6){
                System.out.print("Ingrese el numero de Prestamo: ");
                int idPrestamo= sc.nextInt();
                sc.nextLine();
                String nombreSocio= sc.nextLine();
                sc.nextLine();
                biblioteca.cargarDevolucion(idPrestamo,nombreSocio);
            }
            if (accion==7){
                System.out.print("Ingrese el nombre del autor: ");
                String nombreAutor=sc.nextLine();
                sc.nextLine();
                System.out.print("Ingrese el titulo del libro: ");
                String titulo=sc.nextLine();
                sc.nextLine();
                biblioteca.mostrarDescripcion(nombreAutor,titulo);
            }
//            if (accion==8){
//                System.out.print("Ingrese el titulo del libro: ");
//                String titulo_1=sc.nextLine();
//                sc.nextLine();
//                System.out.print("Ingrese el titulo del libro: ");
//                String titulo_2=sc.nextLine();
//                sc.nextLine();
//                Test test= new Test(titulo_1,titulo_2);
//                test.mostrarTest();
//            }
            accion=mostrarMenu();
        }
    }
}
