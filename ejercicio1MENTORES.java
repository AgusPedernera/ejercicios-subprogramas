/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main. 
EJERCICIO QUE HICE EN EL GRUPO CON LOS MENTORES
 */
package ejerciciossubprogramas;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class ejercicio1MENTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        System.out.println("Ingrese la opcion que desee");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        int opciones = leer.nextInt();

        switch (opciones) {
            case 1:

                System.out.println("El resultado de sumar los numeros es " + Sumar(num1, num2));

                break;
                
            case 2:
               
             System.out.println("El resultado de restar los numeros es "+restar(num1,num2));
             
                break; 
            case 3:
               
             System.out.println("El resultado de multiplicar los numeros es "+multiplicar(num1,num2));
             
                break; 
            case 4:
                if (num2==0 ) {
                    System.out.println("No se puede dividir por 0");
                    
                }else{
             System.out.println("El resultado de dividir los numeros es "+dividir(num1,num2));
                }
             
                break; 
        }
       leer.close();
    }
  
    public static int Sumar(int num1, int num2){
        
        return num1+num2;
    }
    
    public static int restar(int num1, int num2){
        return num1-num2;
    }
    
    public static int multiplicar(int num1, int num2){
        return num1*num2;
    }
    public static float dividir(float num1, float num2){
       
        float cociente = Math.round((num1/num2) * 1000.0f) /1000.0f;
        
        return cociente;  
    }
    
    
}
