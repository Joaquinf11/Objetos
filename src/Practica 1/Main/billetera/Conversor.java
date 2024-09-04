package billetera;

import java.util.Objects;

public class Conversor {
    Moneda monedaReferencia;

    public Conversor(){
        this.monedaReferencia= new Moneda("Dolar",1);
    }

    public Dinero convertir(Dinero monto,Moneda destino){
        Moneda origen= monto.getMoneda();
        if (!Objects.equals(origen,destino)){
            double origenEnDolares= monto.getMonto() / origen.getCotizacion()  ;
            double montoDestino= origenEnDolares * destino.getCotizacion();
            return new Dinero(montoDestino,destino.getNombreMoneda(),destino.getCotizacion());
        }
        else{
            return monto;
        }
    }
}
