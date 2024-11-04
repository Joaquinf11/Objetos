package agenciaturismo;

public abstract class Proveedor {
    private String nombre;
    private TipoProveedor tipo;
    private String pais;
    private String excursion;

    public Proveedor(String nombre,TipoProveedor tipo,String pais,String excursion){
        this.nombre=nombre;
        this.tipo=tipo;
        this.pais=pais;
        if (tipo == TipoProveedor.GUIA){
            this.excursion=excursion;
        }
    }





}
