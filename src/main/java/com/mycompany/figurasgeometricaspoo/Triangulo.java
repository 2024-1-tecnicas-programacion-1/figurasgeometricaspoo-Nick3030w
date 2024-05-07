package com.mycompany.figurasgeometricaspoo;
/**
 * creacion de la clase triangulo, que hereda los atributos de la clase madre
 * y añade las variables base y altura para calcular el area y el perimetro
 * Complejidad temporal: O(1) Tiempo constante
 *
 */
public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    /**
     * metodo que crea todas las variables heredadas y las dos nuevas de la clase
     * Complejidad temporal: O(1) Tiempo constante
     * @param nombre
     * @param color
     * @param base
     * @param altura 
     */

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    /**
     * metodo heredado que calcula especificamente el area del triangulo
     * Complejidad temporal: O(1) Tiempo constante
     * @return 
     */
    @Override
    public double obtenerArea() {
        double areaTriangulo = (base * altura)/2;
        return areaTriangulo;
    } 
    /**
     * metodo heredado de la clase madre que calcula el perimetro del triangulo
     * Complejidad temporal: O(1) Tiempo constante
     * @return 
     */
    
    @Override
    public double obtenerPerimetro(){
        double lado = Math.sqrt((base * base) + (altura * altura));
        double perimetroTriangulo = base + altura + lado;
        return perimetroTriangulo;
    
    }
    
    
}
