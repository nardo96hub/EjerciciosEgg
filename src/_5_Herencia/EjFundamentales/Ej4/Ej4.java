/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjFundamentales.Ej4;

/**
 *
 * @author Jorge
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Circulo c1=new Circulo(1);
     Rectangulo r1=new Rectangulo();
     r1.crearRec();
     
     r1.Perimetro();r1.Area();
     c1.Perimetro();c1.Area();
    }
    
}
