package Fecha;

public class Fecha {
    private Dia dia;
    private Mes mes;
    private Anio anio;

    public Fecha(String dia, String mes, String anio) {
        this.dia = new Dia(dia);
        this.mes = new Mes(mes);
        this.anio = new Anio(anio);
    }

    public Dia getDia() {
        return this.dia;
    }

    public Mes getMes() {
        return this.mes;
    }

    public Anio getAnio() {
        return this.anio;
    }

    public void mostrarFecha(){
        System.out.println(getDia().getDia() + "-" + getMes().getMes() + "-" + getAnio().getAnio());
    }
    
}
