package billetera;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTestUnitarios {
    App app;
    @BeforeEach
    void setUp(){
        app=new App();

    }



    @Test
    public void convertirDeMonedaOrigenADestino(){
        Moneda destino= new Moneda("Pesos",0.001);
        Moneda origen= new Moneda("Euro",1.11);
        Dinero monto= new Dinero(100,origen);

        Dinero resultado= Conversor.convertir(monto,destino);
        assertEquals(111000, (int)resultado.getMonto());
        //casteado a int por que no se como hacer para comprar solo dos decimelas
    }

    @Test
    public void probandoAcreditar(){
        Moneda moneda= new Moneda("Pesos",0.001);
        Dinero monto= new Dinero(100000,moneda);
        Billetera origen= new Billetera(monto,"Joaquin");
        Dinero monto_acreditar= new Dinero(50,new Moneda("Euro",1.1));
        origen.acreditar(monto_acreditar);
        assertEquals(155000,(int) origen.getSaldo().getMonto());
    }

    @Test
    public void probandoDesacreditar(){
        Moneda moneda= new Moneda("Pesos",0.001);
        Dinero monto= new Dinero(100000,moneda);
        Billetera origen= new Billetera(monto,"Joaquin");
        Dinero monto_desacreditar= new Dinero(50,new Moneda("Euro",1.1));
        origen.desacreditar(monto_desacreditar);
        assertEquals(45000,(int) origen.getSaldo().getMonto());
    }

}