package billetera;

import java.util.ArrayList;

public class App {
    private ArrayList<Billetera> billeteras;
    private ArrayList<Moneda> monedas;

    public App() {
        this.billeteras= new ArrayList<Billetera>();
        this.monedas = new ArrayList<Moneda>();
    }

    public ArrayList<Billetera> getBilleteras() {
        return this.billeteras;
    }

    public ArrayList<Moneda> getMonedas() {
        return this.monedas;
    }

    public void agregarMoneda(Moneda moneda){
        getMonedas().add(moneda);
    }

    public void agregarBilletera(Billetera billetera){
        getBilleteras().add(billetera);
    }
}
