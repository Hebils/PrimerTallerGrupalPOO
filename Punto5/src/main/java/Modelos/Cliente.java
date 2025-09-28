/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Angello
 */
public class Cliente {
    private String nombre;
    private int tarjetaDescuento;

    public Cliente(String nombre, int tarjetaDescuento) {
        this.nombre = nombre;
        this.tarjetaDescuento = tarjetaDescuento;
    }

    public boolean tieneTarjeta() {
        
        if(tarjetaDescuento == 1){
            
            return true;
            
        }else if(tarjetaDescuento == 2){
            
            return false;
            
        }else{
            
            return false;
                    
        }
    }

    public String getNombre() {
        return nombre;
    }
}
