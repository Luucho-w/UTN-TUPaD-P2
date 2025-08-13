/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.composición.de.funciones.para.calcular.costo.de.envío.y.total.de.compra;

import java.util.Scanner;

/**
 *
 * @author Luucho
 */
public class ComposiciónDeFuncionesParaCalcularCostoDeEnvíoYTotalDeCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio,peso,costoEnvio,total;
        String zona;
        
        System.out.print("Ingrese el precio del producto: $");
        precio = input.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = input.nextDouble();
        input.nextLine();
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(peso,zona);
        if(costoEnvio <0){
            System.out.println("No se pudo calcular el costo de envío por zona incorrecta.");
        }
        else{
            total = calcularTotalCompra(precio, costoEnvio);
        
        System.out.println("El costo de envío es: $" + costoEnvio);
        System.out.println("El total a pagar es: $" + total);
        }
        
        input.close();
    }
    public static double calcularCostoEnvio(double peso, String zona){
        double costo=0;
        if(zona.equalsIgnoreCase("Nacional")){
            costo = 5 * peso;
        }
        else if(zona.equalsIgnoreCase("Internacional")){
            costo = 10 * peso;
        }
        else{
            return -1;
        }
        return costo;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
}
