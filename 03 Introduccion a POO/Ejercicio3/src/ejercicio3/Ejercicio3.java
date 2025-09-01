/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Luucho
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        
        //Creamos el objeto libro1
        libro1.setTitulo("Cien años de soledad");
        libro1.setAutor("Gabriel García Márquez");
        libro1.setAnio(1967);
        
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Anio: " + libro1.getAnioPublicacion());
        
        //Anios invalidos
        System.out.println("");
        libro1.setAnio(170);
        libro1.setAnio(0000);
        
        //Anio valido
        libro1.setAnio(2000);
        System.out.println("");
        
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Anio: " + libro1.getAnioPublicacion());
    }
}
