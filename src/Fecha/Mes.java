package Fecha;

public class Mes {
    private String mes;

    public Mes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int mesInt(){
        return Integer.parseInt(getMes());
    }
    public boolean isEqual(int mes){
        return mesInt() == mes;
    }

    public boolean isMayor(int mes){
        return  mesInt() > mes;
    }

    public boolean isMenor(int mes){
        return  mesInt() < mes;
    }
}
