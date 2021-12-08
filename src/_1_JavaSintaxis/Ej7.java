/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1_JavaSintaxis;

import java.util.Scanner;


public class Ej7 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese 2 numeros");
        int a,b;
        a=leer.nextInt();
        b=leer.nextInt();
        if(a<b)
        {
            System.out.println(a+"<"+b);
        }
        else
            System.out.println(a+">"+b);
                
    }
    
}
