package ar.edu.unlu.poo.tp1.ej6;

public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private int cantidadPaginas;
    private int cantidadEjemplares;
    private int cantidadEjemplaresPrestados;

    public Libro(String titulo, String autor, int cantidadPaginas, int cantidadEjemplares){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = "";
        this.cantidadPaginas = cantidadPaginas;
        this.cantidadEjemplares = cantidadEjemplares;
        this.cantidadEjemplaresPrestados = 0;
    }
    public Libro(String titulo, String autor, String ISBN, int cantidadPaginas, int cantidadEjemplares){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantidadPaginas = cantidadPaginas;
        this.cantidadEjemplares = cantidadEjemplares;
        this.cantidadEjemplaresPrestados = 0;
    }

    public boolean prestar(){
        if (cantidadEjemplares - cantidadEjemplaresPrestados > 1){
            cantidadEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolver(){
        if (cantidadEjemplaresPrestados > 0){
            cantidadEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }

    public String getDescripcion(){
        return "El libro: " + this.titulo +
                ", creado por el autor: " + this.autor +
                ", tiene: " + this.cantidadPaginas + " paginas" +
                ", quedan: " + getCantidadEjemplaresDisponibles() + " ejemplares disponibles" +
                " y se prestaron: " + this.cantidadEjemplaresPrestados + " ejemplares.";
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        if (cantidadEjemplares > this.cantidadEjemplaresPrestados) {
            this.cantidadEjemplares = cantidadEjemplares;
        }
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public int getCantidadEjemplaresPrestados() {
        return cantidadEjemplaresPrestados;
    }

    public int getCantidadEjemplaresDisponibles(){
        return getCantidadEjemplares() - getCantidadEjemplaresPrestados();
    }
}
