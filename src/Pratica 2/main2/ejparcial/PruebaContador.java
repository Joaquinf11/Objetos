package ejparcial;

public class PruebaContador {
    private Contador c;

    public void comenzar(){
        c = new Contador(1);
        this.setContador(c);
    }

    public void setContador(Contador c){
        c = null;
        c= new Contador(3);
    }


    public Contador getContador() {
        return this.c;
    }
}
