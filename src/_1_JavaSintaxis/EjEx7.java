package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx7 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double prom, n, min, may;
        int cont;
        prom = min = may = 0;
        cont = 0;
        //Version while
        System.out.println("Ingrese un numero>0");
        n = l.nextDouble();
        while (n > 0) {
            cont++;
            prom += n;
            if (cont == 1) {
                min = may = n;
            }
            if (min > n) {
                min = n;
            }
            if (may < n) {
                may = n;
            }
            System.out.println("Ingrese un numero>0");
            n = l.nextDouble();
        }
        if (cont > 0) {
            System.out.println("Informe:\nEl promedio de los " + cont + " numeros ingresados es: " + (prom / cont) + " y el valor min es:" + min + " y el mayor:" + may);
        } else {
            System.out.println("No se ingresaron numeros positivos");
        }

        //Version do while
        prom = min = may = 0;
        cont = 0;
            System.out.println("Ingrese un numero>0");
            n = l.nextDouble();
        do {
            
            if (n > 0) {
                cont++;
                prom += n;
                if (cont == 1) {
                    min = may = n;
                }
                if (min > n) {
                    min = n;
                }
                if (may < n) {
                    may = n;
                }
                System.out.println("Ingrese un numero>0");
                n = l.nextDouble();
            }
        } while (n > 0);
        if (cont > 0) {
            System.out.println("Informe:\nEl promedio de los " + cont + " numeros ingresados es: " + (prom / cont) + " y el valor min es:" + min + " y el mayor:" + may);
        } else {
            System.out.println("No se ingresaron numeros positivos");
        }

    }

}
