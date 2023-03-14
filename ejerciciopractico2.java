/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores de 
edad. Después de cada persona, el programa debe preguntarle al usuario si quiere 
seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

 */
package ejerciciossubprogramas;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class ejerciciopractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        identidad();
    }
    
    public static void identidad(){
        Scanner leer = new Scanner(System.in);
        String respuesta="";
        int edad=0;
        
        while (!respuesta.equalsIgnoreCase("no")) {
        
            System.out.println("Ingrese el nombre de una persona");
            String nombre = leer.next();
            
            System.out.println("Ingrese su edad");
            edad = leer.nextInt();
           
            if (edad>=18) {
                System.out.println(nombre + " es mayor de edad");
                
            }else{
                System.out.println(nombre+" no es mayor de edad");
            }
            System.out.println("Desea seguir ingresando datos? si/no");
            respuesta=leer.next();
    }
        
            
    
  }
    
    
}
