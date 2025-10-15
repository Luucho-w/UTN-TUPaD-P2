/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Luucho
 */
public class EmpleadoTemporal extends Empleado {
    private double horasTrabajadas;
    private double precioHora;

    public EmpleadoTemporal(double horasTrabajadas, double precioHora, String nombre) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }
    
    
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * precioHora;
    }
    
    
}
