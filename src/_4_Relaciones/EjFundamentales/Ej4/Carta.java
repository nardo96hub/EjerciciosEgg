/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4_Relaciones.EjFundamentales.Ej4;

/**
 *
 * @author Jorge
 */
public class Carta {
    Integer num;
    String palo;

    public Carta(Integer num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta: '"  + num + " de " + palo+"'" ;
    }
    
}
