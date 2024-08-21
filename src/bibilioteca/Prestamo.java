package bibilioteca;
import java.time.LocalDateTime;
public class Prestamo {
    private final int idPrestamo;
    private final String  fechaDevolucion;
    private final String fechaPrestamo;


    public Prestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = LocalDateTime.now().toString();
        this.fechaDevolucion = LocalDateTime.now().plusMonths(1).toString();
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }



}
