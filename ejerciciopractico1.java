/*
 *
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package ejerciciossubprogramas;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class ejerciciopractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese dos numeros");
         int num1= leer.nextInt();
        int  num2=leer.nextInt();
    
       String respuesta ="";
       
            
       
        do{
        
            
             System.out.println("Ingrese la opcion que desee"
                + " A.Sumar"
                + " B.Restar"
                + " C.Multiplicar"
                +" D.Dividir"
                +" E.Salir"
            );
        String opcion = leer.next();
        switch (opcion.toUpperCase()) {
            case "A":
                int resultadoS = suma(num1,num2);
                System.out.println("El resultado de la suma es "+ resultadoS);
                
                break;
                
            case "B":
                 int resultadoR= resta(num1,num2);
                System.out.println("El resultado de la resta es " +resultadoR);
                
                break;
            case "C":
                 int resultadoM = multiplicacion(num1,num2);
                System.out.println("El resultado de la multiplicacion es " +resultadoM);
                
                break;
            case "D":
                int resultadoD=division(num1,num2);
                System.out.println("El resultado de la division es " +resultadoD);
                
                break;
            case "E":
                System.out.println("Realmente desea salir? S/N");
              respuesta = leer.next();
                     if (respuesta.equalsIgnoreCase("N")) {
                   
                         
                     }else if (respuesta.equalsIgnoreCase("S")) {
                            System.out.println("Chau!! :)");
                     }
                     break;
        }
        
      }while (respuesta.equalsIgnoreCase("n"));
    } 
    
    public static int suma(int num1, int num2){
       int resultado= num1+num2; 
        
       return resultado; 
    }
    
    public static int resta(int num1, int num2){
       int resultado= num1-num2; 
        
       return resultado; 
    }
        
    public static int multiplicacion(int num1, int num2){
       int resultado= num1*num2; 
        
       return resultado; 
    }
     public static int division(int num1, int num2){
       int resultado= num1/num2; 
        
       return resultado; 
    }
    
}
