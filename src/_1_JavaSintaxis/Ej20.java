/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1_JavaSintaxis;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int a;
      
        for(int i=0;i<4;i++)
        {
            System.out.println("Ingrese un numero entre [1,20] para el numero:"+ (i+1));
            a=leer.nextInt();
            
            while(a<1||a>20)
            {
                System.out.println("Ingrese un numero entre [1,20]");
                a=leer.nextInt();
               
            }
            System.out.print(a+" ");
            for(int j=0;j<a;j++)
            {
                System.out.print("*");
            }
            System.out.println("");   
                    
        }
    }
    
}
