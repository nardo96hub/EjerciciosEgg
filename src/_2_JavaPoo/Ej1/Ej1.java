/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.Ej1;



/**
 *
 * @author Jorge
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro1=new Libro();
        Libro libro2=new Libro("asda", "medicina", "jorge", 8);
        libro2.muestra();
        Libro libro3=new Libro();
        libro3.carga();
        libro3.muestra();
        
    }
    
}
