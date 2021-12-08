/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.EjEx2;

/**
 *
 * @author Jorge
 */
public class EjEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p = new Punto();
        p.crearpunto();

        System.out.println("Dado los puntos:" + p + " la distancia entre esos puntos es de:" + p.distancia());
    }

}
