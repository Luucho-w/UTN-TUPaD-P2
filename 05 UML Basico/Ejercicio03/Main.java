/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio03;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Editorial editorial = new Editorial("Suprem","Av.25 de Mayo");
        Libro libro = new Libro("TP5","123abc",editorial);
        Autor autor = new Autor("Luucho", "Argentino");
        libro.setAutor(autor);
        
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
        
        
    }
}
