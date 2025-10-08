/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Luucho
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // GETTERS
    public String getId(){    
        return id;
    }
    public int getCantidad() {
        return cantidad;
    }
    public CategoriaProducto getCategoria() {
        return categoria;
    }
    public double getPrecio() {
        return precio;
    }
    public String getNombre() {
        return nombre;
    }
    
    // SETTERS
    public void setCantidad(int cantidad) {
        if(cantidad >= 0){
            this.cantidad = cantidad;
        }
        else{
            System.out.println("La cantidad incorrecta.");
        }
    }
    
    // METODOS
    public void mostrarInfo() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    } 
}
