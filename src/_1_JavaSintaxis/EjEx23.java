package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx23 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int n = l.nextInt();
        char b='a';
        int[] a = new int[n + 2];
        System.out.println((b+8)+"");
        for (int i = 0; i < a.length; i++) {
            a[i] = Fibonacci(i);
        }
        System.out.print("La sucesion de Fibonacci de la serie " + n + " es de: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
        

    }

    public static int Fibonacci(int n) {
        int f;
        if (n > 1) {
            f = Fibonacci(n - 1) + Fibonacci(n - 2);
        } else {
            f = 1;
        }
        return f;
    }

}
