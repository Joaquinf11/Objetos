package clubfutbol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClubTest {
    Club club;
    @BeforeEach
    void setUp(){
        club= new Club();
        club.cargarSocio("Joaquin Falco","joaquin@gmail.com","Mathus 82","Basica" );
        club.cargarSocio("Elias Graciano","elias@gmail.com","Las Heras 12","Intermedia" );
        club.cargarSocio("Nicolas Romero","romero@gmail.com","Pueyrredon 52","Destacada" );

        club.cargarActividad(new Actividad("Tenis","Basica"));
        club.cargarActividad(new Actividad("Futbol","Intermedia"));
        club.cargarActividad(new Actividad("Pileta","Destacada"));
    }

    @Test
    public void probandoBuscarSocioEnClub(){
        Socio socio= club.buscarSocio("Joaquin Falco");
        assertEquals("Joaquin Falco",socio.getNombre());
    }

    @Test
    public void probandoCargarSocio(){
        Socio socio= club.buscarSocio("Elias Graciano");
        assertEquals("Elias Graciano",socio.getNombre());
        assertEquals("elias@gmail.com",socio.getMail());
        assertEquals("Las Heras 12",socio.getDireccion());

        Credencial credencial= socio.getCredencial();
        assertEquals(TipoSuscripcion.INTERMEDIA,credencial.getSuscripcion());
    }

}