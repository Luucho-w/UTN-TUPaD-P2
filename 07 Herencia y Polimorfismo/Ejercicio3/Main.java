/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio3;

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
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta(500000.0,"Luucho"));
        empleados.add(new EmpleadoTemporal(3.5,1000.0,"Juan"));
        
        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre() + "\nSueldo: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de planta\n");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado temporal\n");
            }
        }
    }
}
