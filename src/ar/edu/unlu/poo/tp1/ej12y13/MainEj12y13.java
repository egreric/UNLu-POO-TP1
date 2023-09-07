package ar.edu.unlu.poo.tp1.ej12y13;

import ar.edu.unlu.poo.tp1.ej5.Estado;
import ar.edu.unlu.poo.tp1.ej5.Prioridad;
import ar.edu.unlu.poo.tp1.ej5.Tarea;
import ar.edu.unlu.poo.tp1.ej9.FechaUtilidad;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainEj12y13 {
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

        Colaborador c1 = new Colaborador("Carlos","Fernandez","24284036");
        Colaborador c2 = new Colaborador("Javier","Garcia","18388244");
        Colaborador c3 = new Colaborador("Pedro","Ramirez","31237965");

        adm.completarTarea("ir a la universidad",c1);
        adm.completarTarea("programar",c2);
        adm.completarTarea("Cantar",c2);
        adm.completarTarea("Pasear al perro",c1);
        adm.completarTarea("Cocinar",c1);
        adm.completarTarea("Hacer ejercicio",c3);
        for (int i = 0; i < listado.size(); i++){
            System.out.println(listado.get(i).mostrarTarea() + " - " + listado.get(i).getPrioridad() + " - " + listado.get(i).getFechaLimite());
        }

        System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////////////////\n");
        ArrayList<Tarea> listaColaborador = adm.devolverListadoPorColaborador(c1);
        if (listaColaborador != null) {
            System.out.println("La lista de tareas finalizadas por el colaborador '" + c1.getNombre() + " " + c1.getApellido() + "' fueron las siguientes: ");
            for (int i = 0; i < listaColaborador.size(); i++) {
                System.out.println(listaColaborador.get(i).mostrarTarea() + " - " + listaColaborador.get(i).getPrioridad() + " - " + listaColaborador.get(i).getFechaLimite());
            }
        }

    }
}
