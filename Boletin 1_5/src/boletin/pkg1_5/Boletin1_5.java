/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg1_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        float metrosCte=1852;

        

         System.out.println("Introduce un valor decimal en millas marinas: ");

            

            float millas = sc.nextFloat();

            

             System.out.println(millas+"millas marinas son: "+(metrosCte*millas)+"millas");
    }
    
}
