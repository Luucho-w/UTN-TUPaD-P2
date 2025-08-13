/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.validación.de.nota.entre.pkg0.y.pkg10.pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Luucho
 */
public class ValidaciónDeNotaEntre0Y10DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = input.nextDouble();
            
            if(nota<0 || nota>10){
                System.out.println("Error: Nota inválida.");
            }
        } while (nota<0 || nota>10);
        
        System.out.println("Nota guardada correctamente.");
        
        input.close();
    }
    
}
