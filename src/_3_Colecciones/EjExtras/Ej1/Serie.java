/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.EjExtras.Ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Serie {
    //

    public ArrayList leerValores() {
        ArrayList<Integer> n = new ArrayList();
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero (-99 para dejar de agregar)");
        num = s.nextInt();
        while (num != -99) {
            n.add(num);
            
            System.out.println("Ingrese un numero (-99 para dejar de agregar)");
            num = s.nextInt();
        }
        return n;
    }

    public int calcularSuma(ArrayList<Integer> num) {
        int suma = 0;
        for (Integer s : num) {
            suma += s;
        }
        return suma;
    }

    public void mostrarResultados(ArrayList<Integer> n, int s, double m) {
        System.out.println("El arreglo de enteros contiene:");
        System.out.print("[");
        for (int i = 0; i < n.size(); i++) {
            System.out.print(n.get(i) + " ");
        }
        System.out.print("]");
        System.out.println("");
       
        System.out.println("Suma:"+s+" tamano:"+n.size()+" media="+(s/n.size()+"="+m+"?"));
        System.out.println("La suma de todos los elementos es: " + s + " y la media es de:" + m);
        System.out.println("Los elementos del arreglo que son >=" + m + " son:");
        System.out.print("[");
        for (Integer i : n) {
            if (i > m) {
                System.out.print(i + " ");
            }
        }
        System.out.print("]\n");
    }
}
