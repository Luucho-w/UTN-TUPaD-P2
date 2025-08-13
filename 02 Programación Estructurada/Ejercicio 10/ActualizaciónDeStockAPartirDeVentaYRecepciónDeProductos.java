/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.actualización.de.stock.a.partir.de.venta.y.recepción.de.productos;

import java.util.Scanner;

/**
 *
 * @author Luucho
 */
public class ActualizaciónDeStockAPartirDeVentaYRecepciónDeProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stockActual,cantVendida,cantRecibida,nuevoStock;
        
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = input.nextInt();
        
        System.out.print("Ingrese la cantidad vendida: ");
        cantVendida = input.nextInt();
        
        System.out.print("Ingrese la cantidad recibida: ");
        cantRecibida = input.nextInt();
        
        nuevoStock = actualizarStock(stockActual, cantVendida, cantRecibida);
        
        System.out.println("El nuevo stock del producto es: "+ nuevoStock);
        input.close();
    }
    
    public static int actualizarStock(int stockActual,int cantidadVendida, int cantidadRecibida){
        return stockActual - cantidadVendida + cantidadRecibida;
                
    }
}
