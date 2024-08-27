package Contraseña;

public class Contrasenia {
    private String contrasena;
    private int longitud;
    private boolean segura;

    public Contrasenia(int longitud) {
        RandomString random = new RandomString(longitud);
        this.longitud = longitud;
        this.contrasena = random.generarStringAleatorio();
        this.segura= setSegura();
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public boolean getSegura() {
        return segura;
    }
    public boolean setSegura() {
        int mayusculas=0,minisculas = 0,numeros=0;
        String contrasena= getContrasena();
        for (int i=0; i< longitud;i++){
            int caracter= (int)contrasena.charAt(i);
            if ( caracter >= 65 && caracter <= 90){
                mayusculas++;
            }
            else if (caracter >= 97 && caracter <= 122){
                minisculas++;
            }
            else if(caracter >= 48 &&  caracter <= 57){
                numeros++;
            }
        }
        return mayusculas > 2 && minisculas > 1 && numeros >= 2;
    }

    public void mostrarContrasena(){
        if (getSegura()){
            System.out.println(getContrasena() + " - Fuerte");
        }
        else {
            System.out.println(getContrasena() + " - Debil");
        }
    }
}
