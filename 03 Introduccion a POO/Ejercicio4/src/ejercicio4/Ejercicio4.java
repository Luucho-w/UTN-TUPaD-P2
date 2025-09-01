/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Luucho
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina a = new Gallina();
        Gallina b = new Gallina();
        
        //Creamos las dos gallinas y le cargamos datos
        a.setIdGallina(1);
        a.setEdad(5);
        a.setHuevosPuestos(2);
        
        b.setIdGallina(2);
        b.setEdad(10);
        b.setHuevosPuestos(3);
        
        //Mostramos el estado actual
        a.mostrarEstado();
        System.out.println("");
        b.mostrarEstado();
        
        //Simulamos las acciones
        a.ponerHuevo(2);
        a.envejecer(1);
        
        b.ponerHuevo(2);
        b.envejecer(5);
        
        //Mostramos el estado actual
        System.out.println("");
        a.mostrarEstado();
        System.out.println("");
        b.mostrarEstado();
    }
    
}
