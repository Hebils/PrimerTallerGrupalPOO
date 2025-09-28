/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2;

/**
 *
 * @author Angello
 */
public class Notas {
    
    private double nota1, nota2, nota3, nota4, nota5;

    public Notas(double n1, double n2, double n3, double n4, double n5) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        this.nota4 = n4;
        this.nota5 = n5;
    }

    public int contarNotas() {
        int contador = 0;
        if (nota1 >= 3.0){
            contador++;
        }
        if (nota2 >= 3.0){
            contador++;
        }
        if (nota3 >= 3.0){
            contador++;
        }
        if (nota4 >= 3.0){
            contador++;
        }
        if (nota5 >= 3.0){
            contador++;
        }
        return contador;
    }
}
