/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.Ej8;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in).useDelimiter("\n");
        String frase;
        System.out.println("Ingrese una frase");
        frase = l.next();
        Cadena c = new Cadena(frase);
        c.mostrar();
        System.out.println("La cantidad de vocales en la frase " + c.getFrase() + " es de " + c.MostrarVocales());
        c.invertirfrase();
        c.mostrar();
        c.vecesRepetido("l");
        //System.out.println("La cantidad de veces repetido la letra l en la frase " + c.getFrase() + " es " + c.vecesRepetido("l"));
        c.comparar(c.getFrase());
        c.unirfrase(" Hola mundo");
        c.mostrar();
        c.reemplazar("*");
        c.mostrar();
    }

}
