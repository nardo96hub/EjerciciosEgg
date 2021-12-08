package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx22 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        String[][] a = new String[20][20];
        //Inicializo matriz
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = String.valueOf((char) (Math.random() * 10 + '0'));
            }
        }

        String letra;
        int ia, ja;
        for (int i = 0; i < 5; i++) {
             System.out.println("Ingrese la " + (i + 1) + "º de 5 palabras de longitud entre [3,5]");
            letra = l.next();
            while (letra.length() < 3 || letra.length() > 5) {
                System.out.println("Ingrese la " + (i + 1) + "º palabra de longitud entre [3,5]");
                letra = l.next();
            }
            letra = letra.toUpperCase();
          
            ia = (int) (Math.random() * 20);
            ja = (int) (Math.random() * (20 - letra.length()+1));
            for (int j = 0; j < letra.length(); j++) {
                a[ia][ja + j] = letra.substring(j, j + 1);
            }

        }
        System.out.println("\n\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j].charAt(0) > '9') {
                    System.out.print("\u001B[31m" + a[i][j] + "\u001B[0m ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println("");
        }

    }

}
