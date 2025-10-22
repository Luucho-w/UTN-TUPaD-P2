/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Luucho
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ejercicio 4: Excepcion personalizada");
        
        try{
            System.out.print("Ingrese una edad: ");
            int edad = scanner.nextInt();
            
            if(edad < 0 || edad > 120){
                throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
            }
            System.out.println("Edad valida: " + edad);
        }
        catch(EdadInvalidaException e){
            System.out.println("Error: Edad invalida");
        }
    }
}
