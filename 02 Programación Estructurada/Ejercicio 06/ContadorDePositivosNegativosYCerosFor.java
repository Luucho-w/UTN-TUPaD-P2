/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.contador.de.positivos.negativos.y.ceros.pkgfor;

import java.util.Scanner;


/**
 *
 * @author Luucho
 */
public class ContadorDePositivosNegativosYCerosFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribe un programa que pida al usuario ingresar 10 números enteros y
        //cuente cuántos son positivos, negativos y cuántos son ceros.
        Scanner input = new Scanner(System.in);
        
        int num, positivos=0,negativos=0,ceros=0;
        
        for(int i=1;i<11;i++){
            System.out.print("Ingrese el número " + i + ": ");
            num = input.nextInt();
            
            if(num>0){
                positivos+=1;
            }
            else if(num<0){
                negativos+=1;
            }
            else{
                ceros+=1;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
        input.close();
    }
    
}
