package org.example;

/*
 * Ejercicio 5 parte c
 */
public class ContadorFor {
    int MAX_CONT = 50;
    int contador = 1;
    int incremento = 1;
    public ContadorFor() {
    }

    public void mostrarContador(){
        for (int i = contador; i <= MAX_CONT; i += incremento) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        ContadorFor contador = new ContadorFor();
        contador.mostrarContador();
    }
}
