/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio05;

/**
 *
 * @author Luucho
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa;
    private Propietario propiertario;

    public Computadora(String marca, String numeroSerie,String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(modelo,chipset);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlaca() {
        return placa;
    }

    public Propietario getPropiertario() {
        return propiertario;
    }

    public void setPropiertario(Propietario propiertario) {
        this.propiertario = propiertario;
        if(propiertario != null && propiertario.getComputadora() != this){
            propiertario.setComputadora(this);
        }
    }
    
}
