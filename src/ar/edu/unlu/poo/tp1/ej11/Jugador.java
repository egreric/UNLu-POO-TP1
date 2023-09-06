package ar.edu.unlu.poo.tp1.ej11;

public class Jugador {
    private String nombre;
    private int puntaje;

    public Jugador(String nombre){
        setNombre(nombre);
        setPuntaje(0);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public int getPuntaje() {
        return puntaje;
    }

    private void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void sumarPuntaje(int puntaje){
        this.puntaje += puntaje;
    }
}
