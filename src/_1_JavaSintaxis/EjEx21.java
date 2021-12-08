package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx21 {

    public static void main(String[] args) {
        int m, n, s;
        Scanner l = new Scanner(System.in);
        m = l.nextInt();
        n = l.nextInt();
        int[][] a = new int[m][n];
        s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
                s += a[i][j];
            }
        }
        System.out.println("La matriz es la siguiente:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("La suma de todos los elementos de la matriz es:" + s);
    }

}
