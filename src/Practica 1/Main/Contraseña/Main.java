package Contraseña;

import java.util.Scanner;

public class Main {

    public static void mostrarMenu(){
        System.out.println("""
                        Bienvenido al programa
                        0 - Salir
                        1 - Generar una nueva contraseña
                        2 - Obtener longitud de la contraseña
                        3 - Mostrar contraseña
                        4 - Cambiar longitud de contraseña
                        """
        );
    }

    public static void main(String[] args){
        mostrarMenu();
        Scanner sc= new Scanner(System.in);
        int accion=sc.nextInt();

        while (accion != 0){
            if (accion == 1){
                System.out.println("Ingrese la longitud: ");
                int longitud=sc.nextInt();
                Contrasenia contrasenia= new Contrasenia(longitud);
            }
        }


        Contrasenia contrasenia_1= new Contrasenia(20);
        Contrasenia contrasenia_2= new Contrasenia(20);
        Contrasenia contrasenia_3= new Contrasenia(6);
        Contrasenia contrasenia_4= new Contrasenia(6);
        Contrasenia contrasenia_5= new Contrasenia(10);
        Contrasenia contrasenia_6= new Contrasenia(10);

        contrasenia_1.mostrarContrasena();
        contrasenia_2.mostrarContrasena();
        contrasenia_3.mostrarContrasena();
        contrasenia_4.mostrarContrasena();
        contrasenia_5.mostrarContrasena();
        contrasenia_6.mostrarContrasena();

    }
}
