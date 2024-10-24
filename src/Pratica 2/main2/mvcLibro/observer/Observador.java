package mvcLibro.observer;


import mvcLibro.modelo.Evento;

public interface Observador {

    public void notificar(Evento evento);
}

