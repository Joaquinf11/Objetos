package agenciaturismo;

import java.util.ArrayList;

public class Agencia {
    private ArrayList<Ventas> ventas;
    private ArrayList<Proveedor> proveedores;
    private ArrayList <Cliente> clientes;
    private ArrayList <Paquete> paquetes;

    public Agencia(){
        this.ventas= new ArrayList<>();
        this.proveedores=new ArrayList<>();
        this.clientes=new ArrayList<>();
        this.paquetes=new ArrayList<>();
    }

    public void agregarCliente(String nombre){
        this.clientes.add(new Cliente(nombre));
    }

    public void agregarProveedor(String nombre, TipoProveedor tipo,String pais,String excursion){
        this.proveedores.add(new Proveedor(nombre,tipo,pais,excursion));
    }

    public void  agregarPaquetes(String destino, Proveedor transporte, Proveedor hospedaje){
        this.paquetes.add(new Paquete(destino,transporte,hospedaje));
    }
}
