package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx15 {

    public static void main(String[] args) {
        String resp, nomb;
        int edad;
        Scanner l = new Scanner(System.in);
        //resp = "si";
        do {
            System.out.println("Ingrese nombre");
            nomb = l.next();
            System.out.println("Ingrese edad");
            edad = l.nextInt();
            System.out.print("La persona de nombre:" + nomb + " y edad:" + edad + " es:");
            if (edad < 18) {
                System.out.print("mayor de edad");
            } else {
                System.out.print("menor de edad");
            }
            System.out.println("Desea seguir ingresando datos?(Si/no)");
            resp = l.next();
            while (resp.equalsIgnoreCase("si") || resp.equalsIgnoreCase("no")) {
                System.out.println(" ingrese(Si/no)");
                resp = l.next();
            }
        } while (resp.equalsIgnoreCase("si"));

    }

}
