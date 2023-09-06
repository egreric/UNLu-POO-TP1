package ar.edu.unlu.poo.tp1.ej3;

public class NodoPila {
    private Object dato;
    private NodoPila proximo = null;

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return dato;
    }

    public void setProximo(NodoPila nodo){
        this.proximo = nodo;
    }

    public NodoPila getProximo(){
        return proximo;
    }

}
