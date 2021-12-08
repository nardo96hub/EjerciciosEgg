/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.Ej10;

import java.util.Arrays;

/**
 *
 * @author Jorge
 */
public class Arreglo {

    Double[] a = new Double[50];
    Double[] b = new Double[20];

    public Arreglo() {
    }

    public Double[] getA() {
        return a;
    }

    public void setA(Double[] a) {
        this.a = a;
    }

    public Double[] getB() {
        return b;
    }

    public void setB(Double[] b) {
        this.b = b;
    }

    public void carga() {

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
            a[i]=Math.round(a[i]*100.0)/100.0;//Redondeo con 2 decimales 
        }
        
        System.out.println(Arrays.toString(a));    
        Arrays.sort(a);
        for (int i = 0; i < b.length / 2; i++) {
            b[i] = a[i];
        }
        for (int i = b.length / 2; i < b.length; i++) {
            b[i] = 0.5;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
