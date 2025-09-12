/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA1_19_ANTRO_25550692 {

 final static String EDAD ="18";
   final static  String CREDENCIAL ="Si";    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ed, crede;
        Scanner input = new Scanner (System.in);
         
           System.out.println("BIENVENIDO");
             System.out.println("Antro");
         System.out.println("Edad:");
         ed = input.nextLine();
         System.out.println("¿Tiene credencial?");
          crede = input.nextLine();
          
         if(ed.equals(EDAD)){//COMPARAR CADENAS
           if(crede.equals(CREDENCIAL)){
             System.out.println("ACCESO CONCEDIDO");  
           }else{
             System.out.println("ACCESO DENEGADO");     
           }    
         
         }else{
             System.out.println("ACCESO DENEGADO");              
         }
}
}
