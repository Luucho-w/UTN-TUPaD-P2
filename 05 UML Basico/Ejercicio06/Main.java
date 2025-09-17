/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio06;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Mesa mesa = new Mesa(5,5);
        Reserva reserva = new Reserva("19/12/2025","22:00",mesa);
        Cliente cliente = new Cliente("Luucho","12345678");
        reserva.setCliente(cliente);
        
        System.out.println("Reserva: "+ reserva.getFecha() +", Hora: "+reserva.getHora()+ "hs");
        System.out.println("Cliente: "+ reserva.getCliente().getNombre());
        System.out.println("Mesa: "+ reserva.getMesa().getNumero());
        
        
    }
}
