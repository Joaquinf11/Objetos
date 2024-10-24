package mvcLibro.modelo;

import java.util.Objects;

public class Isbn {
    private String valor;

    public Isbn(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Isbn isbn = (Isbn) o;
        return Objects.equals(valor, isbn.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

}
