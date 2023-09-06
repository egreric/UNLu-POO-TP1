package ar.edu.unlu.poo.tp1.ej8;

import java.util.Random;

public class Password {
    private int longitud;
    private String valor;
    private String alfanumericos = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public Password(){
        setLongitud(8);
        generarPassword();
    }

    public Password(int longitud){
        setLongitud(longitud);
        generarPassword();
    }

    public void setLongitud(int longitud){ // genero una password nueva cada vez que seteo longitud (longitud minima = 8)
        if (longitud < 8) {
            longitud = 8;
        }
        this.longitud = longitud;
        generarPassword();
    }

    public int getLongitud(){
        return this.longitud;
    }

    private void setPassword(String pw){
        this.valor = pw;
    }

    public String getPassword(){
        return this.valor;
    }

    public void generarPassword(){
        Random random = new Random();
        String s = "";
        for (int i = 0; i < this.longitud; i++){
            s += this.alfanumericos.charAt(random.nextInt(this.alfanumericos.length()));
        }
        setPassword(s);
    }

    public void generarPasswordFuerte(){ // FALTA TERMINAR
        Random random = new Random();
        String alfabetoMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alfabetoMinus = "abcdefghijklmnopqrstuvwxyz";
        String numericos = "0123456789";
        String s = "";

        // Agrego 3 caracteres mayusculas
        for (int i = 1; i <= 3; i++){
            s += alfabetoMayus.charAt(random.nextInt(alfabetoMayus.length()));
        }

        // Agrego 2 caracteres minusculas
        for (int i = 1; i <= 2; i++){
            s += alfabetoMinus.charAt(random.nextInt(alfabetoMinus.length()));
        }

        // Agrego 2 caracteres numericos
        for (int i = 1; i <= 2; i++){
            s += numericos.charAt(random.nextInt(numericos.length()));
        }

        this.setPassword(s + this.valor.substring(s.length()));
    }

    public boolean esFuerte(){
        int mayus = 0;
        int minus = 0;
        int num = 0;
        for (int i = 0; i < this.valor.length(); i++){
            if (Character.isLowerCase(valor.charAt(i))){
                minus++;
            } else if (Character.isUpperCase(valor.charAt(i))){
                mayus++;
            } else if (Character.isDigit(valor.charAt(i))){
                num++;
            }
        }
        return (mayus > 2 && minus > 1 && num >= 2);
    }

    public String toString(){
        String s = "<" + this.getPassword() + "> - ";
        if (this.esFuerte()){
            s += "Fuerte";
        } else {
            s += "Debil";
        }
        return s;
    }


}
