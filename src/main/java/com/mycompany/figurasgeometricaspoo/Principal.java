
package com.mycompany.figurasgeometricaspoo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingresa el nombre");
        String nombre= lector.next();
     
        System.out.println("ingresa el color");
        String color= lector.next();
        System.out.println("Ingresa el radio");
        double radio = lector.nextDouble();
        
        Circulo circulo1 = new Circulo(nombre, color, radio);
        
    }
}
