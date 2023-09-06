package ar.edu.unlu.poo.tp1.ej1;

public class ListaEnlazada {
    NodoLista primero;

    public ListaEnlazada crearLista(){
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
            NodoLista nodo = primero;
            while (nodo != null){
                cantidad++;
                nodo = nodo.getProximo();
            }
        }
        return cantidad;
    }

    public void agregar (Object elemento){ // agrega un dato al final de la lista
            NodoLista nuevoNodo = new NodoLista();
            nuevoNodo.setDato(elemento);
            if (esVacia()){
                primero = nuevoNodo;
            } else {
                NodoLista nodo = primero;
                while (nodo.getProximo() != null){ // while (NODO != NULL)
                    nodo = nodo.getProximo();
                }
                nodo.setProximo(nuevoNodo);
            }
    }

    public void eliminar(int posicionLista){ // elimino un elemento en la posicion indicada;
        if (!esVacia() && (existePosicionEnMiLista(posicionLista)) ){ // verifico que la lista no este vacia y exista esa posicion dentro de mi lista
            if (posicionLista == 1){
                primero = primero.getProximo();
            } else {
                NodoLista nodoAnterior = buscarNodoLista(posicionLista-1); // nodo anterior al buscado
                NodoLista nodoBuscado = nodoAnterior.getProximo(); // nodo buscado
                nodoAnterior.setProximo(nodoBuscado.getProximo());
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

    // inserto elementos en una posicion dada (si la lista esta vacia no puedo insertar elementos)
    public void insertar (Object elemento, int posicionLista){
        NodoLista nuevoNodo = new NodoLista();
        nuevoNodo.setDato(elemento);
        if ((!esVacia()) && existePosicionEnMiLista(posicionLista)){
            if (posicionLista == 1){
                nuevoNodo.setProximo(primero);
                primero = nuevoNodo;
            } else {
                nuevoNodo.setProximo(buscarNodoLista(posicionLista));
                buscarNodoLista(posicionLista-1).setProximo(nuevoNodo);
            }
        }
    }

    public String toString(){
        String s = "";
        NodoLista nodo = primero;
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
    private NodoLista buscarNodoLista(int posicion){
        NodoLista nodo = null;
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
