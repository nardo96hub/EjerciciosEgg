package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx12 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Ingrese altura >=1");
        int alt = l.nextInt();
        while (alt < 1) {
            System.out.println("Ingrese altura >=1");
            alt = l.nextInt();
        }
        for(int i=1;i<=alt;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

}
