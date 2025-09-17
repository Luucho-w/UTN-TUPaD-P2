/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Artista artista = new Artista("Luucho", "Rock");
        Cancion cancion = new Cancion("Tp5");
        Reproductor reproductor = new Reproductor();
        cancion.setArtista(artista);
        
        System.out.println("Artista: "+ cancion.getArtista().getNombre());
        reproductor.reproducir(cancion);
        
    }
}
