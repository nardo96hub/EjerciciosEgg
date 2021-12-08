package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx6 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double altura, promb, promT;
        int contb, contT;
        promb = promT = 0;
        contT = contb = 0;
        System.out.println("Ingrese altura mayor a 0");
        altura = l.nextDouble();
        while (altura > 0) {
            contT++;
            promT += altura;
            if (altura < 1.60) {
                contb ++;
                promb += altura;
            }
            System.out.println("Ingrese altura mayor a 0");
            altura = l.nextDouble();
        }
        if (contT > 0) {
            System.out.println("El promedio general de alturas es de: " + (promT / contT));
            if (contb > 0) {
                System.out.println("El promedio de personas con altura por debajo de 1.60m es de: " + (promb / contb));
            } else {
                System.out.println("El promedio de personas bajas es 0");
            }

        } else {
            System.out.println("No se ingresaron altura de personas");
        }
    }

}
