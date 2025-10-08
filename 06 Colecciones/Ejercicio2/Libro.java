/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Luucho
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    // GETTERS
    public String getIsbn(){    
        return isbn;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public Autor getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    
    // METODOS
    public void mostrarInfo() {
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor=" + autor.getNombre()+ '}';
    }
}
