/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Luucho
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota a = new Mascota();
        
        a.setNombre("Pupi");
        a.setEspecie("Labrador");
        a.setEdad(3);
        
        a.mostrarInfo();
        System.out.println("");
        
        System.out.println("Despues de 2 anios...");
        a.cumplirAnios(2);
        a.mostrarInfo();
        System.out.println("");
        
        System.out.println("Despues de 5 anios...");
        a.cumplirAnios(5);
        a.mostrarInfo();
    }
    
}
