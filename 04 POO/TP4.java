/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author Luucho
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(01,"Luciano","Lider",900);
        Empleado e2 = new Empleado("Matias","Co-Lider");
        
        e1.actualizarSalario(25);
        e2.actualizarSalario(200.0);
        
        System.out.println(e1);
        System.out.println(e2);
        
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
