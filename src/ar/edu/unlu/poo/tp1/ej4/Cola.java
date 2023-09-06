package ar.edu.unlu.poo.tp1.ej4;

public class Cola {
    private NodoCola primero;
    private NodoCola ultimo;

    public Cola crearCola() {
        primero = null;
        ultimo = null;
        return this;
    }

    public boolean esVacia() {
        boolean vacia = true;
        if (primero != null) {
            vacia = false;
        }
        return vacia;
    }


    public void encolar(Object elemento) {
        NodoCola nuevoNodo = new NodoCola();
        nuevoNodo.setDato(elemento);
        if (esVacia()) {
            primero = nuevoNodo;
        } else {
            ultimo.setProximo(nuevoNodo);
        }
        ultimo = nuevoNodo;
    }

    public void desencolar() {
        if (!esVacia()) {
            if (primero == ultimo) {
                ultimo = primero.getProximo(); // si el primery  ultimo apuntan al mismo objeto entonces hay un solo elemento en la cola
            }
            primero = primero.getProximo();
        }

    }

    // recupero el primer elemento de la cola sin desencolar
    public Object recuperar() {
        Object dato = null;
        if (!esVacia()) {
            dato = primero.getDato();
        }
        return dato;
    }

}
