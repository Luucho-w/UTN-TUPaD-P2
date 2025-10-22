/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Luucho
 */
public class Pedido implements Pagable {
    private ArrayList<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }
    
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    
    @Override
    public double calcularTotal() {
        double totalPedido = 0;
        for (Producto p : productos) {
            totalPedido+= p.calcularTotal();
        }
        return totalPedido;
    } 
    public void cambiarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
        cliente.notificarCambio("Estado: "+ nuevoEstado);
    }
}
