/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.AnteriorGuia.Ej2;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Ej2 {


    public static void main(String[] args) {
      Serie s=new Serie();
      ArrayList<Integer> a=s.leerValores();
        
      
      s.mostrarResultados(a, s.calcularSuma(a), s.calcularSuma(a)/a.size());
    }
    
}
