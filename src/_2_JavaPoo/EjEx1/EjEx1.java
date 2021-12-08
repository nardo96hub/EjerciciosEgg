/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.EjEx1;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class EjEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in).useDelimiter("\n");
        Cancion c=new Cancion(l.next(),l.next());
        System.out.println(c);
    }
    
}
