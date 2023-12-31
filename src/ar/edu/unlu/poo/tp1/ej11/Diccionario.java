package ar.edu.unlu.poo.tp1.ej11;

import java.util.ArrayList;

public class Diccionario {
    private ArrayList<String> palabras = palabras = new ArrayList<String>();

    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public void agregarPalabra(String palabra) {
        if (!existePalabra(palabra)) {
            palabras.add(palabra.toLowerCase());
        }
    }

    public boolean existePalabra(String palabra) {
        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) {
                return true;
            }
        }
        return false;
    }


}
