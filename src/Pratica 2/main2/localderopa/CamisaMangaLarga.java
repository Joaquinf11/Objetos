package localderopa;

public class CamisaMangaLarga extends Camisa{

    public CamisaMangaLarga(double precioLista){
        super(precioLista);
        setPorcentajeGanancia(getPorcentajeGanancia() + 5);
    }



}
