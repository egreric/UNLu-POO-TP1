package ar.edu.unlu.poo.tp1.ej11;

import java.util.ArrayList;

public class Diccionario {
    private ArrayList<String> palabras = new ArrayList<String>();

    public Diccionario(ArrayList<String> palabras){
        for (String p : palabras){
            agregarPalabra(p);
        }
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public void agregarPalabra(String palabra) {
        if (!existe(palabra)) {
            palabras.add(palabra.toLowerCase());
        }
    }

    private boolean existe(String palabra) {
        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) {
                return true;
            }
        }
        return false;
    }

    public boolean esValida(String palabra){
        return existe(palabra);
    }

}
