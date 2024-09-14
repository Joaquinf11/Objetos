package clubfutbol;

public enum TipoSuscripcion {
    BASICA,INTERMEDIA,DESTACADA;


    public static TipoSuscripcion toTipoSuscripcion(String tipo) {
        return switch (tipo) {
            case "Basica" -> TipoSuscripcion.BASICA;
            case "Intermedia" -> TipoSuscripcion.INTERMEDIA;
            case "Destacada" -> TipoSuscripcion.DESTACADA;
            default -> null;
            // aca prodria haber un exception error de si carga mal la suscripcion que la vuelva a cargar
        };
    }

}
