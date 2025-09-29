/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocuatro;
import javax.swing.JOptionPane;
import Modelos.GrupoMateria;
import Modelos.Materia;
/**
 *
 * @author migue
 */
public class EjercicioCuatro {

     public static void main(String[] args) {        
        String codMat = JOptionPane.showInputDialog("Ingrese código de la materia (3-5 caracteres):");
        String nomMat = JOptionPane.showInputDialog("Ingrese nombre de la materia:");
        
        int numGrupos = Integer.parseInt(JOptionPane.showInputDialog(
            "Ingrese número de grupos (1-12):"));
        
        Materia materia = new Materia(codMat, nomMat, numGrupos);
        
        for (int i = 0; i < numGrupos; i++) {
            JOptionPane.showMessageDialog(null, " CREACIÓN DEL GRUPO " + (i + 1) + " ");
            
            int codGrupo = Integer.parseInt(JOptionPane.showInputDialog(
                "Código del grupo (1-60):"));
            
            String profesor = JOptionPane.showInputDialog("Nombre del profesor:");
            
            double promGrupo = Double.parseDouble(JOptionPane.showInputDialog(
                "Promedio del grupo (0.0-5.0):"));
            
            int numEstudiantes = Integer.parseInt(JOptionPane.showInputDialog(
                "Número de estudiantes (0-25):"));
            
            int ganaron = Integer.parseInt(JOptionPane.showInputDialog(
                "Número de estudiantes que ganaron:"));
            
            GrupoMateria grupo = new GrupoMateria(codGrupo, profesor, promGrupo, 
                                                 numEstudiantes, ganaron);
            materia.agregaGrupo(grupo);
        }
        
        JOptionPane.showMessageDialog(null, "REPORTE COMPLETO\n" + materia.toString());
        
        boolean continuar = true;
        while (continuar) {
            String[] opciones = {
                "Calcular porcentaje que perdió en un grupo",
                "Buscar grupo por código",
                "Obtener mayor promedio",
                "Modificar profesor",
                "Salir"
            };
            
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL: \n 1.Porcentaje que perdio del grupo \n 2.Busqueda de grupo \n 3.Mayor Promedio \n 4.Cambiar nombre del profesor \n 5.Salir"));
                opcion--;
            switch (opcion) {
                case 0: 
                    int codConsulta = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese código del grupo para ver porcentaje que perdió:"));
                    String resultado = materia.buscarGrupo(codConsulta);
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                    
                case 1: 
                    int codBusqueda = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese código del grupo a buscar:"));
                    String busqueda = materia.buscarGrupo(codBusqueda);
                    JOptionPane.showMessageDialog(null, busqueda);
                    break;
                    
                case 2: 
                    double mayorPromedio = materia.mayorPromedioDeGrupo();
                    JOptionPane.showMessageDialog(null, 
                        "El mayor promedio de grupo es: " + mayorPromedio);
                    break;
                    
                case 3:
                    int codModificar = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese código del grupo:"));
                    String nuevoProfesor = JOptionPane.showInputDialog(
                        "Ingrese nuevo nombre del profesor:");
                    materia.modificarProfesor(codModificar, nuevoProfesor);
                    JOptionPane.showMessageDialog(null, "Profesor modificado exitosamente");
                    break;
                                        
                default:
                    continuar = false;
            }
        }
        
        JOptionPane.showMessageDialog(null, 
            "REPORTE FINAL\n" + materia.toString());
        
        JOptionPane.showMessageDialog(null, "Saliendo");
    }
}
