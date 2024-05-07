package com.mycompany.figurasgeometricaspoo;
/**
 * creacion de la clase circulo, clase heredera de figura geometrica
 * hereda todas las variables de la clase madre y se añade la variable radio
 * Complejidad temporal: O(1) Tiempo constante
 * 
 */
public class Circulo extends FiguraGeometrica {
    private double radio;
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
    /**
     * metodo sobreescrito de la clase madre que calcula el area del circulo
     * Complejidad temporal: O(1) Tiempo constante
     * @return 
     */
    @Override
    public double obtenerArea(){
        double areaCirculo = Math.PI*(Math.pow(this.radio, 2));
        return areaCirculo;
    /**
     * metodo sobreescrito de la clase madre que calcula el perimetro especificamente
     * del circulo
     * Complejidad temporal: O(1) Tiempo constante
     */
    }
    @Override
    public double obtenerPerimetro(){
        double perimetroCirculo = 2*radio*Math.PI;
        return perimetroCirculo;
        
   
    }
}
