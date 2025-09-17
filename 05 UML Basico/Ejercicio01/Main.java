/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte("1234","2000-05-05","imagen.jpg","IMG");
        Titular titular = new Titular("Luciano Wittmund", "12345678");
        titular.setPasaporte(pasaporte);
        
        System.out.println("Pasaporte numero: " + pasaporte.getNumero());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
    }
    
}
