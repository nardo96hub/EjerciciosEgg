/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjFundamentales.Ej3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomesticos> electro = new ArrayList();
        Scanner l = new Scanner(System.in);
        char tipo;
        double lava,tele;
        lava=tele=0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Se creara el electrodomestico "+i);
            System.out.println("Desea crear una lavadora(L) o televisor(T)?");
            tipo = l.next().toUpperCase().charAt(0);
            while (tipo != 'L' && tipo != 'T') {
                System.out.println("Desea crear una lavadora(L) o televisor(T)?");
                tipo = l.next().toUpperCase().charAt(0);

            }
            if(tipo=='L')
            {
                Lavadora lav=new Lavadora();
                lav.crearLavadora();
                lava+=lav.getPrecio();
                electro.add(lav);
            }else {
                Televisor tel=new Televisor();
                tel.crearTelevisor();
                electro.add(tel);
                tele+=tel.getPrecio();
            }
            
        }
        double p=0;
        for (Electrodomesticos e : electro) {
            System.out.println(e);
          
                    
                    
            
            p+=e.getPrecio();
        }
        System.out.println("La sumatoria de todos los productos de (Lavadoras + Televisor) es de: "+p+" ("+lava+" + "+tele+")");
        
        

    }

}
