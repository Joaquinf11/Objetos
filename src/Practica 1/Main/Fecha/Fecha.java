package Fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private final String dia;
    private final String mes;
    private final String anio;

    public Fecha(String dia, String mes, String anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio =anio;
    }

    public String getMes() {
        return this.mes;
    }

    public String getDia() {
        return this.dia;
    }

    public String getAnio() {
        return this.anio;
    }


    public LocalDate toLocalDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(getDia() + getMes() + getAnio());
    }
    public void mostrarFecha(){
        System.out.println(getDia() + "-" + getMes() + "-" + getAnio());
    }
    
}
