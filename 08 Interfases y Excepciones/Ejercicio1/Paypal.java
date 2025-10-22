/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Luucho
 */
public class Paypal implements Pago {
    private String usuario;

    public Paypal(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("\nProcesando pago con PayPal de $" + monto + " del usuario " + usuario);
    }
    
    
}
