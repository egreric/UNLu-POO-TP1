package ar.edu.unlu.poo.tp1.ej12;

import ar.edu.unlu.poo.tp1.ej5.Estado;
import ar.edu.unlu.poo.tp1.ej5.Prioridad;
import ar.edu.unlu.poo.tp1.ej5.Tarea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class AdminstradorTareas {
    private ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();

    public void crearTarea(String descripcion, LocalDate fecha, Estado estado, Prioridad prioridad, LocalDate fechaRecordatorio ){
        agregarTarea(new Tarea(descripcion,fecha,estado,prioridad,fechaRecordatorio));
    }

    private void agregarTarea(Tarea tarea){
        this.listaTareas.add(tarea);
    }

    public ArrayList<Tarea> devolverListadoOrdenado(){
        Comparator<Tarea> comparadorA = Comparator.comparing(Tarea::getPrioridad);
        Comparator<Tarea> comparadorB = comparadorA.thenComparing(Comparator.comparing(Tarea::getFechaLimite));
        listaTareas.sort(comparadorB);
        return listaTareas;
    }

    public Tarea buscarPorTitulo(String titulo){
        for (Tarea t :listaTareas){
            if (t.getDescripcion().equalsIgnoreCase(titulo)){
                return t;
            }
        }
        return null;
    }

    public void completarTarea(String titulo){
        Tarea t = buscarPorTitulo(titulo);
        if (t != null){
            t.completar();
        }
    }

}
