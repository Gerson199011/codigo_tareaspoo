/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encapsulamiento.newpackage;

import Doctor.doctor;

/**
 *
 * @author Gerson
 */
public class DOCTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instanciar la clase DOCTOR
        doctor Doctor = new doctor();
        
        //Establecer informacion para el objeto doctor
        Doctor.setNombre("Carlos Paz");
        Doctor.setExperiencia("3 Años");
        Doctor.setEdad("30 Años");
        
        //Obtener la informacion
        System.out.println("El nombre del doctor es:"+  Doctor.getNombre());
        System.out.println("La experiencia del doctor es:"+ Doctor.getExperiencia());
        System.out.println("La edad del doctor es:"+  Doctor.getEdad());
        
        
    }
    
}
