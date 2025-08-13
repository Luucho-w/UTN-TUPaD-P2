/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.suma.de.números.pares.pkgwhile;

/**
 *
 * @author Luucho
 */
import java.util.Scanner;
public class SumaDeNúmerosParesWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, suma=0;
        
        System.out.print("Ingrese un número: ");
        num = input.nextInt();
        
        while (num!=0){
            if (num%2==0){
                suma+= num;
            }
            System.out.print("Ingrese un número: ");
            num = input.nextInt();
        }
        System.out.println("La suma de los números pares es: " + suma);
        
        input.close();
    }
    
}
