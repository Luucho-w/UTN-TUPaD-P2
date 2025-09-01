/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Luucho
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private boolean enVuelo;
    
    //Setters
    public void setNombre(String nuevoNombre){
        if(nuevoNombre != null){
            this.nombre = nuevoNombre;
        }
    }
    public void setCombustible(int nuevoCombustible){
        if(nuevoCombustible >=0 && nuevoCombustible <= 100){
            this.combustible = nuevoCombustible;
        }
    }
    public void setEnVuelo(boolean estado){
        this.enVuelo = estado;
    }
    //Metodos
    public void despegar(){
        if (combustible >= 50) {
            combustible -= 50;
            enVuelo = true;
            System.out.println(nombre + " ha despegado");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar");
        }
    }
    public void avanzar(int distancia){
        if (!enVuelo) {
            System.out.println(nombre + " no ha despegado todavia");
            return;
        }
        if (combustible >= (distancia * 2)) {
            combustible -= (distancia * 2);
            System.out.println(nombre + " avanzo " + distancia + " km.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > 100) {
            combustible = 100;
            System.out.println(nombre + " se recargo hasta el máximo (" + 100 + " unidades).");
        } else {
            combustible += cantidad;
            System.out.println(nombre + " recargo " + cantidad + " unidades de combustible.");
        }
    }
    public void mostrarEstado() {
        String estado = enVuelo ? "en vuelo" : "en tierra";
        System.out.println("---Estado---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/100");
        System.out.println("Situacion: " + estado);
    }
}
