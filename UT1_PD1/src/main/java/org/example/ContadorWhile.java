package org.example;

/*
 * Ejercicio 5 parte a
 */
public class ContadorWhile {
    int MAX_CONT = 50;
    int contador = 1;
    int incremento = 1;
    public ContadorWhile() {
    }

    public void mostrarContador(){
        while (contador <= MAX_CONT){
            System.out.println(contador);
            contador += incremento;
        }
    }

    public static void main(String[] args) {
        ContadorWhile contador = new ContadorWhile();
        contador.mostrarContador();
    }
}
