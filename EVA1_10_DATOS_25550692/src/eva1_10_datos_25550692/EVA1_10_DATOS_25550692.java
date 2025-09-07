/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_datos_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA1_10_DATOS_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double distancia;
        double tiempo;
        double velocidad;
        Scanner captu =new Scanner(System.in);
                distancia= 15;
                tiempo=26;
                velocidad= distancia/ tiempo;
                 System.out.println("Introduce la distancia:");
                distancia= captu.nextDouble();
                 System.out.println("Introduce el tiempo:");
                tiempo= captu.nextDouble();
                //calculo
                velocidad =distancia/ tiempo;
                System.out.print("La velocidad es:");
                System.out.print(velocidad);
                System.out.print("m/s");
                
                
                
                
                /*para poner comentarios mas extensos se pone una diagonal y un 
asterisco y se cierra con otra diagonas y asterisco*/
                
                        
              
        
        
        
    }
    
}
