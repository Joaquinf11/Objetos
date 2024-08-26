package Fecha;

public class Dia {
    private int dia;

    public Dia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public boolean isEqual(int dia){
        return getDia() == dia;
    }

    public boolean isMayor(int dia){
        return  getDia() > dia;
    }

    public boolean isMenor(int dia){
        return  getDia() < dia;
    }
}
