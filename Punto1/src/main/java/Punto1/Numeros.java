/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1;

/**
 *
 * @author Angello
 */
public class Numeros {
    private int valor;

    public Numeros(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public int contarDigitos() {
        int n = valor;
        int contador = 0;
        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            n = n / 10;
            contador++;
        }
        return contador;
    }
}
