package bibilioteca;


public class Libro {
    private  final String titulo;
    private final int cantidadPaginas;
    private Ejemplar[] ejemplares;

    public Libro(String titulo, int cantidadPaginas) {
        this.titulo = titulo;
        this.cantidadPaginas = cantidadPaginas;
        this.ejemplares= new Ejemplar[0];
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public static Libro buscarLibro(Libro[] libros, String titulo){
        for( Libro libro : libros){
            if (libro.titulo.equals(titulo)){
                return libro;
            }
        }
        return null;
    }

    public void agregarEjemplar(){
        Ejemplar[] nuevoArreglo = new Ejemplar[ejemplares.length + 1];
        System.arraycopy(ejemplares, 0, nuevoArreglo, 0, ejemplares.length);
        nuevoArreglo[nuevoArreglo.length - 1] = new Ejemplar();
        ejemplares = nuevoArreglo;
    }


    public Ejemplar getDisponible(){
        int contador=0;
        for (Ejemplar ejemplar : ejemplares){
            if(ejemplar.isDisponible() && contador > 1){
                return ejemplar;
            }
            else {
                contador++;
            }
        }
        return  null;
    }

    public int ejemplaresDisponibles(){
        int contador=0;
        for(Ejemplar ejemplar: ejemplares){
            if (ejemplar.isDisponible()){
                contador++;
            }
        }
        return contador;
    }
    public int ejemplaresPrestados(){
        int contador=0;
        for(Ejemplar ejemplar: ejemplares){
            if (!ejemplar.isDisponible()){
                contador++;
            }
        }
        return contador;
    }
}
