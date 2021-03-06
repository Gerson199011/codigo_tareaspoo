/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;

/**
 *
 * @author Gerson
 */
public class doctor {
    //Nombre del Doctor
    public String nombre;
    private String edad;
    private String experiencia;
    
    //constructor
    public doctor(){
        
    }
    //metodos para obtener la informacion del doctor
    
    public String getNombre(){
        return nombre;
    }
    public String getEdad(){
        return edad;
    }
    public String getExperiencia(){
        return experiencia;
    }
    
    //Constructor personalizado
    public doctor(String nombre, String experiencia, String edad){
        this.setNombre(nombre);
        this.setExperiencia(experiencia);
        this.setEdad(edad);
        
    }
    //metodos para establecer
    public void setNombre(String _nombre){
       this.nombre = _nombre; 
    }
    
    public void setExperiencia(String _experiencia){
        this.experiencia = _experiencia;
    }
    public void setEdad(String _edad){
        this.edad = _edad;
    }
}
