package palabras;

public class Palabra {
    private final String palabra;
    private int puntaje;

    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return this.palabra;
    }

    public int getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void calcularPuntaje(){
        String palabra= getPalabra();
        int cantLetras= palabra.length();
        for (int i=0; i <cantLetras; i++){
            int caracter= (int)palabra.charAt(i);
            if (caracter >= 107 &&  caracter <= 119){
                this.puntaje++;
            }
        }
    }
}
