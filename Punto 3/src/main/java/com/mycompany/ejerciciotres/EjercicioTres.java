/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotres;
import javax.swing.JOptionPane;
import Figuras.Circulo;
import Figuras.Rectangulo;
import Figuras.Cuadrado;
import Figuras.Triangulo;
/**
 *
 * @author migue
 */
public class EjercicioTres {

    public static void main(String[] args) {
        
        String menu = "¿Qué figura desea calcular?\n\n" +
                     "1. Círculo\n" +
                     "2. Rectángulo\n" +
                     "3. Cuadrado\n" +
                     "4. Triángulo Rectángulo\n" +
                     "5. Salir\n\n" +
                     "Ingrese una opción:";
        
        int opcion;
        do {
            String input = JOptionPane.showInputDialog(menu);
            opcion = Integer.parseInt(input);
            
            switch (opcion) {
                case 1:
                    crearCirculo();
                    break;
                case 2:
                    crearRectangulo();
                    break;
                case 3:
                    crearCuadrado();
                    break;
                case 4:
                    crearTriangulo();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 5);
    }
    
    private static void crearCirculo() {
        String input = JOptionPane.showInputDialog("Ingrese el radio del círculo (cm):");
        float radio = Float.parseFloat(input);
        
        Circulo circulo = new Circulo(radio);
        String resultado = circulo.obtenerInformacion();
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    private static void crearRectangulo() {
        String inputBase = JOptionPane.showInputDialog("Ingrese la base del rectángulo (cm):");
        String inputAltura = JOptionPane.showInputDialog("Ingrese la altura del rectángulo (cm):");
        
        float base = Float.parseFloat(inputBase);
        float altura = Float.parseFloat(inputAltura);
        
        Rectangulo rectangulo = new Rectangulo(base, altura);
        String resultado = rectangulo.obtenerInformacion();
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    private static void crearCuadrado() {
        String input = JOptionPane.showInputDialog("Ingrese el lado del cuadrado (cm):");
        float lado = Float.parseFloat(input);
        
        Cuadrado cuadrado = new Cuadrado(lado);
        String resultado = cuadrado.obtenerInformacion();
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    private static void crearTriangulo() {
        String inputBase = JOptionPane.showInputDialog("Ingrese la base del triángulo (cm):");
        String inputAltura = JOptionPane.showInputDialog("Ingrese la altura del triángulo (cm):");
        
        float base = Float.parseFloat(inputBase);
        float altura = Float.parseFloat(inputAltura);
        
        Triangulo triangulo = new Triangulo(base, altura);
        String resultado = triangulo.obtenerInformacion();
        JOptionPane.showMessageDialog(null, resultado);
    }
}
