package ar.edu.unlu.poo.tp1.ej2;

public class NodoListaDoble {
    private Object dato;
    private NodoListaDoble proximo = null;
    private NodoListaDoble anterior = null;

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return dato;
    }

    public void setProximo(NodoListaDoble nodo){
        this.proximo = nodo;
    }

    public NodoListaDoble getProximo(){
        return proximo;
    }

    public void setAnterior(NodoListaDoble anterior) {
        this.anterior = anterior;
    }

    public NodoListaDoble getAnterior() {
        return anterior;
    }
}
