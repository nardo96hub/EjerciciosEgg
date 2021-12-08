package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        String l = frase.substring(0, 1);
        if (l.equalsIgnoreCase("A") || l.equalsIgnoreCase("e") || l.equalsIgnoreCase("i") || l.equalsIgnoreCase("o") || l.equalsIgnoreCase("u")) {
            System.out.println("Se trata de una vocal");
        } else {
            System.out.println("No se trata de una vocal");
        }
        

    }

}
