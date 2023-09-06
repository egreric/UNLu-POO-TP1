package ar.edu.unlu.poo.tp1.ej11;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEj11 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        //// agrego 10 palabras a una lista y luego instancio un objeto diccionario
        s.add("kiwi");
        s.add("zapato");
        s.add("red");
        s.add("kawasaki");
        s.add("yucatan");
        s.add("queso");
        s.add("externo");
        s.add("ley");
        s.add("wendy");
        s.add("fiebre");
        Diccionario d = new Diccionario(s);
        //// agrego 10 palabras mas mediante metodo de diccionario(con algunas repetidas)
        d.agregarPalabra("ley");    // repetido
        d.agregarPalabra("axioma");
        d.agregarPalabra("ayer");
        d.agregarPalabra("reloj");
        d.agregarPalabra("zapato");    // repetido
        d.agregarPalabra("coyote");
        d.agregarPalabra("agazapado");
        d.agregarPalabra("zapatilla");
        d.agregarPalabra("yucatan");    // repetido
        d.agregarPalabra("red");    // repetido
        System.out.println("El listado de palabras es: " + d.getPalabras());

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar nombre de jugador 1: ");
        String jugador1 = sc.nextLine();
        System.out.println("Ingresar nombre de jugador 2: ");
        String jugador2 = sc.nextLine();

        Juego juego = new Juego(jugador1,jugador2,d.getPalabras());
        String palabra;

        int cantRondas = 3;
        juego.
        for (int i = 1; i <= cantRondas; i++){
            System.out.println("RONDA " + i);
            System.out.println("Jugador " + juego.getNombreJugador1() + " Ingrese una palabra: ");
            palabra = sc.nextLine();
            if (juego.existePalabra(palabra)){
                System.out.println("La palabra existe!, sumaste " + juego.getPuntajePalabra(palabra) + " puntos.");
                juego.sumarPuntajeJugador1(palabra);
            } else {
                System.out.println("La palabra no es valida, no sumas puntos");
            }
        }

    }

}
