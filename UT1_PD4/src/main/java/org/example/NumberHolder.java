package org.example;


public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.anInt = 5;
        numberHolder.aFloat = 3.14f;
        
        System.out.println("anInt: " + numberHolder.anInt);
        System.out.println("aFloat: " + numberHolder.aFloat);
    }
}