package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx2 {

    public static void main(String[] args) {
        int A, B, C, D, aux;
        Scanner leer = new Scanner(System.in);
        A = leer.nextInt();B = leer.nextInt();C = leer.nextInt();D = leer.nextInt();
        System.out.println("-----------------");
        System.out.println("A=" + A);System.out.println("B=" + B);System.out.println("C=" + C);System.out.println("D=" + D);

        aux = B;B = C;C = A;A = D;D = aux;
        System.out.println("A=" + A);System.out.println("B=" + B);System.out.println("C=" + C);System.out.println("D=" + D);

    }

}
