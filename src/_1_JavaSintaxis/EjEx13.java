package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx13 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int M, N, m, edad, cant;
        System.out.println("Ingrese la cantidad de familias");
        M = l.nextInt();
        m = cant = 0;
        while (M < 1) {
            System.out.println("Ingrese la cantidad de familias");
            M = l.nextInt();
        }

        for (int i = 1; i <= M; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia " + i);
            N = l.nextInt();
            while (N < 0) {
                System.out.println("Ingrese la cantidad de familias");
                N = l.nextInt();
            }
            cant += N;
            if (N > 0) {
                for (int j = 1; j <= N; j++) {
                    System.out.println("Ingrese la edad del hijo " + j + " de la familia " + i);
                    edad = l.nextInt();
                    while (edad < 1) {
                        System.out.println("Ingrese la edad del hijo " + j + " de la familia " + i + ".Mayor a 0");
                        edad = l.nextInt();
                    }
                    m += edad;
                }
            }

        }
        System.out.println("La media de edades de una cantidad de hijos entre todas las familias de " + cant + " es de una de edad=" + (m / cant));

    }

}
