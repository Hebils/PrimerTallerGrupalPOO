/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto2;

import Punto2.Notas;
import javax.swing.JOptionPane;

/**
 *
 * @author Angello
 */
public class Punto2 {

    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 1"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 2"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 3"));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 4"));
        double n5 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 5"));

        Notas notas = new Notas(n1, n2, n3, n4, n5);
        int notasAprobadas = notas.contarNotas();

        JOptionPane.showMessageDialog(null, "El estudiante aprobó " + notasAprobadas + " notas");
    }
}
