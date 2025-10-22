/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Luucho
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        try (BufferedReader lector = new BufferedReader(new FileReader("src\\Ejercicio2\\Archivo.txt"))) {

            System.out.println("Contenido del archivo:\n");

            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } 
        catch (IOException e) {
            System.out.println("\nError al leer el archivo: " + e.getMessage());
        } 
    }
}
