/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.Fundamentales.Ej1.Ej1_2MEsa;

import java.util.Comparator;

/**
 *
 * @author Jorge
 */
public class Comparadores {
    public static Comparator<Perro> perroString =new Comparator<Perro>(){
        @Override
        public int compare(Perro t, Perro t1) {
          return t.getPerro().compareTo(t1.getPerro());
        }
        
    };
}
