package repuestosproductos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VentasTest {
    Ventas ventas;

    @BeforeEach
    void setUp(){
        ventas= new Ventas();
        ventas.altaStock("Lapicera",5);
        ventas.altaStock("Borratinta",2);
        ventas.altaStock("Lapiz",3);
        ventas.altaStock("Goma",1);
        ventas.altaStock("Sacapuntas",4);


    }


    @Test
    public void probandoAltaStock(){
        
    }



}