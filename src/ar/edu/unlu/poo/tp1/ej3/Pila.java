package ar.edu.unlu.poo.tp1.ej3;

public class Pila {

    private NodoPila tope;

    public Pila crearPila(){
        tope = null;
        return this;
    }

    public boolean esVacia(){
        boolean vacia = true;
        if (tope != null){
            vacia = false;
        }
        return vacia;
    }

    public void apilar(Object elemento){
        NodoPila nuevoNodo = new NodoPila();
        nuevoNodo.setDato(elemento);
        nuevoNodo.setProximo(tope);
        tope = nuevoNodo;
    }

    public void desapilar(){
        tope = tope.getProximo();
    }

    public Object recuperarTope(){
        return tope.getDato();
    }

}
