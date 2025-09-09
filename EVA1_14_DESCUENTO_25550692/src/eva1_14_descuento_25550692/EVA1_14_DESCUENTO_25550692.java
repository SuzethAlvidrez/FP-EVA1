/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA1_14_DESCUENTO_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       double montoVenta, montoPagar = 0;
        Scanner captu = new Scanner (System.in);
        System.out.println("Monto de la compra:");
        montoVenta= captu.nextDouble();
         if(montoVenta >1000){
             montoPagar= montoVenta * 0.85;
             //montoPagar= montoVenta - (montoVenta *0.15);
         }
            System.out.println("Debes de pagar");
         System.out.println(montoPagar);
         
                 
                 
        
        
        
       
            
    }
    
}
