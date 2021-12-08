package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx14 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        int a, b, op;

        System.out.println("Ingrese 2 numeros enteros");
        a = l.nextInt();
        b = l.nextInt();
        System.out.println("Dado los 2 numeros ingresado ingrese que desea hacer con ellos");
        System.out.println("1_Sumar\n2_Restar\n3_Multiplicar\n4_Dividir");
        System.out.println("Ingrese una opcion entre [1,4]");
        op = l.nextInt();
        while (op < 1 || op > 4) {
            System.out.println("Ingrese una opcion entre [1,4]");
            op = l.nextInt();
        }
        switch (op) {
            case 1: {

                System.out.println(a + "+" + b + "=" + suma(a, b));
            }
            break;

            case 2: {

                System.out.println(a + "-" + b + "=" + resta(a, b));
            }
            break;
            case 3: {

                System.out.println(a + "*" + b + "=" + producto(a, b));
            }
            break;
            case 4: {

                System.out.println(a + "/" + b + "=" + division(a, b));
            }
            break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int producto(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
