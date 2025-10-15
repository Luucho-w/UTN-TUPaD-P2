/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio2;

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
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Circulo c1 = new Circulo(5, "Circulo 1");
        Circulo c2 = new Circulo(10, "Circulo 2");
        Rectangulo r1 = new Rectangulo(2.0,  6.0, "Rectangulo 1");
        Rectangulo r2 = new Rectangulo(5.0,  8.0, "Rectangulo 2");
        
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2);
        
        for (Figura f : figuras) {
            f.calcularArea();
        }
        
    }
}
