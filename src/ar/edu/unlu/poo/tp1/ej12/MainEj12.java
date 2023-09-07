package ar.edu.unlu.poo.tp1.ej12;

import ar.edu.unlu.poo.tp1.ej5.Estado;
import ar.edu.unlu.poo.tp1.ej5.Prioridad;
import ar.edu.unlu.poo.tp1.ej5.Tarea;
import ar.edu.unlu.poo.tp1.ej9.FechaUtilidad;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainEj12 {
    public static void main(String[] args) {
        AdminstradorTareas adm = new AdminstradorTareas();

        adm.crearTarea("Cantar", FechaUtilidad.getFechaDesdeString("24-03-2028", FechaUtilidad.FORMATO1),
                Estado.INCOMPLETA, Prioridad.ALTA, FechaUtilidad.getFechaDesdeString("30-09-2021", FechaUtilidad.FORMATO1));

        adm.crearTarea("Pasear al perro", FechaUtilidad.getFechaDesdeString("30-08-2022", FechaUtilidad.FORMATO1),
                Estado.INCOMPLETA, Prioridad.ALTA, FechaUtilidad.getFechaDesdeString("30-09-2021", FechaUtilidad.FORMATO1));

        adm.crearTarea("Cocinar", LocalDate.now(),
                Estado.INCOMPLETA, Prioridad.BAJA, FechaUtilidad.getFechaDesdeString("30-09-2021", FechaUtilidad.FORMATO1));

        adm.crearTarea("Hacer ejercicio", FechaUtilidad.getFechaDesdeString("22-08-2025", FechaUtilidad.FORMATO1),
                Estado.INCOMPLETA, Prioridad.BAJA, FechaUtilidad.getFechaDesdeString("30-09-2021", FechaUtilidad.FORMATO1));

        adm.crearTarea("Estudiar", FechaUtilidad.getFechaDesdeString("13-07-2026", FechaUtilidad.FORMATO1),
                Estado.INCOMPLETA, Prioridad.BAJA, FechaUtilidad.getFechaDesdeString("30-09-2021", FechaUtilidad.FORMATO1));

        adm.crearTarea("Ir al cine", LocalDate.now(),
                Estado.INCOMPLETA, Prioridad.MEDIA, FechaUtilidad.getFechaDesdeString("30-09-2021", FechaUtilidad.FORMATO1));

        adm.crearTarea("Ir a la universidad", FechaUtilidad.getFechaDesdeString("21-01-2020", FechaUtilidad.FORMATO1),
                Estado.INCOMPLETA, Prioridad.ALTA, FechaUtilidad.getFechaDesdeString("30-09-2019", FechaUtilidad.FORMATO1));

        adm.crearTarea("Programar", LocalDate.now(),
                Estado.INCOMPLETA, Prioridad.MEDIA, FechaUtilidad.getFechaDesdeString("30-09-2021", FechaUtilidad.FORMATO1));

        ArrayList<Tarea> listado = adm.devolverListadoOrdenado();
        for (int i = 0; i < listado.size(); i++){
            System.out.println(listado.get(i).mostrarTarea() + " - " + listado.get(i).getPrioridad() + " - " + listado.get(i).getFechaLimite() );
        }
        System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////////////////\n");


        Tarea t = adm.buscarPorTitulo("ir a la universidad");
        if (t != null){
            System.out.println("La tarea existe: \n" + t.getDescripcion() + " - " + t.getPrioridad() + " - " + t.getFechaLimite() );
        } else {
            System.out.println("La tarea no existe");
        }
        System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////////////////\n");

        adm.completarTarea("ir a la universidad");
        adm.completarTarea("programar");
        adm.completarTarea("Cocinar");
        for (int i = 0; i < listado.size(); i++){
            System.out.println(listado.get(i).mostrarTarea() + " - " + listado.get(i).getPrioridad() + " - " + listado.get(i).getFechaLimite() );
        }
    }
}
