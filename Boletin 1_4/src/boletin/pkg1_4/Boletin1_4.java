/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg1_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float S,R,P,D;

       

        

        Scanner leer = new Scanner(System.in);

        

         System.out.println("Introduce dos numeros decimales (el segundo que no sea 0: ");

          

            float num1 = leer.nextFloat();

            float num2 = leer.nextFloat();

            

            S=num1+num2;

            R=num1-num2;

            P=num1*num2;

            D=num1/num2;

            

             System.out.println("Suma= "+S+"\nResta= "+R+"\nProducto= "+P+"\nDivision= "+D);

            
    }
    
}
