/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Luucho
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    // GETTERS
    public List<Curso> getCursos(){
        return Collections.unmodifiableList(cursos);
    }
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    
    // METODOS      
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
             c.setProfesor(this);
            }
        }
    }
    public void eliminarCurso(Curso c){
        if(c != null && cursos.contains(c)){
            cursos.remove(c);
            if(c.getProfesor() == this){
                c.setProfesor(null);
            }
        }
    }
    public void listarCursos(){
        System.out.println("Los cursos del profesor " + nombre + " son: ");
        for(Curso c: cursos){
            c.mostrarInfo();
        }
    }
    public void mostrarInfo(){
        System.out.println("Datos del Profesor:");
        System.out.println("ID: " + id + "\nNombre: " + nombre + "\nEspecialidad: " + especialidad );
        System.out.println("Cantidad de cursos: " + cursos.size());
    }
}
