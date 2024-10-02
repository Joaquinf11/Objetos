package localderopa;

public class CamisaMangaLarga extends Camisa{

    public CamisaMangaLarga(double precioLista){
        super(precioLista,true);
        setPorcentajeGanancia(getPorcentajeGanancia() + 5);
    }



}
