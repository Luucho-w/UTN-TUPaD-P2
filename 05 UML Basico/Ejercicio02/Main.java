/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Bateria bateria = new Bateria("Amper",4000);
        Celular c1 = new Celular("1234","Iphone","11",bateria);
        Usuario usuario = new Usuario("Luciano","12345678");
        usuario.setCelular(c1);
        
        System.out.println("Celular: " + c1.getMarca() + " " + c1.getModelo());
        System.out.println("Usuario: " + c1.getUsuario().getNombre() + ", DNI: " + c1.getUsuario().getDni());
        System.out.println("Bateria: " + c1.getBateria().getModelo() + ", Capacidad: " + c1.getBateria().getCapacidad());
    }
}
