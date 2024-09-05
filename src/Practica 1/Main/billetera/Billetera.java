package billetera;

public class Billetera {
    private Dinero saldo;
    private final String  nombreUsuario;

    public Billetera(Dinero saldo,String nombreUsuario) {
        this.saldo =saldo;
        this.nombreUsuario=nombreUsuario;
    }

    public Dinero getSaldo() {
        return this.saldo;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void acreditar(Dinero monto){
        Dinero convertido= Conversor.convertir(monto,this.saldo.getMoneda());
        double nuevoMonto= convertido.getMonto() + getSaldo().getMonto();
        this.saldo= new Dinero(nuevoMonto, getSaldo().getMoneda());
    }

    public boolean desacreditar(Dinero monto){
        Dinero convertido = Conversor.convertir(monto, this.saldo.getMoneda());
        if (this.saldo.getMonto() >= convertido.getMonto()) {
            double nuevoMonto =this.saldo.getMonto() - convertido.getMonto();
            this.saldo = new Dinero(nuevoMonto, this.saldo.getMoneda());
            return true;
        }
        else {
            System.out.println("No hay saldo suficiente en la cuenta");
            return false;
        }
    }
}
