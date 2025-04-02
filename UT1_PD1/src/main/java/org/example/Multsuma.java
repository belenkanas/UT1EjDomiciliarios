package org.example;

/*
 * Ejercicio 3
 */
public class Multsuma {

    public Multsuma() {
    }

    public static void main (String[] args) {
        System.out.println(multsuma(2.4,2.1,4.5));
    }

    public static double multsuma (double a, double b, double c) {
        return a * b + c;
    }
}