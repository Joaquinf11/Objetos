package clubfutbol;

public class Socio {
    private  String nombreSocio;
    private  String mail;
    private String direccion;
    private Credencial credencial;

    public Socio(String nombreSocio, String mail, String direccion, TipoSuscripcion tipoSuscripcion) {
        this.nombreSocio = nombreSocio;
        this.mail = mail;
        this.direccion = direccion;
        this.credencial= new Credencial(tipoSuscripcion);
    }


    public String getNombre() {
        return this.nombreSocio;
    }

    public Credencial getCredencial(){
        return this.credencial;
    }
}
