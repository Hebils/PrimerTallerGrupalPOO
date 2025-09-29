/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author migue
 */
public class Cuadrado {
     private float lado;
    
    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    public float calcularArea() {
        return lado * lado;
    }
    
    public float calcularPerimetro() {
        return 4 * lado;
    }
    
    public String obtenerInformacion() {
        return "CUADRADO:\n" +
               "Lado: " + lado + " cm\n" +
               "Área: " + calcularArea() + " cm²\n" +
               "Perímetro: " + calcularPerimetro() + " cm";
    }
    
    public float getLado() {
        return lado;
    }
    
    public void setLado(float lado) {
        this.lado = lado;
    }
}
