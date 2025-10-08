/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Profesores
    Profesor prof1 = new Profesor("101", "María Gómez", "Matemáticas");
    Profesor prof2 = new Profesor("102", "Juan Pérez", "Física");
    Profesor prof3 = new Profesor("103", "Lucía Fernández", "Química");

    // Cursos
    Curso algebra = new Curso("C01", "Álgebra");
    Curso fisica1 = new Curso("C02", "Física 1");
    Curso quimicaOrg = new Curso("C03", "Química Orgánica");
    Curso calculo = new Curso("C04", "Cálculo");
    Curso laboratorioFisica = new Curso("C05", "Laboratorio de Física");

    // Creamos la universidad 
    Universidad uni = new Universidad("UTN");

    // Agregamos los profesores a la universidad
    uni.agregarProfesor(prof1);
    uni.agregarProfesor(prof2);
    uni.agregarProfesor(prof3);

    // Agregamos los cursos
    uni.agregarCurso(algebra);
    uni.agregarCurso(fisica1);
    uni.agregarCurso(quimicaOrg);
    uni.agregarCurso(calculo);
    uni.agregarCurso(laboratorioFisica);

    // Asignamos los profesores con los cursos
    uni.asignarProfesorACurso("C01", "101"); 
    uni.asignarProfesorACurso("C02", "102"); 
    uni.asignarProfesorACurso("C04", "102"); 
    uni.asignarProfesorACurso("C05", "102"); 
    uni.asignarProfesorACurso("C03", "103"); 

    // Listamos profesores con cursos
    uni.listarProfesor();

    // Listamos cursos
    uni.listarCursos();

    // Cambiamos un profesor de curso
    uni.asignarProfesorACurso("C01", "102"); 
    uni.listarCursos();
    uni.listarProfesor();

    // Removemos un curso y validamos que no lo tiene al profesor
    uni.eliminarCurso(quimicaOrg); 
    uni.listarProfesor();
    uni.listarCursos();

    // Removemos un profesor
    uni.eliminarProfesor(prof1); 
    uni.listarProfesor();
    }
}
