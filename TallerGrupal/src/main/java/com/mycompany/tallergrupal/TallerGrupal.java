/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallergrupal;

import Punto1.Numeros;
import javax.swing.JOptionPane;

/**
 *
 * @author Angello
 */
public class TallerGrupal {

    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        
        Numeros numero = new Numeros(num);
        
        int digitos = numero.contarDigitos();
        
        JOptionPane.showMessageDialog(null, "El número " + numero.getValor() + " tiene " + digitos + " dígitos.");
    }
}
