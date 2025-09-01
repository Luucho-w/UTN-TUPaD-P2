/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Luucho
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    //Getters
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    //Setters
    public void setTitulo(String nuevoTitulo){
        if(nuevoTitulo != null){
            this.titulo = nuevoTitulo;
        }
        else{
            System.out.println("Titulo Invalido"); 
        }
    }
    public void setAutor(String nuevoAutor){
        if(nuevoAutor != null){
            this.autor = nuevoAutor;
        }
        else{
            System.out.println("Autor Invalido"); 
        }
    }
    public void setAnio(int nuevoAnio){
        if(validacionAnio(nuevoAnio) ){
            this.anioPublicacion = nuevoAnio;
        }
        else{
            System.out.println("Anio Invalido (debe estar entre 1000 y 2025)"); 
        }
    }
    //Metodo de validacion. Si esta entre el anio 1000 y 2025.
    private boolean validacionAnio(int anio){
        return anio >= 1000 && anio <= 2025;
    }
}
