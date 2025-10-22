/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Luucho
 */
public class TarjetaCredito implements PagoConDescuento{
    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }
    
    
    @Override
    public double aplicarDescuento(double monto) {
        System.out.println("\nAplicando 10% de descuento por pago con tarjeta de credito");
        return monto * 0.9; 
    }

    @Override
    public void procesarPago(double monto) {
         System.out.println("Procesando pago con tarjeta de credito de $" + monto + " a nombre de " + titular);
    }
    
}
