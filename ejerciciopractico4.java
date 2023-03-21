/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por 
parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, 
sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 
25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.


 */
package ejerciciossubprogramas;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class ejerciciopractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if (ComprobarPrimo(num)) {
            System.out.println("Es primo");
        }else { System.out.println("No es primo");}
        
        
    }
        
    public static boolean ComprobarPrimo(int num){
        boolean primo = false;
        int contador = 0;
        for (int i = 1; i < num + 1; i++) {
            if (num % i == 0) {
            contador++;
            }
        }
        if (contador == 2) {
                primo = true;
        }
        return primo;
    }
    
        
    
        
    
}
