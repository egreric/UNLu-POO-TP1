package ar.edu.unlu.poo.tp1.ej2;

public class MainEj2 {
    public static void main(String[] args) {
        ListaEnlazadaDoble lista2 = new ListaEnlazadaDoble();
        lista2 = lista2.crearLista();

        lista2.agregar('5'); // agrego elementos(nodos) a mi lista Enlazada DobleS
        lista2.agregar(10);
        lista2.agregar(15.0);
        lista2.agregar("20");

        lista2.insertar("INSERTADO",3);
        System.out.println(lista2.toString());

        lista2.eliminar(2);
        System.out.println(lista2.toString());
    }

}
