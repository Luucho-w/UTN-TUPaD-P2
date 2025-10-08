/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luucho
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }
    public void eliminarProfesor(Profesor p) {
        if (p != null && profesores.contains(p)) {
           
            for (Curso curso : new ArrayList<>(p.getCursos())) {
                curso.setProfesor(null);
            }
            profesores.remove(p);
        }
    }
    public void eliminarCurso(Curso c) {
        if (c != null && cursos.contains(c)) {
            c.setProfesor(null);
            cursos.remove(c);
        }
    }
    public void listarProfesor() {
        System.out.println("Los profsores de la universidad " + nombre
                + " cuenta con " + profesores.size() + " profesores: ");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }
    public void listarCursos() {
        System.out.println("La unidversidad " + nombre
                + " cuenta con " + cursos.size() + " cursos y son: ");
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    public Profesor buscarProfesorPorId(String id) {
        if (id != null) {
            for (Profesor profesor : profesores) {
                if (profesor.getId().equals(id)) {
                    return profesor;
                }
            }
        }
        return null;
    }
    public Curso buscarCursoPorCodigo(String codigo) {
        if (codigo != null) {
            for (Curso curso : cursos) {
                if (curso.getCodigo().equals(codigo)) {
                    return curso;
                }
            }
        }
    return null;
    }
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profesor= this.buscarProfesorPorId(idProfesor);
        Curso curso=this.buscarCursoPorCodigo(codigoCurso);
        if(profesor!=null && curso!=null){
            curso.setProfesor(profesor);
        }
        else{
            System.out.println("O el docente o el curso no existen "
               + "en la universidad "+nombre);
        }
    }
}
