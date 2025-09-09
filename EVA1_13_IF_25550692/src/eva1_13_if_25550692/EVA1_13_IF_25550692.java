/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA1_13_IF_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce tú año de nacimiento:");
        edad= captu.nextInt();
        if(edad <=2007) {//bloque verdadero
            System.out.println("Si puedes comprar bebidad alcoholicas");
     }else{//BLOQUE FALSO 
      System.out.println("No puedes comprar bebidas alcoholicas");
        
    }
    
}
}
