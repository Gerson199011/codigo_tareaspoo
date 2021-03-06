/*
 * Arreglo que guarde 20 nombres de ciudades
 * 
 * 
 */


/**
 *
 * Gerson Reyes
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arregloqueguarde20nombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nciudades;
        
        nciudades = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de ciudades"));
        char[]ciudad = new char[nciudades];
        System.out.println("Digite los elementos del arreglo:");
        for(int i=0;i<nciudades;i++){
            System.out.print((i+1)+"Digite un caracter:");
            ciudad[i] = entrada.next().charAt(0);
            
        }
        
        System.out.println("\nLos caracteres del arreglo son :");
        for(int i=0;i<nciudades;i++){
            System.out.print(ciudad[i]+"");
        }
        
    }
    
}
