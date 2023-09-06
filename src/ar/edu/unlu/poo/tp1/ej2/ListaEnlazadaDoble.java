package ar.edu.unlu.poo.tp1.ej2;

public class ListaEnlazadaDoble {
    NodoListaDoble primero;

    public ListaEnlazadaDoble crearLista(){
        primero = null;
        return this; // se devuelve a si misma xq ya creandola por constructor por default se crea vacia
    }

    public boolean esVacia(){
        boolean vacia = true;
        if (primero != null){
            vacia = false;
        }
        return vacia;
    }

    /* creo el metodo longitud(para practicar) que recorre toda la lista para saber cuantos hay. pero es mas eficiente
    tener un atributo privado "longitud" e ir incrementando o decrementando segun vaya creando/eliminando nodos */
    public int longitud()
    {
        int cantidad = 0;
        if (!esVacia()){    // si la lista no esta vacia cuento cuantos elementos hay en la misma
            NodoListaDoble nodo = primero;
            while (nodo != null){
                cantidad++;
                nodo = nodo.getProximo();
            }
        }
        return cantidad;
    }

    public void agregar (Object elemento){ // agrega un dato al final de la lista
        NodoListaDoble nuevoNodo = new NodoListaDoble();
        nuevoNodo.setDato(elemento);
        if (esVacia()){
            primero = nuevoNodo;
        } else {
            NodoListaDoble nodo = primero;
            while (nodo.getProximo() != null){ // busco el ultimo elemento de la lista
                nodo = nodo.getProximo();
            }
            nuevoNodo.setAnterior(nodo);
            nodo.setProximo(nuevoNodo);
        }
    }

    public void eliminar(int posicionLista){ // elimino un elemento en la posicion indicada;
        if (!esVacia() && (existePosicionEnMiLista(posicionLista)) ){ // verifico que la lista no este vacia y exista esa posicion dentro de mi lista
            if (posicionLista == 1){
                primero = primero.getProximo();
                primero.setAnterior(null);
            } else {
                NodoListaDoble nodoAEliminar = buscarNodoLista(posicionLista);
                nodoAEliminar.getAnterior().setProximo(nodoAEliminar.getProximo()); // le digo a mi nodo anterior q setee su proximo como mi proximo
                if (nodoAEliminar.getProximo() != null){ // si mi nodo a eliminar tiene proximo seteo su anterior como mi anterior, sino tiene proximo es xq es el ultimo elemento
                    nodoAEliminar.getProximo().setAnterior(nodoAEliminar.getAnterior());
                }

            }
        }
    }

    public Object recuperar (int posicionLista){
        Object dato = null;
        if (existePosicionEnMiLista(posicionLista)){
            dato = buscarNodoLista(posicionLista).getDato();
        }
        return dato;
    }

    // funcion que recupera el dato del nodo anterior / se implemento para verificar el correcto
    // funcionamiento de las listas enlazadas dobles
    public Object recuperarAnterior (int posicionLista){
        Object dato = null;
        if (existePosicionEnMiLista(posicionLista)){
            if (buscarNodoLista(posicionLista).getAnterior() == null){
                dato = null;
            } else {
                dato = buscarNodoLista(posicionLista).getAnterior().getDato();
            }
        }
        return dato;
    }

    // inserto elementos en una posicion dada (si la lista esta vacia no puedo insertar elementos)
    public void insertar (Object elemento, int posicionLista){
        NodoListaDoble nuevoNodo = new NodoListaDoble();
        nuevoNodo.setDato(elemento);
        if ((!esVacia()) && existePosicionEnMiLista(posicionLista)){
            if (posicionLista == 1){ // si quiero insertar el elemento en la primer posicion
                nuevoNodo.setProximo(primero);
                primero.setAnterior(nuevoNodo);
                primero = nuevoNodo;
            } else {
                nuevoNodo.setProximo(buscarNodoLista(posicionLista));
                nuevoNodo.setAnterior(buscarNodoLista(posicionLista-1));
                nuevoNodo.getProximo().setAnterior(nuevoNodo);
                nuevoNodo.getAnterior().setProximo(nuevoNodo);
            }
        }
    }

    public String toString(){
        String s = "";
        NodoListaDoble nodo = primero;
        while (nodo != null){
            s = (s + nodo.getDato().toString() + " / ");
            nodo = nodo.getProximo();
        }
        return s;
    }

    // Informo si existe o no la posicion indicada en mi lista
    private boolean existePosicionEnMiLista(int posicion) {
        boolean existe = false;
        if ((posicion <= longitud()) && (posicion > 0)){
            existe = true;
        }
        return existe;
    }

    // Devuelvo el nodo de la lista de la posicion pasada por parametro
    private NodoListaDoble buscarNodoLista(int posicion){
        NodoListaDoble nodo = null;
        if (!esVacia()){
            int posLista = 1;
            nodo = primero;
            while (posicion != posLista){
                nodo = nodo.getProximo();
                posLista++;
            }
        }
        return nodo;
    }

}

