/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio04;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Cliente cliente = new Cliente("Luucho","12345678");
        Banco banco = new Banco("BNA+","987654321");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("12345","15/29",banco);
        cliente.setTarjetaDeCredito(tarjeta);
        
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("Banco :" + tarjeta.getBanco().getNombre());
    }
}
