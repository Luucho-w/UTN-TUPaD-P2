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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ejercicio 2: Conversion de cadena a numero");
        String cadena;
        
        try{
            System.out.print("Escribe una cadena de texto: ");
            cadena = scanner.nextLine();
            System.out.println("\nNumero convetido: " + Integer.parseInt(cadena));
        }
        catch(NumberFormatException e){
            System.out.println("\nError: el texto no se puede convertir a numero.");
        }
    }
}
