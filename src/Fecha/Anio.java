package Fecha;

public class Anio {
    private int anio;

    public Anio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public boolean isEqual(int anio){
        return getAnio() == anio;
    }

    public boolean isMayor(int anio){
        return  getAnio() > anio;
    }

    public boolean isMenor(int anio){
        return  getAnio() < anio;
    }


}
