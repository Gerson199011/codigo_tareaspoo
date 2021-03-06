
import javax.swing.JOptionPane;

/*
 * Numeros pares de 2 al 100
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Gerson Reyes
 */
public class Numerosparesde2a100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while(numero!=100) {//mientras el numero sea distinto de 0
            
            if(numero %2 ==0){//si el numero es par
                System.out.println("El numero"+numero+"es par");
            }
            else{
                System.out.println("El numero"+numero+"es impar");
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
        
        
    }
    
}
