package ar.edu.unlu.poo.tp1.ej11;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private Diccionario diccionario;
    private int cantidadJugadores

    public Juego(String nombreJugador1, String nombreJugador2, ArrayList<String> listaPalabras){
        setJugadores(nombreJugador1,nombreJugador2);
        setDiccionario(listaPalabras);
    }

    private void setJugadores(String nombre1, String nombre2){
        this.jugadores.add(new Jugador(nombre1));
        this.jugadores.add(new Jugador(nombre2));
    }

    private void setDiccionario(ArrayList<String> palabras){
        this.diccionario = new Diccionario(palabras);
    }

    public String getNombreJugador1(){
        return this.jugadores.get(1).getNombre();
    }

    public String getNombreJugador2(){
        return this.jugadores.get(2).getNombre();
    }

    public boolean existePalabra(String palabra){
       return this.diccionario.esValida(palabra);
    }

    public int getPuntajePalabra(String palabra){
        String p = palabra.toLowerCase();
        int suma = 0;
        for (int i = 0; i < palabra.length(); i++){
            if ((p.charAt(0) == 'k') || (p.charAt(0) == 'z') || (p.charAt(0) == 'x') ||
                    (p.charAt(0) == 'y') ||(p.charAt(0) == 'w') || (p.charAt(0) == 'q')){
                suma += 2;
            } else {
                suma++;
            }
        }
        return suma;
    }

    public void sumarPuntajeJugador1(String palabra) {
        this.jugadores.get(1).sumarPuntaje(this.getPuntajePalabra(palabra));
    }
}
