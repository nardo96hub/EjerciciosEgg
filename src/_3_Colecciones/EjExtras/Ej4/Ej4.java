/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.EjExtras.Ej4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej4 {

    public static void main(String[] args) {
        HashMap<Integer, String> info = new HashMap();
        Scanner l = new Scanner(System.in).useDelimiter("\n");

        String ciudad;
        Integer codp;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Carga de la "+i+"º Ciudad:");
            System.out.println("Ingrese codigo de ciudad");
            codp = l.nextInt();
            System.out.println("Ingrese nombre de ciudad");
            ciudad = l.next();
            info.put(codp, ciudad);
        }
        for (Map.Entry<Integer, String> i : info.entrySet()) {
            System.out.println("<Codigo: " + i.getKey() + ", Ciudad:" + i.getValue() + ">");

        }
        System.out.println("Ingrese codigo postal");
        codp = l.nextInt();
        System.out.println(info.get(codp));
        for (Map.Entry<Integer, String> i : info.entrySet()) {
            System.out.println("<Codigo: " + i.getKey() + ", Ciudad:" + i.getValue() + ">");

        }
        System.out.println("Ingrese codigo de ciudad");
        codp = l.nextInt();
        System.out.println("Ingrese nombre de ciudad");
        ciudad = l.next();
        info.put(codp, ciudad);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese codigo de la " + (i + 1) + " ºciudad a eliminar");
            codp = l.nextInt();
            info.remove(codp);
        }
        for (Map.Entry<Integer, String> i : info.entrySet()) {
            System.out.println("<Codigo: " + i.getKey() + ", Ciudad:" + i.getValue() + ">");

        }
    }

}
