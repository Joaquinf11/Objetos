package listaTareas;

import java.time.LocalDate;


public class Tarea {
    private String descripcion;
    private boolean estado;
    private String prioridad;
    private final LocalDate fechaLimite;

    public Tarea(String descripcion, boolean estado, LocalDate fechaLimite) {
        this.estado = estado;
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

    public String getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDate getFechaLimite() {
        return this.fechaLimite;
    }

    public boolean isVencida(){
        return LocalDate.now().isAfter(getFechaLimite());
    }

    public boolean isCompleta(){
        return this.estado;
    }

    public void mostrarTarea(){
        if(isCompleta()){
            System.out.println("(Vencida)" + getDescripcion());
        }
        else{
            System.out.println(getDescripcion());
        }
    }
}
