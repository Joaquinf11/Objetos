package localderopa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App app;

    @BeforeEach
    void setApp(){
        app= new App();
        app.agregarPrenda(new Remera(100));


    }

    @Test
    public void probando(){
        MedioDePago medio= new TarjetaDorada();
        Remera remera = new Remera(100);
        Sweater sweater= new Sweater(1000);
        Conjunto conjunto = new ConjuntoDescuento(remera,sweater,10);
        ArrayList<Vendible> vendibles= new ArrayList<>();
        vendibles.add(remera);
        vendibles.add(sweater);
        vendibles.add(conjunto);


        for(Vendible vendible : vendibles){
            System.out.println(medio.calcularPrecioFinal(vendible.calcularPrecio()));
        }



    }


}