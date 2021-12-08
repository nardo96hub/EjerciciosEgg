package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx18 {

    public static void main(String[] args) {
        boolean igual = true;
        Scanner l = new Scanner(System.in);
        int tamano = l.nextInt();

        int[] a = new int[tamano];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese la info de la posicion " + (i + 1) + " de " + a.length);
            a[i] = l.nextInt();

        }
        int i = 0;
        while (i < a.length - 1 && igual) {
            if (a[i] != a[i + 1]) {
                igual = false;
            }
            i++;
        }
        System.out.print("Dado el vector [");
        for (int j = 0; j < a.length; j++)
        {
            System.out.print(a[j]+" ");
        }
        System.out.println("]");
        if (igual) {
            System.out.println("Se observa que el vector es igual");
        } else {
            System.out.println("Se observa que el vector es distinto");
        }
    }

}
