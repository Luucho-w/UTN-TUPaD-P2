/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Biblioteca B1 = new Biblioteca("Biblioteca One");
        Autor autor1 = new Autor("A1", "Gabriel Garcia Marquez", "Colombiana");
        Autor autor2 = new Autor("A2", "Julio Cortazar", "Argentina");
        Autor autor3 = new Autor("A3", "Isabel Allende", "Chilena");
        
        //Agregamos Libros a la Biblioteca
        B1.agregarLibro("L001", "Cien anios de soledad", 1967, autor1);
        B1.agregarLibro("L002", "Cronica de una muerte anunciada", 1981, autor1);
        B1.agregarLibro("L003", "Rayuela", 1963, autor2);
        B1.agregarLibro("L004", "Final del juego", 1956, autor2);
        B1.agregarLibro("L005", "La casa de los espiritus", 1982, autor3);
        
        // Listamos los libros
        System.out.println("Lista de Libros:");
        B1.listarLibros();
        
        //Buscamos libro por isbn
        System.out.println("\nLibro por ISBN:");
        System.out.println(B1.buscarLibroPorIsbn("L003"));
        
        //Filtramos libro por anio
        System.out.println("\nLibros por anio: ");
        B1.filtrarLibrosPorAnio(1956);
        
        //Eliminamos libro por isbn
        System.out.println("\nLibro eliminado: \n" + B1.eliminarLibro("L001"));
        System.out.println("\nLibros restantes:");
        B1.listarLibros();
        
        //Mostramos cantidad de libros
        System.out.println("\nCantidad de Libros: ");
        System.out.println("Biblioteca: " + B1.getNombre());
        System.out.println("Cantidad: " + B1.obtenerCantidadLibros());
        
        //Mostramos autores disponibles
        B1.mostrarAutoresDisponibles();
    }
}
