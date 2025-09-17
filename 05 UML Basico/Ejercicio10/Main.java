/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Titular titular = new Titular("Luucho","12345678");
        CuentaBancaria cuenta = new CuentaBancaria("12345",100.0,"54321","16/09");
        cuenta.setTitular(titular);
        
        System.out.println("Titular: "+ cuenta.getTitular().getNombre());
        System.out.println("Clave: "+ cuenta.getClave().getCodigo());
        System.out.println("Saldo: "+ cuenta.getSaldo());
    }
}
