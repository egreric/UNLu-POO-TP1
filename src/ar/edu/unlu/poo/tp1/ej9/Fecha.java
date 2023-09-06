package ar.edu.unlu.poo.tp1.ej9;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private String fecha;

    public Fecha(String fecha){
        setFecha(fecha);
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return stringAFecha(this.fecha);
    }

    public String toString(){
        return this.fecha;
    }

    private LocalDate stringAFecha(String fecha){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(fecha, formatter);
    }

    public boolean esMayor(String fecha){
        LocalDate f = stringAFecha(fecha);
        if (getFecha().isAfter(f)){
            return true;
        } else {
            return false;
        }
    }

    public boolean esMenor(String fecha){
        LocalDate f = stringAFecha(fecha);
        if (getFecha().isBefore(f)){
            return true;
        } else {
            return false;
        }
    }

    private boolean esIgual(String fecha){
        LocalDate f = stringAFecha(fecha);
        if (getFecha().isEqual(f)){
            return true;
        } else {
            return false;
        }
    }


    public boolean estaEntre(String fecha1, String fecha2){
        if ( esIgual(fecha1) || esIgual(fecha2) ){
            return true;
        } else if ( esMayor(fecha1) && esMenor(fecha2) ) {
            return true;
        } else if ( esMayor(fecha2) && esMenor(fecha1) ) {
            return true;
        } else {
            return false;
        }
    }
}
