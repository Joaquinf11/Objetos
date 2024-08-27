package Fecha;

public class Dia {
    private String dia;

    public Dia(String  dia) {
        this.dia = dia;
    }

    public String getDia() {
        return this.dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int diaInt(){
        return Integer.parseInt(getDia());
    }

    public boolean isEqual(int dia){
        return diaInt() == dia;
    }

    public boolean isMayor(int dia){
        return  diaInt() > dia;
    }

    public boolean isMenor(int dia){
        return  diaInt() < dia;
    }
}
