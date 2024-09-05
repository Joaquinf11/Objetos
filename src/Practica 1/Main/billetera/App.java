package billetera;

import java.util.ArrayList;
import java.util.Objects;

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

    public void agregarMoneda(String nombreMoneda, double cotizacion){
        Moneda moneda= new Moneda(nombreMoneda,cotizacion);
        getMonedas().add(moneda);
    }

    public void agregarBilletera(double monto,String nombreMoneda,String nombreUsuario){
        Moneda moneda= buscarMoneda(nombreMoneda);
        Dinero dinero= new Dinero(monto,moneda);
        Billetera billetera= new Billetera(dinero,nombreUsuario);
        getBilleteras().add(billetera);
    }

    public void realizarTransferencia(String nombreUsuarioOrigen,String nombreUsuarioDestino,double monto,String nombreMonedaOrigen){
        Billetera origen= buscarBilletera(nombreUsuarioOrigen);
        Billetera destino= buscarBilletera(nombreUsuarioDestino);
        Moneda moneda= buscarMoneda(nombreMonedaOrigen);
        Dinero dinero= new Dinero(monto,moneda);
        Transferencia transferencia= new Transferencia(origen,destino,dinero);
        transferencia.transferir();
    }

    public Moneda buscarMoneda( String nombreMoneda){
        for (Moneda moneda : monedas){
            if (Objects.equals(moneda.getNombreMoneda(), nombreMoneda)) {
                return moneda;
            }
        }
        return null;
    }

    public Billetera buscarBilletera(String nombreUsuario){
        for (Billetera billetera: billeteras){
            if (Objects.equals(billetera.getNombreUsuario(),nombreUsuario)){
                return billetera;
            }
        }
        return null;
    }
}
