package org.example;


public class Rectangle {
    //Ejercicio 2
    
    public int width; // Se inicializa en 0 la variable de instancia, que luego será modificada en el método main.
    public int height;
    
    public Rectangle() {
        this.width = 0;
        this.height = 0;
        }
    
    public int area() { // Se crea método para calcular el área del rectángulo, que luego será llamado en el método main.
        return width * height;
        }
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
        }
     
    /*
     * En este caso, el error se debe a que la variable myRect no ha sido inicializada, por lo que no se puede acceder a sus atributos.
     * Para poder solucionarlo, se debe crear una instancia de la clase Rectangle con sus atributos correspondientes.
     */
}

