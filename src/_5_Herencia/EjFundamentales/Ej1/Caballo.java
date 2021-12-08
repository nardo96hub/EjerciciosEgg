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
public class Caballo extends Animal{
    
    public Caballo(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

  /*  Caballo(String spirit, String pasto, String fino, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    @Override
    public void Alimentarse()
    {
        System.out.println("Los caballos comen "+alimento);
    }
}
