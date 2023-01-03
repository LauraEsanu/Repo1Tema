package com.itfactory;

public class Persoana {

    private String nume;
    private int varsta;
    private int CNP;
    private double salariuNet;

    public Persoana(int varsta, double salariuNet) {
        this.varsta = varsta;
        this.salariuNet = salariuNet;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getSalariuNet(){
        return salariuNet;
    }

    public void setSalariuNet(double salariuNet){
        this.salariuNet = salariuNet;
    }
}
