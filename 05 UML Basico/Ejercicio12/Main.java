/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Contribuyente contribuyente = new Contribuyente("Luucho","12345");
        Impuesto impuesto = new Impuesto(105.5);
        Calculadora calculadora = new Calculadora();
        impuesto.setContribuyente(contribuyente);
        
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        calculadora.calcular(impuesto);
    }
}
