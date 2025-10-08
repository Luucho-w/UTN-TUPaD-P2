/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Luucho
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    // METODOS
    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    public Producto buscarProductoPorId(String id) {
        Producto pEncontrado = null;
        Iterator<Producto> it = this.productos.iterator();
        while(it.hasNext() && pEncontrado == null){
            Producto p = it.next();
            if(p.getId().equalsIgnoreCase(id)){
                pEncontrado = p;
            }
        }
        return pEncontrado;
    }
    public Producto eliminarProducto(String id) {
        Producto prodABorrar = buscarProductoPorId(id);
        if(prodABorrar != null){
            this.productos.remove(prodABorrar);
        }
        return prodABorrar;
    }
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto prodAActualizar = buscarProductoPorId(id);
        if(prodAActualizar != null){
            prodAActualizar.setCantidad(prodAActualizar.getCantidad() + nuevaCantidad);
        }
    }
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> prodFiltroCat = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getCategoria() == categoria){
                prodFiltroCat.add(producto);
            }
        }
        return prodFiltroCat;
    }
    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock+= producto.getCantidad();
        }
        return totalStock;
    }
    public int maxStock() {
        int maxStock = -1;
        for (Producto producto : productos) {
            if(producto.getCantidad() > maxStock){
                maxStock = producto.getCantidad();
            }
        }
        return maxStock;
    }
    public ArrayList<Producto> obtenerProductoConMayorStock() {
        ArrayList<Producto> prodMaxStock = new ArrayList<>();
        int stockMax = maxStock();
        for (Producto producto : productos) {
            if(producto.getCantidad() == stockMax){
                prodMaxStock.add(producto);
            }
        }
        return prodMaxStock;
    }
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList prodPorPrecio = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getPrecio() >= min && producto.getPrecio()<=max){
                prodPorPrecio.add(producto);
            }
        }
        return prodPorPrecio;
    }
    public void mostrarCategoriasDisponibles() {
        CategoriaProducto[] cat = CategoriaProducto.values();
        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i]);
        }
    }
    @Override
    public String toString() {
        return "Inventario{" + "productos=" + productos + '}';
    }  
}