package mvcLibro.observer;



import mvcLibro.modelo.Evento;

public interface Observado {

    public void agregarObservador(Observador observador);

    public void notificar(Evento libroAgregado);
}

