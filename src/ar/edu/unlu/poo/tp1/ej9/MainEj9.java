package ar.edu.unlu.poo.tp1.ej9;


public class MainEj9 {
    public static void main(String[] args){
        Fecha fecha = new Fecha("27-08-1994");

        System.out.println(fecha.toString());
        System.out.println(fecha.getFecha());

        System.out.println(fecha.esMenor("28-08-1994"));
        System.out.println(fecha.esMenor("20-07-1994"));
        System.out.println(fecha.esMayor("05-02-1991"));
        System.out.println(fecha.esMayor("25-05-1995"));
        System.out.println(fecha.estaEntre("17-08-1985","27-08-2006"));
        System.out.println(fecha.estaEntre("17-08-1998","27-08-2006"));


    }
}
