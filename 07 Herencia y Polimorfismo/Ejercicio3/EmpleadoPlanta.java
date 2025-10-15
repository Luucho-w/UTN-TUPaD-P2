/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Luucho
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;

    public EmpleadoPlanta(double sueldoBase, String nombre) {
        super(nombre);
        this.sueldoBase = sueldoBase;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }
}
