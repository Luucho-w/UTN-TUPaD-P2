/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Luucho
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    //Setters
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public void setApellido(String nuevoApellido){
        this.apellido = nuevoApellido;
    }
    public void setCurso(String nuevoCurso){
        this.curso = nuevoCurso;
    }
    public void setCalificacion(double nuevaCalificacion){
        if(nuevaCalificacion >= 0){
           this.calificacion = nuevaCalificacion; 
        } else{
            System.out.println("Calificacion Invalida");
        }          
    }
    
    //Metodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos){
        if(puntos > 0){
            calificacion+= puntos;
        }
    }
    
    public void bajarCalificacion(double puntos){
        if(calificacion>0){
            calificacion-= puntos;
            if(calificacion < 0){
                calificacion = 0;
            }
        }
    }
}
