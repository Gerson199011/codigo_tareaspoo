/*
 * Dadas las variables indicar si es verdadero o falso
 *
 * 
 */

/**
 *
 * Gerson 
 */
public class Evaluacionesdevariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m=6;
        int t=1;
        int k=-10;
        float div,suma,resta;
        boolean verdadero = true;
        boolean falso = false;
        
        if (m>t){
            System.out.println("m es mayor que t");
        }else{
            System.out.println("t es mayor");
        }
             div =t/k;
             if(div==-5){
                 System.out.println("verdadero");
             }else{
                 System.out.println("falso");
             }
             suma = m+t;
             resta = m-t;
             
             System.out.println("la suma es :"+suma);
             System.out.println("la resta es :"+resta);
                 
             }
             
             
    }
    

