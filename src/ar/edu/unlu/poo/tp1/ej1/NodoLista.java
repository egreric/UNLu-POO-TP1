package ar.edu.unlu.poo.tp1.ej1;

public class NodoLista {
    private Object dato;
    private NodoLista proximo = null;

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return dato;
    }

    public void setProximo(NodoLista nodo){
        this.proximo = nodo;
    }

    public NodoLista getProximo(){
        return proximo;
    }

}
