package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx17 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int tamano = l.nextInt();
        int s=0;
        int[] a = new int[tamano];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese la info de la posicion " + (i+1) + " de " + a.length);
            a[i] = l.nextInt();
            s+=a[i];
        }
        System.out.print("Dado el vector [");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("] tiene suma="+s);
        
    }

}
