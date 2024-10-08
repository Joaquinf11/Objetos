package listaTareas;
/*
Generar un programa en Java que haga uso de la clase Tarea, y cree las siguientes tareas:

        "Ir al supermercado mañana". Debe tener la fecha límite establecida y estar incompleta.
"Consultar repuesto del auto". Debe tener la fecha límite para ayer y estar completa.
        "Ir al cine a ver la nueva película de Marvel". Debe tener fecha límite de ayer y estar incompleta.
        */

import java.time.LocalDate;
import java.util.ArrayList;

public class ListaTareas {
    private ArrayList<Tarea> lista;

    public ListaTareas() {
        this.lista = new ArrayList<Tarea>();
    }

    public void agregarTarea(Tarea tarea){

    }



    public static void main(String[] args){
        LocalDate fecha_hoy=LocalDate.now();
        Tarea tarea_1= new Tarea("Ir al supermercado mañana",fecha_hoy.plusDays(5),fecha_hoy.plusDays(3));
        Tarea tarea_2= new Tarea("Consultar repuesto del auto",fecha_hoy.minusDays(5),fecha_hoy.plusDays(4));
        Tarea tarea_3= new Tarea("Ir al cine a ver la nueva película de Marvel",fecha_hoy.minusDays(1),fecha_hoy.minusDays(2));


        tarea_1.setEstado(false);
        tarea_2.setEstado(true);
        tarea_3.setEstado(false);

        System.out.println(tarea_1.mostrarTarea());
        System.out.println(tarea_2.mostrarTarea());
        System.out.println(tarea_3.mostrarTarea());

        Tarea tarea_4= new Tarea("Limpiar la casa","30-08-2024","28-08-2024");

        System.out.println(tarea_4.mostrarTarea());

//        System.out.println("Tarea 1 vencida: " + tarea_1.isVencida()); // false
//        System.out.println("Tarea 2 vencida: " + tarea_2.isVencida()); // false (está completa)
//        System.out.println("Tarea 3 vencida: " + tarea_3.isVencida()); // true
//
//
//        System.out.println("Tarea 1 completa: " + tarea_1.isCompleta()); // false
//        System.out.println("Tarea 2 completa: " + tarea_2.isCompleta()); // true
//        System.out.println("Tarea 3 completa: " + tarea_3.isCompleta()); // false
    }
}
