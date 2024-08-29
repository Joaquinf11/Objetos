package listaTareas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Tarea {
    private String descripcion;
    private boolean estado;
    private int prioridad;
    private final LocalDate fechaLimite;
    private final LocalDate fechaRecordatorio;

    public Tarea(String descripcion, LocalDate fechaLimite,LocalDate fechaRecordatorio) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.fechaRecordatorio= fechaRecordatorio;
    }

    public Tarea(String descripcion,String fechaLimite,String fechaRecordatorio){
        this.descripcion=descripcion;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaLimite= LocalDate.parse(fechaLimite,formatter);
        this.fechaRecordatorio= LocalDate.parse(fechaRecordatorio,formatter);
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDate getFechaLimite() {
        return this.fechaLimite;
    }

    public LocalDate getFechaRecordatorio() {
        return fechaRecordatorio;
    }

    public boolean isVencida(){
        return LocalDate.now().isAfter(getFechaLimite()) && !isCompleta();
    }

    public boolean isCompleta(){
        return this.estado;
    }

    public boolean estaPorVencer() {
        if (!isVencida()) {
            return LocalDate.now().isAfter(getFechaRecordatorio());
        }
        else{
            return false;
        }
    }
    public String mostrarTarea(){
        String resultado;
        if (estaPorVencer()){
            resultado= "(Por vencer)" + getDescripcion();
        }
        else if(isVencida()){
            resultado=("(Vencida)" + getDescripcion());
        }
        else if(isCompleta()){
            resultado="(Completada)" + getDescripcion();
        }
        else{
            resultado=(getDescripcion());
        }
        return resultado;
    }
}
