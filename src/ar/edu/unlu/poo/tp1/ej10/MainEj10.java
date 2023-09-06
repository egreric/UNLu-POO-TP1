package ar.edu.unlu.poo.tp1.ej10;

import ar.edu.unlu.poo.tp1.ej5.Estado;
import ar.edu.unlu.poo.tp1.ej5.Prioridad;
import ar.edu.unlu.poo.tp1.ej5.Tarea;
import ar.edu.unlu.poo.tp1.ej9.Fecha;

public class MainEj10 {
    public static void main(String[] args){


        Fecha fechaLimite = new Fecha("31-10-2022");
        Fecha fechaRecordatorio = new Fecha("30-09-2021");
        Tarea tarea = new Tarea("Pasear al perro", fechaLimite.getFecha(), Estado.INCOMPLETA, Prioridad.BAJA, fechaRecordatorio.getFecha());


        System.out.println("Descripcion de mi tarea: " + tarea.mostrarTarea());
        System.out.println("La prioridad de mi tarea es: " + tarea.getPrioridad());
        System.out.println("Mi fecha limite para mi tarea es: " + tarea.getFechaLimite());
        System.out.println("Mi fecha recordatorio es: " + tarea.getFechaRecordatorio());

        System.out.println("Mi tarea esta por vencer?: " + tarea.estaPorVencer());
        System.out.println("Mi tarea esta completa?: " + tarea.estaCompleta());
        System.out.println("Mi tarea esta vencida: " + tarea.estaVencida());


    }
}
