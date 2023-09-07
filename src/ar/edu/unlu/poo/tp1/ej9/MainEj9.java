package ar.edu.unlu.poo.tp1.ej9;


import java.time.LocalDate;

public class MainEj9 {
    public static void main(String[] args){
        LocalDate fecha1 = FechaUtilidad.getFechaDesdeString("31-05-2023",FechaUtilidad.FORMATO1);
        LocalDate fecha2 = FechaUtilidad.getFechaDesdeString("07-29-2023",FechaUtilidad.FORMATO2);


        System.out.println("El " + fecha1 + " es Mayor que el " + fecha2 + "? : " + FechaUtilidad.esMayor(fecha1,fecha2));
        System.out.println("El " + fecha1 + " es Menor que el " + fecha2 + "? : " + FechaUtilidad.esMenor(fecha1,fecha2));

        LocalDate fecha3 = FechaUtilidad.getFechaDesdeString("25-06-2023","dd-MM-yyyy");
        System.out.println("El " + fecha3 + " esta entre el " + fecha1 + " y el: " + fecha2 + "?: " + FechaUtilidad.estaEntre(fecha3,fecha1,fecha2));
        System.out.println("El " + fecha3 + " esta entre el " + fecha2 + " y el: " + fecha1 + "?: " + FechaUtilidad.estaEntre(fecha3,fecha2,fecha1));


    }
}
