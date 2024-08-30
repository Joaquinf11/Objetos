package Contraseña;

import java.util.Random;

public class RandomString {
    private int longitud;
    private final String characters;

    public RandomString( int longitud) {
        this.characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        this.longitud = longitud;
    }

    public String getCharacters() {
        return characters;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String generarStringAleatorio() {
        // StringBuilder para construir el string aleatorio
        StringBuilder randomString = new StringBuilder(getLongitud());
        // Generador de números aleatorios
        Random random = new Random();
        for (int i = 0; i < getLongitud(); i++) {
            // Seleccionar un índice aleatorio de 'characters' y añadirlo a 'randomString'
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }

        return randomString.toString();
    }
}

