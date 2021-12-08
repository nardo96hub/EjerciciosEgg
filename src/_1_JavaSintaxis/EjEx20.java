package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx20 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double tp1, tp2, pi, si;
        double[] a = new double[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese las 4 notas del alumno " + (i + 1));
            System.out.println("Ingrese la nota del Primer trabajo practico entre [1,10]");
            tp1 = l.nextDouble();
            while (tp1 < 1 || tp1 > 10) {
                System.out.println("Ingrese una nota entre [1,10]");
                tp1 = l.nextDouble();
            }
            System.out.println("Ingrese la nota del Segundo trabajo practico entre [1,10]");
            tp2 = l.nextDouble();
            while (tp2 < 1 || tp2 > 10) {
                System.out.println("Ingrese una nota entre [1,10]");
                tp2 = l.nextDouble();
            }
            System.out.println("Ingrese la nota del Primer trabajo practico entre [1,10]");
            pi = l.nextDouble();
            while (pi < 1 || pi > 10) {
                System.out.println("Ingrese una nota entre [1,10]");
                pi = l.nextDouble();
            }
            System.out.println("Ingrese la nota del Primer trabajo practico entre [1,10]");
            si = l.nextDouble();
            while (si < 1 || si > 10) {
                System.out.println("Ingrese una nota entre [1,10]");
                si = l.nextDouble();
            }
            a[i] = (tp1 * 0.1 + tp2 * 0.15 + pi * 0.25 + si * 0.5);

        }
        System.out.println("El promedio de notas es:[");
        int desa = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (a[i] < 7) {
                desa++;
            }
        }
        
        System.out.println("]");
        System.out.println("La cantidad de alumnos aprobados es de:"+(a.length-desa)+" y la cantidad de desaprobados es:"+desa);

    }

}
