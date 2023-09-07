package ar.edu.unlu.poo.tp1.ej9;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaUtilidad {
    public static final String FORMATO1 = "dd-MM-yyyy";
    public static final String FORMATO2 = "MM-dd-yyyy";
    private static DateTimeFormatter formatterFormato1 = DateTimeFormatter.ofPattern(FORMATO1);
    private static DateTimeFormatter formatterFormato2 = DateTimeFormatter.ofPattern(FORMATO2);

    public static LocalDate getFechaDesdeString(String fecha, String formato){
        if (formato.equals(FORMATO1)){
            return LocalDate.parse(fecha, formatterFormato1);
        } else if (formato.equals(FORMATO2)) {
            return LocalDate.parse(fecha, formatterFormato2);
        }
        return null;
    }

    public static boolean esMayor(LocalDate fecha1, LocalDate fecha2){
        return (fecha1.isAfter(fecha2));
    }

    public static boolean esMenor (LocalDate fecha1, LocalDate fecha2){
        return (fecha1.isBefore(fecha2));
    }

    public static boolean estaEntre(LocalDate fechaAComparar, LocalDate fecha1, LocalDate fecha2){
        if (esMenor(fecha1,fecha2)){ // si fecha1 es la menor entonces pregunto si mi fecha es mayor a fecha1 pero menor a fecha2
            return (esMayor(fechaAComparar,fecha1) || esMenor(fechaAComparar,fecha2));
        } else {
            return (esMayor(fechaAComparar,fecha2) || esMenor(fechaAComparar,fecha1));
        }
    }

}
