/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_if_anidado_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA1_16_IF_ANIDADO_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //dia de la semana del 1 al 7
        int dia;
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce un numero de dia (1 a7):");
        dia = captu.nextInt();
        if(dia==1){
            System.out.println("Domingo");
             }else if (dia==2){
                 System.out.println("Lunes");
             }else if (dia==3){
                 System.out.println("Martes");
             }else if (dia==4){
                 System.out.println("Miercoles");
             }else if (dia==5){
                 System.out.println("Jueves");
             }else if (dia==6){
                 System.out.println("Viernes");
             }else if (dia==7){
                 System.out.println("Sabado");
             }else{//opcional
                  System.out.println("Número no es valido!!");
                 
             }
        
        
    }
    
}
