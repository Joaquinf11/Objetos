package clubfutbol;

import java.util.ArrayList;

public class Club {
    private ArrayList<Socio> socios;

    public Club() {
        this.socios = new ArrayList<>();
    }

    public void cargarSocio(String nombreSocio,String mail, String direccion,String tipoSuscripcion){
        this.socios.add(new Socio(nombreSocio,mail,direccion,tipoSuscripcion));
    }
}
