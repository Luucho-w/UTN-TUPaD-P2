/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Luucho
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
           
    //Setters
    public void setIdGallina(int id){
        if(id >= 0){
            this.idGallina = id;
        }
    }
    public void setEdad(int nuevaEdad){
        if(nuevaEdad > 0){
            this.edad = nuevaEdad;
        }
    }
    public void setHuevosPuestos(int huevos){
        if(huevos >= 0){
            this.huevosPuestos = huevos;
        }
    }
    //Metodos
    public void ponerHuevo(int huevo){
        if(huevo > 0){
            this.huevosPuestos+= huevo;
        }
    }
    public void envejecer(int anios){
        if(anios > 0){
            this.edad+= anios;
        }
    }
    public void mostrarEstado(){
        System.out.println("ID Gallina: " + idGallina);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Huevos Puestos: " + huevosPuestos);
    }
}
