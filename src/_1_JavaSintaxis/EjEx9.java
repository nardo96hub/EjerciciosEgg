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
public class EjEx9 {

  
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int a,b,c,r;
        System.out.println("Ingrese 2 numeros para realizar la division");
        a=l.nextInt();
        b=l.nextInt();
        c=0;
        r=a;
        while(r>b)
        {
            r-=b;
            c++;
        }
        System.out.println(a+"/"+b+" tiene residuo:"+r+" y cociente:"+c);
    }
    
}
