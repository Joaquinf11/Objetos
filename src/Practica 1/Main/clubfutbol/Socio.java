package clubfutbol;

public class Socio {
    private  String nombreSocio;
    private  String mail;
    private String direccion;
    private TipoSuscripcion suscripcion;

    public Socio(String nombreSocio, String mail, String direccion, String tipoSuscripcion) {
        this.nombreSocio = nombreSocio;
        this.mail = mail;
        this.direccion = direccion;
        setSuscripcion(tipoSuscripcion);
    }

    public void setSuscripcion(String tipoSuscripcion){
        if (tipoSuscripcion.equals("Basica")){
            this.suscripcion= TipoSuscripcion.BASICA;
        }
        if (tipoSuscripcion.equals("Intermedia")){
            this.suscripcion= TipoSuscripcion.INTERMEDIA;
        }if (tipoSuscripcion.equals("Destacada")){
            this.suscripcion= TipoSuscripcion.DESTACADA;
        }
    }
}
