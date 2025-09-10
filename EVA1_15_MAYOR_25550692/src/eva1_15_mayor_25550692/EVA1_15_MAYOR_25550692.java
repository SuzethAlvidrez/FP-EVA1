/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mayor_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA1_15_MAYOR_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2;
         Scanner input = new Scanner (System.in);
         System.out.println("Introduce el primer  numero:");
         n1 = input.nextInt();
         System.out.println("Introduce el segundo numero:");
         n2= input.nextInt();
         if(n1>n2){
             System.out.println("El numero mayor es:");
             System.out.println(n1);
         }
         else {
         if(n2> n1){
             System.out.println("El numero mayor es:");
             System.out.println(n1);
         }else{System.out.println("Los valores son iguales");
         }
         //Ignoramos que los numeros son iguales
         }
         
    }
}
    
         
    
   

