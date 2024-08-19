import ar.unlu.edu.poo.joaco.Lista;
import ar.unlu.edu.poo.joaco.ListaDoble;
import ar.unlu.edu.poo.joaco.Pila;
import ar.unlu.edu.poo.joaco.Cola;


public  class Main {
    public static void testListaSimple() {
        Lista lista = new Lista();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

//        int resultado= lista.recuperar(5);
//        boolean resultado=lista.buscar(3);
//        System.out.println(resultado);

//        lista.eliminar(1);
//
//
//        lista.insertar(4,4);
//        lista.insertar(0,1);
//        lista.insertar(9,2);

//      System.out.print( lista.recuperar(4));

        lista.mostrarLista();

    }

    public static void testListadoble(){
        ListaDoble lista = new ListaDoble();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);


//        lista.eliminar(1);
//        lista.eliminar(2);
//        lista.eliminar(3);
//
//
//        lista.insertar(4,4);
//      lista.insertar(0,1);
//        lista.insertar(9,2);

        System.out.println( lista.recuperar(4));
        System.out.println( lista.recuperar(1));
        System.out.println( lista.recuperar(2));
      lista.mostrarLista();

    }


    public static void testPila() {
        Pila pila = new Pila();

        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);

        if (pila.desapilar() != 3){
            throw new AssertionError("No anda el desapilar/apilar :P");
        }
        System.out.println("Test: desapilar//apilar Paso!!");

//        if (!pila.toString().equals("2, 1")){
//            throw new AssertionError("Error en la funcion:  toString");
//        }
//        System.out.println("Test: toString Paso!!");

        pila.desapilar();pila.desapilar();

        if (!pila.estaVacia()){
            throw new AssertionError("Error en la funcion: estaVacia");
        };
        System.out.println("Test: estaVacia Paso!!");
    }


    public static void testCola() {
        Cola cola = new Cola();
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        if (cola.desencolar() != 1){
            throw new AssertionError("Error en el encolar//desencolar");
        };
        System.out.println("Test: desencolar//encolar Paso!!");

//        if (!cola.toString().equals("2, 3")){
//            throw new AssertionError("Error en el toString");
//        }
//        System.out.println("Test: toString Paso!!");
    }


    public static void main(String[] args){
        //testListaSimple();
        //testListadoble();
        //testPila();
        //testCola();
    }
}