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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        // Ejercicio 1: División segura 
        System.out.println("Ejercicio 1: Division segura ");
        int num1, num2;
       
        try{
            System.out.print("Ingrese el primer numero: ");
            num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            num2 = scanner.nextInt();
            
            System.out.println("\n" + num1 + "/" + num2 + ": " + (num1/num2));
        }
        catch(ArithmeticException e){
            System.out.println("\nNo se puede dividir por cero");
        }
        finally{
            System.out.println("Operacion finalizada");
        }
    }
}
