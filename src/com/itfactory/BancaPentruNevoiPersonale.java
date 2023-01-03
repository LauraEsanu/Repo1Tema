package com.itfactory;

public class BancaPentruNevoiPersonale extends UnitateBancara {
    @Override
    public double calcCredit(Persoana persoana) {
        return persoana.getSalariuNet() * 10;
    }

    @Override
    public double dobanda(Persoana persoana) {
        return (persoana.getSalariuNet() * 10) * 8/100;
    }
}
