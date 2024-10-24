package mvcLibro.modelo;

public interface ILibro {
    Isbn getIsbn();

    String getTitulo();

    String getAutor();

    int getEjemplaresDisponibles();

    int getEjemplaresPrestados();

}
