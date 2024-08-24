package bibilioteca;
import java.time.LocalDateTime;
public class Prestamo {
    private final int idPrestamo;
    private final String  fechaDevolucion;
    private final String fechaPrestamo;
    private final Ejemplar ejemplar;


    public Prestamo(int idPrestamo,Ejemplar ejemplar) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = LocalDateTime.now().toString();
        this.fechaDevolucion = LocalDateTime.now().plusMonths(1).toString();
        this.ejemplar=ejemplar;

        ejemplar.setDisponible(false);
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



    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public static Prestamo buscarPrestamo(Prestamo[] prestamos, int idPrestamo){
        for (Prestamo prestamo : prestamos){
            if (prestamo.getIdPrestamo() == idPrestamo){
                return prestamo;
            }
        }
        return null;
    }

    public void altaDevolucion(){
        Ejemplar ejemplar= getEjemplar();
        ejemplar.setDisponible(true);
    }
}
