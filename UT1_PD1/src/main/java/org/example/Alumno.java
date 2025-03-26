package org.example;

/*
 * Ejercicio 4
 */
public class Alumno {
    
    private String nombre;
    
    public Alumno () {
        nombre = null; //El error está en que se debe inicializar en vacío, en lugar de null lo inicié con " "
    }

    public String getNombreAdmiracion() {
        if (nombre == null) {
            return "¡No hay nombre!";
        } else {
            return nombre.concat("!");
        }
    }


    public static void main (String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
        System.out.println(recorrer("Hola Mundo"));
        System.out.println(getValor());
        System.out.println(getPrimerCaracter("Hola Mundo"));
        System.out.println(paraAString(5));

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
        if (palabra == null || palabra.length() == 0) {
            return ' ';
        }
        return (palabra.charAt(0)); // El error está en el índice, debería ser 0
    }

    public static String paraAString(int a) {


        return Integer.toString(a); //El error está en que se debe convertir a String con Integer.toString(a)

    }
}

