/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.modificación.de.un.array.de.precios.y.visualización.de.resultados;

/**
 *
 * @author Luucho
 */
public class ModificaciónDeUnArrayDePreciosYVisualizaciónDeResultados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios={199.99,299.5,149.75,399.0,89.99};
        
        System.out.println("Precios Originales:");
        for(double i : precios){
            System.out.println("Precio: $" + i);
        }
        
        precios[1] = 300.0;
        precios[4] = 21.99;
        
        System.out.println("Precios Modificados:");
        for(double i : precios){
            System.out.println("Precio: $" +i);
        }
    }
    
}
