package ar.edu.unlu.poo.tp1.ej4;

public class NodoCola {
    private Object dato;
    private NodoCola proximo = null;

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return dato;
    }

    public void setProximo(NodoCola nodo){
        this.proximo = nodo;
    }

    public NodoCola getProximo(){
        return proximo;
    }

}
