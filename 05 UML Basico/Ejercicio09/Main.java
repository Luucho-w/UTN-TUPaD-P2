/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ejercicio09;

/**
 *
 * @author Luucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Paciente paciente = new Paciente("Luucho","IOSPER");
        Profesional profesional = new Profesional("Matias","Nutricionista");
        CitaMedica cita = new CitaMedica("2025-12-19","7:30hs");
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);
        
        System.out.println("Cita: "+ cita.getFecha()+", Hora: "+ cita.getHora());
        System.out.println("Profesional: "+ cita.getProfesional().getNombre());
        System.out.println("Paciente: "+ cita.getPaciente().getNombre());
    }
}
