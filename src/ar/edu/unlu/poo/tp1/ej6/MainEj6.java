package ar.edu.unlu.poo.tp1.ej6;

import java.util.ArrayList;

public class MainEj6 {
    public static void main(String[] args){

        Libro libro1 = new Libro("Subiendo la cima","Carlos Sanchez",540,10);
        Libro libro2 = new Libro("Bajando la nube","Pedro Rodriguez","24ABN2",780,1);
        System.out.println(libro1.getDescripcion());
        System.out.println(libro2.getDescripcion());

        // informo cual libro tiene mas paginas
        if (libro1.getCantidadPaginas() > libro2.getCantidadPaginas()){
            System.out.println("El libro: " + libro1.getTitulo() + " tiene mas paginas(" + libro1.getCantidadPaginas() + ") que el libro: " + libro2.getTitulo() + "(" + libro2.getCantidadPaginas() + ").");
        } else {
            System.out.println("El libro: '" + libro2.getTitulo() + "' tiene mas paginas(" + libro2.getCantidadPaginas() + ") que el libro: '" + libro1.getTitulo() + "(" + libro1.getCantidadPaginas() + ").");
        }

        // agrego libros a una lista
        ArrayList<Libro> libros = new ArrayList<Libro>();
        libros.add(libro1);
        libros.add(libro2);

        // prestamo de libros
        for (Libro l: libros) {
            if (l.prestar()) {
                System.out.println("Libro prestado!");
            } else {
                System.out.println("No se pudo prestar el libro");
            }
        }

        for (int i = 0; i < libros.size(); i++){
            System.out.println(libros.get(i).getDescripcion());
        }

        int suma = 0;
        for (Libro l: libros){
            suma += l.getCantidadEjemplaresPrestados();
        }
        System.out.println("La cantidad total hecha de prestamos es de: " + suma + " Libros");
    }
}
