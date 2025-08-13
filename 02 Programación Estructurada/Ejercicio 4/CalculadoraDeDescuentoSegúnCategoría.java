/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.calculadora.de.descuento.según.categoría;

/**
 *
 * @author Luucho
 */
import java.util.Scanner;
public class CalculadoraDeDescuentoSegúnCategoría {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribe un programa que solicite al usuario el precio de un producto y
        //su categoría (A, B o C).
        
        Scanner input = new Scanner(System.in);
        
        double precioProducto, precioFinal=0;
        char categoria;
        
        System.out.print("Ingrese el precio del prodcuto: $");
        precioProducto = input.nextDouble();
        input.nextLine();
        
        System.out.print("Ingrese la categoría (A, B o C): ");
        categoria = input.nextLine().charAt(0);
        
        switch (categoria){
            case 'A':
            case 'a':{
                precioFinal = precioProducto * 0.90;
                System.out.println("Descuento aplicado: 10%");
                break;
            }
            case 'B':
            case 'b':{
                precioFinal = precioProducto * 0.85;
                System.out.println("Descuento aplicado: 15%");
                break;
            }
            case 'C':
            case 'c':{
                precioFinal = precioProducto * 0.80;
                System.out.println("Descuento aplicado: 20%");
                break;
            }
            default:{
                System.out.println("Categoria incorrecta.");
            }
            
        }
        System.out.println("Precio Final: $" + precioFinal);
        input.close();
    }
    
}
