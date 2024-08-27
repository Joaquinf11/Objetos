package listaTareas;
/*
Generar un programa en Java que haga uso de la clase Tarea, y cree las siguientes tareas:

        "Ir al supermercado mañana". Debe tener la fecha límite establecida y estar incompleta.
"Consultar repuesto del auto". Debe tener la fecha límite para ayer y estar completa.
        "Ir al cine a ver la nueva película de Marvel". Debe tener fecha límite de ayer y estar incompleta.
        */

import java.time.LocalDate;

public class ListaTareas {
    public static void main(String[] args){
        LocalDate fecha_hoy=LocalDate.now();
        Tarea tarea_1= new Tarea("Ir al supermercado mañana",0,fecha_hoy.plusDays(1));
        Tarea tarea_2= new Tarea("Consultar repuesto del auto",0,fecha_hoy.minusDays(1));
        Tarea tarea_3= new Tarea("Ir al cine a ver la nueva película de Marvel",0,fecha_hoy.minusDays(1));

        tarea_1.setEstado(false);
        tarea_2.setEstado(true);
        tarea_3.setEstado(false);

        System.out.println(tarea_1.mostrarTarea());
        System.out.println(tarea_2.mostrarTarea());
        System.out.println(tarea_3.mostrarTarea());



        System.out.println("Tarea 1 vencida: " + tarea_1.isVencida()); // false
        System.out.println("Tarea 2 vencida: " + tarea_2.isVencida()); // false (está completa)
        System.out.println("Tarea 3 vencida: " + tarea_3.isVencida()); // true

        // Comprobar si las tareas están completas
        System.out.println("Tarea 1 completa: " + tarea_1.isCompleta()); // false
        System.out.println("Tarea 2 completa: " + tarea_2.isCompleta()); // true
        System.out.println("Tarea 3 completa: " + tarea_3.isCompleta()); // false
    }
}
