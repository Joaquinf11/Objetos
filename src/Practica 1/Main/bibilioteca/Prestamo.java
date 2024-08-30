package bibilioteca;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Prestamo {
    private final int idPrestamo;
    private final String  fechaDevolucion;
    private final String fechaPrestamo;
    private final Ejemplar ejemplar;


    public Prestamo(int idPrestamo,Ejemplar ejemplar) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = LocalDate.now().toString();
        this.fechaDevolucion = LocalDate.now().plusMonths(1).toString();
        this.ejemplar=ejemplar;

        ejemplar.setDisponible(false);
    }

    public int getIdPrestamo() {
        return this.idPrestamo;
    }

    public String getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public String getFechaPrestamo() {
        return this.fechaPrestamo;
    }



    public Ejemplar getEjemplar() {
        return ejemplar;
    }


    public void altaDevolucion(){
        Ejemplar ejemplar= getEjemplar();
        ejemplar.setDisponible(true);
    }
}
