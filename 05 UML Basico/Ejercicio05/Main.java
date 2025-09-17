/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio05;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Computadora computadora = new Computadora("Asus","12345","E404","b405");
        Propietario propietario = new Propietario("Luucho","12345678");
        propietario.setComputadora(computadora);
        
        System.out.println("Computadora: "+ computadora.getMarca());
        System.out.println("Placa Madre: "+ computadora.getPlaca().getModelo());
        System.out.println("Propietariio: "+ computadora.getPropiertario().getNombre());
    }
}
