package Fecha;

public class Mes {
    private int mes;

    public Mes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    public boolean isEqual(int mes){
        return getMes() == mes;
    }

    public boolean isMayor(int mes){
        return  getMes() > mes;
    }

    public boolean isMenor(int mes){
        return  getMes() < mes;
    }
}
