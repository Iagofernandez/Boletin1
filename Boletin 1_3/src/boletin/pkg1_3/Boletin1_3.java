/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg1_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        

        float dolarCte=1.15f;

        

         System.out.println("Introduce un valor en euros:\n ");

         

          float euros = teclado.nextFloat();

          

           System.out.println(euros+" 1euros son: "+(dolarCte*euros)+" dolares");
    }
    
}
