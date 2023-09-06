package ar.edu.unlu.poo.tp1.ej7;

import java.util.ArrayList;

public class EcuacionSegundoGrado {
    private int coeficienteA;
    private int coeficienteB;
    private int coeficienteC;

    public EcuacionSegundoGrado(int a, int b, int c){
        setCoeficienteA(a);
        setCoeficienteB(b);
        setCoeficienteC(c);
    }

    private void setCoeficienteA(int a){
        this.coeficienteA = a;
    }

    public int getCoeficienteA() {
        return this.coeficienteA;
    }

    private void setCoeficienteB(int b){
        this.coeficienteB = b;
    }

    public int getCoeficienteB() {
        return this.coeficienteB;
    }

    private void setCoeficienteC(int c) {
        this.coeficienteC = c;
    }

    public int getCoeficienteC() {
        return this.coeficienteC;
    }

    public String getEcuacionSegundoGrado(){
        return "y = " + this.coeficienteA + " * x^2 + " + this.coeficienteB + " * x + " + this.coeficienteC;
    }

    public ArrayList<Double> getRaices(){
        ArrayList<Double> raices = new ArrayList<Double>();
        if (discriminante() > 0) {
            raices.add( (((-this.coeficienteB) + ((Math.sqrt(discriminante())))) / (2 * this.coeficienteA)) );
            raices.add( (((-this.coeficienteB) - ((Math.sqrt(discriminante())))) / (2 * this.coeficienteA)) );
        } else {
            if (discriminante() == 0){
                raices.add( (((-this.coeficienteB) + ((Math.sqrt(discriminante())))) / (2 * this.coeficienteA)) );
            }
        }
        return raices;
    }
    private double discriminante(){
        return ( Math.pow(this.coeficienteB,2) - (4 * this.coeficienteA * this.coeficienteC) );
    }

    public double valorDeLaFuncionEnBaseX(double x){
        return ( (this.coeficienteA * (Math.pow(x,2))) + (this.coeficienteB * x) + this.coeficienteC );
    }

}
