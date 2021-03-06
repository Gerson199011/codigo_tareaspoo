/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.claseprincipal;
import Recursos1.Recursos1;

import javax.swing.JOptionPane;
/**
 *
 * @author Gerson
 */
public class Recurso {

    /**
     
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Clase recursos
        Recursos recursos = new Recursos();
        recursos.setSaludo("Programacion orientado a objetos 2021");
        
        recursos.setEdad(19);
        
        //Obtener la informacion
        System.out.println("La edad es:"+ recursos.getEdad());
        
        System.out.println("\nEl mensaje es:" + recursos.getSaludo());
        
         Recursos1 mult = new Recursos1();
        mult.recursos1();
        
        
}
}
