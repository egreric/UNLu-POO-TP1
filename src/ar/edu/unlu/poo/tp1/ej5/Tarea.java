package ar.edu.unlu.poo.tp1.ej5;

import ar.edu.unlu.poo.tp1.ej9.FechaUtilidad;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private Prioridad prioridad;
    private Estado estado;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;
    private final LocalDate FECHA_HOY = LocalDate.now();

    public Tarea(String descripcion, LocalDate fecha, Estado estado, Prioridad prioridad, LocalDate fechaRecordatorio) {
        setDescripcion(descripcion);
        setFechaLimite(fecha);
        setEstado(estado);
        setFechaRecordatorio(fechaRecordatorio);
        setPrioridad(prioridad);
    }

    public Tarea(String descripcion, LocalDate fecha, Estado estado, Prioridad prioridad) {
        setDescripcion(descripcion);
        setFechaLimite(fecha);
        setEstado(estado);
        setPrioridad(prioridad);
        setFechaRecordatorio(null); // por defecto seteo las fechas recordatorio como null (osea q no estan por vencer)
    }

    public Tarea(String descripcion, Estado estado, Prioridad prioridad) {
        setDescripcion(descripcion);
        setFechaLimite(null);   // por defecto seteo las fechas como null (osea que no tienen fecha limite)
        setEstado(estado);
        setPrioridad(prioridad);
        setFechaRecordatorio(null); // por defecto seteo las fechas recordatorio como null (osea q no estan por vencer)
    }

    public Tarea(String descripcion, LocalDate fecha, Estado estado) {
        setDescripcion(descripcion);
        setFechaLimite(fecha);
        setEstado(estado);
        setPrioridad(Prioridad.BAJA); // por defecto seteo las prioridades como bajas
        setFechaRecordatorio(null); // por defecto seteo las fechas recordatorio como null (osea q no estan por vencer)
    }

    public Tarea(String descripcion, Estado estado) {
        setDescripcion(descripcion);
        setFechaLimite(null);   // por defecto seteo las fechas como null (osea que no tienen fecha limite)
        setEstado(estado);
        setPrioridad(Prioridad.BAJA); // por defecto seteo las prioridades como bajas
        setFechaRecordatorio(null); // por defecto seteo las fechas recordatorio como null (osea q no estan por vencer)
    }

    public boolean estaCompleta(){
        return (estado == Estado.COMPLETA);
    }

    public boolean estaVencida(){
        boolean vencida = false;
        if (fechaLimite != null && !estaCompleta()) {   // me fijo antes si la tarea esta completa (y no es nula)
            if (FechaUtilidad.esMenor(fechaLimite,FECHA_HOY)); { // comparo si mi fecha limite es menor a la fecha de hoy
                vencida = true;
            }
        }
        return vencida;
    }

    public boolean estaPorVencer(){
        boolean porVencer = false;
        if (fechaRecordatorio != null && fechaLimite != null && !estaCompleta() && !estaVencida()) {
            porVencer = (fechaRecordatorio.isEqual(FECHA_HOY) || FechaUtilidad.esMayor(fechaRecordatorio,FECHA_HOY));
        }
        return porVencer;
    }

    public void completar(){
        if (estado == Estado.INCOMPLETA){
            setEstado(Estado.COMPLETA);;
        }
    }

    public String mostrarTarea() {
        String descripcion = "";
        if (estaVencida()){
            descripcion += "(vencida)";
        } else if (estaPorVencer()){
            descripcion += "(por vencer)";
        }
        return descripcion + this.descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Prioridad getPrioridad() {
            return prioridad;
    }

    public void setPrioridad(Prioridad prioridad){
        if (estaPorVencer()){
            this.prioridad = Prioridad.ALTA;
        } else {
            this.prioridad = prioridad;
        }
    }

    public Estado getEstado() {
        return estado;
    }

    private void setEstado(Estado estado){
        this.estado = estado;
    }

    public LocalDate getFechaLimite(){
        return this.fechaLimite;
    }

    public void setFechaLimite(LocalDate fecha){
        this.fechaLimite = (fecha);
    }

    public LocalDate getFechaRecordatorio() {
        return this.fechaRecordatorio;
    }
    public void setFechaRecordatorio(LocalDate fechaRecordatorio) { // si cambio la fecha de recordatorio puede ser que ahora mi tarea este por vencer (y por lo tanto tambien tengo q cambiar la prioridad)
        this.fechaRecordatorio = fechaRecordatorio;
        setPrioridad(this.prioridad);
    }
}
