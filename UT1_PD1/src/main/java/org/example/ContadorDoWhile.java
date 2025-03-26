package org.example;

/*
 * Ejercicio 5 parte b
 */
public class ContadorDoWhile {
    int MAX_CONT = 50;
    int contador = 1;
    int incremento = 1;
    public ContadorDoWhile() {
    }

    public void mostrarContador(){
        do {
            System.out.println(contador);
            contador += incremento;
        } while (contador <= MAX_CONT);

        
    }

    public static void main(String[] args) {
        ContadorDoWhile contador = new ContadorDoWhile();
        contador.mostrarContador();
    }
}
