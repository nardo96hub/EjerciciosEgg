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
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    int sum=0;
    int i = 0;
    int a;
   do{
              
       System.out.println("Ingrese un numero: ");
       a = leer.nextInt();
       i=i+1;
       
       System.out.println("contador"+i);
       if (a >0)
       {
           sum = sum + a;
       }

   }while(i<3 && a!=0);
        System.out.println(sum);
   
        System.out.println("Mi version");
        sum=0;
        for(int j=1;j<=20;j++)
        {
            System.out.println("Ingrese el numero "+j);
            a=leer.nextInt();
            if(a==0) break;
            else if(a>0)
                sum+=a;
        }
        System.out.println(sum);
    }
    
}  
    
    
    

