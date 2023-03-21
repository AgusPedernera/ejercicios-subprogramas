/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que 
será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package ejerciciossubprogramas;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class ejerciciopractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca a continuacion la cantidad de euros que desea convertir a otra moneda");
        float euros = leer.nextInt();
        System.out.println("Ingrese a que moneda quiere hacer el cambio. (dolar, yen o libra)");
        String opcion = leer.next();
       
        Convertir(euros,opcion);
       
    }
    
    public static void Convertir(float euros, String opcion){
        switch (opcion) {
            case "dolar":
              float conver = Math.round((euros*1.28611) * 100000.0f) /100000.0f;
               System.out.println(euros+"€ a dolares, equivalen a "+(euros*1.28611));  
                break;
            case "yen":

              float converY =Math.round((euros*129.852) * 1000.0f) /1000.0f;
                 System.out.println(euros+"€ a yenes, equivalen a "+ converY );
                break;
            case "libra":

                  float converL = Math.round((euros*0.86) * 100.0f) /100.0f;
                 System.out.println(euros+"€ a libras, equivalen a "+ converL );
                
            default:
                System.out.println("No corresponde a una opcion");
        }
        

       
 
       
    }
    
}
