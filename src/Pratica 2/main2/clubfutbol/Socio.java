package clubfutbol;

public class Socio {
    private  String nombreSocio;
    private  String mail;
    private String direccion;
    private Suscripcion suscripcion;

    public Socio(String nombreSocio, String mail, String direccion, String tipoSuscripcion) {
        this.nombreSocio = nombreSocio;
        this.mail = mail;
        this.direccion = direccion;
        this.suscripcion= new Suscripcion(tipoSuscripcion);
    }


}
