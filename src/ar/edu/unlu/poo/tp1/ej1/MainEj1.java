package ar.edu.unlu.poo.tp1.ej1;

public class MainEj1 {
    public static void main(String[] args){
        ListaEnlazada lista = new ListaEnlazada();
        lista = lista.crearLista(); // creo lista vacia
        if (lista.esVacia()){       // funcion que me dice si la lista se encuentra vacia
            System.out.println("Lista vacia creada");
        }
        System.out.println("La longitud de la lista vacia es: " + lista.longitud() + "\n"); // funcion para saber la cantidad de elementos de una lista


        System.out.println("Agregamos 4 elementos a la lista");
        lista.agregar('5'); // agrego elementos(nodos) a mi lista
        lista.agregar(10);
        lista.agregar(15.0);
        lista.agregar("20");
        System.out.println("Los valores de los elementos que estan en la lista son: " + lista.toString());  // sobrecarga del metodo toString -- muestros todos los elementos de la lista
        System.out.println("La longitud de la lista es: " + lista.longitud() + "\n");

        System.out.println("Eliminamos el elemento en la posicion 2 de la lista");
        lista.eliminar(2);  // elimino un elemento de la lista en la posicion indicada

        for (int i = 1; i <= lista.longitud(); i++){
            System.out.println("Elemento " + i + " de la lista: " + lista.recuperar(i) );
        }



        System.out.println("Insertamos un elemento en la posicion 3 de la lista");
        lista.insertar("NUEVO_ELEMENTO",3);
        System.out.println("Los valores de los elementos que estan en la lista son: " + lista.toString());
    }
}
