/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjFundamentales.Ej2;

/**
 *
 * @author Jorge
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora l1 = new Lavadora();
        Televisor t1 = new Televisor();

        l1.crearLavadora();
        t1.crearTelevisor();

        System.out.println("Lavadora: " + l1);
       System.out.println("Televisor: " + t1);
    }

}
