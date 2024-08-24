package bibilioteca;

public class Test {
    private final  String titulo_1;
    private final String titulo_2;

    public Test(String titulo_1, String titulo_2) {
        this.titulo_1 = titulo_1;
        this.titulo_2 = titulo_2;
    }

    public String getTitulo_1() {
        return titulo_1;
    }

    public String getTitulo_2() {
        return titulo_2;
    }

    public Libro masCantidadPaginas(){
        Libro libro_1= Autor.buscarLibro(Biblioteca.getAutores(),getTitulo_1());
        Libro libro_2= Autor.buscarLibro(Biblioteca.getAutores(),getTitulo_2());
        if (libro_1.getCantidadPaginas() > libro_2.getCantidadPaginas()){
            return libro_1;
        }
        else{
            return libro_2;
        }
    }
    public void mostrarTest(){
        Libro resultado= masCantidadPaginas();
        System.out.println("El libro con mas paginas es: " + resultado.getTitulo());
    }
}

