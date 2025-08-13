/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package determinar.el.mayor.de.tres.números;

/**
 *
 * @author Luucho
 */
import java.util.Scanner;
public class DeterminarElMayorDeTresNúmeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2, num3;
        
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        num3 = input.nextInt();
        
        if (num1 == num2 && num2==num3){
            System.out.println("Los tres número son iguales.");
        }
        else if ((num1>=num2) && (num1>=num3)){
            System.out.println("El número " + num1 + " es el mayor.");
        }
        else if ((num2>=num1) && (num2>=num3)){
            System.out.println("El número " + num2 + " es el mayor.");
        }
        else{
            System.out.println("El número " + num3 + " es el mayor.");
        }
        input.close();
    }
    
}
