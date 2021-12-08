/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4_Relaciones.EjFundamentales.Ej2;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*ArrayList<Jugador>a=new ArrayList();
      Revolver r=new Revolver();
      r.llenarREvolver();
    
      Juego j=new Juego();
      j.llenarJuego(a, r);
      
      */
      for(int i=0;i<100000;i++)
      {
          System.out.println(Math.floor(Math.random()*6+1));
      }
      
    }
    
}
