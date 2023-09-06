package ar.edu.unlu.poo.tp1.ej8;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEj8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Password> listaPw = new ArrayList<Password>();
        int cantidadPw;
        int longitud;
        boolean hayDebiles = false;

        System.out.println("Ingrese la cantidad de passwords a generar");
        cantidadPw = sc.nextInt();

        for (int i = 1; i <= cantidadPw; i++){
            System.out.println("Ingresar longitud de la password " + i);
            longitud = sc.nextInt();
            listaPw.add(new Password(longitud));
        }


        for (Password p : listaPw) {
            System.out.println(p.toString());
            if (!p.esFuerte()){
                hayDebiles = true;
            }
        }

        if (hayDebiles){
            System.out.println("\nExisten passwords debiles, se regeneraran para convertirlas en fuertes\n");
        }

        for (Password p: listaPw){
            if (!p.esFuerte()){
                System.out.print("La password debil: " + p.getPassword());
                p.generarPasswordFuerte();
                System.out.println(" fue reemplazada por la password fuerte: " + p.getPassword());
            }
        }





    }
}
