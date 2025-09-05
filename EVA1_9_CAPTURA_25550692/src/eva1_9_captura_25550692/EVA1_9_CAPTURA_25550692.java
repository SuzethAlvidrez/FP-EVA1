/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA1_9_CAPTURA_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        double promedio;
        Scanner input =new Scanner(System.in);//CREA EL SCANNER
        System.out.println("Introduce tu nombre completo:");
        nombre = input.nextLine();
       System.out.println("Introduce tu edad:");
       edad = input.nextInt();
       System.out.println("Captura tu promedio de la preparatoria:");
       promedio = input.nextDouble();
        
        nombre =input.nextLine();//captura el texto (next line())
        System.out.println("El nombre es:");
        System.out.print(nombre);
        System.out.println("La edad es:");
        System.out.println(edad);
        System.out.println("El promedio es:");
        System.out.println(promedio);
        
        
        
      
    }
    
}
