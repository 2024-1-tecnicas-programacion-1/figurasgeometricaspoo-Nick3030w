package com.mycompany.figurasgeometricaspoo;
/**
 * Nueva clase rectangulo que hereda las variables de la clase madre y añade las 
 * variables lado 1 y lado2 para calcular el area y el perimetro
 * Complejidad temporal: O(1) Tiempo constante
 *
 */
public class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;
    /**
     * asignacion de todas las variables
     * Complejidad temporal: O(1) Tiempo constante
     * @param nombre
     * @param color
     * @param lado1
     * @param lado2 
     */
    public Rectangulo (String nombre, String color, double lado1, double lado2){
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    /**
     * metodo sobreescrito de la clase madre
     * se calcula el area del rectangulo
     * Complejidad temporal: O(1) Tiempo constante
     * @return 
     */
    @Override
    public double obtenerArea() {
        double areaRectangulo = lado1*lado2;
        return areaRectangulo;
    }
    /**
     * metodo sobreescrito de la clase madre que calcula el perimetro del rectangulo
     * utilizando las dos variables nuevas
     * Complejidad temporal: O(1) Tiempo constante
     * @return 
     */
    @Override
    public double obtenerPerimetro() {
        double perimetroRectangulo = (2*lado1) + (2*lado2);
        return perimetroRectangulo;
    } 
}
