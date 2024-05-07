package com.mycompany.figurasgeometricaspoo;
/**
 * creacion de la clase publica FiguraGeometrica
 * (clase madre) que tiene las variables nombre y color
 * Complejidad temporal: O(1) Tiempo constante
 * 
 */
public class FiguraGeometrica {
    private String nombre; 
    private String color;
    /**
     * metodo que asigna parametros nombre y color
     * Complejidad temporal: O(1) Tiempo constante
     * @param nombre
     * @param color 
     */
     public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        
    }
     /**
      * getter del area 
      * Complejidad temporal: O(1) Tiempo constante
      * @return 
      */
     public double obtenerArea() {
        return 0;
    }
     /**
      * getter del perimetro
      * Complejidad temporal: O(1) Tiempo constante
      * @return 
      */
     public double obtenerPerimetro() {
        return 0;
    }
}
