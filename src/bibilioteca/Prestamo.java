package bibilioteca;

public class Prestamo {
    private final int idPrestamo;
    private final int fechaDevolucion;
    private final int fechaEntrega;


    public Prestamo(int idPrestamo, int fechaDevolucion, int fechaEntrega) {
        this.idPrestamo = idPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaEntrega = fechaEntrega;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public int getFechaDevolucion() {
        return fechaDevolucion;
    }

    public int getFechaEntrega() {
        return fechaEntrega;
    }



}
