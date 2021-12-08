/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.EjEx5;

import java.util.Arrays;
import java.util.Scanner;

public class Mes {

    String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    String mesS = mes[(int) (Math.random() * 12)];

    private String getMesS() {
        return mesS;
    }

    public String[] getMes() {
        return mes;
    }

    public void juego() {
        Scanner l = new Scanner(System.in).useDelimiter("\n");
        System.out.println(Arrays.toString(getMes()));
        
        System.out.print("Adivine el mes secreto.Introduzca el nombre del mes en minusculas: ");

        String m = l.nextLine(); 
        Arrays.sort(mes);
        while (Arrays.binarySearch(mes, m) == -1) {
            System.out.println("Introduzca un mes valido");
            m = l.nextLine();
        }

        
        while (!m.equalsIgnoreCase(getMesS())) {
            System.out.print("No ha acertado.Intente adivinarlo introduciendo otro mes ("+getMesS()+"):");
            m = l.nextLine();
            while (Arrays.binarySearch(mes, m) == -1) {
                System.out.println("Introduzca un mes valido");
                m = l.nextLine();
            }
        }
        System.out.println("!Ha acertado!");

    }
}
