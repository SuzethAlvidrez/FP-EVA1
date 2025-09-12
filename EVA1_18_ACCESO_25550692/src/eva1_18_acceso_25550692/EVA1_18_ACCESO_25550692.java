/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA1_18_ACCESO_25550692 {
   final static String USUARIO ="suzeth";
   final static  String PWD ="1234";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usu, contra;
         Scanner input = new Scanner (System.in);
         
           System.out.println("BIENVENIDO");
             System.out.println("Sistema de venta ");
         System.out.println("Introduce tu usuario:");
         usu = input.nextLine();
         System.out.println("Introduce tu contraseña:");
          contra = input.nextLine();
          
         if(usu.equals(USUARIO)){//COMPARAR CADENAS
           if(contra.equals(PWD)){
             System.out.println("ACCESO CONCEDIDO");  
           }else{
             System.out.println("ACCESO DENEGADO");     
           }
             
         } else{
             System.out.println("ACCESO DENEGADO");                  
         }
    }
    
}
