package org.example;

public class Alumno {
    
    private String nombre;
    
    public Alumno () {
        nombre = " "; //El error está en que se debe inicializar en vacío, en lugar de null lo inicié con " "
    }

    public String getNombreAdmiracion() {
        return nombre.isEmpty() ? "!" : nombre.concat("!"); //Primero evalúa si está vacío y luego concatena el signo de exclamación
    }


    public static void main (String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
    }



    public static int recorrer (String cadena) {
        int res = 0;
        for (int i = 0; i < cadena.length(); i++) { //El error está en el <=, debería ser <, además de que se debe inicializar en 0
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }

    public static int getValor() {
        int vector[] = { 6, 16, 26,36,46,56,66,76 };
        int idx = 7; //El error está en el índice, debería ser 7 (último índice válido)
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra) {
        String string[] = new String[5];
        return (string[1].charAt(0)); // El error está en el índice, debería ser 0
    }

    public static String paraAString(int a) {


        return Integer.toString(a); //El error está en que se debe retornar el valor de x1, invoqué el método Integer.toString(a) en lugar de x1;

    }
}

