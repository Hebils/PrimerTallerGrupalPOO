/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Angello
 */
public class Boleta {
    private int promotora;
    private int tipoFuncion;
    private int precio;

    public Boleta(int promotora, int tipoFuncion) {
        this.promotora = promotora;
        this.tipoFuncion = tipoFuncion;

        if (promotora == 1) {
            if (tipoFuncion == 1) {
                precio = 8000;
            } else if (tipoFuncion == 2) {
                precio = 9500;
            }
        } else if (promotora == 2) {
            if (tipoFuncion == 1) {
                precio = 6500;
            } else if (tipoFuncion == 2) {
                precio = 8500;
            }
        }
    }

    public int getPromotora() {
        return promotora;
    }

    public int getTipoFuncion() {
        return tipoFuncion;
    }

    public int getPrecio() {
        return precio;
    }
    
    
}
