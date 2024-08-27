package listaTareas;

import java.time.LocalDate;


public class Tarea {
    private String descripcion;
    private boolean estado;
    private int prioridad;
    private final LocalDate fechaLimite;

    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite) {
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
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

    public boolean isVencida(){
        return LocalDate.now().isAfter(getFechaLimite()) && !isCompleta();
    }

    public boolean isCompleta(){
        return this.estado;
    }

    public String mostrarTarea(){
        String resultado;
        if(isVencida()){
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
