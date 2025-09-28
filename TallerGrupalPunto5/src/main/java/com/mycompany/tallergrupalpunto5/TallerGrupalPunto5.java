/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallergrupalpunto5;

import Modelos.Boleta;
import Modelos.Cliente;
import Modelos.Factura;
import javax.swing.JOptionPane;

/**
 *
 * @author Angello
 */
public class TallerGrupalPunto5 {

    public static void main(String[] args) {
 int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas a procesar"));

        Factura[] facturas = new Factura[n];
        double totalCineColombia = 0;
        double totalRoyalFilms = 0;
        int boletas35mm = 0;
        int boletas3D = 0;
        String masBoletas;

        for (int i = 0; i < n; i++) {
            JOptionPane.showMessageDialog(null, "Factura " + (i + 1));

            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del comprador");

            int promotora = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la promotora\n 1. Cine Colombia\n 2. Royal Films"));

            int tipoFuncion = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione el tipo de función:\n1. 35mm\n2. 3D"));

            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de boletas"));

            int tieneTarjeta = Integer.parseInt(JOptionPane.showInputDialog("Tiene tarjeta de descuento\n 1. Si \n 2. No"));

            Cliente cliente = new Cliente(nombre, tieneTarjeta);
            Boleta boleta = new Boleta(promotora, tipoFuncion);
            Factura factura = new Factura(cliente, boleta, cantidad);

            facturas[i] = factura;

            double totalFactura = factura.calcularTotal();
            JOptionPane.showMessageDialog(null, factura.toString() + "\nTotal: $" + totalFactura);

            if (promotora == 1) {
                totalCineColombia += totalFactura;
            } else {
                totalRoyalFilms += totalFactura;
            }

            if (tipoFuncion == 1) {
                boletas35mm += cantidad;
            } else {
                boletas3D += cantidad;
            }
        }
        
        if(boletas35mm > boletas3D){
            
            masBoletas = "35mm";
            
        }else{
            
            masBoletas = "3D";
            
        }

        String resumen = "RESUMEN GENERAL\n\n" +
                         "Total facturado Cine Colombia: $" + totalCineColombia + "\n" +
                         "Total facturado Royal Films: $" + totalRoyalFilms + "\n" +
                         "Función que más boletas vendió: " + masBoletas;

        JOptionPane.showMessageDialog(null, resumen);
    }
}
