package joaco;

public class Pila {
    private NodoPila tope;
    private int cantidaElementos;

    // apilar desapilar tope vacia

    public boolean estaVacia(){
        return this.cantidaElementos == 0;
    }

    public void apilar(int valor){
        NodoPila nuevoNodo= new NodoPila(valor);
        if (estaVacia()){
            this.tope= nuevoNodo;
            this.cantidaElementos++;
        }
        else {
            nuevoNodo.setSiguiente(this.tope);
            this.tope=nuevoNodo;
            this.cantidaElementos++;
        }
    }

    public int desapilar(){
        NodoPila nodo=this.tope;
        this.tope= nodo.getSiguiente();
        this.cantidaElementos--;
        return nodo.getValor();
    }

}
