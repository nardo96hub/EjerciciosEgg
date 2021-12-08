package _1_JavaSintaxis;

import java.util.Scanner;

public class EJEX5 {

    public static void main(String[] args) {
        String socio;
        double tratamiento;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese A,B,C");
        socio = leer.nextLine();
        socio = socio.substring(0, 1);
        while (!socio.equalsIgnoreCase("A") && !socio.equalsIgnoreCase("b") && !socio.equalsIgnoreCase("c")) {
            System.out.println("Ingrese A,B o C");
            socio = leer.nextLine();
            socio = socio.substring(0, 1);
        }
        System.out.println("Ingrese precio de tratamiento");
        tratamiento=leer.nextDouble();
        System.out.println("Al ser socio del tipo "+socio+" y con precio "+tratamiento+" debe pagar en total: "+descuento(socio,tratamiento));

    }
    public static double descuento(String s, double t)
    {
        if(s.equalsIgnoreCase("a"))
        {
            t*=0.5;
        }
        else if(s.equalsIgnoreCase("a")) t=t-t*0.35;
        return t;
    }

}
