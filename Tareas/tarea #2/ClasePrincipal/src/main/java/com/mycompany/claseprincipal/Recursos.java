/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.claseprincipal;

/**
 *
 * @author Gerson
 */
public class Recursos {
    //Propiedades
    private String saludo;
    private int edad;
    //constructor
    public Recursos(){
        
    }
    //Constructor con parametros
    public Recursos(String saludo){
        this.setSaludo(saludo);
        
    }
    public Recursos(int edad){
        this.setEdad(edad);
    }
    
    //Metodos
    public String getSaludo(){
        return saludo;
    }
    public int getEdad(){
        return edad;
    }
    
    //Metodos para establecer
    public  void setSaludo(String _saludo){
        this.saludo = _saludo;
    }
    public void setEdad(int _edad){
        this.edad = _edad;
        if(edad>=21){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("\nEres menor de edad");
        }
    }
}
