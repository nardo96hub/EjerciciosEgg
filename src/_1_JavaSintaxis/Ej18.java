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
public class Ej18 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String a="A";
        String is,js,ks;is=js=ks="";
        for(int i=0; i<10;i++)
        {
            
            for(int j=0; j<10;j++)
            {
                for(int k=0; k<10;k++)
                {
                    is=String.valueOf(i);
                    js=String.valueOf(i);
                    ks=String.valueOf(i);
                   if(j==3){
                       js="E";
                   }
                   if(i==3){
                       is="E";
                   }
                   if(k==3){
                       ks="E";
                   }
                    
                    System.out.println(is+"-"+js+"-"+ks); 
                }
            }
            
            
            
            
        }
        /*for(int i=0; i<10;i++)
        {
            
            for(int j=0; j<10;j++)
            {
                for(int k=0; k<10;k++)
                {
                    
                    if(i!=3 && j!=3 && k!=3)
                        System.out.println(i+"-"+j+"-"+k);
                    else if(i==3 && j!=3&& k!=3)
                        System.out.println("E-"+j+"-"+k);
                    else if(i==3 && j==3 && k!=3)
                        System.out.println("E-E-"+k);
                    else if(i==3 && j==3 && k==3)
                        System.out.println("E-E-E");
                    else if(i==3 && j!=3 && k==3)
                        System.out.println("E-"+j+"-E");
                    else if(i!=3 && j==3 && k!=3)
                        System.out.println(i+"-E-"+k);
                    else if(i!=3 && j==3 && k==3)
                        System.out.println(i+"-E-E");
                    else if(i!=3 && j!=3 && k==3)
                        System.out.println(i+"-"+j+"-E");
                    
                    
                }
            }
            
            
            
            
        }*/
    
}
}
