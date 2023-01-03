package com.itfactory;

public class BancaPentruLocuinte extends UnitateBancara {
    @Override
    public double calcCredit(Persoana persoana) {
        return persoana.getSalariuNet() * 100;
    }

    @Override
    public double dobanda(Persoana persoana) {
        return (persoana.getSalariuNet() * 100) *5/100;
    }
}
