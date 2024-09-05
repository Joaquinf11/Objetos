package billetera;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App app;
    @BeforeEach
    void setUp(){
        app=new App();
        app.agregarMoneda("Dolar",1);
        app.agregarMoneda("Peso argentino",0.001);
        app.agregarMoneda("Euro",1.11);

        app.agregarBilletera(100000,"Peso Argentino","Joaquin Falco");
        app.agregarBilletera(1000,"Dolar","Elias Graciano");
    }

    @Test
    public void probandoBuscarMoneda(){
        Moneda moneda=app.buscarMoneda("Dolar");
        assertEquals("Dolar",moneda.getNombreMoneda());
    }

    @Test
    public void probandoBuscarBilletera(){
        Billetera billetera=app.buscarBilletera("Joaquin Falco");
        assertEquals("Joaquin Falco",billetera.getNombreUsuario());
    }

//    @Test
//    public void probandoTransferir(){
//        Billetera origen= app.buscarBilletera("Elias Graciano");
//        Billetera destino=app.buscarBilletera("Joaquin Falco");
//        Moneda moneda= app.buscarMoneda("Dolar");
//        Dinero monto= new Dinero(500,moneda);
//        app.realizarTransferencia(origen,destino,monto);
//        assertEquals(500,origen.getSaldo().getMonto());
//        assertEquals(,destino.getSaldo().getMonto());
//
//    }
}