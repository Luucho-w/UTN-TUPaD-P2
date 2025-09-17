/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio07;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Motor motor = new Motor("V8","1234");
        Vehiculo vehiculo = new Vehiculo("ABC123","Porsche",motor);
        Conductor conductor = new Conductor("Luucho","A1");
        vehiculo.setConductor(conductor);
        
        System.out.println("Vehiculo: "+ vehiculo.getModelo());
        System.out.println("Motor: "+ vehiculo.getMotor().getTipo());
        System.out.println("Conductor: "+ vehiculo.getConductor().getNombre());
    }
}
