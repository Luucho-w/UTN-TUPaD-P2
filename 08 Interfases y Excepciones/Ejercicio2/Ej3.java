/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Luucho
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ejercicio 3: Lectura de archivo");
        try {
            File archivo = new File("src\\Ejercicio2\\Archivo.txt");
            Scanner lector = new Scanner(archivo);

            System.out.println("Contenido del archivo:\n");

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }

            lector.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("\nError: el archivo no existe o no se pudo abrir.");
        } 
        finally {
            scanner.close();
        }
    }
}
