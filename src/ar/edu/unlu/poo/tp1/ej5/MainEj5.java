package ar.edu.unlu.poo.tp1.ej5;

import java.time.LocalDate;

public class MainEj5 {
    public static void main(String[] args){
        LocalDate fechaAyer = LocalDate.now().minusDays(1);  // seteo una variable fecha con la fecha actual de hoy
        LocalDate fecha = LocalDate.of(2023,9,2);

        System.out.println("\nCOMIENZA EL EJERCICIO\n");
        Tarea tarea1 = new Tarea("Ir al supermercado mañana",fecha, Estado.INCOMPLETA);
        Tarea tarea2 = new Tarea("Consultar repuesto del auto",fechaAyer,Estado.COMPLETA);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel",fechaAyer,Estado.INCOMPLETA);
        System.out.println(tarea1.mostrarTarea());
        System.out.println(tarea2.mostrarTarea());
        System.out.println(tarea3.mostrarTarea());

    }
}
