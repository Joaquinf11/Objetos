package billetera;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App app;
    @BeforeEach
    void setUp(){
        app=new App();
    }

    @Test
    public void agregandoNuevaMonedaEnApp(){
        Moneda moneda= new Moneda("Peso",1400);
        ArrayList<Moneda> monedas_esperada= new ArrayList<Moneda>();
        monedas_esperada.add(moneda);
        app.agregarMoneda(moneda);
        assertNotEquals(null,app.getMonedas());
        assertEquals(monedas_esperada,app.getMonedas());
    }

    @Test
    public void agregandoNuevaBilleteraEnApp(){
        Dinero dinero= new Dinero(14000,"euros",1.30);
        Billetera billetera= new Billetera(dinero,"Joaquin");
        ArrayList<Billetera> billeteras_esperada= new ArrayList<Billetera>();
        billeteras_esperada.add(billetera);
        app.agregarBilletera(billetera);
        assertNotEquals(null,app.getBilleteras());
        assertEquals(billeteras_esperada,app.getBilleteras());
    }

    
}