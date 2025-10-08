/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Luucho
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    // GETTERS

    public String getNombre() {
        return nombre;
    }
    
    // METODOS 
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
       libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    public void listarLibros() {
        for (Libro libro : libros) {
        libro.mostrarInfo();
        }
    }
    public Libro buscarLibroPorIsbn(String isbn){
       Libro libroEncontrado = null;
       Iterator<Libro> it = this.libros.iterator();
       while(it.hasNext() && libroEncontrado == null){
           Libro lib = it.next();
           if(lib.getIsbn().equalsIgnoreCase(isbn)){
               libroEncontrado = lib;
           }
       }
        return libroEncontrado;
    }
    public Libro eliminarLibro(String isbn){
        Libro libroABorrar = buscarLibroPorIsbn(isbn);
        if(libroABorrar != null){
            this.libros.remove(libroABorrar);
        }
        return libroABorrar;
    }
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    public void filtrarLibrosPorAnio(int anio){
        boolean encontrado = false;
        for (Libro libro : libros) {
            if(libro.getAnioPublicacion()== anio){
                System.out.println(libro);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No se encontraron libros publicados en el anio " + anio);
        }
    }
    public void mostrarAutoresDisponibles(){
        HashSet<String> autores = new HashSet<>();
        for (Libro libro : libros) {
            autores.add(libro.getAutor().getNombre());
        }
        System.out.println("\nAutores disponibles:");
        for (String autor : autores) {
            System.out.println(autor);
        }
    }
}
