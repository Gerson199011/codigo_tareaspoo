/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicaabstraccion.newpackage;

import Ayudas.HospitalEscuela;
import Ayudas.MarioCatarinoRivas;
import Ayudas.SanFelipe;

/**
 *
 * @author Gerson
 */
public class Hospitales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarioCatarinoRivas mcr = new MarioCatarinoRivas ();
        HospitalEscuela he = new HospitalEscuela();
        SanFelipe sf = new SanFelipe();
        
        System.out.println(mcr.getNombre());
        System.out.println(mcr.getDirector());
        System.out.println(he.getNombre());
        System.out.println(he.getDirector());
        System.out.println(sf.getNombre());
        System.out.println(sf.getDirector());
        
    }
    
}
