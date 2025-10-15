/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());
        
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
