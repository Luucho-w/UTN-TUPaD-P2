/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        //Creamos 5 productos
        Producto p1 = new Producto("A1", "Leche", 250, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("B2", "Auriculares", 1800, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("C3", "Remera", 1200, 15, CategoriaProducto.ROPA);
        Producto p4 = new Producto("D4", "Cafetera", 3500, 3, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("E5", "Pan", 150, 30, CategoriaProducto.ALIMENTOS);
        
        //Agregamos los productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        //Listamos los productos:
        System.out.println("Lista de Productos");
        inventario.listarProductos();
        
        //Buscamos producto por ID
        System.out.println("\nProducto por ID:");
        System.out.println(inventario.buscarProductoPorId("D4"));
        
        //Filtramos producto por categoria especifica
        System.out.println("\nProducto por categoria:");
        System.out.println(inventario.filtrarPorCategoria(CategoriaProducto.ROPA));
        
        //Eliminamos producto por ID
        System.out.println("\nProducto eliminado: \n" + inventario.eliminarProducto("C3"));
        System.out.println("\nProductos restantes:");
        inventario.listarProductos();
        
        //Actualizamos stock
        inventario.actualizarStock("B2", 5);
        
        //Mostramos total de stock
        System.out.println("\nStock total: " + inventario.obtenerTotalStock());
        
        //Producto con mayor stock
        System.out.println("\nProducto/s con mayor stock: \n" + inventario.obtenerProductoConMayorStock());
        
        //Flitramos productos por precios
        System.out.println("\nProductos entre $1000 y $3000: ");
        System.out.println(inventario.filtrarProductosPorPrecio(1000,3000));
        
        //Mostramos categorias
        System.out.println("\nCategorias:");
        inventario.mostrarCategoriasDisponibles();
    }
    
}
