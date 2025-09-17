/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Proyecto proyecto = new Proyecto("TP5","3:30");
        EditorVideo editor = new EditorVideo();
        
        System.out.println("Proyecto: "+proyecto.getNombre());
        editor.exportar("MP4", proyecto);
    }
}
