package ar.edu.unlu.poo.tp1.ej11;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private Diccionario diccionario;
    private Jugador jugadorActual = null;

    public Juego(Diccionario diccionario){
        setDiccionario(diccionario);
    }

    public void agregarJugador(String nombre){
        jugadores.add(new Jugador(nombre));
        if (jugadorActual == null){
            setJugadorActual(jugadores.get(0)); // al agregar al primer jugador seteo a mi actual como ese
        }
    }

    private void setJugadorActual(Jugador jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    private void setDiccionario(Diccionario diccionario){
        this.diccionario = diccionario;
    }

    private boolean palabraSeRepite(String palabra){
        for (String s: this.jugadorActual.getPalabras()){
            if (s.equals(palabra)){
                return true;
            }
        }
        return false;
    }

    public void agregarPalabra(String palabra){ // al agregar una nueva palabra siempre lo hago a mi jugador actual
        if (diccionario.existePalabra(palabra) && !palabraSeRepite(palabra)){
           jugadorActual.agregarPalabra(palabra.toLowerCase());
           jugadorActual.sumarPuntaje(calculaPuntaje(palabra));
        }
    }

    public void siguienteJugador(){
        if (jugadores.get(jugadores.size()-1) == jugadorActual) { // si mi ultimo jugador de la lista es el mismo que mi actual, entonces seteo el siguiente como el primero
            setJugadorActual(jugadores.get(0));
        } else {
            jugadorActual = jugadores.get(getPosicionJugador(jugadorActual) + 1);
        }
    }

    public int getPuntosJugadorActual() {
        return jugadorActual.getPuntaje();
    }

    public String getNombreJugadorActual() {
        return jugadorActual.getNombre();
    }

    private int getPosicionJugador(Jugador jugador){
        return jugadores.indexOf(jugadorActual);
    }
    
    private int calculaPuntaje(String palabra){
        String p = palabra.toLowerCase();
        int suma = 0;
        for (int i = 0; i < palabra.length(); i++){
            if ((p.charAt(i) == 'k') || (p.charAt(i) == 'z') || (p.charAt(i) == 'x') ||
                    (p.charAt(i) == 'y') ||(p.charAt(i) == 'w') || (p.charAt(i) == 'q')){
                suma += 2;
            } else {
                suma++;
            }
        }
        return suma;
    }

    public String getGanador(){
        String datosGanador = "";
        Jugador jugadorGanador;
        if (!jugadores.isEmpty()){
            jugadorGanador = jugadorConMasPuntos();
            datosGanador = "El ganador es el jugador: " + jugadorGanador.getNombre() + ". con un total de " + jugadorGanador.getPuntaje() + " puntos.\n" +
                    "Las palabras utilizadas fueron: " + jugadorGanador.getPalabras(); 
        } 
        return datosGanador;
    }
    
    private Jugador jugadorConMasPuntos(){
        int mayor = -1;
        Jugador jugadorMayorPuntaje = null;
        for (Jugador j: this.jugadores){
            if (j.getPuntaje() > mayor){
                jugadorMayorPuntaje = j;
                mayor = j.getPuntaje();
            }
        }
        return jugadorMayorPuntaje;
    }
}
