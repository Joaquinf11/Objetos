package billetera;

public class Billetera {
    private Dinero saldo;
    private String nombreUsuario;

    public Billetera(Dinero saldo,String nombreUsuario) {
        this.saldo =saldo;
        this.nombreUsuario=nombreUsuario;
    }
}
