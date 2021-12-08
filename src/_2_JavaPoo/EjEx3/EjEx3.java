/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.EjEx3;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class EjEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        System.out.println("Ingrese los valores de A,B,C de la siguiente ecuacion Ax^2+Bx+C=0");
        Raices r=new Raices(l.nextDouble(),l.nextDouble(),l.nextDouble());
        r.calcular();
       
    }
    
}
