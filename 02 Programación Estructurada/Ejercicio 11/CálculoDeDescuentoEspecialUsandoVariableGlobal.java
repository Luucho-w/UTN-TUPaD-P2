/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.cálculo.de.descuento.especial.usando.variable.global;

import java.util.Scanner;

/**
 *
 * @author Luucho
 */
public class CálculoDeDescuentoEspecialUsandoVariableGlobal {

    static double descuentoEspecial = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;
        
        System.out.print("Ingrese el precio del producto: $");
        precio = input.nextDouble();
        
        calcularDescuentoEspecial(precio);
    }
    
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * descuentoEspecial;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("Descuento aplicado: $" + descuentoAplicado);
        System.out.println("Precio final con descuento: $" + precioFinal);
    }
}
