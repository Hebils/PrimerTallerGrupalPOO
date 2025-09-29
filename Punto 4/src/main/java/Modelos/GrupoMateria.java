/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author migue
 */
public class GrupoMateria {
     private int codGrupo;
    private String profesor;
    private double promGrupo;
    private int numEstudiantes;
    private int ganaron;
    

    public GrupoMateria(int codGrupo, String profesor, double promGrupo, int numEstudiantes, int ganaron) {
        this.codGrupo = codGrupo;
        this.profesor = profesor;
        this.promGrupo = promGrupo;
        this.numEstudiantes = numEstudiantes;
        this.ganaron = ganaron;
    }

    public int getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(int codGrupo) {
        this.codGrupo = codGrupo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public double getPromGrupo() {
        return promGrupo;
    }

    public void setPromGrupo(double promGrupo) {
        this.promGrupo = promGrupo;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public int getGanaron() {
        return ganaron;
    }

    public void setGanaron(int ganaron) {
        this.ganaron = ganaron;
    }
    
    public double porcentajeQuePerdio() {
        if (numEstudiantes == 0) {
            return 0.0;
        }
        int perdieron = numEstudiantes - ganaron;
        return (perdieron * 100.0) / numEstudiantes;
    }
    
    @Override
    public String toString() {
        return "Código Grupo: " + codGrupo + 
               "\nProfesor: " + profesor + 
               "\nPromedio Grupo: " + promGrupo + 
               "\nNúmero Estudiantes: " + numEstudiantes + 
               "\nEstudiantes que ganaron: " + ganaron + 
               "\nPorcentaje que perdió: " + String.format("%.2f", porcentajeQuePerdio()) + "%";
    }
}
