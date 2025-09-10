/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Luucho
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int idAutomatico =  1;
    
    //CONSTRUCTOR
    public Empleado(int id, String nombre, String puesto, double salario){
        setId(id);
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
        totalEmpleados++;
        
        //Ajustamos idAutomatico 
        if (id >= idAutomatico) {
            idAutomatico = id + 1;
        }
    }
    public Empleado(String nombre, String puesto){
        this.id = idAutomatico++;
        setNombre(nombre);
        setPuesto(puesto);
        this.salario = 500.0;
        totalEmpleados++;
    }
    
    //SETTERS
    public void setId(int id){
        if(id >= 0){
            this.id = id;
        }
        else{
            System.out.println("Id Invalido");
        }
    }
    public void setNombre(String nombre){
        if(nombre != null){
            this.nombre = nombre;
        }
        else{
            System.out.println("Nombre Invalido");
        }
    }
    public void setPuesto(String puesto){
        if(puesto != null){
            this.puesto = puesto;
        }
        else{
            System.out.println("Puesto Invalido");
        }
    }
    public void setSalario(double salario){
        if(salario >= 0){
            this.salario = salario;
        }
        else{
            System.out.println("Salario Invalido");
        }
    }
    
    //METODOS
    public void actualizarSalario(int porcentaje){
        if(porcentaje > 0){
            this.salario += ((salario * porcentaje)/100);
        }
        else{
            System.out.println("Porcentaje Invalido");
        }
    }
    public void actualizarSalario(double cantidad){
        if(cantidad > 0){
            this.salario += cantidad; 
        }
        else{
            System.out.println("Cantidad Invalida");
        }
    }
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
}
