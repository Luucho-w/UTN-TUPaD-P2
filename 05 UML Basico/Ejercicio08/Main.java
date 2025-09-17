/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio08;

/**
 *
 * @author Luucho
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Usuario usuario = new Usuario("Luucho","luucho@gmail.com");
        Documento doc = new Documento("Cheque", "Contenido del cheque", "abc123", "2025-12-19", usuario);
        
        System.out.println("Documento: "+ doc.getTitulo());
        System.out.println("Usuario: "+ doc.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Codigo Hash: "+ doc.getFirmaDigital().getCodigoHash());
    }
}
