/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cbarraganc.t02.p2;
import java.util.Scanner;

/**
 *
 * @author Carlos Javier Barragán Carrión
 * Matrícula: A01410357
 * Carrera: IMT
 */
public class SPPCBarraganCT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valinf, valsup;
        
        Scanner kb = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("Bienvenido al Verificador de números 3000000");
        System.out.println("******************************");
        
        System.out.println("\nIntroduce un número entero:");
        valinf = kb.nextDouble();
        
        System.out.println("Ahora introduce un número mayor al anterior:");
        valsup = kb.nextDouble();
        
       
        
       while(valinf <= valsup){
           if (valinf % 2 == 0){
        System.out.println(valinf + " = *Este número es PAR*");
    }
           else if (valinf % 3==0 && valinf % 5==0){
           System.out.println(valinf+ " = *Este número es divisible entre 3 y 5*");
       }
           else if(valinf % 3==0){
               System.out.println(valinf+ " = *Este número es divisible entre 3*");
            }
           else if(valinf % 5==0){
               System.out.println(valinf+ " = *Este número es divisible entre 5*");
            }
           else{
               System.out.println(valinf);
           }
           valinf++;
        }
       

       }  
}
