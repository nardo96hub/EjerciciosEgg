/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.Ej12;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio s = new Servicio();
        Persona p1 = s.crearpersona();
        Persona p2 = s.crearpersona();
        System.out.println(s.calcularEdad(p1));
        System.out.println(s.calcularEdad(p2));
        s.menorQue(p1, p2);
        s.menorQue2(p1, p2);
        
    }
    
}
