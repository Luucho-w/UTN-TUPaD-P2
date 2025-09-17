/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Luucho
 */
public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario){
        CodigoQR codigo = new CodigoQR(valor);
        codigo.setUsuario(usuario);
        
        System.out.println("Valor CodigoQR: "+codigo.getValor());        
    }
}
 