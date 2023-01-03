package com.itfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        UnitateBancara unitateBancara;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buna ziua! Introduceti varsta dvs: ");

        Persoana persoana1 = new Persoana(0,0);


        persoana1.setVarsta(scanner.nextInt());
        int varsta = persoana1.getVarsta();

        if (varsta < 18) {
            System.out.println("Persoana nu este eligibila pentru un credit");


        } else if (varsta <= 40) {
            UnitateBancara p1 = new BancaPentruLocuinte();
            System.out.println("Introduceti salariu net: ");
            persoana1.setSalariuNet(scanner.nextDouble());
            System.out.println("Limita maxima a creditului dvs este: " + p1.calcCredit(persoana1) + " lei.");
            System.out.println("Dobanda totala a creditului este: " + p1.dobanda(persoana1) + " lei.");


        } else {

            UnitateBancara p2 = new BancaPentruNevoiPersonale();
            System.out.println("Introduceti salariu net: ");
            persoana1.setSalariuNet(scanner.nextDouble());
            System.out.println("Limita maxima a creditului dvs este: " + p2.calcCredit(persoana1) + " lei.");
            System.out.println("Dobanda totala a creditului este: " + p2.dobanda(persoana1) + " lei.");

        }

    }
}
