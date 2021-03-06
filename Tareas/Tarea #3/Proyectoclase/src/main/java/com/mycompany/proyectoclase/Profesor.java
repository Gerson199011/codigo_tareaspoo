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
public class Profesor {
    
    //Propiedades
    private int edad;
    private String name;
    private String profesion;
    
    //Constructor por defecto
    public Profesor(){
        
    }
    
    //Constructor de parametros
    public Profesor(int edad, String name, String profesion){
      this.setEdad(edad);
      this.setName(name);
      this.setProfesion(profesion);
    }
    //Metodos para dar la informacion
    public int getEdad(){
        return edad;
    }
    
    public String getName(){
        return name;
    }
    
    public String getProfesion(){
        return profesion;
    }
    //Metodo para establecer
    public void setEdad(int _edad){
        this.edad = _edad;
    }
    
    public void setName(String _name){
        this.name = _name;
    }
    
    public void setProfesion(String _profesion){
        this.profesion = _profesion;
    }
}
