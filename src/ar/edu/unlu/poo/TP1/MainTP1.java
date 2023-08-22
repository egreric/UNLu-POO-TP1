package ar.edu.unlu.poo.TP1;

import ar.edu.unlu.poo.TP1.EJ1.*;

import java.util.Scanner;

public class MainTP1 {

    public static void main(String[] args){
        Nodo nodo = new Nodo();
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        while (!opcion.equals("0")){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("TRABAJO PRACTICO 1 \n");
            System.out.println("1 -> EJERCICIO 1");
            System.out.println("2 -> EJERCICIO 2");
            System.out.println("3 -> EJERCICIO 3");
            System.out.println("4 -> EJERCICIO 4");
            System.out.println("5 -> EJERCICIO 5");
            System.out.println("0 -> SALIR \n");
            System.out.println("INGRESE UNA OPCION: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("CODIGO DE EJERCICIO 1");
                }
                case "2" -> {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("CODIGO DE EJERCICIO 2");
                }
                case "3" -> {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("CODIGO DE EJERCICIO 3");
                }
                case "4" -> {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("CODIGO DE EJERCICIO 4");
                }
                case "5" -> {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("CODIGO DE EJERCICIO 5");
                }
                case "0" -> {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("SALIENDO..");
                }
                default -> {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("OPCION FUERA DE RANGO");
                }
            }

            if (!opcion.equals("0")) {
                System.out.println("PRESIONE ENTER PARA CONTINUAR".toLowerCase());
                sc.nextLine();
            }

        }

    }
}
