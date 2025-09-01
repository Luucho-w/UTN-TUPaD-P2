/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Luucho
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    //Setters
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public void setEspecie(String nuevoEspecie){
        this.especie = nuevoEspecie;
    }
    public void setEdad(int nuevaEdad){
        if(nuevaEdad > 0){
            this.edad = nuevaEdad;
        }
    }
    //Metodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " anios");
    }
    
    public void cumplirAnios(int anios){
        if(anios > 0){
            edad+= anios;
        }
    }
}
