/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author migue
 */
public class Circulo {
    private float radio;
    private final float PI = 3.1416f;
    
    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public float calcularArea() {
        return PI * radio * radio;
    }
    
    public float calcularPerimetro() {
        return 2 * PI * radio;
    }
    
    public String obtenerInformacion() {
        return "CÍRCULO:\n" +
               "Radio: " + radio + " cm\n" +
               "Área: " + String.format("%.2f", calcularArea()) + " cm²\n" +
               "Perímetro: " + String.format("%.2f", calcularPerimetro()) + " cm";
    }
    
    public float getRadio() {
        return radio;
    }
    
    public void setRadio(float radio) {
        this.radio = radio;
    }
}
