package joaco;

import java.util.Scanner;

public class Lista {

    private Nodo inicio;

    private int cantidadElementos;

    public Lista() {
        this.cantidadElementos = 0;
    }

    public boolean estaVacia() {
        return this.cantidadElementos == 0;
    }

    public int longitud(){
        return this.cantidadElementos;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (this.estaVacia()) {
            this.inicio = nuevoNodo;
            this.cantidadElementos++;

        } else {
            Nodo nodoActual = this.inicio;
            while (nodoActual.valorIs(valor) || nodoActual.hasSiguiente()) {
                nodoActual = nodoActual.getSiguiente();
            }
            if (!nodoActual.hasSiguiente() && !nodoActual.valorIs(valor)) {
                nodoActual.setSiguiente(nuevoNodo);
                this.cantidadElementos++;
            }
        }
    }



    public void eliminar(int valor){
        Nodo nodoActual = this.inicio;
        if (nodoActual.valorIs(valor)) {
            this.inicio = nodoActual.getSiguiente();
            this.cantidadElementos--;
        }
        else {
            boolean bandera=true;
            while (nodoActual.hasSiguiente() && bandera) {
                if (nodoActual.getSiguiente().valorIs(valor)){
                    bandera=false;
                    nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
                    this.cantidadElementos--;
                }
                else{
                    nodoActual = nodoActual.getSiguiente();
                }
            }
        }
    }

    public boolean buscar(int valor) {
        if (this.estaVacia()) {
            return false;
        } else {
            Nodo nodoActual = this.inicio;
            boolean bandera=true;
            while (bandera && nodoActual.hasSiguiente()) {
                if (nodoActual.valorIs(valor)) {
                    bandera = false;
                } else {
                    nodoActual = nodoActual.getSiguiente();
                }
            }
            return nodoActual.valorIs(valor);
        }
    }


    public int recuperar(int posicion){
        if (posicion > longitud() || estaVacia()){
            return -111111111;
        }
        Nodo nodoActual=this.inicio;
        int i=0;
        while (nodoActual.hasSiguiente() && posicion-1 != i){
            nodoActual= nodoActual.getSiguiente();
            i++;
        }
        return nodoActual.getValor();
    }

    public void insertar(int valor,int posicion){
        Nodo nuevoNodo= new Nodo (valor);
        if (estaVacia()){
            this.inicio=nuevoNodo;
            this.cantidadElementos++;
        }
        if (posicion > this.cantidadElementos){
            agregar(valor);
        }
        else if (posicion == 1){
            nuevoNodo.setSiguiente(this.inicio);
            this.inicio=nuevoNodo;
            this.cantidadElementos++;
        }
        else{
            Nodo nodoActual= this.inicio;
            Nodo nodoAnterior=this.inicio;
            int i=0;
            while(nodoActual.hasSiguiente() && posicion-1 != i){
                nodoAnterior=nodoActual;
                nodoActual=nodoActual.getSiguiente();
                i++;
            }
            nuevoNodo.setSiguiente(nodoActual);
            nodoAnterior.setSiguiente(nuevoNodo);
            this.cantidadElementos++;
        }
    }


    public void mostrarLista(){

        System.out.print("[ ");
        Nodo nodoActual=this.inicio;
        //System.out.print(nodoActual.getValor());
        for (int i= 0; i < longitud();i++){
            System.out.print(nodoActual.getValor());
            nodoActual=nodoActual.getSiguiente();
        }
        System.out.println(" ]");
    }

}