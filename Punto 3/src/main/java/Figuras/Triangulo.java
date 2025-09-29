/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author migue
 */
public class Triangulo {
    private float base;
    private float altura;
    
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public float calcularArea() {
        return (base * altura) / 2;
    }
    
    public float calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }
    
    public float calcularHipotenusa() {
        float sumaCuadrados = (base * base) + (altura * altura);
        float raiz = sumaCuadrados / 2;
        float temp;
        
        do {
            temp = raiz;
            raiz = (temp + (sumaCuadrados / temp)) / 2;
        } while ((temp - raiz) != 0);
        
        return raiz;
    }
    
    public String determinarTipo() {
        float hipotenusa = calcularHipotenusa();
        final float TOLERANCIA = 0.1f;
        
        if (Math.abs(base - altura) < TOLERANCIA && 
            Math.abs(altura - hipotenusa) < TOLERANCIA) {
            return "Equilátero";
        } else if (Math.abs(base - altura) < TOLERANCIA || 
                   Math.abs(base - hipotenusa) < TOLERANCIA || 
                   Math.abs(altura - hipotenusa) < TOLERANCIA) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    
    public String obtenerInformacion() {
        return "TRIÁNGULO RECTÁNGULO:\n" +
               "Base: " + base + " cm\n" +
               "Altura: " + altura + " cm\n" +
               "Hipotenusa: " + String.format("%.2f", calcularHipotenusa()) + " cm\n" +
               "Área: " + String.format("%.2f", calcularArea()) + " cm²\n" +
               "Perímetro: " + String.format("%.2f", calcularPerimetro()) + " cm\n" +
               "Tipo: " + determinarTipo();
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
