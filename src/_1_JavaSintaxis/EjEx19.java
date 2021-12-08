/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1_JavaSintaxis;

public class EjEx19 {

    public static void main(String[] args) {
        int[] a = new int[8];
        carga(a);
        muestra(a);
    }

    public static void carga(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
    }

    public static void muestra(int[] a) {
        System.out.print("El arreglo es el siguiente:[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");

    }

}
