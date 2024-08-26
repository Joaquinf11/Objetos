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
        Tarea tarea_1= new Tarea("Ir al supermercado mañana",false,fecha_hoy.plusDays(1));
        Tarea tarea_2= new Tarea("Consultar repuesto del auto",true,fecha_hoy.minusDays(1));
        Tarea tarea_3= new Tarea("Ir al cine a ver la nueva película de Marvel",false,fecha_hoy.minusDays(1));
        tarea_1.mostrarTarea();
        tarea_2.mostrarTarea();
        tarea_3.mostrarTarea();
    }
}
