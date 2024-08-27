package Fecha;

public class Anio {
    private String anio;

    public Anio(String anio) {
        this.anio = anio;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int anioInt(String anio){
        return Integer.parseInt(anio);
    }
    public boolean isEqual(String anio){
        return anioInt(getAnio()) == anioInt(anio);
    }

    public boolean isMayor(String anio){
        return  anioInt(getAnio()) > anioInt(anio);
    }

    public boolean isMenor(String anio){
        return  anioInt(getAnio()) < anioInt(anio);
    }


}
