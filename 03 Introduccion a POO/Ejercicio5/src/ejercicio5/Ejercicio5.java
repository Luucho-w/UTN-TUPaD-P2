/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Luucho
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        
        /*Informacion:
        Limite de combustible maximo: 100.
        1km de distancia -> consume 2 de combustible.*/
        
        nave.setNombre("Galactica");
        nave.setCombustible(50);
        nave.setEnVuelo(false);
        
        nave.despegar();              // consume 50
        nave.avanzar(10);             // sin combustible, no puede avanzar
        nave.recargarCombustible(80); // recarga pero no se pasa del máximo
        nave.avanzar(10);             // ahora sí puede avanzar
        System.out.println("");
        nave.mostrarEstado();
        
    }
    
}
