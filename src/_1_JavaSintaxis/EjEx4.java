package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx4 {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero entre [1,10]");
        Scanner leer = new Scanner(System.in);
        int r = leer.nextInt();
        while (r < 1 || r > 10) {
            System.out.println("Ingrese un numero entre [1,10]");
            r = leer.nextInt();
        }
        System.out.println("Exivalencias de numeros romanos");
        switch (r) {
            case 1:
                System.out.println(r + "=I");
                break;
            case 2:
                System.out.println(r + "=II");
                break;
            case 3:
                System.out.println(r + "=III");
                break;
            case 4:
                System.out.println(r + "=IV");
                break;
            case 5:
                System.out.println(r + "=V");
                break;
            case 6:
                System.out.println(r + "=VI");
                break;
            case 7:
                System.out.println(r + "=VII");
                break;
            case 8:
                System.out.println(r + "=VIII");
                break;
            case 9:
                System.out.println(r + "=IX");
                break;
            case 10:
                System.out.println(r + "=X");
                break;
        }
    }

}
