package Fecha;

public class Fecha {
    private Dia dia;
    private Mes mes;
    private Anio anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = new Dia(dia);
        this.mes = new Mes(mes);
        this.anio = new Anio(anio);
    }
}
