/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author migue
 */
public class Materia {
    private String codMat;
    private String nomMat;
    private int numGrupos;
    private GrupoMateria[] grupos;
    private int indice;
    
    public Materia(String codMat, String nomMat, int numGrupos) {
        this.codMat = codMat;
        this.nomMat = nomMat;
        this.numGrupos = numGrupos;
        this.grupos = new GrupoMateria[numGrupos];
        this.indice = 0;
    }

    public String getCodMat() {
        return codMat;
    }

    public void setCodMat(String codMat) {
        this.codMat = codMat;
    }

    public String getNomMat() {
        return nomMat;
    }

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }

    public int getNumGrupos() {
        return numGrupos;
    }

    public void setNumGrupos(int numGrupos) {
        this.numGrupos = numGrupos;
    }

    public GrupoMateria[] getGrupos() {
        return grupos;
    }

    public void setGrupos(GrupoMateria[] grupos) {
        this.grupos = grupos;
    }
    
    public void agregaGrupo(GrupoMateria grupo) {
        if (indice < numGrupos) {
            grupos[indice] = grupo;
            indice++;
        } else {
            System.out.println("No se pueden agregar más grupos. Límite alcanzado.");
        }
    }
    
    @Override
    public String toString() {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Código Materia: ").append(codMat)
               .append("\nNombre Materia: ").append(nomMat)
               .append("\nNúmero Grupos: ").append(numGrupos)
               .append("\n\n GRUPOS \n");
        
        for (int i = 0; i < indice; i++) {
            reporte.append("\nGrupo ").append(i + 1).append(":\n")
                   .append(grupos[i].toString())
                   .append("\n");
        }
        
        return reporte.toString();
    }
    
    public String buscarGrupo(int codGrupo) {
        for (int i = 0; i < indice; i++) {
            if (grupos[i].getCodGrupo() == codGrupo) {
                return grupos[i].toString();
            }
        }
        return "No existe un grupo con este código de grupo";
    }
    
    public double mayorPromedioDeGrupo() {
        if (indice == 0) {
            return 0.0;
        }
        
        double mayorPromedio = grupos[0].getPromGrupo();
        for (int i = 1; i < indice; i++) {
            if (grupos[i].getPromGrupo() > mayorPromedio) {
                mayorPromedio = grupos[i].getPromGrupo();
            }
        }
        return mayorPromedio;
    }
    
    public void modificarProfesor(int codGrupo, String otroProfesor) {
        for (int i = 0; i < indice; i++) {
            if (grupos[i].getCodGrupo() == codGrupo) {
                grupos[i].setProfesor(otroProfesor);
                System.out.println("Profesor modificado exitosamente");
                return;
            }
        }
        System.out.println("No se encontró el grupo con código: " + codGrupo);
    }
}
