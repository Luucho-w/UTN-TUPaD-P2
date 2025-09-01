/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Luucho
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante lucho = new Estudiante();
       
        lucho.setNombre("Luciano");
        lucho.setApellido("Wittmund");
        lucho.setCurso("Programacion2");
        lucho.setCalificacion(100.5);
        
        lucho.mostrarInfo();
        System.out.println("");
        
        lucho.subirCalificacion(20);
        
        lucho.mostrarInfo();
        System.out.println("");
        
        lucho.bajarCalificacion(20.5);
        lucho.mostrarInfo();
        
    }
    
}
