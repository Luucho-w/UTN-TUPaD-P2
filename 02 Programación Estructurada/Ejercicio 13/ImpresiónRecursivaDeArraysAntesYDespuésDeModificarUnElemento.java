/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.impresión.recursiva.de.arrays.antes.y.después.de.modificar.un.elemento;

/**
 *
 * @author Luucho
 */
public class ImpresiónRecursivaDeArraysAntesYDespuésDeModificarUnElemento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios={199.99,299.5,149.75,399.0,89.99};
        
        System.out.println("Precios Originales:");
        mostrarPreciosOriginales(precios, 0);
        
        precios[0] = 300.0;
        precios[3] = 21.99;
        
        System.out.println("Precios Modificados:");
        mostrarPreciosModificados(precios, 0);
        
    }
    
    public static void mostrarPreciosOriginales(double precios[],int indice){
        if (indice >=precios.length){
        }
        else{
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosOriginales(precios, indice+1);
        }
    }
    public static void mostrarPreciosModificados(double precios[],int indice){
        if (indice >=precios.length){
        }
        else{
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosModificados(precios, indice+1);
        }
    }
}
