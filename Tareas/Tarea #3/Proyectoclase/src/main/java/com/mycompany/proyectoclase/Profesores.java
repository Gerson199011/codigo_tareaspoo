/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoclase;

/**
 *
 * @author Gerson
 */
public class Profesores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Que tal profesor");
        
        //Instanciar la clase Profesor
        Profesor profesor = new Profesor();
        profesor.setEdad(28);
        profesor.setName("Arnol Gutierrez");
        profesor.setProfesion("Ingeniero en Sistema");
        
        //Obtener la informacion
        System.out.println("La edad del catedratico es:"+ profesor.getEdad());
        System.out.println("La edad del catedratico es:"+ profesor.getName());
        System.out.println("La edad del catedratico es:"+ profesor.getProfesion());
        
    }
    
}
