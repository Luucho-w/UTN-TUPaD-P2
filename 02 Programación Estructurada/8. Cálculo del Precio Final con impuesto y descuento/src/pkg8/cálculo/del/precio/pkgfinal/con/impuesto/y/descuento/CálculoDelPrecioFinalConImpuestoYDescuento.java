/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.cálculo.del.precio.pkgfinal.con.impuesto.y.descuento;

import java.util.Scanner;

/**
 *
 * @author Luucho
 */
public class CálculoDelPrecioFinalConImpuestoYDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precioBase, porcentajeImpuesto, porcentajeDescuento,precioFinal=0;
        
        System.out.print("Ingrese el precio base del producto: $");
        precioBase = input.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        porcentajeImpuesto = input.nextDouble();
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        porcentajeDescuento = input.nextDouble();
        
        precioFinal = calcularPrecioFinal(precioBase,porcentajeImpuesto,porcentajeDescuento);
        
        System.out.println("El precio final del producto es: $" + precioFinal);
        
        input.close();
    }
    
    public static double calcularPrecioFinal(double precio,double impuesto,double descuento){
        impuesto = impuesto / 100;
        descuento = descuento / 100;
        double precioFinal;
        precioFinal = precio + (precio * impuesto) - (precio * descuento);
        return precioFinal;
    } 
}
