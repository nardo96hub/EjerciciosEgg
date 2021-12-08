/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjFundamentales.Ej1;

/**
 *
 * @author Jorge
 */
public class Gato extends Animal{
    
    public Gato(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }
/*
    Gato(String pelusa, String galletas, String siames, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    @Override
    public void Alimentarse()
    {
        System.out.println("Los gatos comen "+alimento);
    }
}
