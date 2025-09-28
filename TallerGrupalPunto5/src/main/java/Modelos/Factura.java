/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Angello
 */
public class Factura {
    private Cliente cliente;
    private Boleta boleta;
    private int cantidad;

    public Factura(Cliente cliente, Boleta boleta, int cantidad) {
        this.cliente = cliente;
        this.boleta = boleta;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        double total = boleta.getPrecio() * cantidad;
        if (cliente.tieneTarjeta()) {
            total = total * 0.9;
        }
        return total;
    }
    
    @Override
    public String toString() {
        
        String quePromotora;
        String queFuncion;
        String tarjeta;
        
        if(boleta.getPromotora() > 1){
            
            quePromotora = "Royal Films";
            
        } else{
            
            quePromotora = "Cine Colombia";
            
        }
        
        if(boleta.getTipoFuncion() > 1){
            
            queFuncion = "3D";
            
        }else{
            
            queFuncion = "35mm";
            
        }
        
        if(cliente.tieneTarjeta() == true){
            
            tarjeta = "Si";
            
        }else{
            
            tarjeta = "No";
            
        }
        
        return "Factura\nCliente: " + cliente.getNombre() +
               "\nPromotora: " + quePromotora +
               "\nTipo de función: " + queFuncion +
               "\nCantidad: " + cantidad +
               "\nTarjeta: " + tarjeta;
    }
}
