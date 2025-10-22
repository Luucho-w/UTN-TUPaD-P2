/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un cliente
        Cliente c1 = new Cliente("Luucho");
        
        // Creamos un pedido
        Pedido p1 = new Pedido(c1);
        
        // Agregamos productos
        p1.agregarProducto(new Producto("Grafica", 500000));
        p1.agregarProducto(new Producto("Monitor", 200000));
        
        // Calculamos el total del pedido
        System.out.println("Total del pedido: $" + p1.calcularTotal());
        
        // Cambaimos el estado del pedido
        p1.cambiarEstado("Confirmar pago");
        
        // Pago con tarjeta
        TarjetaCredito tarjeta = new TarjetaCredito("Luciano Wittmund");
        double montoConDsc = tarjeta.aplicarDescuento(p1.calcularTotal());
        tarjeta.procesarPago(montoConDsc);
        
        // Pago con paypal
        Paypal paypal = new Paypal("Luucho.witt");
        paypal.procesarPago(p1.calcularTotal());
        
        // Cambiamo el estado del pedido
        p1.cambiarEstado("Enviado");
    }
    
}
