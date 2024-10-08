package clubfutbol;

import java.util.ArrayList;
import java.util.Objects;

import static java.lang.System.out;

//Reporte mensual de nuevos socios inscriptos
//Listado de actividades clasificadas por suscripción (actividades accesibles con la suscripción básica, actividades accesibles con la suscripción intermedia y aquellas que solo puede accederse con la suscripción destacada).
//Listado de socios clasificados por suscripción adquirida

public class Club {
    private ArrayList<Socio> socios;
    private ArrayList<Actividad> actividades;


    public Club() {
        this.socios = new ArrayList<>();
        this.actividades= new ArrayList<Actividad>();
    }

    public void cargarSocio(String nombreSocio,String mail, String direccion,String tipoSuscripcion){
        this.socios.add(new Socio(nombreSocio,mail,direccion,tipoSuscripcion));
    }

    public void cargarActividad(Actividad actividad){
        this.actividades.add(actividad);
    }

    public void inscribirSocioEnActividad(String nombreSocio) {
        Socio socio = buscarSocio(nombreSocio);
        Credencial credencial = socio.getCredencial();
        for (Actividad actividad : actividades) {
            if (credencial.getSuscripcion().compareTo(actividad.getNivelMinimo()) >= 0 ){
                credencial.agregarActividad(actividad);
            }

        }
    }

    public Socio buscarSocio(String nombreSocio){
        for (Socio socio : socios){
            if (Objects.equals(socio.getNombre(),nombreSocio)){
                return socio;
            }
        }
        return null;
    }

    public Actividad buscarActividad(String nombre){
        for (Actividad actividad : actividades){
            if (actividad.getNombre().equals(nombre)){
                return actividad;
            }
        }
        return null;
    }

    public ArrayList<Actividad> getactividadesPorSucripcion(TipoSuscripcion suscripcion){
        ArrayList<Actividad> resultado= new ArrayList<>();
        for(Actividad actividad : actividades){
          if (actividad.getNivelMinimo().compareTo(suscripcion) <= 0){
              resultado.add(actividad);
          }

        }
        return  resultado;
    }

    public ArrayList<Socio> getSociosPorSucripcion(TipoSuscripcion suscripcion){
        ArrayList<Socio> resultado= new ArrayList<>();
        for(Socio socio : socios){
            if (socio.getCredencial().getSuscripcion().compareTo(suscripcion) == 0){
                resultado.add(socio);
            }
        }
        return  resultado;
    }


    public void informeActividadesPorSuscripcion(){
        ArrayList<Actividad> resultado= getactividadesPorSucripcion(TipoSuscripcion.BASICA);
        out.println("Actividades permitidias para la suscripcion basica: ");
        for (Actividad mostrar : resultado ){
            out.print(mostrar.getNombre() + "\t");
        }
        out.println();
        resultado= getactividadesPorSucripcion(TipoSuscripcion.INTERMEDIA);
        out.println("Actividades permitidias para la suscripcion Intermedia: ");
        for (Actividad mostrar : resultado ){
            out.print(mostrar.getNombre() + "\t");
        }
        out.println();
        resultado= getactividadesPorSucripcion(TipoSuscripcion.DESTACADA);
        out.println("Actividades permitidias para la suscripcion destaca: ");
        for (Actividad mostrar : resultado ){
            out.print(mostrar.getNombre() + "\t");
        }
        out.println();
    }

    public void informeSociosPorSuscripcion(){
        ArrayList<Socio> resultado= getSociosPorSucripcion(TipoSuscripcion.BASICA);
        out.print("Socios con suscripcion basica: ");
        for (Socio mostrar : resultado ){
            out.print(mostrar.getNombre() + "\t");
        }
        out.println();
        resultado= getSociosPorSucripcion(TipoSuscripcion.INTERMEDIA);
        out.print("Socios con suscripcion Intermedia: ");
        for (Socio mostrar : resultado ){
            out.print(mostrar.getNombre() + "\t");
        }
        out.println();
        resultado= getSociosPorSucripcion(TipoSuscripcion.DESTACADA);
        out.print("Socios con suscripcion destacada: ");
        for (Socio mostrar : resultado ){
            out.print(mostrar.getNombre() + "\t");
        }
        out.println();
    }
}
