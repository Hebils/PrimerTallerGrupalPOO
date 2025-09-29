/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author migue
 */
public class Rectangulo {
     private float base;
    private float altura;
    
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public float calcularArea() {
        return base * altura;
    }
    
    public float calcularPerimetro() {
        return 2 * (base + altura);
    }
    
    public String obtenerInformacion() {
        return "RECTÁNGULO:\n" +
               "Base: " + base + " cm\n" +
               "Altura: " + altura + " cm\n" +
               "Área: " + calcularArea() + " cm²\n" +
               "Perímetro: " + calcularPerimetro() + " cm";
    }
    
    public float getBase() {
        return base;
    }
    
    public void setBase(float base) {
        this.base = base;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
