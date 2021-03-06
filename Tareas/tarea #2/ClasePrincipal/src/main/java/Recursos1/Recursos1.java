/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos1;
import javax.swing.JOptionPane;

/**
 *
 * @author Emely
 */
public class Recursos1 {

    /**
     * @param args the command line arguments
     */
   
   
    
    public void recursos1(){
        String num1, num2;
        int n1, n2, resultado;
        
        
        num1=JOptionPane.showInputDialog("Ingrese el primer numero");
        num2=JOptionPane.showInputDialog("Ingrese el segundo numero");
        
        n1=Integer.parseInt(num1);
        n2=Integer.parseInt(num2);
        
        resultado=n1*n2;
        
        System.out.println("El resultado es:" +resultado);
    }
    
     
    public static void main(String[] args) {
        // TODO code application logic here
     
        
    }
   
        
    }
