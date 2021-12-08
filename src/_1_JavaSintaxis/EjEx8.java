package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx8 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int par, impar, cont, num;
        par = impar = cont = 0;
        System.out.println("Ingrese un numero que no sea multiplo de 5");
        num = l.nextInt();
        while (num % 5 != 0) {
            cont++;
            if (num > 0) {

                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
            System.out.println("Ingrese un numero que no sea multiplo de 5");
            num = l.nextInt();
        }
        System.out.println("Informe:\nLa cantidad de numeros ingresados es: "+cont+"\nDonde la cantidad de numeros>0 "+par+" son pares y "+impar+" son impares");
    }

}
