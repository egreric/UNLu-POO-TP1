package ar.edu.unlu.poo.tp1.ej11;

public class MainEj11 {
    public static void main(String[] args) {
        Diccionario d = new Diccionario();
        d.agregarPalabra("kiwi");
        d.agregarPalabra("zapato");
        d.agregarPalabra("red");
        d.agregarPalabra("casa");
        d.agregarPalabra("kawasaki");
        d.agregarPalabra("yucatan");
        d.agregarPalabra("pera");
        d.agregarPalabra("zanahoria");
        d.agregarPalabra("externo");
        d.agregarPalabra("queso");
        d.agregarPalabra("lampara");

        System.out.println("El listado de palabras es: " + d.getPalabras());
        Juego j = new Juego(d);

        j.agregarJugador("Pedro");
        j.agregarJugador("Carlos");

        System.out.println("Jugador: " + j.getNombreJugadorActual());
        j.agregarPalabra("parque");
        System.out.println(j.getPuntosJugadorActual());
        j.agregarPalabra("Lampara");
        j.agregarPalabra("QUESO");
        j.agregarPalabra("externo");
        System.out.println(j.getPuntosJugadorActual());

        j.siguienteJugador();
        System.out.println("Jugador: " + j.getNombreJugadorActual());
        j.agregarPalabra("kawasaki");
        j.agregarPalabra("pera");
        j.agregarPalabra("pantalla");
        j.agregarPalabra("kawasaki");
        j.agregarPalabra("kawasaki");
        System.out.println(j.getPuntosJugadorActual());

        System.out.println(j.getGanador());

    }

}
